package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {
	

	@Test
	public void testAdd()
	{
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSubtract()
	{
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.subtract(6, 2);
		Integer expected = 4;
		assertEquals(expected, actual);
		
	}

}
