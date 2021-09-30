import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArrayInsertionTest {

	@Test
	public void Array_Instest()
	{
		 // Array array = new Array(); //create an array.	
		    int [] array = new int[7];
		    ArrayInsertion.insert(array,1,0);
		    ArrayInsertion.insert(array,5,1);
		    ArrayInsertion.insert(array,57,2);
		    ArrayInsertion.insert(array,12,3);
		    ArrayInsertion.insert(array,9,4);
		 // array.insert(value,index);//insert 
		    
		  int[] expectedArray= {1,5,57,12,9,0,0};
		  
		  Assert.assertArrayEquals(expectedArray, array);	
		
	}
	
	
	@Test
	public void Array_Instest_Fail()
	{
		 // Array array = new Array(); //create an array.	
		    int [] ArrayF = new int[7];
		    ArrayInsertion.insert(ArrayF,1,0);
		    ArrayInsertion.insert(ArrayF,5,1);
		    ArrayInsertion.insert(ArrayF,57,2);
		    ArrayInsertion.insert(ArrayF,12,3);
		    ArrayInsertion.insert(ArrayF,9,4);
		 // array.insert(value,index);//insert 
		    
		  int[] expectedFArray= {1,5,57,12,9,0,0};
		  
		  Assert.assertNotEquals(expectedFArray, ArrayF);	
		
	}
	
	

}
