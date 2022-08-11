package Assaignment1;
import java .util.Arrays;

public class Missingelement 
	{
	 public static void  main(String args[])
	 {// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int a=1;
		for(int i = 0;i<=arr.length;i++)
		{
		 if(arr[i]!=a)	
		 {
			System.out.println("The missing elemment is:" +a);
			break;
		 }

		a++;
		}

	}

	 }
