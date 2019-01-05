/*The Social Security Administration maintains an actuarial life table that contains the probability that a person in the
 *United States will die (http://www.ssa.gov/OACT/STATS/table4c6.html). The death probabilities from this table for 2009 are 
 *stored in the file LifeDeathProbability.txt that is included with the book's source code. There are three values for each row 
 *age, death probability for a male, and death probability for a female. For example the first five lines are:
 *0	 0.006990  0.005728
 *1  0.000447  0.000373
 *2  0.000301  0.000241
 *3  0.000233  0.000186
 *4  0.000177  0.000150
 *
 *This says that a 3-year-old female has a 0.000186 chance of dying that year. Write a program that simulates how long you will live.
 *The basic idea is to generate random numbers for each age until you "die." For example, if you are a 1-year-old male, then if
 *a random number is <=0.000447 then the simulation will say you will live to age 1. Otherwise if the random number is > 0.000447
 *then go to age 2 and generate another random number. If it is < 0.000301 then the simulation will say you will live to age 2, etc.
 *The program should input your sex and age to determine which probabilities to use. The program should then simulate to what age you
 *will live by starting with the death probability for the age and sex entered in the file. If the simulation reaches age 120 then
 *stop and predict that the user will live to 120. This program is merely a simulation and will give different results each time it is
 *run.
 * */

package assignment3;
import java.io.*;
import java.util.*;
public class LifeDeathProbability {

	//static boolean isLessThanOrEqual(int age, int male, int female) {
		//return false;
		
	//}
	public static void main(String[] args) {
		Scanner inputStream=null;
		Scanner input = new Scanner(System.in);
		String fileName="LifeDeathProbability.txt";
		
		Random r = new Random();
		
		int age=0;
		double maleProb;
		double femProb;
		double rando;
		boolean cont = true;
		
		int a;
		int gender;
		
		try {
			System.out.println("Please enter the age");
			a=input.nextInt();
			System.out.println("Please enter the gender, 1 for male and 2 for female.");
			gender=input.nextInt();
			
			inputStream = new Scanner(new File(fileName));
		
			while (inputStream.hasNext()&&cont) {
				rando = r.nextDouble();
				age=inputStream.nextInt();
				maleProb=inputStream.nextDouble();
				femProb=inputStream.nextDouble();
				
				//rando = r.nextDouble();
				
				if(a==age&&age<120) {
					
					if(gender==1) {
						System.out.println(" ");
						if(rando<=maleProb) {
							System.out.println(rando+" is less than or equal to "+maleProb+" for age "+age);
							System.out.println("You will live to be "+age+" years old.");
							System.out.println("Gender is male");
							cont=false;
						}
						else if(age==119&&rando>maleProb)
							System.out.println("Congrats, you lived to 120!");
						
						else //{
							System.out.println(rando+" is greater than "+maleProb+" for age "+age);
							a++;
						//}
							//continue;
						
					}
					if(gender==2) {
						System.out.println(" ");
						if(rando<=femProb) {
							System.out.println(rando+" is less than or equal to "+femProb+" for age "+age);
							System.out.println("You will live to "+age+" years old.");
							System.out.println("Gender is female");
							cont=false;
						}
						else if(age==119&&rando>femProb)
							System.out.println("Congrats, you lived to 120!");
						
						else //{
							System.out.println(rando+" is greater than "+femProb+" for age "+age);
							a++;
						//}
							//continue;
						
					}
					
				}
				//if(age>=120) {
					//System.out.println("Congrats, you lived to 120!");
				//}
				
			}
			inputStream.close();
		
		
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		catch (Exception e) {
			e.getMessage();
		}

	}

}
