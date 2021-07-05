/**
 * This program is to find FibonociSeries
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;
public class FibonociSeries {
	public static void main(String args[])
	{
		FibonociSeries obj= new FibonociSeries();
		obj.fibonacci();
	}

	void fibonacci()
	{
		Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Enter the number in which u want to calculate fibonacci : ");
		int count=sc.nextInt();
		sc.close();
		for(int i=2;i<count;i++)
		{

			n3=n1+n2;
			System.out.print(n1 +","+ n3+ " ");
			n1=n2;
			n2=n3;
		}
	}

}
