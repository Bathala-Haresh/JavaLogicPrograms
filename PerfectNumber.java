/**
 * This program is to find Perfect Number
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		PerfectNumber perfectNumber=new PerfectNumber();
		perfectNumber.perfect();
	}

	void perfect()
	{
		int i, Number, Sum = 0 ;
		Scanner sc=new Scanner(System.in);		
		System.out.println(" Please Enter any Number: ");
		Number = sc.nextInt();
		sc.close();
		//adding each individual number which are divided by i if it is equal to 0
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n% d is a Perfect Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}
	}

}
