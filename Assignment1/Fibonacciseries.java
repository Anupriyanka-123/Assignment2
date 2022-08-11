package Assaignment1;

public class Fibonacciseries {

	public static void main(String[] args) 
	{
		int range=8,firstnum=0,secnum=1,sum;
		System.out.println(firstnum+ "" +secnum);
		for(int i=2;i<=2;++i)
		{
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
		    System.out.println("" +sum);
		}

	}

}
