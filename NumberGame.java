package CodSoft.Task1;
import java.util.*;
public class NumberGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int minNo = 1;
        int maxNo = 100;
        int maxAttempts = 8;     //As per your choice
        int score = 0;
        boolean playAgain = true;

        System.out.println("---Welcome to the Number Game---");

        while (playAgain) 
        {
            int compNo = (int) (Math.random() * (maxNo - minNo + 1) + minNo);
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("The computer has selected a number between " +minNo+ " and " +maxNo+
                               ". You have " +maxAttempts+ " attempts to guess it. "
                               		+ "Start guessing...");

            while (attempts < maxAttempts) 
            {
                System.out.println("Enter your number: ");
                int userNo = sc.nextInt();
                attempts++;
                
                if(compNo - userNo == 1 || compNo - userNo == -1 
                		|| compNo - userNo == 2 || compNo - userNo == -2 )
                {
                	System.out.println("Keep Guessing. You are near.");
                }
                else if (userNo < compNo) 
                {
                    System.out.println("Too low! Try guessing a higher number.");
                } 
                else if (userNo > compNo)
                {
                    System.out.println("Too high! Try guessing a lower number.");
                } 
                else 
                {
                    System.out.println("Congratulations! You guessed the number " +compNo+
                                       " correctly in " +attempts+ " attempts!");
                    score += attempts; 		//Score is based on attempts taken.
                    correctGuess = true;
                    break;
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you have run out of attempts. The correct number was " + compNo);
                }
            }

            System.out.println("\nDo you want to play again? Type 'y' to play again or any other key to exit: ");
            String play = sc.next().toLowerCase();
            playAgain = play.equals("y");

            if (!playAgain) {
                System.out.println("\nThank you for playing the Number Game!");
                System.out.println("Your total score is: " +score);
            }
        }
        sc.close();
    }
}