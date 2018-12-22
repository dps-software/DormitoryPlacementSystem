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
		addPoints(allStudents);
		Collections.sort(allStudents, Student.StuPointComparator);
		
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
	
	public void addPoints(List<Student> list) {  
		  for (int i=0;i<list.size();i++) {
			  if(list.get(i).getHomeCity().equals("Istanbul")) {
				  list.get(i).setPoint(list.get(i).getPoint()+1);
			  }else list.get(i).setPoint(list.get(i).getPoint()+2);
		  }
		 
		  for (int i=0;i<list.size();i++) {
			  if(list.get(i).getAge() == 18) {
				  list.get(i).setPoint(list.get(i).getPoint()+5);
			  }else if (list.get(i).getAge() == 19) {
				  list.get(i).setPoint(list.get(i).getPoint()+4);
			  }else if (list.get(i).getAge() == 20) {
				  list.get(i).setPoint(list.get(i).getPoint()+3);
			  }else if (list.get(i).getAge() == 21) {
				  list.get(i).setPoint(list.get(i).getPoint()+2);
			  }else list.get(i).setPoint(list.get(i).getPoint()+1);
		  }
		 
	  } 
	
	
	
	
	
}
