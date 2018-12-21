
public class Student {
	private String studentName;
	private int age;
	private String homeCity;
	private boolean payment;
	
	public Student (String studentName, int age, String homeCity) {
		this.studentName = studentName;
		this.age = age;
		this.homeCity = homeCity;
		payment = false;
	}
	
	public Student (String studentName, int age, String homeCity, boolean payment) {
		this.studentName = studentName;
		this.age = age;
		this.homeCity = homeCity;
		this.payment = payment;
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
	
	public String getHomeCity() {
		return homeCity;
	}
	
	public boolean getPayment(){
		return payment;
	}
	
	public void setPayment(boolean payment){
		this.payment = payment;
	}
	
	public String toString(){
		return ("Name: " + getStudentName() +"\n"+
	            "Age: " + getAge() +"\n"+ 
	            "HomeCity: " + getHomeCity() +"\n"+ 
	            "Payment: " + getPayment()+"\n");
	}

}
