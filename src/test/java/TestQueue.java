import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueue
{
	 Queue<String> B;
	 Queue<String> A;
	
	@BeforeEach
	void setUp() throws Exception
	{
		B = new Queue<String>();
	}
	
	@Test 
	void testUnderFlowException()
	{
		assertThrows(QueueUnderFlowException.class, () ->
		{
			B.pop();
		});
	}
	@Test 
	void testStacks()
	{
		A = new Queue<String>();
		assertTrue(A.isEmpty());
		A.push("1st");//first
		assertFalse(A.isEmpty());
		A.push("2nd");
		A.push("3rd");
		assertEquals("1st",A.pop());
		assertEquals("2nd",A.pop());
		assertEquals("3rd",A.pop());
		assertTrue(A.isEmpty());
		assertThrows(QueueUnderFlowException.class, () ->
		{
			A.pop();
		});
		
	}
}


