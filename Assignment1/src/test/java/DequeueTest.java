import org.junit.*;
import org.junit.Test;

public class DequeueTest
{	 
	   //objects of Dequeue class
	
	   Dequeue ObjQue1 = new Dequeue(15);	  
	   Dequeue ObjQue2 = new Dequeue(15);
	  
	   @Test
	   public void Fail_Que_test() 
	   {   
		   ObjQue1.addLeft(30);
		   ObjQue1.addRight(40);
		   ObjQue2.addLeft(50);
		   ObjQue2.addRight(60);
		  
	       Assert.assertSame(ObjQue2, ObjQue1);
	      
	   }

	   
	   @Test
	   public void Pass_Que_test() 
	   {
		   ObjQue1.addLeft(30);
		   ObjQue1.addRight(15);
	       Assert.assertNotNull(ObjQue1); 
	       
	   }
	  
	   @Test
	   public void Pass_Que_test2() 
	   {   
		   ObjQue1.addLeft(10);
		   ObjQue1.addRight(50);
		   ObjQue2.addLeft(60);
		   ObjQue2.addRight(80);
		  
	       Assert.assertNotSame(ObjQue2, ObjQue1);
	      
	   }
	  
}
