package ClassesWithAttribute;

	//attribute or fielt
	public class Product {
		
		//Constructor
		public Product() {  //yapıcı blok . () içindekileri verirsen bunu kullandırırım demek
			System.out.println("Yapici blok calisti.");
			
		}
		//public Product(int id, String name, String description, doubke price, int stockAmount, String kod) {  // () içindekileri verirsen bunu kullandırırım demek
		//	System.out.println("Yapici blok calisti.");
			
		//}
		
	
	// public : her yerden ulaşılabilir
	// private : sadece tanımlandığı blokta geçerlidir.
		private int id;
		String name;
		String description;
		double price;
		int stockAmount;
		private String kod;
		
	//getter
	//this içinde bulunduğum class demek
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id=id;
		//_id=id;
	}
	public String getKod() {
		return this.name.substring(0,1) + id ;
	}
	


}
