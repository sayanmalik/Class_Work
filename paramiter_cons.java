class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		}
	void display()
	{
		System.out.println("Roll: "+roll+"name: "+name);
	}
	}

public class paramiter_cons {

	public static void main(String[] args) {
		Student monojit=new Student(101,"Deb");
		monojit.display();
		Student mangaldeep=new Student(102,"Sarkar");
		mangaldeep.display();
		
	}

}