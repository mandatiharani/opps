import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				Scanner sc=new Scanner (System.in);
				System.out.println("enter row size: ");
				int r=sc.nextInt();
				System.out.println("enter column size: ");
				int c=sc.nextInt();
				int mat[][]=new int[r][c];
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++) 
					{
						System.out.println("mat["+i+"]["+j+"]");
						mat[i][j]=sc.nextInt();
					}	
				}
				for(int i=0;i<r;i++) 
				{
					for(int j=0;j<c;j++)
					{
						System.out.print(mat[i][j]+" ");
					}
					System.out.println(" ");
				}
			

	}

}
