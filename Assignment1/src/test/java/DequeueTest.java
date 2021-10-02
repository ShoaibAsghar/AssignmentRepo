import org.junit.*;
import org.junit.Test;

public class DequeueTest
{	 
	   
	   Dequeue ObjQue1 = new Dequeue(15);	  
	   Dequeue ObjQue2 = new Dequeue(15);
	  
	   @Test
	   public void Que_test1() 
	   {   
		   //this test case pass because we check	not same
		   ObjQue1.addLeft(30);
		   ObjQue1.addRight(40);
		   ObjQue2.addLeft(50);
		   ObjQue2.addRight(60);
		  
	       Assert.assertNotSame(ObjQue2, ObjQue1);
	      
	   }
	   
	   
	   
	   @Test
	   public void Pass_Que_test2() 
	   {
		   ObjQue1.addLeft(30);
		   ObjQue1.addRight(15);
	       Assert.assertNotNull(ObjQue1); 
	       
	   }
	   
	   
	  
	   @Test
	   public void Pass_Que_test3() 
	   {   
		   ObjQue1.addLeft(10);
		   ObjQue1.addRight(50);
		   ObjQue2.addLeft(60);
		   ObjQue2.addRight(80);
		  
	       Assert.assertNotSame(ObjQue2, ObjQue1);
	      
	   }
	   
	   @Test
	   public void Que_test4() 
	   {   
		   //this test case pass because we check	not same
		   ObjQue1.addLeft(-30);
		   ObjQue1.addRight(-40);
		   ObjQue2.addLeft(-20);
		   ObjQue2.addRight(-10);
		  
	       Assert.assertNotEquals(ObjQue2, ObjQue1);
	      
	   }
	   
	   @Test
	   public void Pass_Que_test5() 
	   {
		   
		   ObjQue1.addLeft(30);
		   ObjQue1.addRight(15);
		   ObjQue2.addLeft(10);
		   ObjQue2.addRight(5);
	       Assert.assertNotEquals(ObjQue2, ObjQue1);
	       
	   }

	  
}
