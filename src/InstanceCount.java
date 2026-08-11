class A{
	static int n=0;
	{
		n++;
	}
	static int getinstances() {
		return n;
	}
}
public class InstanceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		
		System.out.println("no of instances: "+A.getinstances());
		

	}

}
