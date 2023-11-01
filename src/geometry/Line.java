package geometry;

import java.awt.Graphics;

public class Line extends Shape {
	private Point startPoint; //tip podatka je Point. startPoint je zapravo objekat klase Point sa svim pripadajucim obelezjima koja su definisana!!!
	private Point endPoint;
	private boolean selected;
	
	
	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint; 
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	// U okviru ove metode se poziva metoda distance iz klase Point
	// pozivamo metodu distance jer je vec kreirana, i samim tim koristimo vec nesto
	// sto je kreirano da ne bismo imali vise puta isti kod
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Line) {

			Line pomocna = (Line)obj;
			if (pomocna.startPoint.equals(this.startPoint) && pomocna.endPoint.equals(this.endPoint)) {
				return true;
			} else
				return false;

		} else 
			return false;
	}
	

	// Metode pristupa (GET i SET)
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
	
	public boolean contains(int x, int y) {
		return startPoint.distance(x,y) + endPoint.distance(x,y) - length() <= 2;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int x, int y) {
		this.startPoint.moveTo(x,y);

	}

	@Override
	public void moveBy(int byX, int byY) {
		this.startPoint.moveBy(byX,byY);
		this.endPoint.moveBy(byX,byY);

	}


}
