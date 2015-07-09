package shakirashakira;
import java.util.ArrayList;
// Shakeeb Saleh 109239204
public class Course {
	private String courseName = "";
	private ArrayList<String> students = new ArrayList<String>(100) ;
	private int numberOfStudents;

	 public Course(String courseName) {
	 this.courseName = courseName;
	 }

	public void addStudents(String student){
	 students.add(numberOfStudents, student);
	 numberOfStudents++;
	 }
	public ArrayList<String> getStudents(){
	 return students;
	 }

	public int GetNumberOfStudents(){
	 return numberOfStudents;
	}

	public String getCourseName(){
	 return courseName;
	 }

	public void dropStudent(String studentname){
		for (int i=0; i<students.size(); i++){
			if(students.get(i) == studentname){
				students.remove(i);
			}
		}
	 }

}
