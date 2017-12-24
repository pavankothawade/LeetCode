import java.util.Scanner;

public class twosum {
 public static int[] twosum(int[] nums, int target) {
	 for(int i=0;i<nums.length; i++) {
		 for(int j=i+1;j<nums.length; j++) {
			 if(nums[j]==target-nums[i]) {
				 return new int[] {i,j};
			 }
		 }
	 }
	  return new int[] {};
	 }
public static void main(String[] args) {
	int array[]= {1,2,3,4,5};
	int number= 143;
	
	System.out.println();
	
	
}

}
