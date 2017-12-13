import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	
	public static void main (String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println(removeDupes(nums));

	}
	
	public static List<Integer> removeDupes(List<Integer> nums)
	{
		Collections.sort(nums);
		for(int i = 0; i < nums.size()-1; i++)
		{
			if(nums.get(i) == nums.get(i+1))
			{
				nums.remove(i);
				i--;
			}
		}
		return nums;
	}

}
