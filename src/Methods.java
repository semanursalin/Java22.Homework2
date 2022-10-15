
public class Methods {
	//program sadece main içinde yazan kodları çalıştırır.
			//fonksiyonlara sürekli kullacağımız şeyleri tanımlayabiliriz örneğin ekrana yazdırmayı projenin her yerinde kullanabiliriz onu bir fonksiyonda tanımlayıp
			//kolayca çağırabiliriz
			public static void main(String[] args) {
				sayiBulmaca();
				
			}
			
			public static void sayiBulmaca() {
					int[] sayilar = new int[] {1,2,5,6,4,7,8,9};
					int aranacak=4;
					boolean varMi=false;
					for (int sayi : sayilar) {
						if(sayi==aranacak) {
							varMi=true;
							break;
						}
					}
					if (varMi) {
					   mesajVer("Sayi mevcuttur : "+aranacak); 
					}
					else mesajVer("Elimizde o sayi kalmadii"+aranacak);
			}
			
			public static void  mesajVer(String mesaj) {
				System.out.println(mesaj);
				
				
			}


}
