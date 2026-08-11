import java.util.Scanner;
public class findingprices
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option,itemnumber,quantity;
		double rate,price;
		String itemname;
		do{
			System.out.println("enter Item number");
			itemnumber=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Item name");
			itemname=sc.nextLine();
			System.out.println("enter Rate");
			rate=sc.nextDouble();
			System.out.println("enter quantity");
			quantity=sc.nextInt();
			price=rate*quantity;
			System.out.println("Itemnumber:"+itemnumber+"name:"+itemname+"rate:"+rate);
			
			
			
			
		
		}


	}

}
