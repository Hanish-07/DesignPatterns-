public class Seller extends Person { // Implements the Seller class extending the Person Class of the Factory Method.

	Seller() {
		super(productMenu);
	}

	Seller(ProductMenu theProductMenu) {
		super(productMenu);
	}

	@Override
	public void showMenu() {
		System.out.println("Menu items of seller....");
	}

	@Override
	public ProductMenu CreateProductMenu() {
		int offer = 0;
		if (offer == 0) {
			return new MeatProductMenu();
		} else {
			return new ProduceProductMenu();
		}
	}

}
