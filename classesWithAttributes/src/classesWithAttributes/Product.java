package classesWithAttributes;

public class Product {
	
	/*public Product() {            // constructor
		System.out.println("Yapici blok çalıştı");
	}
	*/
	
	// bu değikenlere özelliklere attributes veya field denilebilir
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	 // getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	// setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
