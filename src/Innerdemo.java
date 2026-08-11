//non static inner class
class Outer{
	int m=100;
	class Inner
	{
		void dostuff() {
			System.out.println("m="+m);
		}
	}
	
}
public class Innerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner innerObj=new Outer().new Inner();
		innerObj.dostuff();
		

	}

}
//static inner class