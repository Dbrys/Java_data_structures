
public class Array_structure {

	private long [] ary;   //reference for ary
	public Array_structure(int size) {
		ary = new long [size]; 
	}
	
	public void setArray(int index,long value)// the position in the array and the value to be inserted
	{
		ary[index] = value; 
		
	}
	
	public long getArray(int index)// index to decide which item in the array to get 

	{
		return ary[index]; 
		
	}
}
