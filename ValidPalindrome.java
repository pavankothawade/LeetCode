package LeetCode;

public class ValidPalindrome {

	public static void main(String[] args) {

System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}
	 public static boolean isPalindrome(String s) {
		 if(s==null || s.length()==0 ||s.length()==1) {
			 return true;
		 }
		 
		 s= s.toLowerCase();
		 int start=0, end=s.length()-1;
		 
		 while(start < end) {
			 if(!Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			 }else if(!Character.isLetterOrDigit(s.charAt(end))){
				 end--;
			 }else if(s.charAt(start) != s.charAt(end)) {
				 return false;
			 }else {
				 start++;
				 end--;
			 }
			 
		 }
		 return true;
		 
	 }

}
