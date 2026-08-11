import java.util.Scanner;
class Customer{
	int custid;
	String custName,custAddress;
	Customer(int custid,String custName,String custAddress){
		this.custid=custid;
		this.custName=custName;
		this.custAddress=custAddress;
	}
	void display() {
		System.out.println("customer id: "+custid+"customer name:"+custName+"customer Address: "+custAddress);
	}
}
class Accountt{
	int acctid;
	String acctType;
	Customer cust;
	double acctbalance;
	
	Accountt(int acctid,String acctType,Customer cust,double acctbalance){
		this.acctid=acctid;
		this.acctType=acctType;
		this.cust=cust;
		this.acctbalance=acctbalance;
	}
		void display() {
			cust.display();
			System.out.println("Account  id: "+acctid+"Account type:"+acctType+"Balance: "+acctbalance);
	}
	
}
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer id,name,address:");
		int id=sc.nextInt();
		sc.nextLine();
		String name =sc.nextLine();
		String addr =sc.nextLine();
		Customer c=new Customer (id,name,addr);
		System.out.println ("Enter acctid,type,balance");
		int aid=sc.nextInt();
		sc.nextLine();
		String type=sc.nextLine();
		double bal=sc.nextDouble();
		Accountt acc=new Accountt(aid,type,c,bal);
		acc.display();
		sc.close();
	}

}
