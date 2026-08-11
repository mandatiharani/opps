import java.util.Scanner;
public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter array size: ");
		int s=sc.nextInt();
		int Arr[]=new int[s];
		int big=Integer.MIN_VALUE;
		int secbig=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int secsmall=Integer.MAX_VALUE;
		for(int i=0;i<s;i++) {
			System.out.println("Arr["+i+"]: ");
			Arr[i]=sc.nextInt();
		}
		if(s>2) 
		{
			for(int n:Arr) 
			{
				if(n>big)
				{
					secbig=big;
					big=n;
				}
				else if(n>secbig&&secbig!=big)
				{
					secbig=n;
				}
			}
			for(int n:Arr) 
			{
				if(n<small)
				{
					secsmall=small;
					small=n;
				}
				else if(n<secsmall&&secsmall!=small)
				{
					secsmall=n;
				}
			}
			System.out.println("Big:"+big+" secbig:" +secbig);
			System.out.println("small: "+small+"  secsmall: "+secsmall);
		}
		else 
		{
			System.out.println("2 element array not possible");
		}

		}}



