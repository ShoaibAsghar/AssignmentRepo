import org.junit.*;
import org.junit.Test;

public class QueueWithLinkedListTest 
{
	QueueWithLinkedList Obj_Que = new QueueWithLinkedList();
    
	@Test
    public void Failtest() {
        
    	QueueWithLinkedList.enqueue(25);
    	QueueWithLinkedList.enqueue(30);

        Assert.assertNotEquals(1, QueueWithLinkedList.size);
    }
	
    @Test
    public void Passtest() 
    {
       
    	QueueWithLinkedList.enqueue(20);
    	QueueWithLinkedList.enqueue(40);

        Assert.assertEquals(2, QueueWithLinkedList.size);
    }
   
    @Test
    public void Passtest2() 
    {
       
    	QueueWithLinkedList.enqueue(50);
    	QueueWithLinkedList.enqueue(60);

        Assert.assertEquals(50, QueueWithLinkedList.dequeue());
    }
    
    @Test
    public void Passtest3() 
    {
       
    	QueueWithLinkedList.enqueue(60);
    	QueueWithLinkedList.enqueue(70);

        Assert.assertNotEquals(70, QueueWithLinkedList.dequeue());
    }
    


}

