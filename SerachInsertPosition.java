package LeetCode;

public class SerachInsertPosition {

	public static void main(String[] args) {
		int[] a= {1,3,5,6};
		System.out.println(searchInsert(a,7));

	}
	public static int searchInsert(int[] nums, int target)
	{
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]>=target)
				return i;
		
		}
		return nums.length;
	}

}
