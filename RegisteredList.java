import java.util.ArrayList;
import java.util.List;

public class RegisteredList {
	List<Student> registeredList = new ArrayList<Student>();
	
	public RegisteredList(){
		registeredList = new ArrayList<Student>(250);
	}
	
	public void addStudent(Student student){
		registeredList.add(student);
	}
	
	public void removeStudent(Student student){
		registeredList.remove(student);
	}

}
