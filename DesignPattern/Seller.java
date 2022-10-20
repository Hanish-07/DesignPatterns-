public class Seller extends Person {

	Seller() {
		super(productMenu);
	}

	Seller(ProductMenu theProductMenu) {
		super(productMenu);
	}

	@Override
	public void showMenu() {
		System.out.println("Seller Menu items....");
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
