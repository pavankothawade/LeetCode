
public class reverseinteger {
public static int reverse(int x){
	int rev_num=0;
	while(x>0) {
		
		rev_num= rev_num*10+ x%10;
		x=x/10;
	}
	return rev_num;
}
public static void main(String[] args) {
	System.out.println(reverse(456));
}
}
