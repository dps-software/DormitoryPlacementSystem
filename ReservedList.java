import java.util.ArrayList;
import java.util.List;

public class ReservedList {
	List<Student> reservedList = new ArrayList<Student>();
	
	public ReservedList(){
		
	}
	
	public List<Student> getReservedList(){
		return reservedList;
	}
	
	public void addStudent(Student student){
		reservedList.add(student);
		student.setPayment(false);
	}
	

}
