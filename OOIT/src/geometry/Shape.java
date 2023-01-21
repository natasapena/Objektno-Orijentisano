package geometry;

public abstract class Shape {
	
	protected boolean selected;
	public Shape() {
		
	}
	
	public abstract boolean contains (int x, int y);
	
	public Shape (boolean selected) {
		this.selected = selected;
				}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected= selected;
	}
}