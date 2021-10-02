import org.junit.Test;
import org.junit.*;

public class QueueImplementationTest

{

	QueueImplementation OBJ=new QueueImplementation(7);
	
	@Test
	public void Quetest() throws Exception 
	{
		OBJ.enqueue(3);
		OBJ.enqueue(4);
		OBJ.enqueue(5);
		
	 	Assert.assertEquals(OBJ.dequeue(),3);
	 	
	}
	
	
	@Test
	public void Quetest2() throws Exception 
	{
		//test case pass because we check false
		OBJ.enqueue(9);
	 	Assert.assertFalse(OBJ.empty() == true);
	 	
	}
	
	
	
	@Test
	public void Quetest3() throws Exception 
	{
		OBJ.enqueue(7);
		OBJ.enqueue(3);
		OBJ.enqueue(4);
		OBJ.enqueue(5);

		Assert.assertEquals(OBJ.dequeue(),7);
	 	
	}
	
	@Test
	public void Quetest4() throws Exception 
	{
		//test case pass because we check not equal
		OBJ.enqueue(5);
		OBJ.enqueue(6);
		OBJ.enqueue(7);
		OBJ.enqueue(8);

		Assert.assertNotEquals(OBJ.dequeue(),6);
		
	}
	
	@Test
	public void Quetest5() throws Exception 
	{
	 	Assert.assertTrue(OBJ.empty() == true);
	 	
	}


	
}

