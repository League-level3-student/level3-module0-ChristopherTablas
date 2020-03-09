package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random ran = new Random();

		// 1. make an array of 5 Strings
		String[] yes = { "hi", "my", "name", "is", "chris" };
		// 2. print the third element in the array
		System.out.println(yes[2]);
		// 3. set the third element to a different value
		yes[2] = ("nombre");
		// 4. print the third element again
		System.out.println(yes[2]);
		// 5. use a for loop to set all the elements in the array to a string of
		// your choice
		for (int i = 0; i < yes.length; i++) {
			yes[i] = "hey";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		//for (int i = 0; i < yes.length; i++) {
			//System.out.println(yes[i]);
		//}
		// 7. make an array of 50 integers
		int[] fifty = new int[50];

		// 8. use a for loop to make every value of the integer array a random
		// number
		for (int i = 0; i < fifty.length; i++) {
			fifty[i] = ran.nextInt(100);
		}
		int smoll = fifty[0];

		// 9. without printing the entire array, print only the smallest number
		// on the array
		for (int i = 0; i < fifty.length; i++) {
			if (smoll > fifty[i]) {
			smoll = fifty[i];


			}
		}
		System.out.println(smoll);

		// 10 print the entire array to see if step 8 was correct
		// for(int i = 0; i < fifty.length; i++){
		// System.out.println(fifty[i]);
		// }
		int biiig = fifty[0];
		// 11. print the largest number in the array.
		for(int i = 0; i<fifty.length; i++){
			if(biiig< fifty[i]){
				biiig = fifty[i];
			}

		}
		System.out.println(biiig);
		// 12. print only the last element in the array
		System.out.println(fifty[49]);
	}
}
