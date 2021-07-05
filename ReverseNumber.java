/**
 * This program is to find Reverse of a number
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber();
		obj.reverse();


	}

	void reverse()
	{
		int reverseNumber=0;
		Scanner sc=new Scanner(System.in);		
		System.out.print(" Please Enter any Number: ");
		int number = sc.nextInt();
		sc.close();

		while(number !=0)
		{
			int remainder=number%10;
			reverseNumber=reverseNumber * 10 + remainder;
			number=number/10;

		}
		System.out.println("reversed number is " + reverseNumber);
	}

}
