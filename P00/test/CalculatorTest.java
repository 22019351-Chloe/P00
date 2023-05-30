import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	public void testSubtract() {
		int a=2345;
		int b=1432;
		
		Calculator cal=new Calculator();
		int actual=cal.subtract(a, b);
		int expected=913;
		
		assertEquals(expected,actual);
	}
	
	public void testDivide() {
		int a=300;
		int b=5;
		Calculator cal=new Calculator();
		int actual=cal.divide(a, b);
		int expected=60;
		
		assertEquals(expected,actual);
	}

	public void testMultiple() {
		int a=523;
		int b=243;
		
		Calculator cal=new Calculator();
		int actual=cal.multiple(a, b);
		int expected=127089;
		
		assertEquals(expected,actual);
	}
	
}
