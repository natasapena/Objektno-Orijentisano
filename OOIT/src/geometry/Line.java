package geometry;

public class Line {
	
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line ( ) {
	}

	public Line (Point startPoint , Point endPoint ) {
	this.startPoint= startPoint;
	this.endPoint= endPoint;
	}

	public Line (Point startPoint , Point endPoint, boolean selected) {
	this.startPoint= startPoint;
	this.endPoint= endPoint;
	this.selected=selected;
	}
	
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	//ispod equals
	public boolean contains(int x, int y) {
		return(startPoint.distance(x, y) + endPoint.distance(x, y)) - length()<=2;
	}
	
	@Override
	public String toString () {
		return startPoint + " --> " + endPoint;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Line) { 
			Line temp = (Line) obj;
			if(startPoint.equals(temp.getStartPoint()) && endPoint == temp.getEndPoint()) {
				return true;
			}
		}return false;
	}
	
	public Point getStartPoint() {
		return startPoint;
		}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
		}
	
	public Point getEndPoint() {
		return endPoint;
		}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
		}
	
	public boolean isSelected() {
		return selected;
		}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
		}

}
