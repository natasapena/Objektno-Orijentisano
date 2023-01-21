package geometry;

public class Circle {

	private Point center;
	private int r;
	private boolean selected;

	public Circle () {
	}
	
	public Circle (Point center, int r ) {
	this.center=center;
	this.r=r;
	}
	
	public Circle (Point center, int r, boolean selected) {
	this.center=center;
	this.r=r;
	this.selected=selected;
	}
	
	@Override
	public String toString() {
		return "Center: " + center + " radius: "+r;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Circle) { // ispitujemo da li je objekat tipa Circle 
			Circle temp = (Circle) obj ; // KASTOVANJE - tip objekta pretvaramo u tip Circle, kako bi mogli porediti
			if (center.equals(temp.getCenter()) && r == temp.getR()){ // da li je centar od temp jednak centru klase Circle u kojoj se nalazimo
				return true;
			}
		}return false;
	}
	
	public double circumference() {
	return 2 * r * Math.PI;
	}
	
	public double area() {
	return r* r * Math.PI;
	}
	
	public boolean contains (int x, int y) {
		return center.distance(x, y) <=r;
	}
	
	//da li circle sadrzi neku tacku
	public boolean contains (Point p) {
		return center.distance(p.getX(),p.getY()) <=r;
	}
	
	public Point getCenter() {
	return center;
	}

	
	public void setCenter(Point center) {
	this.center = center;
	}
	
	public int getR() {
	return r;
	}
	
	public void setR(int r) {
	this.r = r;
	}
	
	public boolean isSelected() {
	return selected;
	}
	
	public void setSelected(boolean selected) {
	this.selected = selected;
	}



	}

