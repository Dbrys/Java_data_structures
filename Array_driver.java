
public class Array_driver {

	public static void main(String[] args) {
		Array_structure aray = new Array_structure(15); // calling Array_structure class 
		int x; 
		int length_array; 
		
		aray.setArray(0, 21);
		aray.setArray(1, 199);
		aray.setArray(2, 340);
		aray.setArray(3, 251);
		aray.setArray(4, 11);
		aray.setArray(5, 25);
		aray.setArray(6, 1);
		aray.setArray(7, 456);
		aray.setArray(8, 25);
		aray.setArray(9, 91);
		
		length_array = 10; 
		
		//displaying items in array
        for(x=0; x<length_array; x++)
        {
        	System.out.println(aray.getArray(x)); 
        	
        }
        
        //searching for an item in array 
        int key_item = 340;
        
        for(x = 0; x<length_array; x++)
        {
           if(aray.getArray(x) == key_item)
        	   break;
        }
        
        if(x == length_array)
        	System.out.println("Number not in array");
        
        else
        	System.out.println(key_item + " was found at " + x);
        
  
	
	   //Deleting a item in an array using two classes
	    
       int delt_item = 456; 
       
       for(x = 0; x <length_array; x++)
       {
    	   if(aray.getArray(x) == delt_item)
    		   break; //Mental note to always break after first for loop
       }
       //don't minus length when working with classes
       for(int y = x; y < length_array;y++)
       {
    	 aray.setArray(y, aray.getArray(y+1));
       }
       length_array--; 
       
     //displaying items in array
       for(x=0; x<length_array; x++)
       {
       	System.out.println(aray.getArray(x)); 
       	
       }
		System.out.println(length_array); 

	}
}


