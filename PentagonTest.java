import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PentagonTest {
	
	// test cases for perimeter -----------------------------------------------------------------------------
	@Test
	void testPerimeter1() {
		Pentagon p = new Pentagon(new Point(1, 0), new Point(Math.cos(2*Math.PI/5), Math.sin(2*Math.PI/5)), new Point(Math.cos(4*Math.PI/5), Math.sin(4*Math.PI/5)), new Point(Math.cos(6*Math.PI/5), Math.sin(6*Math.PI/5)), new Point(Math.cos(8*Math.PI/5), Math.sin(8*Math.PI/5)));
		assertEquals(p.perimeter(), 5.877852522924732);
	}
	
	@Test
	void testPerimeter2() {
		Pentagon p = new Pentagon(new Point(0, 4), new Point(3, 2), new Point(3, -1), new Point(-3, -1), new Point(-3, 2));
		assertEquals(p.perimeter(), 12 + 2*Math.sqrt(13));
	}
	
	// test cases for isEquilateral ----------------------------------------------------------------------------
	@Test
	void testIsEquilateral1() {
		Pentagon p = new Pentagon(new Point(1, 0), new Point(Math.cos(2*Math.PI/5), Math.sin(2*Math.PI/5)), new Point(Math.cos(4*Math.PI/5), Math.sin(4*Math.PI/5)), new Point(Math.cos(6*Math.PI/5), Math.sin(6*Math.PI/5)), new Point(Math.cos(8*Math.PI/5), Math.sin(8*Math.PI/5)));
		assertTrue(p.is_equilateral());
	}
	
	@Test
	void testIsEquilateral2() {
		Pentagon p = new Pentagon(new Point(-3, -1), new Point(-3, 2), new Point(0, 4), new Point(3, 2), new Point(3, -1));
		assertFalse(p.is_equilateral());
	}
	
	@Test
	void testIsEquilateral3() {
		Pentagon p = new Pentagon(new Point(0, 0), new Point(-1, 2), new Point(1, 3), new Point(3, 1), new Point(2, 0));
		assertFalse(p.is_equilateral());
	}
	
	@Test
	void testIsEquilateral4() {
		Pentagon p = new Pentagon(new Point(10, 3), new Point(4, 3), new Point(1, 9), new Point(4, 12), new Point(10, 12));
		assertFalse(p.is_equilateral());
	}
	
	@Test
	void testIsEquilateral5() {
		Pentagon p = new Pentagon(new Point(0, 2), new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(1, 3));
		assertFalse(p.is_equilateral());
	}
	
	@Test
	void testIsEquilateral6() {
		Pentagon p = new Pentagon(new Point(Math.sqrt(3), 3), new Point(0, 2), new Point(0, 0), new Point(2, 0), new Point(2, 2));
		assertFalse(p.is_equilateral());
	}
	
	
}
