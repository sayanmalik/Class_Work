// package oops;

class Emp
{
//	int emp_id= 121;
//	String emp_name= "Sayan";
//	long emp_phno= 1234567890l;
//	int salary= 120000;
	int emp_id;
	String emp_name;
	long emp_phno;
	int salary;
	
	public void setData(int id,String name,long ph,int sal)
	{
		emp_id=id;
		emp_name=name;
		emp_phno=ph;
		salary=sal;
	}
	public void getData()
	{
		System.out.println("Id: "+emp_id+"\n"+"Name: "+emp_name+"\n"+"emp_phno: "+emp_phno+"\n"+"Salary: "+salary);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		Emp e1=new Emp();
		
//		System.out.println("Id "+e1.emp_id);
//		System.out.println("Name: "+e1.emp_name);
//		System.out.println("Phone: "+e1.emp_phno);
//		System.out.println("Salary: "+e1.salary);
		e1.setData(121, "Sayan",1234567890l, 120000);
		e1.getData();
    }
}