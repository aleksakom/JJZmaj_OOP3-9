package geometry;

public class Line {
	private Point startPoint; //tip podatka je Point. startPoint je zapravo objekat klase Point sa svim pripadajucim obelezjima koja su definisana!!!
	private Point endPoint;
	private boolean selected;

	// U okviru ove metode se poziva metoda distance iz klase Point
	// pozivamo metodu distance jer je vec kreirana, i samim tim koristimo vec nesto
	// sto je kreirano da ne bismo imali vise puta isti kod
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
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

}
