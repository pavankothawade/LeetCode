package LeetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs= {"leetcode", "leet"};
		System.out.println(longestCommonPrefix(strs));

	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
			return "";
		String res="";
		for(int i=0; i<strs[0].length(); i++) {
			char c=strs[0].charAt(i);
			for(int j=0; j<strs.length; j++) {
				if(i>= strs[j].length() || strs[j].charAt(i)!=c)
					return res;
			}
			res= res+c;
		}
		return res;
	}

}
