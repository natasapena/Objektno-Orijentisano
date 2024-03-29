package geometry;

public class Rectangle {

	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;

	public Rectangle () {
	}

	public Rectangle (Point upperLeft, int width, int height) {
	this.upperLeft=upperLeft;
	this.width=width;
	this.height=height;
	}

	public Rectangle (Point upperLeft, int width, int height, boolean selected) {
	this.upperLeft=upperLeft;
	this.width=width;
	this.height=height;
	this.selected=selected;
	}
	
	@Override
	public String toString() {
		return " upper Left point: "+ upperLeft + " width: "+ width+ 
				" ,height: "+height;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle temp = (Rectangle) obj;
			if (upperLeft.equals (temp.getUpperLeft()) && width == temp.getWidth()
					&& height == temp.getHeight()) {
				return true;
			}
		}return false;
	}

	public int circumference() {
	return 2*(width + height);
	}
	
	public int area() {
	return width*height;
	}
	
	public boolean contains (int x, int y) {
		return upperLeft.getX() < x && ((upperLeft.getX()+ width)> x) && (upperLeft.getY()< y
				&& upperLeft.getY()+ width >y);
	}
	
	public boolean contains (Point p) {
		return this.contains(p.getX(), p.getY());	
	}
	
	
	public Point getUpperLeft() {
	return upperLeft;
	}
	
	public void setUpperLeft(Point upperLeft) {
	this.upperLeft = upperLeft;
	}
	
	public int getWidth() {
	return width;
	}
	
	public void setWidth(int width) {
	this.width = width;
	}
	
	public int getHeight() {
	return height;
	}
	
	public void setHeight(int height) {
	this.height = height;
	}
	
	public boolean isSelected() {
	return selected;
	}
	
	public void setSelected(boolean selected) {
	this.selected = selected;
	}


	}


