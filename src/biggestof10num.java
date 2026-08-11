import java.util.Scanner;
public class biggestof10num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int big=0,n;
			n=sc.nextInt();
			for (int i=0;i<10;i++) {
				System.out.println("entra"+(i+1)+"st/th/rd/nd number");
				n=sc.nextInt();
				if(big<n) {
					big=n;
				}
			}
			System.out.println("big:"+big);	
			}
	}