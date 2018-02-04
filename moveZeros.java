package LeetCode;

public class moveZeros {

	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        
        moveZero(arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

	}
	public static void moveZero(int[] nums)
	{
		int count=0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]!=0)
			{
				nums[count++]=nums[i];
			}
		}
		while(count< nums.length)
		{
			nums[count++]=0;
		}
	}

}
