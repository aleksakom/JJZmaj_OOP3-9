package geometry;

import java.awt.Graphics;

public class Point extends Shape{

	private int x;
	private int y;
	private boolean selected;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this.x = x;
		this.y = y;
		this.selected = selected;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pomocna = (Point)obj;
			if (pomocna.x == this.x && pomocna.y == this.y) {
				return true;
			} else 
				return false;

		} else 
			return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double distance(int x2, int y2) {
		int dx = x2 - x;
		int dy = y2 - y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}

	public boolean contains(int x, int y) {
		return this.distance(x,y) <= 2;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
