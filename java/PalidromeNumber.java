

public class PalidromeNumber {
	public static void main(String[] args) {
		
		int n = 121;
		int rev = 0, rem, temp;
		
		temp = n;
		while(temp>0)
		{
			rem = temp%10;
			rev = rev + rem;
			temp = temp/10;
		}
		
		System.out.println(rev);
		
	}

}
