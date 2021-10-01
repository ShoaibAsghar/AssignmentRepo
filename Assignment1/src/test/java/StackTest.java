import org.junit.*;
import org.junit.Test;

public class StackTest {

	 @Before
     public void StackpassTest() 
     {
		 
	  Stack Objstack = new Stack();		 
	  Objstack.push(5);
	  Objstack.push(10);
	  Objstack.push(15);
	  Objstack.push(20);
	  Objstack.push(25);
	  
     }

	 @Test
     public void stack1()
     {
		    //this test case pass  because stack follow LIFO structure so expected value is 25 
             Assert.assertEquals(Stack.pop(),25);
     }

	 
     @Test
     public void stack2() 
     {
    	//this test case fail because its size is 5 but we give expected 7s 
        Assert.assertEquals(Stack.size,7);
     }

    	

}
