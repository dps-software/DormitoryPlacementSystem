import java.util.ArrayList;
import java.util.List;

public class PaymentList {
	
	public List <Student> paymentList = new ArrayList<Student>();

	public PaymentList(){
	}
	
	public List<Student> getPaymentList(){
		return paymentList;
	}
	
	public void addStudent(Student student){
		paymentList.add(student);
	}
	
	public void removeStudent(Student student){
		paymentList.remove(student);
	}
	public void listPayment(){
		System.out.println("Students payment information");
		
		for(int i =0; i<paymentList.size(); i++){
			if(paymentList.get(i).getPayment() == false){
				System.out.println("False");
			}else{
				System.out.print(paymentList.get(i).getStudentName() + " ");
				System.out.println("True");
			}
		}
	}
	

}
