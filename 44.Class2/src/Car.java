
public class Car { // Bir fabrika gibi düşün class'ı içerisinde ürünün özellikleri ve metotları ( çalışma şekilleri yer alıyor )
	
	 public int car_age;
	 public double car_km;
	 public String car_name ;
	 public String car_color;
	 
	 
	 private String car_marka ; 
	 private int car_tekerlek;
	 private String car_model; // Bu private erişim belirleyicisine sahip değişkenlere sadece bu class içerisinden direkt erişilebilir.
	 						   // Başka bir class içerisinden eğer erişmek istiyorsam (public) metotları kullanıyorum.
	 						   // Değer atamak içinde bu özelliklere metodumun parametlerelerini kullanıyorum.


	 public void carBilgiler(String car_marka,int car_tekerlek, String car_model) {
		 
		 this.car_marka=car_marka;
		 this.car_tekerlek=car_tekerlek;
		 this.car_model=car_model; // this : üzerinde çalıştığım, bulunduğum class demek
		 
		 System.out.println(this.car_marka+" "+this.car_tekerlek+" "+this.car_model);
	 }
	 
	 public void setArabaModel(String car_model) { // car_model değişkeni için parametre ile veri al

	 }
	 public String getArabaModel() {  //  car_model değişkeninin değerini geriye döndür , değerini dışarıya aktar
		 return this.car_model;
	 }
	 
	 // araba yaşını alalım ama doğrudan alırsak bir değişken ile yanlış veri girilirse - bir değer gibi değiştiremeyiz 
	 // bu yüzden verimizi private yapıp metotlar ile metotlarımızdaki koşullar sağlanırsa ulaştıracağız .
	 
	 public void setArabaYasi(int car_age) { // Girilen parametre 0'dan küçük ise ekrana uyarı ver
		 if (car_age<0) {
			System.out.println("Lütfen 0 veya 0'dan büyük bir değer giriniz!!!");
		} else {
			 this.car_age=car_age; // Girilen parametre doğru aralıkta ise değişkenime parametreyi ata
		}
		
	 }
	 
	 public int getArabaYasi() {
		 return this.car_age;
	 }
	 
	 

	 

}


