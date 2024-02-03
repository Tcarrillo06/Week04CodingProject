package Week04CodingAssignment;

public class Java04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		

//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		System.out.println(ages[ages.length - 1] - ages[0]);

//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

//i. Make sure that there are 9 elements of type int in this new array.  
		int[] ages2 = { 5, 10, 15, 20, 25, 30, 35, 40, 45};
		
//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		System.out.println(ages2[ages2.length - 1] - ages2[0]);


//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		System.out.println(ages2[3]);
		System.out.println(ages2[5]);

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int i : ages2) {
			sum += i;
					
		}	
	
		int average = sum / ages2.length;
		System.out.println(average);	
		

//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		

//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
			
			
		}	
		
		double average2 = sumOfLetters / names.length;
		
		System.out.println(average2);
		
		
		

//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String sumOfAllNames = "";
		
		for (int i = 0; i < names.length; i++) {
				sumOfAllNames += names[i] + " ";
			
		}
		System.out.println(sumOfAllNames);
		
//3. How do you access the last element of any array?
		System.out.println(names[names.length-1]);

//4. How do you access the first element of any array?
		System.out.println(names[0]);


//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		

//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 int elementsSum = 0;
		 for ( int i = 0; i < nameLengths.length; i++) {
			 elementsSum += nameLengths[i];
		 }
		System.out.println(elementsSum);

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		System.out.println(produceConcatenatedWord("Hello", 3));

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(printFullName("Teresa","Carrillo"));

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] array = { 15, 16, 23, 24, 50, 75};
		
		System.out.println(verifySumIsGreaterThan100(array));
		
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] array2 = { 1.5, 6.45, 2.83, 4.58, 9.50, 11.75};
		
		System.out.println(findAverageOfArray(array2));

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] double1 = {2.5, 3.8, 4.7, 5.2, 6.9, 7.1};
		double[]	 double2 = {0.5, 1.1, 1.3, 2.5, 4.2, 6.1};	
		
		System.out.println(is1GreaterThan2(double1,double2));


//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket= 11.75;
		
		System.out.println(willBuyDrink(isHotOutside,moneyInPocket));
		

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		String myName = createAGreeting(" Teresa");
		
		System.out.println(myName);
		
	}
	
// 7 Method:
	private static String produceConcatenatedWord(String word, int n ) {
		String produceConcatenatedWord = "";
		for (int i = 0; i < n; i++) {
			produceConcatenatedWord += word;
		}
			return produceConcatenatedWord;	
		
	}
	
// 8 Method:
	private static String printFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		
	}
	
// 9 Method:
	private static boolean verifySumIsGreaterThan100(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		
			if (sum > 100) {
			return true;
			}	
		} 
			return false;
	}
  
// 10 Method:	
	private static double findAverageOfArray(double[]array2) {
		double sum = 0;
		for (double number : array2) {
			sum += number;
			
		}
		return sum / array2.length;
	}
	
// 11 Method:
	private static boolean is1GreaterThan2(double[] double1, double[] double2) {
		double sum = 0;
		double sum2 = 0;
		for (double i : double1){
			sum += i;
		}
		for (double j : double2){
			sum2 += j;	
		
			if (sum > sum2) {
			return true;
			}	
		} 
			return false;
	}
	
// 12 Method:
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside == true) && (moneyInPocket >= 10.50)) {
			return true;
		}
			return false;
	}

	//13 Method:
	public static String createAGreeting(String myName) {
		return "Hi, My name is" + myName + "!";

	}
}
