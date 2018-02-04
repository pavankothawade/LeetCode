package LeetCode;

import java.util.HashMap;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		System.out.println(duplicate(a));

	}
	public static boolean duplicate(int[] nums)
	{
		boolean flag;
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if(hm.containsKey(nums[i])) {
				flag=true;
				return flag;
			}else
			{
				hm.put(nums[i], i+1);
				
			}
			
		}
		flag=false;
		return flag;
		
	}

}
