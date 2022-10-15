package ClassesWithAttribute;

public class classesWithAttribute {

	public static void main(String[] args) {
		
		Product product = new Product();
		//roduct product = new Product(id: 1, name: "Laptop", description: "Lenovo Laptop", price: 2800, stockAmount:2, kod: L1);
		product.name = "Laptop";
		product.setId(1);
		//product.id = 1;
		product.description = "Lenovo Laptop";
		product.price = 2800;
		product.stockAmount = 1;
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		
		System.out.println(product.name);
		System.out.println(product.getKod());
		
	}

}