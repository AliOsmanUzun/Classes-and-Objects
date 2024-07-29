
public class Test {
	
	public static void main(String[] args) {
	
// OOP
// Nedir bu obje : Laptop , masa , klavye , mouse gerçek hayattaki her bir nesneyi 
// veya kişiyi birer obje olarak tanımlayabiliriz
// Her bir nesnenin özellikleri ( değikenler vb. )
// Ve çalışma şekilleri vardır ( metodlar )
// Bir laptopun rengi olur , tuşları olur , ekranı büyük veya küçük olur bunlar bir özelliktir.
// Laptop'da space bastığımız zaman boşluk atması , entre'a bastığımız zaman satır atlaması onun fonksiyonel bir özelliği oluyor.
// Gerçek hayatı programlama dünyasına uyarlamak ,
		
// Class aynı bir fabrika gibi içerisinde ürünün özellikleri ve metodları ( çalışma şekli ) bellidir.
// Classlara özellik ve metotlar yükleriz bu class'dan bir obje ürettiğimiz zaman bu özelliklerin ve metodların tamamına sahip olmuş olur.
		
		Car car1 = new Car();// Bir obje oluşturdum bu obje classım'daki tüm özellikleri ve metodların tamamına sahip
	    // Class içerisine erişim için referans gereklidir buradaki referansı CAR1 ile yapıyorum.
		// Burada bir obje oluşturduk ama obje CAR1 değil o bir referans 
		// new Car(); ifadesi bir  Car objesi oluşturdu heap'te. 
		// Bende bu objeye stack'te yer alan car1 referans değişkenimle bu oluşturduğum objeye erişiyorum
		// Bu referans değişkenim objemin (heap'deki) bellek adresini tutuyor  ve bu adresler aracılğıyla objelere erişim sağlıyorum

		car1.car_age = 19;
		car1.car_color="Kırmızı  ve Beyaz";
		car1.car_km = 159.121;
		car1.car_name="Cesur"; // Oluşturduğum araba objeme car1 referansı ile çağır ve araba adını cesur olarak ata 
		
		System.out.println("Araba yaşı : " + car1.car_age);
		System.out.println("Araba rengi : " + car1.car_color);
		System.out.println("Araba kilometresi : " + car1.car_km);
		System.out.println("Araba'nın adı : " + car1.car_name);
		
		
		// private özelliklerimize dolaylı yoldan erişiyoruz 
		// bu erişimide public erişim belirleyicilerine sahip metodlarımız ile yapıyoruz.
		
		car1.carBilgiler("Mercedes",4,"2024 Model");
		
		car1.setArabaYasi(158);
		System.out.println(car1.getArabaYasi());
		
		//  Car car2 ;  // böyle bir kullanım olamaz çünkü referansım hiç bir objeyi göstermiyor.
		 // Car class'ımın değişkenlerine ve metotlarına erişemem , nedeni ise  erişmem için bir objem olması gerekiyor.
		 // referanslar bir objeyi temsil eder bir sınıfın özelliklerini ve metotlarını objeler alır.
		 // o yüzden bir referansa obje ataması yapmalı ve objeme referans ile erişebilmeliyim. 
		  
		// Car car3 = null ; // Null demek bu referans şuan herhangi bir yeri göstermiyor demek
		 				   // Kod çalıştığı zaman NullPointerException hatası alırım 
		 				   // Buda o referansımın herhangi bir objeyi göstermediğini söyler	
	}
}
