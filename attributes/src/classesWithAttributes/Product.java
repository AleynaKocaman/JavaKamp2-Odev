package classesWithAttributes;

public class Product {

	

	
	//attribute -field
	public int id;
	public String name;
	public String description;
	public double price;
	public int stockAmount;
	public String kod;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String description, double price, int stockAmount) {
	
		System.out.println("Yapýcý blok çalýþtý");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		
	}
	
	public String getKod() {
		return this.name.substring(0,1)+id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	//getter
	public int getId() {
		
		return id;
	}
	//bulunduðum class-->this
	
	//setter
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	

}
