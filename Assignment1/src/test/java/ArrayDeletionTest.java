import org.junit.*;
import org.junit.Test;
public class ArrayDeletionTest {

	@Test
	 public void deleteTestPassing() 
	{
        int[] array = {3, 4, 5, 11, 12, 13};
        int deletionIndex = 3;
        ArrayDeletion AB=new ArrayDeletion();
        AB.delete(array,3);
       // ArrayDeletion.AB.delete(array,3);
        int[] expectedArray = {3, 4, 5, 12, 13, -1};
        Assert.assertArrayEquals("Value at index 3 should be deleted and " + "original array should be affected", expectedArray, array);
    }

	
    /*
     * This test checks if the length of the array has reduced after
     * performing the deletion. Here, as seen, the delete function
     * doesn't alter the length of the resultant array and thereby
     * it is bound to fail.
     */
	
    @Test
    public void deleteTestFailing() {
        int[] array = {3, 4, 5, 11, 12, 13};
        int deletionIndex = 3;
       // int expectedArrayLength = array.length;
        ArrayDeletion AB=new ArrayDeletion();
        AB.delete(array,3);
        int[] expectedArray = {3, 4, 5, 12, 0, -1};
       // ArrayDeletion.delete(array,3);
        //Assert.assertEquals("Array size should reduce by 1 upon deletion",
          //      expectedArrayLength, array.length);
        Assert.assertArrayEquals("Value at index 3 should be deleted and " + "original array should be affected", expectedArray, array);
    }

	
}
