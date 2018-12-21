import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Software {
	static List<Student> allStudents = new ArrayList<>();
	
	public static RegisteredList registered = new RegisteredList();
	public static PaymentList payment = new PaymentList();
	public static ReservedList reserved = new ReservedList();
	public static RandomG r = new RandomG();
	
	
	public Software() {
		createAllStudents();
		createRegisteredStudents(allStudents);
		createReservedList(allStudents);
		createPaymentList(allStudents);
		removeUnpaidStudents();
		
	}
	
	public static void main (String[] args) {
		
		
	}
	
	public void createAllStudents(){
		for (int i=0;i<500;i++) {
			Student student = new Student("", 0, "");
			student.setStudentName(r.createRandomName());
			student.setAge(r.generateAge());
			student.setHomeCity(r.generateCity());
			student.setPayment(r.randomPayment());
			allStudents.add(student);
		}
	}
	
	public static void createRegisteredStudents(List<Student> obj){
		for (int i=0; i<allStudents.size()/2;i++){
			registered.addStudent(obj.get(i));
		}
		
	}
	
	public  void createReservedList(List<Student> obj){
		for(int i = obj.size()/2; i<obj.size(); i++){
			reserved.addStudent(obj.get(i));
		}
	}
	
	public  void createPaymentList(List<Student> obj){
		for (int i=0; i<allStudents.size()/2;i++){
			payment.addStudent(obj.get(i));
			removeUnpaidStudents();
		}
	}
	
	public PaymentList removeUnpaidStudents(){ 
		for(int j = 0; j<payment.getPaymentList().size(); j++){
			if(payment.getPaymentList().get(j).getPayment() == false){
				payment.removeStudent(payment.getPaymentList().get(j));
			} 
		}
		
		return payment;
	}
	
	  public void copyFromPaymentList(){
		registered.getRegisteredList().clear();
		registered.getRegisteredList().addAll(payment.getPaymentList());
	}
    
    public void takeFromReserveList(){
    	
    	int  count = 0;
    	for(int i = registered.getRegisteredList().size(); i < 250; i++){
    		registered.addStudent(reserved.reservedList.get(count));
    		reserved.reservedList.get(count).setPayment(true);
    		count++;
    	}
    }
	
	
	
}
