import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//https://www.javatpoint.com/difference-between-comparable-and-comparator

class Employeee implements Comparable{
                private int eid;
                private String name;
                public Employeee(int eid, String name) {
                                super();
                                this.eid = eid;
                                this.name = name;
                }
                @Override
                public String toString() {
                                return "Employee [eid=" + eid + ", name=" + name + "]";
                }
                @Override
                public int compareTo(Object o) {
                                Employeee e = (Employeee)o;
                                return e.eid<this.eid?-1:this.eid<e.eid?1:0;
                }
                
}

class Student{
	int id ;
	String name ;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+" "+name;
	}
}
public class CompareableTest {

                public static void main(String[] args) {
                                ArrayList<Employeee> list = new ArrayList<>();
                                list.add(new Employeee(101,"Kanta"));
                                list.add(new Employeee(103,"hari"));
                                list.add(new Employeee(102,"ananda"));
                                System.out.println(list);
                                Collections.sort(list);
                                
                                System.out.println(list);
                                
                                ArrayList<Student> student = new ArrayList<>();
                                student.add(new Student(4,"Z"));
                                student.add(new Student(102,"A"));
                                student.add(new Student(5,"M"));
                                
/*                                Collections.sort(student,new Comparator<Student>() {

									@Override
									public int compare(Student o1, Student o2) {
										return o1.id- o2.id;
									}
                                	
                                });*/
                                
                                Collections.sort(student,(o1,o2)->{
                                		//return o1.id- o2.id;
                                	System.out.println(o1.name.compareTo(o2.name));
                                		//return o1.name.compareTo(o2.name)<0?-1:o1.name.compareTo(o2.name)>0?1:0;
                                	return o2.name.compareTo(o1.name);
                                } );
                                System.out.println(student);
                }
}
