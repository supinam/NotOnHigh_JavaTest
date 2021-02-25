import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckoutBill {

	public static void main(String[] args) {

		System.out.println("Welcome to NotOnHighStreet !\n");

		// display available products
		List<Product> productsAvailable = new ArrayList<Product>();
		productsAvailable.add(new Product("001", "Travel Card Holder", 9.25, 0));
		productsAvailable.add(new Product("002", "Personalised Cufflinks", 45.00, 0));
		productsAvailable.add(new Product("003", "Kids t-shirt", 19.95, 0));

		System.out.println("Products available to shop are :");
		productsAvailable.forEach(x -> System.out.println(
				"Product Code: " + x.getProductCode() + " Product: " + x.getName() + " Price:  " + x.getPrice()));

		System.out.println("\nEnter number of items to purchase :");
		// Accept shopping cart items from user
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Add items in the cart :");

			List<Product> cartList = new ArrayList<Product>();
			List<String> codes = new ArrayList<String>();

			for (int i = 0; i < num; i++) {
				codes.add(sc.next());
			}
			sc.close();

			for (String str : codes) {
				for (Product p : productsAvailable) {

					if (str.equals(p.getProductCode())) {
						cartList.add(p);
					}
				}
			}

			// display shopping cart
			System.out.println("Your shopping cart looks like this :");
			cartList.forEach(x -> System.out.println(
					"Product Code: " + x.getProductCode() + " Product: " + x.getName() + " Price:  " + x.getPrice()));

			// Calculate total price
			ShoppingCart scart = new ShoppingCart();
			scart.setProductList(cartList);
			double tot = scart.totalPrice();

			// Display the total price
			System.out.println("\nTotal price, post discount is :" + tot);
		}

	}
}
