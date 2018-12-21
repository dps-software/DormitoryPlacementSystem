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
	
	

}
