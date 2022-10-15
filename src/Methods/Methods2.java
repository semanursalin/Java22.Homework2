package Methods;

public class Methods2 {
	//Methotları(fonksiyonlari,operasyonları) kendimizi tekrar etmemek için kullanıyoruz

	public static void main(String[] args) {
		String mesaj = "Bugün kitap okuyacağım.";
		String yeniMesaj = mesaj.substring(0, 2); // Bir değer döndürüyor (Sadece string döndürür)
		String yeniMesaj2 = sehirVer();    
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj2);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,5,4,7,8,9,5,4,7,1);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");		
	}
	public static void guncelle() {
		System.out.println("Güncellendi");		
	}
	
	public static int topla(int sayi1 , int sayi2) { //Bu fonksiyon interger türünde bir değer döndürür
		return sayi1 + sayi2;
	}
	public static String sehirVer() {
		return "Kayseri";
	}
	public static int topla2(int... sayilar) {    // int sayilar[] == int... sayilar  istediğimiz kadar sayilari toplariz
		int toplam = 0 ;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;	
	}
	
	

}
