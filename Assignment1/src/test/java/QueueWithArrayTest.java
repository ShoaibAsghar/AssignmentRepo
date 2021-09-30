import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class QueueWithArrayTest 
{
	QueueWithArray OBJ=new QueueWithArray(8);
	
	@Test
	public void Queue_Arraytest() 
	{
		OBJ.enqueue(3);
		OBJ.enqueue(4);
		OBJ.enqueue(5);
		
	 	Assert.assertEquals(OBJ.dequeue(), 3);
	 	
		
	}

	@Test
	public void Queue_Arraytest2() 
	{
		OBJ.enqueue(4);
		Assert.assertEquals(OBJ.dequeue(), 5);	
		
	}
	
	
}
