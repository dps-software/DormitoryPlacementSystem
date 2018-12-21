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
	
	public void listReserved(){
		String total = "\nStudents reserved information:\n";
		
		for(int i =0; i<reservedList.size(); i++){
			total += reservedList.get(i) + "\n";
		}
		System.out.println(total);
	}
	

}
