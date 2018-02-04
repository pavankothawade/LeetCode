package LeetCode;

public class singleNumber {

	public static void main(String[] args) {
int arr[] = {1,2,3,4,5,1,2,3,4};
        
        
        System.out.println(singleNumber(arr));

	}
	public static int singleNumber(int[] nums)
	{
		int result=0;
		for(int i=0; i< nums.length; i++)
		{
			result= result^nums[i];
		}
		return result;
	}

}
