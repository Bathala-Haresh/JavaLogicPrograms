/**
 * This program is to find PrimeNumbers in java
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
	{
		PrimeNumber primeNumber=new PrimeNumber();
		primeNumber.prime();

	}

	void prime()
	{
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//taking the input from the users
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
}
