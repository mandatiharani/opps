import java.util.Scanner;
public class smallestof10num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					Scanner sc = new Scanner(System.in);
					int smal=-99999,n;
					n=sc.nextInt();
					for (int i=0;i<10;i++) {
						System.out.println("entra"+(i+1)+"st/th/rd/nd number");
						n=sc.nextInt();
						if(n<smal) {
							smal=n;
						}
					}
					System.out.println("small:"+smal);	
					}
			}

	
