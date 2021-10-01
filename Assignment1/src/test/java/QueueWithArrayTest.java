import org.junit.*;
import org.junit.Test;


public class QueueWithArrayTest 

{
	QueueWithArray ObjQue=new QueueWithArray(8);
	
	@Test
	public void Queue_Arraytest1() 
	{
		ObjQue.enqueue(3);
		ObjQue.enqueue(4);
		ObjQue.enqueue(5);
		ObjQue.enqueue(10);
		
	 	Assert.assertEquals(ObjQue.dequeue(), 3);
	 			
	}
	
		
	@Test
	public void Queue_Arraytest2() 
	{
		ObjQue.enqueue(4);
		ObjQue.enqueue(5);
		Assert.assertNotEquals(ObjQue.dequeue(), 5);	
		
	}
	
	@Test
	public void Queue_Arraytest3() 
	{
		ObjQue.enqueue(10);
		ObjQue.enqueue(20);
		ObjQue.enqueue(30);
		Assert.assertEquals(ObjQue.dequeue(), 10);	
		
	}
	
	
	

}

