import org.junit.*;

public class LinkedListTest {
	LinkedList Link_list1 = new LinkedList();
	LinkedList Link_list2 = new LinkedList();
	
	@Test
	public void Pass_testcase1() 
	{
		Link_list1.pushFront(10);
		Link_list1.pushFront(20);
		Link_list1.pushFront(30);
		Link_list1.pushFront(40);
		int[] expectedArr= {40,30,20,10};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArr[k],Link_list1.head.key);	
		  Link_list1.head=Link_list1.head.next;
		}	
	  	
		
	}
	
	@Test
	public void Passtest2() 
	{
		Link_list1.pushBack(50);
		Link_list1.pushBack(60);
		Link_list1.pushBack(70);
		Link_list1.pushBack(80);
		int[] expectedArray= {50,60,70,80};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArray[k],Link_list1.head.key);	
		  Link_list1.head=Link_list1.head.next;
		}
		
	}
	
	
	@Test
	public void Passtest3() 
	{
		Link_list2.pushFront(-12);
		Link_list2.pushFront(-20);
		Link_list2.pushFront(-30);
		Link_list2.pushFront(-40);
		int[] expectedArray1= {-40,-30,-20,-12};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArray1[k],Link_list2.head.key);	
		  Link_list2.head=Link_list2.head.next;
		}
		
	}
	
	@Test
	public void Passtest4() 
	{
		Link_list1.pushFront(10);
		Link_list1.pushFront(20);
		Link_list1.pushFront(30);
		Link_list1.pushFront(40);
		
		Link_list1.popFront();
		Link_list1.popFront();
		
		int[] expectedArray3= {20,10};
		for(int k=0;k<2;k++)
		{
		  Assert.assertEquals(expectedArray3[k],Link_list1.head.key);	
		  Link_list1.head=Link_list1.head.next;
		}
		
	}
	
	@Test
	public void Passtest5() 
	{
		Link_list1.pushBack(-50);
		Link_list1.pushBack(-60);
		Link_list1.pushBack(-70);
		Link_list1.pushBack(-80);
		
		Link_list1.popBack();
		Link_list1.popBack();
		
		int[] expectedArray= {-50,-60};
		for(int k=0;k<2;k++)
		{
		  Assert.assertEquals(expectedArray[k],Link_list1.head.key);	
		  Link_list1.head=Link_list1.head.next;
		}
		
	}
	
	@Test
	public void Passtest6() 
	{
		Link_list1.pushBack(50);
		Link_list1.pushBack(60);
		Link_list1.pushBack(70);
		Link_list1.pushBack(80);
		
		Link_list1.popBack();
		Link_list1.popBack();
		
		int[] expectedArray= {70,80};
		for(int k=0;k<2;k++)
		{
		  Assert.assertNotEquals(expectedArray[k],Link_list1.head.key);	
		  Link_list1.head=Link_list1.head.next;
		}
		
	}
	
	
	@Test
	public void Passtest7() 
	{
		Link_list1.pushFront(5);
		Link_list1.pushFront(10);
		Link_list1.pushFront(15);
		Link_list1.pushFront(20);
		
		Link_list1.pop(5);
		Link_list1.pop(10);
		
		int[] expectedArray7= {20,15};
		for(int k=0;k<2;k++)
		{
		  Assert.assertEquals(expectedArray7[k],Link_list1.head.key);	
		  Link_list1.head=Link_list1.head.next;
		}
		
	}
	
	
	

}

