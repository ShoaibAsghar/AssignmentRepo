import org.junit.*;
import org.junit.Test;

public class LinkedListSwapNodesTest {

     @Test
     public void Pass_Test1()
     {      
    	     LinkedListSwapNodes.pushFront(50);
    	     LinkedListSwapNodes.pushFront(60);
    	     LinkedListSwapNodes.pushFront(70);
             Assert.assertEquals(LinkedListSwapNodes.head.key, 70);
     }
     
     @Test
     public void Pass_Test2()
     {      
    	     LinkedListSwapNodes.pushFront(50);
    	     LinkedListSwapNodes.pushFront(60);
    	     LinkedListSwapNodes.pushFront(70);
             Assert.assertNotEquals(LinkedListSwapNodes.head.key, 60);
     }
     
     @Test
     public void Pass_Test3()
     {      
    	     LinkedListSwapNodes.pushFront(50);
    	     LinkedListSwapNodes.pushFront(60);
    	     LinkedListSwapNodes.pushBack(80);
    	     LinkedListSwapNodes.pushFront(90);
             Assert.assertNotEquals(LinkedListSwapNodes.head.key, 60);
     }


     @Test
     public void Pass_Test4()
     {   
    	 LinkedListSwapNodes.pushFront(50);
	     LinkedListSwapNodes.pushFront(60);
	     LinkedListSwapNodes.pushBack(80);
	     LinkedListSwapNodes.pushFront(90);
    	
	     LinkedListSwapNodes.swap();
         Assert.assertEquals(LinkedListSwapNodes.head.key, 80);
     }

     @Test
     public void Pass_Test5()
     {
    	 LinkedListSwapNodes.pushBack(40);
    	 LinkedListSwapNodes.pushFront(50);
	     LinkedListSwapNodes.pushFront(60);
    	 LinkedListSwapNodes.swap();
         Assert.assertEquals(LinkedListSwapNodes.head.key, 40);
     }
     
     @Test
     public void Pass_Test6()
     {	 
    	 //this test case pass because we check	not equal 
    	 LinkedListSwapNodes.pushBack(10);
    	 LinkedListSwapNodes.pushFront(20);
    	 LinkedListSwapNodes.pushBack(30);
    	 LinkedListSwapNodes.swap();
         Assert.assertNotEquals(LinkedListSwapNodes.head.key, 10);
     }
     
     @Test
     public void Pass_Test7()
     {	 
    	 LinkedListSwapNodes.pushFront(50);
    	 LinkedListSwapNodes.pushFront(60);
    	 
    	 LinkedListSwapNodes.pushBack(70);
    	 LinkedListSwapNodes.pushBack(80);
    	 LinkedListSwapNodes.swap(); 
             Assert.assertEquals(LinkedListSwapNodes.head.key, 80);
     }
     
     @Test
     public void Pass_Test8()
     {	 
    	 LinkedListSwapNodes.pushFront(50);
    	 LinkedListSwapNodes.pushFront(60);
    	 
    	 
    	 LinkedListSwapNodes.pushBack(70);
    	 LinkedListSwapNodes.pushBack(80);
    	 LinkedListSwapNodes.swap(); 
    	 LinkedListSwapNodes.swap();
             Assert.assertEquals(LinkedListSwapNodes.head.key, 60);
     }
     
     
}
