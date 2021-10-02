
import org.junit.*;
import org.junit.Test;
public class StackWithLinkedListTest 
{
	
		@Test 
	    public void PassTestcase() 
		{
			 StackWithLinkedList.push(10);
			 StackWithLinkedList.push(20);
			 StackWithLinkedList.push(30);
			 StackWithLinkedList.push(40);
	         Assert.assertEquals(40, StackWithLinkedList.top());
	    }

	    @Test
	    public void FailTestcase1() 
	    {   
	    	//test case pass because we check not equal
	    	StackWithLinkedList.push(10);
		    StackWithLinkedList.push(20);
		    StackWithLinkedList.push(30);
		    StackWithLinkedList.push(40);
		    
	    	StackWithLinkedList.pop();
	    	StackWithLinkedList.pop();
	        Assert.assertNotEquals(10, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void PassTestcase2() 
		{
	    	 StackWithLinkedList.push(10);
			 StackWithLinkedList.push(20);
			 StackWithLinkedList.push(40);
			 
	    	 StackWithLinkedList.pop();
	        
	        Assert.assertEquals(20, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void PassTestcase3() 
	    {   
	    	 StackWithLinkedList.push(10);
			 StackWithLinkedList.push(20);
			 StackWithLinkedList.push(30);
			 StackWithLinkedList.push(40);
			 
	    	StackWithLinkedList.pop();
	    	StackWithLinkedList.pop();
	    	StackWithLinkedList.pop();
	        Assert.assertEquals(10, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void PassTestcase4() 
		{
	    	 StackWithLinkedList.push(10);
			 StackWithLinkedList.push(20);
			 StackWithLinkedList.push(30);
			 StackWithLinkedList.push(40);
			 
	    	 StackWithLinkedList.pop();
	    	 StackWithLinkedList.pop();
	        Assert.assertEquals(20, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void FailTestcase3() 
		{
	    	//this test case pass because we check not equal
	    	 StackWithLinkedList.push(10);
			 StackWithLinkedList.push(20);
			 StackWithLinkedList.push(30);
			
	    	 StackWithLinkedList.pop();
	        Assert.assertNotEquals(10, StackWithLinkedList.top());
	    }

}

