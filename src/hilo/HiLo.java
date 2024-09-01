/*
Your program will use Math.random to generate a random number between 1 and 20. 

This is the secret number your player is trying to guess. Do not show this number to the user.

The user will have 5 tries per round to correctly guess the generated number.

The game continues until the user has decides to exit the game.

At this time, assume the user knows to and will always enter a number. Don't worry about handling users that don't read instructions at this time :-D .

User Story #0
Generate a random number, falling in the range of 1 and 20, and store this into a variable. been there done that!!!

now on to User Story #1
Prompt the user for a number between 1 and 20.

User Story #2
The program will compare their guess with the current value of the randomly generated number.

User Story #3
If they are equal, notify the player they have won.

If their guess is not correct, notify the user whether their guess is too high or too low.

User Story #4
If the user guessed incorrectly, they will be prompted to guess again, for a max of 5 tries.

User Story #5
If the user has not guessed the correct number within 5 attempts, inform the user politely that
 they missed this round, and display the generated number they missed.

*/
package hilo;
import java.util.Scanner;
import java.util.Random;

public class HiLo 
{

	public static void main(String[] args) 
	{
		// declare variables
		Scanner keyboard = new Scanner(System.in);
		int computerGuess = 0;
		int userGuess = 0;
		String userWantToPlay = "";
		
		// initialize the computer guess as a random number
		Random randomNumber = new Random();
		
		// set the computer guess to a random number between 1 - 20
		computerGuess = randomNumber.nextInt(20);
		
		// what is the computer guess going into game
		// System.out.println("computer guess = " + computerGuess);
		
		// going to print out the rules of Hi / Lo game
		printRules();
		
		// now telling the user the name of the game and ask if they would like to play
		System.out.println("Would you like to play a game of Hi / Lo?\n");
		System.out.print("Please enter yes or no ");
		userWantToPlay = keyboard.next();
		
		
		while (userWantToPlay.equals("yes"))
		{

			System.out.print("\nPlease enter you next guess ");
			userGuess = keyboard.nextInt();
			
			int i;
			
			// while loop for user to guess the number
			for (i = 1; i <= 6; i++)
			{	
			    
				// adding debug to see value of i to make sure break happens for if i > 5
				// can't have more than 5 tries
				// System.out.println("that was guess number = " + i);
				
				if ((i >= 5) && (userGuess != computerGuess))
				{
					
					System.out.println("Sorry you loose, you took to many turns :(!!!!!");
					System.out.println("\tYour last choice was " + userGuess);
					System.out.println("\tThe computers number was " + computerGuess + "\n\n");
					// should break out of for loop here
					break;
				}
				else if (userGuess < computerGuess)
				{
					System.out.println("Nope your guess " + userGuess + " is too low!!!\n");
				}
				else if (userGuess > computerGuess)
				{
					System.out.println("Wrong!!! your guess " + userGuess + " is too high!!\n");
				}
				else if (userGuess == computerGuess)
				{
					System.out.println("\n\n!!!!! Huzzahhhh Dilly Dilly You Won !!!!!\n");
					break;
				}
				
				System.out.print("Please enter you next guess ");
				userGuess = keyboard.nextInt();
				
				
				
				
				
				
			} // end for loop of user guesses
			
			
			// thing to note if user enters no it will end the while loop
			System.out.println("Would you like to play again?");
			System.out.print("Please enter yes or no ");
			userWantToPlay = keyboard.next();
			
			
			// almost forgot that i needed to get a new random number
			// lol was using same random number over and over again derp de derp
			// set the computer guess to a random number between 1 - 20
			computerGuess = randomNumber.nextInt(20);
			// System.out.println("what is computer guess for new game = " + computerGuess);
			
						
		} // end while loop
				
		
		System.out.println("\nThank you for playing our game!!! \nHope you had fun!\n");
		
		// don't forget to close your keyboard!
		keyboard.close();
		

	} // end main
	
	public static void printRules()
	{
		System.out.println("\n\nYou will need to enter a guess between 1 and 20");
		System.out.println("You will only have 5 tries to guess the number that the computer has guessed");
		System.out.println("If you guess the number you Win!!!");
		System.out.println("otherwise ..... :(\n\n");
		
	} // end printRules
	

} // end HiLo class
