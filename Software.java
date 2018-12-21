import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Software {
	static List<Student> allStudents = new ArrayList<>();
	static List<Student> registeredList = new ArrayList<>();
	static List<Student> reserveList = new ArrayList<>();
	static List<Student> paymentList;
	
	public static void main (String[] args) {
		
		createAllStudents();
		
		for(int i = 0; i<250; i++){
			createRegisteredStudents(i);
			createPaymentList(i);
			removeUnpaidStudents(i);
			//System.out.println(paymentList);
			removeFromRegisteredList();
			
			//registeredlisti payment liste eşitleme kısmı yok
			
			// ÇALIŞMIYO BURAYA TEKRAR BAKICAZ
			
			}
		
		createReservedList();
		
	}
	
	public static void createAllStudents(){
		//System.out.println("These are all the students who consult to DPS:");
		for (int i=0;i<500;i++) {
			Student student = new Student(createRandomName(), generateAge(), generateCity());
			allStudents.add(student);
		}
	}
	
	public static void createRegisteredStudents(int i){
		//System.out.println("These are all the students who has a room :");
		registeredList.add(allStudents.get(i));
		//System.out.println(registeredList.toString());
	}
	
	public static void createPaymentList(int i){
		System.out.println("The payment information for registered students: ");
		paymentList = new ArrayList<>(registeredList);
		paymentList.get(i).setPayment(randomPayment());
		System.out.println(paymentList);
	}
	
	public PaymentList removeUnpaidStudents(){ 
		for(int j = 0; j<payment.getPaymentList().size(); j++){
			if(payment.getPaymentList().get(j).getPayment() == false){
				payment.removeStudent(payment.getPaymentList().get(j));
			} 
		}
		
		return payment;
	}
	
	public static void removeFromRegisteredList(){
		//registeredList.clear();
		for(int i = 0; i < paymentList.size(); i++){
			registeredList.set(i, paymentList.get(i));
		}
	}
	
	public static void createReservedList(){
		for(int i = 250; i<500; i++){
			reserveList.add(allStudents.get(i));
		}
	}
	
	public static String createRandomName() {
		String[] firstNames = { "Ali", "Ayse", "Ahmet", "Mehmet", "Mustafa", "Gizem", "Sibel", "Burak", "Bahar" };
		String[] lastNames = { "Yilmaz", "Caliskan", "Korkmaz", "Kaya", "Akar", "Sonmez", "Celikoglu" };

		Random random = new Random();

		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];
		String name = firstName + " " + lastName;

		return name;

	}
	
	public static String generateCity() {
		String[] cities = {"Istanbul", "Ankara", "Izmir", "Antalya", "Bursa", "Edirne"};
		
		Random random = new Random();
		
		String city = cities[random.nextInt(cities.length)];
		
		return city;
	}
	
	public static int generateAge() {
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
	
	public static boolean randomPayment(){
		boolean payment = false;
		
		Random random = new Random();
		payment = random.nextBoolean();
		return payment;
	}
}
