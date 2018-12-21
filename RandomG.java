import java.util.*;

public class RandomG{
	
	

	public String createRandomName() {
		String[] firstNames = { "Ali", "Ayse", "Ahmet", "Mehmet", "Mustafa", "Gizem", "Sibel", "Burak", "Bahar", "Yiğit", "Ekin", "Uğur", "Betül", "Önay", "Hasan", "Veli", "Burak Can", "Pelinsu", "Selin", "Kemal", "Ali", "Muratcan", "Kazım", "Fevzi", "Melisa", "Gül", "Barlas", "Sinan", "Selen", "Öyküm", "Ece", "Selim", "Hüsnü", "Aylin", "Kerim", "Kerem", "Damla", "Meriç", "Yasin", "Arda", "Bahar", "Volkan", "Burhan", "Simay", "Yağız", "Bengü", "Aslı", "Çağla", "Erkut", "Zeki", "Merthan", "Mesut", "Muharrem", "Oğuz", "İlayda", "Tarık", "Egecan", "Aytaç", "Deniz", "Sacit", "Ata", "Cem", "Fatih", "Cemil", "Cemal", "Arda", "Kamil", "Halil", "İbrahim", "Efe", "Kaan", "Okan" };
		String[] lastNames = { "Yılmaz", "Çalışkan", "Korkmaz", "Kaya", "Akar", "Sönmez", "Çelikoglu", "Soydan", "İnsel", "Temir", "Başıbüyük", "Çarşıbaşı", "Çakmak", "Nakkaş", "Çakır", "Bayramgürler", "İnönü", "Ecevit", "Ersoy", "Erbil", "Anadolu", "Kılıçdaroğlu", "İnce", "Akşener", "Gürses", "Ziyagil", "Nalbant", "Şahin", "Kartal", "Konuşkan", "Geyik", "Tilki", "Taş", "Altıntop", "Koçyiğit", "Ateş", "Toprak", "Işık", "Topatan", "Sözer", "Hışım", "Boyacı", "Aldemir", "Tunç", "Çoban", "Güneri", "Taşkın", "Uysal", "Sivaslı", "Tan", "Güneş", "Tatlıtuğ", "Yerlitaş", "Gürel", "Gülsoy", "Ergüçlü", "Ulusoy", "Dalkılıç", "Saat", "Çayoğlu", "Özpirinççi", "Boluğur", "Uzerli", "Sert", "Mola", "Evcen", "Erçel", "Esmersoy", "Sangu", "Hasoğlu", "Sarıkaya", "Özçivit", "Boz", "Akar", "Bakar", "Soluk", "Solak", "Köylü", "Topal", "İzmirli", "Toy", "Zorlu", "Koç", "Kral", "Aslan", "Geyikçi", "Gar", "Soysal", "Portakal" };

		Random random = new Random();

		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];
		String name = firstName + " " + lastName;

		return name;

	}
	
	public String generateCity() {
		String[] cities = {"Istanbul", "Ankara", "Izmir", "Antalya", "Bursa", "Edirne","Aydın",
				"Kars","Ağrı", "Afyon", "Kayseri", "Kilis", "Antep", "Adana"};
		
		Random random = new Random();
		
		String city = cities[random.nextInt(cities.length)];
		
		return city;
	}

	public int generateAge() {
		int[] ages = new int[5];
		ages[0] = 18;
		ages[1] = 19;
		ages[2] = 20;
		ages[3] = 21;
		ages[4] = 22;
										
		Random random = new Random();
		
		int age = ages[random.nextInt(ages.length)];
		
		return age;
	}
	
	public boolean randomPayment(){
		boolean payment = false;
		
		Random random = new Random();
		payment = random.nextBoolean();
		return payment;
	}
	

}
