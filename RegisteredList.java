import java.util.ArrayList;
import java.util.List;

public class RegisteredList {
	List<Student> registeredList = new ArrayList<Student>();
	
	public RegisteredList(){	
	}
	
	public void addStudent(Student student){
		registeredList.add(student);
	}
	
	public void removeStudent(Student student){
		registeredList.remove(student);
	}
	
	public List<Student> getRegisteredList(){
		return registeredList;
	}
	
	public void listRegistered(){
		String total = "\nStudents registered information:\n";
		
		for(int i =0; i<registeredList.size(); i++){
			total += registeredList.get(i) + "\n";
		}
		System.out.println(total);
	}
	
}
