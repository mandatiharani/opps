
public class addingofnumbersuntilusergives0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;
	
				Scanner sc=new Scanner (System.in);
				int n,sum=0;
				for(;;) {
					System.out.println("enter a number: ");
					n=sc.nextInt();
					if(n==0)break;
					sum+=n;
					
				}
		        System.out.println("sum: "+sum);
			}

		}

	