package allcorrect;

public class Student implements Comparable<Student> {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	int id;
	String name;
	
	Student(){
		
	}
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
