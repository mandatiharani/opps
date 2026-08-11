class person{
	String name,addr;
	int age;
	person(String name,int age,String  addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	public String toString() {
		return "Name:"+name+"Addr:"+addr;
	}
}
class Employee extends person{
	int empid;
	String dept;
	Employee(person p , int empid,String dept){
		super(p.name,p.age,p.addr);
		this.empid=empid;
		this.dept=dept;
	}
	void getDetails() {
		System.out.println("Emp id:"+empid+"Dept:"+dept);
	}
}
public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person ("ABC",25,"wgl");
		Employee e=new Employee(p,123,"Sales");
		System.out.println(p);
		e.getDetails();
		

	}

}
