package Classes;

public class Classes {
	// iş yapan her sey class tır. 
	// 
	public static void main(String[] args) {
		//reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager2.Add();
		
		//value type (değer tipi)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		//referance type  
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1 ;
		sayilar1[0] =10;
		System.out.println(sayilar2[0]);
		

	}

}



