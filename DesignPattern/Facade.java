import java.util.Iterator;
import java.util.Scanner;

public class Facade {

	private int userType;

	private Product productList;

	private OfferingList offeringList;

	private int selectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private int menuType;

	private String username;

	private String password;

	private Login login = new Login();

	private boolean success;


	public void startFacade() {
		System.out.println("---HELLO!!---");
		System.out.println("----------Facade Pattern has been Implemented---------");
		System.out.println("---LOGIN---");
		System.out.println("Enter 0 for Buyer");
		System.out.println("Enter 1 for Seller");
		Scanner sc = new Scanner(System.in);
		userType = sc.nextInt();
		if(userType != 1 && userType != 0){
			System.out.println("User Not Found");
			sc.close();
		}
		success = login.login(userType);
		if(success == false)
		{
			System.out.println("Invalid credentials");
			sc.close();
		}
		System.out.println("Select an option(Number) from available Product Menu \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		selectedProduct = sc.nextInt();
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
		remind(menuType);
		System.out.println("Implementing Iterator pattern ....");
		if(menuType == 1)
			productList = new Product(new ProduceProductMenu());
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
