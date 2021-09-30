import org.junit.Test;
import org.junit.*;

public class QueueImplementationTest {

	QueueImplementation OBJ=new QueueImplementation(7);
	
	@Test
	public void Quetest() throws Exception 
	{
		OBJ.enqueue(3);
		OBJ.enqueue(4);
		OBJ.enqueue(5);
		
	 	Assert.assertEquals(OBJ.dequeue(), 3);
	 	
	}
	
	
	@Test
	public void Quetest2() throws Exception 
	{
		
	 	Assert.assertFalse(OBJ.empty() == true);
	 	
	}
	
	
	
	@Test
	public void Quetest3() throws Exception 
	{
		//OBJ.dequeue();
        //OBJ.dequeue();
	 	Assert.assertTrue(OBJ.empty() == true);
	 	
	}

	
}

