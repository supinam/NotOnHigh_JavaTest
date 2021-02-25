// Product class
public class Product {

	private String productCode;
	private String name;
	private double price;
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", price=" + price + "]";
	}
	public Product(String productCode, String name, double price, int quantity) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.price = price;
		
	}
	
		
}
