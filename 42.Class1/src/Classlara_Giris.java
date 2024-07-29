import com.aliosman.Sinif;

public class Classlara_Giris {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
 // Bir class var diyelim. Ben eğer bir class'ın içindeki değişkenlere erişmek istiyorsam o classtan nesne türetmem gerekir
 // Bir class'dan da nesne türetmek için "new" anahtar kelimesini kullanıyorum
 // Bir classı kullanırken onun paket yolu "import" ile belirtiliyor yukarıda bu zorunlu bir şeydir.
 // Eğer kullanılmaz ise derleyici sınıfın nereden geldiğini tanımlayamadığı için sınıfı çalıştırmaz
		
		Sinif ogrenci1 = new Sinif("Ali Osman","Uzun",58);  // Burada bir nesne oluşturdum adı ogrenci1
															// Bu oluşturduğum nesne ile class'ımın içindeki değişkenlere ulaşabiliyorum
         ogrenci1.id=58;
		 ogrenci1.name="Ali Osman";                         // ogrenci1 nesnesi ile sinif class'ımdaki name değişkenime ulaştım ve ona değer atadım.
		 ogrenci1.surname="Uzun";
		System.out.println("ÖĞRENCİ BİLGİLERİ");
		System.out.println("İD : "+ogrenci1.id );
		System.out.println("ADI : "+ ogrenci1.name);
		System.out.println("SOYADI : "+ ogrenci1.surname);
		
		
		
		// Constructor ( Yapıcı Metotlar ) 
		
	
		Sinif ogrenci2 = new Sinif(); // Class'ın ismi - referans ismi 
									  // "new" kelimesi nesne türetmek için gerekli olan anahtar kelime
				  					  // son şey ise Sinif class'ımın constructor'ıdır ( Yapıcı metodur ) .
									  // nesne türetilmeden önce kullanmış olduğum sınıfın constructor'ı çalışır ilk önce 
									  // ondan sonra nesne türetilir.
		
		
	// ERİŞİM BELİRLEYİCİLERİ ( ACCESS MODIFIERS ) 	
	//	public : her yerden erişilebilir kısıtlama yok.	
	//	private : sadece  bulunduğu class içerisinden erişilebilir.	
	//	protected : bulunduğu class içinden ve o classı miras alan alt classlardan erişilebilir.	

	Sinif ogrenci3 = new Sinif("Erkek");
	ogrenci3.ogrenciCinsiyet();
						
	
	}

}
