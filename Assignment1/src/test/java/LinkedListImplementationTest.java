import org.junit.*;

public class LinkedListImplementationTest {
	LinkedListImplementation Linked_List1 = new LinkedListImplementation();
	
	@Test
	public void Passtest1() throws Exception 
	{
		Linked_List1.add(10);
		Linked_List1.add(15);	
		Linked_List1.add(20);	
		Linked_List1.add(25);	
		Linked_List1.popFront();
		
		int[] expectedArr= {15,20,25};
		for(int k=0;k<3;k++)
		{
		  Assert.assertEquals(expectedArr[k],Linked_List1.headPointer.data);	
		  Linked_List1.headPointer=Linked_List1.headPointer.nextPointer;
		}	
		
	}
	
  
	@Test
	public void Passtest2() throws Exception 
	{
		Linked_List1.pushFront(10);
		Linked_List1.pushFront(20);
		Linked_List1.pushFront(30);
		Linked_List1.pushFront(40);
		int[] expectedArr= {40,30,20,10};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArr[k],Linked_List1.headPointer.data);	
		  Linked_List1.headPointer=Linked_List1.headPointer.nextPointer;
		}
		
	}
	
	@Test
	public void Passtest3() throws Exception 
	{
		Linked_List1.pushFront(-10);
		Linked_List1.pushFront(-20);
		Linked_List1.pushFront(-30);
		Linked_List1.pushFront(-40);
		int[] expectedArray3= {-40,-30,-20,-10};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArray3[k],Linked_List1.headPointer.data);	
		  Linked_List1.headPointer=Linked_List1.headPointer.nextPointer;
		}
		
	}
	
	@Test
	public void Passtest4() throws Exception 
	{
		Linked_List1.pushFront(10);
		Linked_List1.pushFront(20);
		Linked_List1.pushFront(30);
		Linked_List1.pushFront(40);
		int expectednum= 40;
		
		 Assert.assertEquals(expectednum,Linked_List1.topFront());	
		  				
	}
	
	@Test
	public void Passtest5() throws Exception
	{
		Linked_List1.pushFront(10);
		Linked_List1.pushFront(20);
		Linked_List1.pushFront(30);
		Linked_List1.pushFront(40);
		
		Linked_List1.popFront();
		Linked_List1.popFront();
		
		int[] expectedArray5= {20,10};
		for(int k=0;k<2;k++)
		{
		  Assert.assertEquals(expectedArray5[k],Linked_List1.headPointer.data);	
		  Linked_List1.headPointer=Linked_List1.headPointer.nextPointer;
		}
		
	}

	@Test
	public void Passtest6() throws Exception
	{
		 //this test case pass because we check	not equal 
		LinkedListImplementation Linked_List2 = new LinkedListImplementation();
		Linked_List2.pushBack(50);
		Linked_List2.pushBack(60);
		Linked_List2.pushBack(70);
		Linked_List2.pushBack(80);
		Linked_List2.popFront();
		int[] expectedArray6= {50,60,70,80};
		for(int k=0;k<3;k++)
		{
			  Assert.assertNotEquals(expectedArray6[k],Linked_List2.headPointer.data);	
			  Linked_List2.headPointer=Linked_List2.headPointer.nextPointer;
			  
		}
		
	}
	
	@Test
	public void Passtest7() throws Exception 
	{
		Linked_List1.pushBack(10);
		Linked_List1.pushBack(20);
		Linked_List1.pushBack(30);
		Linked_List1.pushBack(40);
		int expectednumber= 40;
		
		 Assert.assertEquals(expectednumber,Linked_List1.topBack());	
		  				
	}
	 
	@Test
	public void Passtest8() throws Exception 
	{
		 //this test case pass because we check	not equal 
		Linked_List1.pushFront(10);
		Linked_List1.pushFront(20);
		Linked_List1.pushFront(30);
		Linked_List1.pushFront(40);
		int expectedSize= 3;
		
		 Assert.assertNotEquals(expectedSize,Linked_List1.size());	
		  				
	}
	
	
}
