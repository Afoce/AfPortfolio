/*Write a program that reads a file of numbers of type int and writes all the numbers to another file, but without any duplicate 
 * numbers. Assume that the numbers in the input file are already ordered from smallest to largest. After the program is run, the 
 * new file will contain all the numbers in the original file, but no number will appear more than once in the file. The
 * numbers in the output file should also be sorted from smallest to largest. Your program should obtain both file names from the 
 * user. Use either a text file or a binary file. For the text-file version, assume one number per line. For the binary-file 
 * version, use numbers of type int that are written using writeInt.*/
package assignment3;

import java.io.*;
import java.util.Scanner;

public class ReadFileWriteToNext {
	

	
	public static void main (String []args){
		
		
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String fileName2;
		Scanner inp = new Scanner(System.in);
		String fileName; //File x = new File(fileName);
		//int ctr = 0;
		int temp = 0;
		
		
		int value;
		//boolean firstTime = true;
		
		//while (exc) {
		try {
			System.out.println("Please enter the name of the file.");
			fileName=inp.nextLine();
			System.out.println("Please enter the name of the file to write to.");
			fileName2=inp.nextLine();
			
			inputStream = new Scanner(new File(fileName));
			outputStream = new PrintWriter(fileName2);
			temp = inputStream.nextInt();
			System.out.println(temp);
			outputStream.println(temp);
			while(inputStream.hasNextInt()) {
				
				value = inputStream.nextInt();
				//nextValue= inputStream.nextInt();
			
		
			
				
				
				
				
				
				
				if (value!=temp) {
					temp=value;
					//ctr++;
					
					
					System.out.println(value);
					outputStream.println(value);
					 
			          
				}
				
				
				
				
				
				
				
			}

			inputStream.close();
			outputStream.close();
			//File fileObject = new File(fileName);
			//if (fileObject.exists()&&fileObject.canRead() {
			//	System.out.println();
			//}
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.getMessage();
		}
		
		
		

	}

		
	}


