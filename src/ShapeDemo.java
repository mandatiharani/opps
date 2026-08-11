class Shape{
	void Draw() {
		System.out.println("Drawing Shape");
	}
}
class circle extends Shape{
	void Draw() {
		System.out.println("Drawing circle");
	}
	
}
class rectangle extends Shape{
	void Draw() {
		System.out.println("Drawing Rectangle");
	}
	
}
class Triangle extends Shape{
	void Draw() {
		System.out.println("Drawing triangle");
	}
	
}
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape[] shape= {new circle(),new rectangle(),new Triangle()};
		for(Shape s: shape) {
			s.Draw();
		}

	}

}
