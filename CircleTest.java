package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
	
	@Test
	void testNegativeRadius() {
		Circle c = new Circle(0,0,-1);
		assertEquals(1, c.radius);
	}

	@Test
	void testZeroCircumference() {
		Circle c = new Circle(1,1,0);
		assertEquals(0, c.circum());
	}
	
	@Test
	void testCircumference() {
		Circle c = new Circle(0,0,3);
		assertEquals(6*Math.PI, c.circum());
	}

	@Test
	void testZeroArea() {
		Circle c = new Circle(1,1,0);
		assertEquals(0, c.area());
	}
	
	@Test
	void testArea() {
		Circle c = new Circle(0,0,3);
		assertEquals(Math.PI*9, c.area());
	}
	
	@Test
	void testEquals() {
		//same centre, same radius
		Circle c1 = new Circle(0,0,0);
		Circle c2 = new Circle(0,0,0);
		assertTrue(c1.equals(c2));
	}
	
	@Test
	void testNotEquals1() {
		//same centre, different radius
		Circle c1 = new Circle(0,0,1);
		Circle c2 = new Circle(0,0,2);
		assertFalse(c1.equals(c2));
	}
	
	@Test
	void testNotEquals2() {
		//different centre, same radius
		Circle c1 = new Circle(0,1,2);
		Circle c2 = new Circle(1,0,2);
		assertFalse(c1.equals(c2));
	}
	
	@Test
	void testNotEquals3() {
		//different centre, different radius
		Circle c1 = new Circle(0,1,2);
		Circle c2 = new Circle(1,0,3);
		assertFalse(c1.equals(c2));
	}
	
	@Test
	void testSameHashCode() {
		//same centre, same radius
		Circle c1 = new Circle(1,1,1);
		Circle c2 = new Circle(1,1,1);
		assertEquals(c1.hashCode(), c2.hashCode());
	}

	@Test
	void testDiffHashCode1() {
		//same centre, different radius
		Circle c1 = new Circle(0,0,1);
		Circle c2 = new Circle(0,0,2);
		assertNotEquals(c1.hashCode(), c2.hashCode());
	}
	
	@Test
	void testDiffHashCode2() {
		//different centre, same radius
		Circle c1 = new Circle(0,1,2);
		Circle c2 = new Circle(1,0,2);
		assertNotEquals(c1.hashCode(), c2.hashCode());
	}
	
	@Test
	void testDiffHashCode3() {
		//different centre, different radius
		Circle c1 = new Circle(0,1,2);
		Circle c2 = new Circle(1,0,3);
		assertNotEquals(c1.hashCode(), c2.hashCode());
	}
	
}
