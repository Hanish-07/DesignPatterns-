public class MeatProductMenu implements ProductMenu {  // Implements the Meat product Menu from the Factory method design pattern

	@Override
	public void showMenu() {
		System.out.println();
	}

	@Override
	public void showAddButton() {
		System.out.println();
	}

	@Override
	public void showViewButton() {
		System.out.println();
	}

	@Override
	public void showRadioButton() {
		System.out.println();
	}

	@Override
	public void showLabels() {
		System.out.println();
	}

	@Override
	public void showComboxes() {
		System.out.println();
	}

	public void createProductList() {
		System.out.println("Product List created ...");
	}

	public void AttachProductToUser() {
		System.out.println("User Attached .... ");
	}

	public void productOperation() {
		System.out.println("Operation performed on the Product...");
	}


	public void SelectProduct(int UserType) {
		System.out.println("Meat Product Menu Selected ...\n Bridge Pattern for connection used");
		Person person;
		if (UserType == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.showMenu();
	}

}
