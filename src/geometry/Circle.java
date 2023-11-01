package geometry;

import java.awt.Graphics;

public class Circle extends Shape{
	private Point center;
	private int radius;
	private boolean selected;
	
	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);		
		this.selected = selected;
	}

	// Površina kruga
	// Math.PI
	public double area() {
		return radius * radius * Math.PI;
	}

	// Obim kruga
	public double circumference() {
		return 2 * radius * Math.PI;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocna = (Circle)obj;

			if(this.center.equals(pomocna.center) && this.radius == pomocna.radius)
				return true; 
			else
				return false;
		} else
			return false;		
	}

	// Metode pristupa
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean contains(int x, int y) {
		return (center.distance(x,y) <= radius);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int x, int y) {
		this.center.moveTo(x,y);

	}

	@Override
	public void moveBy(int byX, int byY) {
		this.center.moveBy(byX,byY);

	}
}
