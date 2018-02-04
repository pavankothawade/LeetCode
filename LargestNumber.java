package LeetCode;

public class LargestNumber {

	public static void main(String[] args) {
		int [] a= {3, 6, 1, 200};
		System.out.println(dominantIndex(a));
	}
	public static int dominantIndex(int[] nums) {
		int maxindex = 0;
		for(int i = 1; i < nums.length; i++)
			if(nums[i] > nums[maxindex])
				maxindex = i;
		
		
		int i;
		for(i = 0; i < nums.length; i++) {
			if(i == maxindex)
				continue;
			if(nums[maxindex] < nums[i] * 2)
				break;
		}
		
		if(i == nums.length) {
			return maxindex;
		}
		return -1;
	}

}
