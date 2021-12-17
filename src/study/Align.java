package study;

public class Align {
	public int length;
	public int width;
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width; 
	}
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	public void showRectangle() {
		System.out.println("length:" + this.length );
		System.out.println("width" + this.width);
	}
}
