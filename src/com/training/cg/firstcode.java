package com.training.cg;
import java.util.*;
public class firstcode {
	public static void main(String arg[])
	{
		int lucky=3,count=1,num;
		System.out.println("Guess the lucky number between 1 to 10:");
		//Scanner sc = new Scanner(System.in);
		//num =sc.nextInt();
		/*if(num==lucky)
		{
			System.out.println("Congrats! You guessed it correct in "+count );
		}	
		else
		{
			 System.out.println("Not really!! Try Again");*/
			 for(int i=0;i<9;i++)
			 {
				 Scanner sc = new Scanner(System.in);
				 num =sc.nextInt();
				 
				 if(num==lucky)
					{
						System.out.println("Congrats! You guessed it correct in "+count );
					}	
				 else
				 {
					 System.out.println("Not really!! Try Again");
					 
					 count++;
				 }
				 
			 }
			 
			
		}
		
		
	
		
	}


