package study;

public class Circle {
	public int radious;
	public String color;
	public void setRadius(int radiousCircle) {
		this.radious = radiousCircle;
	}
	public int getRadius() {
		return this.radious;
	}
	public void setColor(String colorCircle) {
		this.color = colorCircle;
	}
	public void showCircle() {
		System.out.println("radious:" + this.radious );
		System.out.println("color" + this.color);
	}
}
