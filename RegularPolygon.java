public class RegularPolygon {
    //Initialize data sets
	private int n;
	private double side;
	private double x;
	private double y;

	//Creates a normal polygon to compare
	RegularPolygon() {
		n = 3;
		side = 1;
		x = y = 0;
	}

	//Creates a new polygon
	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
		x = y = 0;
	}

	//Creates another polygon with specific measurments
	RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}

	public void setN(int newN) {
		n = newN;
	}

	public void setSide(double newSide) {
		side = newSide;
	}

	public void setX(double newX) {
		x = newX;
	}

	public void setY(double newY) {
		y = newY;
	}

    //The next four arguments return the new coordinates and sides
	public int getN() {
		return n;
	}

	public double getSide() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	//Returns perimeter
	public double getPerimeter() {
		return side * n;
	}

	//Finally returns the area with the calculation
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}
