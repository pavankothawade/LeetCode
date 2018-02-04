package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
	int[] result= twoSum(new int[] {2,7,11,15}, 9);
		System.out.println(Arrays.toString(result));

	}
	public static int [] twoSum(int[] a, int target) {
		HashMap <Integer, Integer> hm= new HashMap<Integer, Integer>();
		for(int i = 0; i< a.length; i++)
		{
			if(hm.containsKey(target- a[i]))
			{
				return new int[] {hm.get(target- a[i]), i};
			}
		hm.put(a[i], i);	
		}
		return new int[] {-1,-1};
	}

}
