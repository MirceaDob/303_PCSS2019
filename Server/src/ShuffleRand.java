import java.util.*;

public class ShuffleRand
{

	static int[] IDrand = new int[20];
	
	public static int shuffleID()
	{
		
		for(int i = 1; i < IDrand.length; i++) {
			IDrand[i] = i;
		}
		
		MysqlCon rand = new MysqlCon();
	    //Integer[] arr = new Integer[20];
		
		int genID = IDrand[(int)(Math.random() * 20 + 1)];
		
	    System.out.println(genID);
		return genID;
	    
	    //Collections.shuffle(Arrays.asList(IDrand));
	       
	}
}