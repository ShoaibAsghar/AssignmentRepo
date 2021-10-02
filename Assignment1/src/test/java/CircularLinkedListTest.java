import org.junit.*;
import org.junit.Test;

public class CircularLinkedListTest 
{
	CircularLinkedList ObjList = new CircularLinkedList();
	CircularLinkedList ObjList2 = new CircularLinkedList();
	
	@Test
	public void Passtest1() 
	{
		ObjList.pushFront(10);
		ObjList.pushFront(20);
		ObjList.pushFront(30);
		ObjList.pushFront(40);
		int[] expectedArr= {40,30,20,10};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArr[k],ObjList.head.key);	
		  ObjList.head=ObjList.head.next;
		}
		
	}
	
	@Test
	public void Passtest2() 
	{
		ObjList.pushBack(50);
		ObjList.pushBack(60);
		ObjList.pushBack(70);
		ObjList.pushBack(80);
		int[] expectedArray= {50,60,70,80};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArray[k],ObjList.head.key);	
		  ObjList.head=ObjList.head.next;
		}
		
	}
	
	
	@Test
	public void Passtest3() 
	{
		ObjList2.pushFront(-12);
		ObjList2.pushFront(-20);
		ObjList2.pushFront(-30);
		ObjList2.pushFront(-40);
		int[] expectedArray1= {-40,-30,-20,-12};
		for(int k=0;k<4;k++)
		{
		  Assert.assertEquals(expectedArray1[k],ObjList2.head.key);	
		  ObjList2.head=ObjList2.head.next;
		}
		
	}
	
	@Test
	public void Passtest4() 
	{
		ObjList.pushFront(10);
		ObjList.pushFront(20);
		ObjList.pushFront(30);
		ObjList.pushFront(40);
		
		ObjList.popFront();
		ObjList.popFront();
		
		int[] expectedArray3= {20,10};
		for(int k=0;k<2;k++)
		{
		  Assert.assertEquals(expectedArray3[k],ObjList.head.key);	
		  ObjList.head=ObjList.head.next;
		}
		
	}
	
	@Test
	public void Passtest5() 
	{
		ObjList.pushBack(-50);
		ObjList.pushBack(-60);
		ObjList.pushBack(-70);
		ObjList.pushBack(-80);
		
		ObjList.popBack();
		ObjList.popBack();
		
		int[] expectedArray= {-50,-60};
		for(int k=0;k<2;k++)
		{
		  Assert.assertEquals(expectedArray[k],ObjList.head.key);	
		  ObjList.head=ObjList.head.next;
		}
		
	}
	
	@Test
	public void Passtest6() 
	{
		 //this test case pass because we check	not equal 
		ObjList.pushBack(50);
		ObjList.pushBack(60);
		ObjList.pushBack(70);
		ObjList.pushBack(80);
		
		ObjList.popBack();
		ObjList.popBack();
		
		int[] expectedArray= {70,80};
		for(int k=0;k<2;k++)
		{
		  Assert.assertNotEquals(expectedArray[k],ObjList.head.key);	
		  ObjList.head=ObjList.head.next;
		}
		
	}
	

}
