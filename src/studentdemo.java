class student{
	int rollnum,mark1,mark2,mark3,totalmarks;
	String studname;
	 
	void setstuddetails(int rollnum,String studname,int mark1,int mark2,int mark3) {
		this.rollnum=rollnum;
		this.studname=studname;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void calculatetotal() {
		totalmarks=mark1+mark2+mark3;
	}
	void displaystuddetails() {
		System.out.println("roll no:"+rollnum+"name: "+studname+"totalmarks: "+totalmarks);
	}
}
public class studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		s1.setstuddetails(123,"suhas",30,25,27);
		s1.calculatetotal();
		s1.displaystuddetails();

	}

}
