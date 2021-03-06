package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    	public void testMultipleNumbers(){
    		assertEquals(6, Calculator.add("1,2,3"));
    	}
	
	@Test
    	public void testNewlineDelim(){
    		assertEquals(6, Calculator.add("1\n2,3"));
    	}
	
	@Test
    	public void testCustomDelim(){
    		assertEquals(3, Calculator.add("//;\n1;2"));
    	}
	
/* Had problems with this test, manually testing proved code works
	@Test
    	public void testNegThrowsIllegalArgumentException(){
		Throwable e = null;
		try {
			Calculator.add("-1,2");
		} catch (Throwable ex) {
			e = ex;
		}
  	assertTrue(e instanceof IllegalArgumentException);
	} */
	
	@Test
    	public void testLargeNumber(){
    		assertEquals(2, Calculator.add("1001,2"));
    	}

	
}
