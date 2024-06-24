public class Circle {
	double centre_x;
	double centre_y;
	double radius;
	
	public Circle(double centre_x, double centre_y, double r) {
		this.centre_x = centre_x;
		this.centre_y = centre_y;
		if (r < 0) this.radius =  -r;
		else {
			this.radius = r;
		}
	}
	
	public double circum() {
		return 2*Math.PI*radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public boolean equals(Object o) {
		Circle c = (Circle)o;
		return centre_x == c.centre_x && centre_y == c.centre_y && radius == c.radius;
	}
	
	@Override 
	public int hashCode() {
		return (int)(13*centre_x + 7*centre_y + 17*radius);
	}

}
