import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

	@Test
	public void Insert_valuestest()
	{
	  Array array = new Array(); //create an array.	
	  int value=3;
	  int index=0;
	  array.insert(value,index);//insert 
	  boolean resultant=array.linearSearch(value);
	  boolean expectedResult=true;
	  Assert.assertEquals(expectedResult, resultant);
	  
	}
	
	
	@Test
	public void delete_check()
	{
		  Array array = new Array(); //create an array.	
		  int value=2;
		  int index=0;
		  array.insert(2,0);//insert 
		  array.insert(4,1);//insert 
		  array.insert(6,2);//insert
		  array.delete(2);
	      boolean expected_R=false;
	     
	      boolean resultant_R=array.linearSearch(4);
	    //  Assert.assertFalse(array.linearSearch(4));
	      Assert.assertNotEquals(expected_R, resultant_R);
	      
	      
	}
	
	@Test
	public void Linear_search_check()
	{
		 Array array = new Array(); //create an array.	
		 array.insert(3,0);//insert 
		 array.insert(4,1);//insert
		 array.insert(5,2);//insert
		 array.insert(3,3);//insert 
		 boolean Result_R=array.linearSearch(5);
	     boolean expected_Re=true;
	     Assert.assertEquals(expected_Re, Result_R);
		
	}
	
	@Test
	public void Binary_SearchCheck()
	{
		 Array array = new Array(); //create an array.	
		 array.insert(5,0);//insert 
		 array.insert(6,1);//insert
		 array.insert(7,2);//insert
		 array.insert(8,3);//insert 
		 array.insert(9,4);//insert
		 array.insert(10,5);//insert 
		 boolean Result_B=array.binarySearch(8,0,5);
		 boolean expected_B=true;
		 Assert.assertEquals(expected_B, Result_B);
	}

}


