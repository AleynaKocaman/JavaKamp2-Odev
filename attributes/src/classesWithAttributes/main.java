package classesWithAttributes;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		Product product2=new Product(2,"telefon","samsung",7850,5);
		
		Product product=new Product();
		product.id=1;
		product.name="Laptop";
		product.price=18000;
		product.stockAmount=10;
		product.description="monster";
		System.out.println(product.getKod());
		
		ProductManager productManager=new ProductManager();
		productManager.ekle(product);
	}

}
