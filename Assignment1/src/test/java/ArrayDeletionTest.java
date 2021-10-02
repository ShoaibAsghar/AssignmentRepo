import org.junit.*;
import org.junit.Test;
public class ArrayDeletionTest {

	@Test
	 public void Pass_Test1() 
	{
        int[] array = {1,2,3, 4, 5, 7};
        int Index_Delete = 3;
        ArrayDeletion objDelete=new ArrayDeletion();
        objDelete.delete(array,3);
       
        int[] expectedArray = {1,2,3,5,7, -1};
        Assert.assertArrayEquals("Value at index 3 deleted", expectedArray, array);
    }

	
    @Test
    public void Pass_Test2() 
    {
        int[] array = {1,2,3, 4, 5, 7};
        int Index_Delete = 4;
       
        ArrayDeletion objDelete=new ArrayDeletion();
        objDelete.delete(array,4);
        int[] expectedArray = {1,2,3, 4, 7, -1};
        
        Assert.assertArrayEquals("Value of index delete 4 ", expectedArray, array);
    }
    
    @Test
    public void Pass_Test3() 
    {
    	//this test case pass because we check not equal
        int[] array = {1,2,3, 4, 5, 7};
        int Index_Delete = 5;
       
        ArrayDeletion objDelete=new ArrayDeletion();
        objDelete.delete(array,5);
        int[] expectedArray = {1,2,3, 4, 7, -1};
        
        Assert.assertNotEquals("Value of index 5 delete  ", expectedArray, array);
    }
 
    
	
}
