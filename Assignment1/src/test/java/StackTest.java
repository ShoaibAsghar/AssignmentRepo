import org.junit.*;
import org.junit.Test;

public class StackTest {


	 @Test
     public void stack1()
     {
		    //this test case pass  because stack follow LIFO structure so expected value is 25 
		  Stack Objstack = new Stack();		 
		  Objstack.push(5);
		  Objstack.push(10);
		  Objstack.push(15);
		  Objstack.push(20);
		  Objstack.push(25);
             Assert.assertEquals(Stack.pop(),25);
     }

	 
     @Test
     public void stack2() 
     {
    	//this test case fail because its size is 5 but we give expected 7s 
    	 Stack Objstack = new Stack();		 
   	     Objstack.push(5);
   	     Objstack.push(10);
   	     Objstack.push(15);
   	     Objstack.push(20);
   	     Objstack.push(25); 
         Assert.assertNotEquals(Stack.size,7);
     }
     
     @Test
     public void stack3() 
     {
    	//this test case fail because its size is 5 but we give expected 7s 
    	 Stack Objstack = new Stack();		 
   	     Objstack.push(5);
   	     Objstack.push(10);
   	     Objstack.push(15);
   	     Objstack.push(20);
         Assert.assertEquals(Stack.size,4);
     }
     
     @Test
     public void stack4()
     {
		    
		  Stack Objstack = new Stack();		 
		  Objstack.push(5);
		  Objstack.push(10);
		  Objstack.push(15);
		  Objstack.push(20);
          Assert.assertNotEquals(Stack.pop(),15);
     }
     

    	

}
