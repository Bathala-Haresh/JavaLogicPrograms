/**
 * This program is to find time elapsed between start and stop time
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;

public class StopWatch
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i=0;
	    System.out.print("press Enter key to start the timer:");
	    long StartTime=0;
	    long EndTime=0;
	    String ch;
	    
	    while(true)
	    {
	        ch=sc.nextLine();
	        //if we press enter key then there will be no input so we are checking by isEmpty method
	        if(ch.isEmpty())
	        {
	            if(i==0)
	            {
	                StartTime = System.currentTimeMillis();
	                System.out.print("Press Enter key  to stop the timer: ");
	                i++;
	            }
	            else if(i==1)
	            {
	                EndTime = System.currentTimeMillis();
	                break;
	            }
	        }
	        
	    }
	    sc.close();
	    //finding elapsed time between start time and end time
	    long diff=EndTime-StartTime;
	    double diffsec=(double)diff/1000;
	    double diffmin=(double)diffsec/60;
	    System.out.println(diff+" milli seconds");
	    System.out.println(String.format("%.3f",diffsec)+" seconds");
	    System.out.println(String.format("%.3f",diffmin)+" miniutes");
		
	}
}