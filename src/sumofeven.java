public class sumofeven{

	public static void main(String[] args) {
		int n=300,sumEven=0,sumOdd=0;
		for(int i=1;i<n;i++) {
			if(i%2==0)
				sumEven+=i;
			else
				sumOdd+=i;
		}
		System.out.println("sumof even: "+sumEven+"sum of Odd:"+sumOdd);
		
	}}
	