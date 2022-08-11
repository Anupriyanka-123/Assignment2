package Assaignment1;

public class palindrome1 {

	public static void main(String[] args) {
		int num =34343,temp ,rev,s;
		temp=num;
		{
			for( rev=0;num>0;num/=10)
			{
				s=num%10;
				rev=(rev*10)+s;
				
			}
			System.out.println(temp);
			if(rev==temp)
			{
				System.out.println("the given number is palindrome");
			}
			else
			{
				System.out.println("the given number is not palindrome");
			}

		}

	}

}
 
