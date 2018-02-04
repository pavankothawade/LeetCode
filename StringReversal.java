package LeetCode;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("pavan"));

	}
	public static String reverseString(String s)
	{
		char[] word= s.toCharArray();
		int j= s.length()-1;
		int i=0;
		while ( i < j )
		{
			char temp= word[i];
			word[i]= word[j];
			word[j]= temp;
			i++;
			j--;
		}
		
		return new String(word);
	}

}
