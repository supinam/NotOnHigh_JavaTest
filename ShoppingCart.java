import java.util.List;

public class ShoppingCart {

	private List<Product> productList;
	public static final double overallDiscountValue = 60.0;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public double totalPrice() {
		
		//Calculate the total price of the items in cart

		double tot = 0.0;

		applyProductDiscount();

		for (Product p : productList) {
			tot = tot + p.getPrice();
		}

		double newtot = applyOverallDiscount(tot);

		return newtot;
	}

	public void applyProductDiscount() {
		//apply discount on specific product "Travel Card Holder"
		
		int quantity = 0;
		double dropped_price = 8.50;

		for (Product pro : productList) {
			if (pro.getProductCode().equals("001")) {
				quantity++;
			}
		}

		if (quantity >= 2) {
			for (Product p : productList) {
				if (p.getProductCode().equals("001")) {
					p.setPrice(dropped_price);
				}
			}

		}

	}

	public double applyOverallDiscount(double tot) {
		
		//apply overall discount on purchase > 60

		if (tot > overallDiscountValue)

		{
			tot = tot - 0.10 * tot;
		}

		return tot;
	}
}
