class Students
{
	int id1;
	String name1;
	int age1;
	long phno1;
Students(int id,String name)
{
	id1=id;
	name1=name;
	}
Students (int id,String name,int age)
{
	
	id1=id;
	name1=name;
	age1=age;
	}
Students (int id,String name,int age,long phno)
{
	
	id1=id;
	name1=name;
	age1=age;
	phno1=phno;
	}
public void display()
{
	System.out.println("Id: "+id1+"\n"+"Name: "+name1+"\n"+"Age: "+age1+"\n"+"Phone: "+phno1);
	}
	}
public class Const_overload {

	public static void main(String[] args) {
		Students s1=new Students(112,"Sayan");
		Students s2=new Students(112,"Sayan",21);
		Students s3=new Students(112,"Sayan",21,999999999l);
		s3.display();
		
		

	}

}