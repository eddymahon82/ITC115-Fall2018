public class ProductMain{

	public static void main(String[] args) {
		
		//Assigning values to product
		Product p1 = new Product("26s4e9", "puppy dog", 250);
		Product p2 = new Product("93p3v2", "smart tv", 2599.95);
		Product p3 = new Product("55b2l4", "school book", 67.45);
		
		p2.setPrice(9.99);
		
		//Displaying outputs
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		//Counting the number of products
		System.out.println("Inventory Count: " + p1.getCount());
	}
}
