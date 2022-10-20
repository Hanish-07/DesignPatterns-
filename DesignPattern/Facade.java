import java.util.Iterator;
import java.util.Scanner;

public class Facade {

	private int userType;

	private Product productList;

	private OfferingList offeringList;

	private String selectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private int menuType;

	private String username;

	private String password;

	public void startFacade() {
		System.out.println("Facade pattern initiated ");
		userType = login() ? 1:0;
		menuType = 0;
		System.out.println("Select from available Product Menu \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		Scanner scan = new Scanner(System.in);
		selectedProduct = scan.nextLine();
		if (selectedProduct.equalsIgnoreCase("Meat Product Menu")) {
			SelectProduct(new MeatProductMenu(), userType);
		} else if (selectedProduct.equalsIgnoreCase("Produce Product Menu")) {
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
		scan.close();
		
	}

	public boolean login() {
		System.out.println("Enter Username ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		username = scan.next();
		System.out.println("Enter Password ");
		password = scan.next();
		userType = validation(username, password);
		return (userType > 0);
	}

	public int validation(String username, String password) {
		if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
			System.out.println("Welcome Tutu ");
			userType = 0;
		}
		else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
			System.out.println("Welcome mimi ");
			userType = 0;
		}
		else if ((username.equalsIgnoreCase("nana")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Welcome mimi ");
			userType = 0;
		}
		else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Welcome pepe ");
			userType = 1;
		}
		else {
			System.out.println("Invalid User ");
			System.exit(-1);
		}

		return userType;
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
