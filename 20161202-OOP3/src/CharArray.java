
public class CharArray {

	private char[] internalArray;
	public static int countObjects;
	
	public CharArray(char[] param)
	{
		this.internalArray = param;
		countObjects++;
	}
	
	public void print()
	{
		for (int i = 0; i < this.internalArray.length; i++)
			System.out.print(internalArray[i]);
		System.out.println();
	}
	
	public void print(int start, int end)
	{
		if (start >= 0 
				&& end >= start 
				&& end < internalArray.length
				)
		{
			for (int i = start; i < end; i++)
				System.out.print(internalArray[i]);
			System.out.println();
		}
			
	}
	
	public int length()
	{
		return internalArray.length;
	}
}
