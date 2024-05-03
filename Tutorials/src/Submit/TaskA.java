package Submit;

//Task A
class Rectangle{
	protected float length;
	protected float width;
	
	public Rectangle(float l, float w) {
		this.length=l;
		this.width=w;
	}
	protected float Area() {
		return length*width;
	}
}
class Box extends Rectangle{
	private float height;
	public Box(float l, float w, float h) {
		super(l,w);
		this.height=h;
	}
	protected float Area(){
	float BoxSurface= 2*(length * width + length * height + width * height);
	return BoxSurface;
	}
	protected float Volume() {
		return length*width*height;
	}
}

public class TaskA{
public static void main(String[] args) {
	Rectangle R1 = new Rectangle(5,8);
	System.out.println("Area of the rectangle is: "+R1.Area());
	Box Box1=new Box(8,10,6);
	System.out.println("The surface area of the box Box1 is: "+Box1.Area());
	}
}