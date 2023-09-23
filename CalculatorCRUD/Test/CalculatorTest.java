import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.DAO.CalculatorImplementation;

class CalculatorTest {

	CalculatorImplementation c = new CalculatorImplementation();
	
	@Test
	void test()
	{
		int output = c.addition1(5, 4);
		assertEquals(9, output);
	}
	
	@Test
	void test1()
	{
		int output = c.subtraction1(4, 3);
		assertEquals(1, output);
	}
	
	@Test
	void test2()
	{
		int output = c.multiplication1(4, 3);
		assertEquals(12, output);
	}
	
	@Test
	void test3()
	{
		int output = c.division1(55, 5);
		assertEquals(11, output);
	}


}
