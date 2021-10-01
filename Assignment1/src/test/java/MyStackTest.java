import org.junit.*;
import org.junit.Test;

public class MyStackTest {

	MyStack Obj_stack = new MyStack(15);
	
	 @Before
    public void Before_stack() throws Exception 
	 {
          
		 Obj_stack.push(7);
		 Obj_stack.push(8);
		 Obj_stack.push(10);
		 Obj_stack.push(15);
		 Obj_stack.push(20);
		 
    }

    @Test
    public void Mystack1() throws Exception 
    {
            Assert.assertEquals(Obj_stack.top(), 20);
    }
    
    @Test
    public void Mystack2() throws Exception 
    {
           Assert. assertNotEquals(Obj_stack.size(), 2);
    }
    
    
    @Test
    public void Mystack3() throws Exception 
    {
           Assert. assertEquals(Obj_stack.size(), 5);
    }

   
}
