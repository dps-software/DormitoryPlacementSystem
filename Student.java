import java.util.Comparator;

public class Student {
	private String studentName;
	private int age;
	private String homeCity;
	private boolean payment;
	private int point;
	private int roomnumber;
	
	public Student (String studentName, int age, String homeCity) {
		this.studentName = studentName;
		this.age = age;
		this.homeCity = homeCity;
		payment = false;
		point = 0;
	}
	
	public Student (String studentName, int age, String homeCity, boolean payment) {
		this.studentName = studentName;
		this.age = age;
		this.homeCity = homeCity;
		this.payment = payment;
	}
	
	public void setStudentName(String name){
		this.studentName = name;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setHomeCity(String homeCity){
		this.homeCity = homeCity;
	}
	
	public String getHomeCity() {
		return homeCity;
	}
	
	public boolean getPayment(){
		return payment;
	}
	
	public void setPayment(boolean payment){
		this.payment = payment;
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getRoomNumber() {
		return roomnumber;
	}
	
	public void setRoomNumber(int roomnumber){
		this.roomnumber = roomnumber;
	}
	
	public String toString(){
		return ("Name: " + getStudentName() +"\n"+
	            "Age: " + getAge() +"\n"+ 
	            "HomeCity: " + getHomeCity() +"\n"+ 
	            "Payment: " + getPayment()+"\n");
	}
	
	public static Comparator<Student> StuPointComparator = new Comparator <Student>() {
		public int compare (Student s1, Student s2) {
			int StudentPoint1 = s1.getPoint();
			int StudentPoint2 = s2.getPoint();
			
			return StudentPoint2- StudentPoint1;
		}
	};   

}
