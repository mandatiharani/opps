

class Outer{
	int m=100;
	class Inner
	{
		void dostuff() {
			System.out.println("m="+m);
		}
	}
	
}
public class StaticInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner innerObj=new Outer.Inner();
		innerObj.dostuff();
		

	}

}