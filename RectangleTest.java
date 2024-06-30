package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

	//Testing perimeter
	@Test
	void testPerimeter1() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(1,1);
		Point p3 = new Point(1,0);
		Point p4 = new Point(0,0);
		Rectangle r = new Rectangle(p1,p2,p3,p4);
		assertEquals(r.perimeter(), 4);
	}
	
	@Test
	void testPerimeter2() {
		Point p1 = new Point(0,13);
		Point p2 = new Point(12,13);
		Point p3 = new Point(12,0);
		Point p4 = new Point(0,0);
		Rectangle r = new Rectangle(p1,p2,p3,p4);
		assertEquals(r.perimeter(), 50);
	}
	
	//Testing isEquilateral
	@Test
	void isEquilateralTrue() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(1,1);
		Point p3 = new Point(1,0);
		Point p4 = new Point(0,0);
		Rectangle r = new Rectangle(p1,p2,p3,p4);
		
		assertEquals(r.isEquilateral(), true);
	}
	
	@Test
	void isEquilateralFalse() {
		Point p1 = new Point(0,2);
		Point p2 = new Point(1,2);
		Point p3 = new Point(1,0);
		Point p4 = new Point(0,0);
		Rectangle r = new Rectangle(p1,p2,p3,p4);
		
		assertEquals(r.isEquilateral(), false);
	}

}
