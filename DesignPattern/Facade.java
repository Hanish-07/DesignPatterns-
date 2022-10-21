import java.util.Iterator;
import java.util.Scanner;

public class Facade {  //Here we implement the Facade class diagram

	private int userType;

	private Product productList;

	private OfferingList offeringList;

	private int selectedProduct;

	private int menuType;

	private Login login = new Login();

	private boolean success;

	private int option;

	private Register register = new Register();


	public void startFacade() {  				// facade pattern diagram will be intitiate by this fn
		Scanner sc = new Scanner(System.in);
		System.out.println("____----HELLO!---____");
		System.out.println("To LOGIN = Enter 0");
		System.out.println("To REGISTR = Enter 1");
		option = sc.nextInt();
		if(option == 0) 							// The Login page is initiated
		{
			System.out.println("Facade Pattern has been Implemented");  
			System.out.println("_____---LOGIN---____-");
			System.out.println("For BUYER = Enter 0");
			System.out.println("For SELLER = Enter 1");
			userType = sc.nextInt();
			if(userType != 1 && userType != 0){
				System.out.println(" No User Found");
				sc.close();
			}
			success = login.login(userType);
			if(success == false)
			{
				System.out.println("Invalid credentials, Please Try to use vaild credentials");
				sc.close();
			}
		}
		if(option == 1)								// The registration page is initiated
		{
			System.out.println("----------Facade Pattern has been Implemented---------");
			System.out.println("____---REGISTER---_____");
			System.out.println("For BUYER = Enter 0");
			System.out.println("For SELLER = Enter 1");
			userType = sc.nextInt();
			try{
				register.Registration(userType);  	//In the register class The user option is passed as an argument for registration 
			}
			catch(Exception e){
				System.out.println("Unable to register at this moment, please try again");
				sc.close();
			}
		}
		
		System.out.println("Select an optionfrom available Product Menu \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		selectedProduct = sc.nextInt(); 		// The user option is selected for creating a meat or produce product menu options
		if (selectedProduct == 1) {
			SelectProduct(new MeatProductMenu(), userType);
		} else if (selectedProduct == 2) {
			SelectProduct(new ProduceProductMenu(), userType);
			menuType = 1;
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		System.out.println("Implementing Visitor Pattern...."); 
		remind(menuType);											// Implemention of Visitor pattern function
		System.out.println("Implementing Iterator pattern ....");
		if(menuType == 1)
			productList = new Product(new ProduceProductMenu());	// Implemention of Iterator pattern function
		else
			productList = new Product(new MeatProductMenu());
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) productList.createIterator();
		ProductIterator productIterator = new ProductIterator();
		if(menuType == 1)
			offeringList = new OfferingList(new ProduceProductMenu());
		else
		offeringList = new OfferingList(new MeatProductMenu());
		@SuppressWarnings("rawtypes")
		Iterator iterate2 = (Iterator) offeringList.createIterator();
		OfferingIterator oi = new OfferingIterator();
		while (productIterator.hasNext(iterate)) {
			System.out.println(productIterator.Next(iterate));
			System.out.println(oi.Next(iterate2));
		}
		sc.close();
		
	}


	public void addTrading(Trading t) {
		t.addTrading();
	}

	public void viewTrading(Trading t) {
		t.viewTrading();
	}

	public void decideBidding(Offering o) {
		o.decideBidding();
	}

	public void discussBidding(Offering o) {
		o.discussBidding();
	}

	public void submitBidding(Offering o) {
		o.submitBidding();
	}

	public void remind(int menu) {
		ReminderVisitor remind = new ReminderVisitor();
		if(menuType == 0)
			productList = new Product(new MeatProductMenu());
		else
			productList = new Product(new ProduceProductMenu());
			productList.accept(remind);

	}

	public void createUser(UserInfoItem userinfoitem) {
		userinfoitem.createUSer();
	}

	public void createProductList(ProductMenu prodMenu) {
		prodMenu.createProductList();
	}

	public void AttachProductToUser(ProductMenu prodMenu) {
		prodMenu.AttachProductToUser();
	}

	public void SelectProduct(ProductMenu prodMenu, int userType) {
		prodMenu.SelectProduct(userType);
	}

	public void productOperation(ProductMenu prodMenu) {
		prodMenu.productOperation();
	}

}
