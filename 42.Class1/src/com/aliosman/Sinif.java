package com.aliosman;

public class Sinif { // public her yerden erişilebilir demek , class diyerek bir klass oluşturuyorum ardından class'ın adı geliyor 
 
	// Class'lar içinde değişken tanımlama 
	
	public int id; // değişken - field - property
	
	public String name ; 
	
	public String surname ;
	
	private String cinsiyet ; // private erişim belirleyicisini kullandım .
							 // o yüzden bu değişken artık dış dünyaya kapalı sadece bu class içinde kullanabilirim
	
	
	
	
	
	 // Contructor tanımlarken erişim_belirleyicisi ve sınıf_ismini yazıyorum bu kadar
	// Ama sıradan metotlar için eğer geriye değer dönmüyorsa  void diye veya döndürüyorsa dönülen veri tipini belirtmek zorunludur.
	// Constructor nesne türetilmeden önce çalışır ve ardından nesne türetilir.
	// Constructor'lar parametre alabilir bu parametreleri nesne türetirken girmem gereklidir.
	// Constructor metotlar geriye dönüş tipleri olmayan metotlardır. Bir sınıfın birden fazla constructor'ı olabilir ama birbirlerine benzer olamazlar
	 
	public Sinif(String ad,String soyad,int kimlik) { 
		// this : şuan üzerinde çalıştığım class
		this.name=ad;
		this.surname=soyad;
		this.id= kimlik;  // this ile burada Sinif class'imdaki id değişkenine kimlik parametresini ata demiş oldum
	}

	// Metotlara overloading 
	// ya parametre sayısı farklı olacak
	// ya da parametre tipleri farklı olacak 
	// bu yöntem ile dilersek bu metodumuzu veya başka bir metodumuzu kullanabiliyoruz
	
	public Sinif() {
		System.out.println("Yapıcı metod çalıştı");
	}
	
	public Sinif(String cinsiyet) {
		this.cinsiyet=cinsiyet;
	}
	
	public void ogrenciCinsiyet() {
		
		System.out.println("Cinsiyet  : " + this.cinsiyet);
	}
}
