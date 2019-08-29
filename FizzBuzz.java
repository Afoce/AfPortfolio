//Aria Fakoor
//8/21/2019
//FizzBuzz attempt
/*The purpose of this program is to print out the word fizz
 * every time a number divisible by 3 comes up (from 1-100) and buzz
 * every time a number divisible by 5 comes up (1-100). If a number is divisible
 * by both, then the word fizzbuzz is printed to the screen.*/


public class FizzBuzz {

	public static void main(String[] args) {
		

		for(int i = 1; i <= 100; i++) {
			
			 if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			 }
			 else if(i%3==0) {
				System.out.println("Fizz");
			 }
			 else if(i%5==0) {
					System.out.println("Buzz");
			 }
			 
			 
			 else {
				 System.out.println(i);
			 }
			
		}

	}

}
