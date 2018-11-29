import java.text.NumberFormat;

// Design and Code a class for a generic product. 
//The product data should include a product code, description, price and product count. 
//In addition to the getter and setter method, the class should implement toString and 
//also a formatted output of the price

public class Product {

	//defining the fields - state of each product object
	private String code;
	private String description;
	private double price;
	private static int count = 0;

	//Constructors - initializing the state of the created objects
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;	
		count++; 
	}

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}

	//Methods
	public String getCode() {
		return code;
	}

	//Return the code of the product
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

	//Returns a string representation of object
	@Override
	public String toString() {
		return ("Product Code: " + code + "    Description: " + description + 
				"    Price: " + getPriceFormatted());
	}
}
