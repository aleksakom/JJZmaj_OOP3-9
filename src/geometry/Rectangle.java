package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape{
	private Point upperLeftPoint; //uociti tip podatka!!!
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {

	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width; 
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height); 
		this.selected = selected;
	}

	// Povrsina pravougaonika P=w*h
	public int area() {
		return width * height;
	}

	// Obim pravougaonika
	public int circumference() {
		return 2 * (width + height);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) && this.width == pomocna.width
					&& this.height == pomocna.height)
				return true;
			else 
				return false;
		} else 
			return false;

	}

	// Metode pristupa
	public Point getUpperLeftPoint() {
		return this.upperLeftPoint;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
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

	public boolean contains(int x, int y) {
		return (x >= upperLeftPoint.getX() && x <= upperLeftPoint.getX() + width 
				&& y >= upperLeftPoint.getY() && y <= upperLeftPoint.getY() + height);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
