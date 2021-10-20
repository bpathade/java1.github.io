
import java.io.*;
import java.lang.Object;
 import java.util.Scanner;

public class Even
{

	public static void main(String[] args) 
	{
		int n, i, e = 5;
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter any Number : ");
		n= sc.nextInt();	
		
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				e = e + i; 
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + n + "  =  " + e);
	}
}

