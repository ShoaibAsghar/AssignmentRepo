
import org.junit.*;
import org.junit.Test;
public class StackWithLinkedListTest 
{

	@Before
	public void Before_Testcase()
	{
		
		 StackWithLinkedList.push(10);
		 StackWithLinkedList.push(20);
		 StackWithLinkedList.push(30);
		 StackWithLinkedList.push(40);
         		
	}
	
		@Test 
	    public void PassTestcase() 
		{
	       
	        Assert.assertEquals(40, StackWithLinkedList.top());
	    }

	    @Test
	    public void FailTestcase() 
	    {
	    	StackWithLinkedList.pop();
	    	StackWithLinkedList.pop();
	        Assert.assertEquals(10, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void PassTestcase2() 
		{
	    	 StackWithLinkedList.pop();
	        
	        Assert.assertEquals(30, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void PassTestcase3() 
	    {   
	    	StackWithLinkedList.pop();
	    	StackWithLinkedList.pop();
	    	StackWithLinkedList.pop();
	        Assert.assertEquals(10, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void PassTestcase4() 
		{
	    	 StackWithLinkedList.pop();
	    	 StackWithLinkedList.pop();
	        Assert.assertEquals(20, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void FailTestcase3() 
		{
	    	 StackWithLinkedList.pop();
	    	 StackWithLinkedList.pop();
	        Assert.assertNotEquals(20, StackWithLinkedList.top());
	    }

}

