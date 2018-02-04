package LeetCode;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {1,2,9};
int[]a= plusone(b);
for(int i=0; i<a.length; i++)
{
System.out.print("["+a[i]+"]");	
}
	}
	public static int[] plusone(int[] digits) {
		if(digits.length==0)
			return digits;
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i]!=9) {
				digits[i]++;
				return digits;
				}
				else digits[i]=0;
			}
		int[] result= new int[digits.length+1];
		result[0]=1;
		return result;
		}
	}


