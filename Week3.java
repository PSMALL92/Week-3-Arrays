package promineotech;


public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[9];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 76;
		
		
		     //a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		int newAge = (ages[8] - ages[0]);
		System.out.println(newAge + " is first new age");
		
		     //b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		for(int i = 1; i < ages.length; i++ ) {
			int firstAgeDifference = ages[i] - 3;
		
			System.out.println(firstAgeDifference + " Is the total after subtracting 1st age");
	 
		}
		
		     //c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		System.out.println(calculateAverage(ages) + " Is the average age");
		
		
		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = new String[6];
		       names[0] = "Sam";
		       names[1] = "Tommy";
		       names[2] = "Tim";
		       names[3] = "Sally";
		       names[4] = "Buck";
		       names[5] = "Bob";
		     //a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		        
		        
		
		     //b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		//3.	How do you access the last element of any array?
		      // ~Total number of array minus one and System print the result. if total is [5] you would print [4]
		//4.	How do you access the first element of any array?
		      // ~Array starts at 0, system print name of the array[0]
	  	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		       int[] nameLengths = new int[6];
		       nameLengths[0] = 3;
		       nameLengths[1] = 5;
		       nameLengths[2] = 3;
		       nameLengths[3] = 5;
		       nameLengths[4] = 4;
		       nameLengths[5] = 3;
		       for(int a = 0; a < nameLengths.length; a++)
		    	
		        for (String name : names) {
		    	   System.out.println( name + nameLengths[a]);
		      // System.out.println(nameLengths[a]);
		       }
		       
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		       
	    //7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		       System.out.println(multiplyString(" Ha ha ha", 3));
		       
		//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		       String firstName = "Jashard";
		       String lastName = "Prewitt";
		       String fullName = firstName + " " + lastName;
		       System.out.println(fullName);
		//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		       
		       int[] steps = new int[7];
		       steps[0] = 7;
		       steps[1] = 12;
		       steps[2] = 9;
		       steps[3] = 3;
		       steps[4] = 24;
		       steps[5] = 15;
		       steps[6] = 35;
		       System.out.println(sumWalking(steps) >= 100);
		//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		       double[] tests = new double[5];
		       tests[0] = 89.9;
		       tests[1] = 99.5;
		       tests[2] = 75;
		       tests[3] = 56.2;
		       tests[4] = 68.7;
		       System.out.println(theAverage(tests));
		//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created 

 
	}

	





	private static int sumWalking(int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}




	private static double theAverage(double[] numbers) {
		double sum = 0;
		for(double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}




	private static String multiplyString(String string, int num) {
		String result = "";
		for(int i = 0; i < num; i++) {
			result += string;
		}
		return result;
	}




	public static int calculateAverage(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	

}
