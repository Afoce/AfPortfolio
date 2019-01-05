/*Write a program that searches a file of numbers and displays the largest number, the smallest number, and the average of all the
 *numbers in the file. Do not assume that the numbers in the file are in any special order. Your program should obtain the file name
 *from the user. Use either a text file or a binary file. For the text-file version, assume one number per line. For the 
 *binary-file version, use numbers of type double that are written using writeDouble.
 * */

package assignment3;
import java.io.*;
import java.util.Scanner;

public class ReadMinMaxAvgFile {
public static void main (String []args) {
	double value;
	//double average;
	double sum=0;
	double max =-2147483648; //Double.MIN_VALUE;
	double min = 2147483647;
	Scanner inputStream = null;
	Scanner inp = new Scanner(System.in);
	String fileName; //File x = new File(fileName);
	
	//boolean exc = true;
	
	
	//while (exc) {
	try {
		System.out.println("Please enter the name of the file.");
		fileName=inp.nextLine();
		inputStream = new Scanner(new File(fileName));
		int ctr = 0;
		while(inputStream.hasNextDouble()) {
			ctr++;
			value = inputStream.nextDouble();
			if (value>max) {
				max=value;
			}
			
				
			if (value<min) {
				min=value;	
				}
			sum+=value;
			
		}
		System.out.println("The sum is "+sum);
		System.out.println("There are "+ctr+" numbers.");
		/*This part isn't necessary, but helps the user know basic information so they can test on their own to see whether average
		 * is right.*/
		double average = (double)sum/ctr;
		System.out.println("The average is "+average);
		System.out.println("The max is "+max);
		System.out.println("The min is "+min);
		inputStream.close();
		
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	catch (Exception e) {
		e.getMessage();
	}
	//}
	
	
		
	}

}
