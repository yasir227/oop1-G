
public class Rectangle {

	private double height;
	private double width;
	
	public Rectangle() {

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Ractangle [height=" + height + ", width=" + width + "]";
	}

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	public double CalculateArea(){
		return (height*width);
		
	}
}
