
public class Arrays {

	public static void main(String[] args) {
		
		long [] numEx = new long[10]; 
		numEx[0] = 52; 
		numEx[1] = 66;
		numEx[2] = 22;
		numEx[3] = 45;
		numEx[4] = 23;
		numEx[5] = 96;
		numEx[6] = 12;
		numEx[7] = 74;
		numEx[8] = 75;
		numEx[9] = 18;
		
		int arry_length = numEx.length;// how many items are in the array 
		System.out.println("The length of the array is " + arry_length);
		int x; //must initialize if searching through an array 
		
		for(x =0; x<arry_length; x++)
		{
			System.out.println(numEx[x]+ " ");	
		}
		
	// Searching for the 12
	// Big O notation of N/2
		int keyItem = 12;
		for(x =0; x<arry_length; x++)
		{
			if(numEx[x] == keyItem)
			   break; 
		}
		
		if(x == arry_length)
			System.out.println("The number is not in the array "); 
		
		else
			System.out.println("Found the keyItem " + keyItem);	
			
	
	// Deleting and item in an array 
	// Bit O notation of N + N/2
	   int dlt_item = 23; 
	   for(x = 0; x<arry_length; x++)
	   {
		   if(numEx[x] == dlt_item)
			   break; 
	   }
	   //y has to be equal to x 
	   //x is the number to be removed
	   for(int y = x; y < arry_length-1; y++)//the x is removed when by being replaced 
	   {
		   numEx[y] = numEx[y+1]; 
	   }
	   arry_length--;//reduce the length of array by 1 since we removed a item  
	   
	   for(x =0; x<arry_length; x++)
		{
			System.out.println(numEx[x]+ " ");	
		}
		
	  
		
	}
}

