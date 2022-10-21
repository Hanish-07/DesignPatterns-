public class Buyer extends Person { 			//Implemention of factory design pattern

	Buyer() {
		super(productMenu);
	}

	Buyer(ProductMenu theProductMenu) {
		super(productMenu);
	}


	@Override
	public void showMenu() {
		System.out.println("Menu items of BUYER....");  //Shows the menu items
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
