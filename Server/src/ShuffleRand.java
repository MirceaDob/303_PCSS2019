import java.util.*;

public class ShuffleRand
{
	
	public static void main(String[] args)
	{
	    Integer[] arr = new Integer[20];
	    
	    for (int i = 0; i < arr.length; i++)
	    {
	        arr[i] = i + 1;	        
	    }	    
	    
	    Collections.shuffle(Arrays.asList(arr));
	    
	    for (int k=1; k<=5; k++)
	    {
	        System.out.println(arr[k]);
	    }	    
	}
}