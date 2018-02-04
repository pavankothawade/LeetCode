package LeetCode;

public class RotateArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
        
        System.out.println(rotate(a,2));
	}
	public static void reverse(int[] nums, int start, int end) {
	while(start < end) {
		int temp= nums[start];
		nums[start]= nums[end];
		nums[end]= temp;
		start++;
		end--;
	}
	}
	public static int[] rotate(int[] nums, int k) {
		k=k%nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
		return nums;
	}
	

}
