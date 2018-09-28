//Jackie fang 9/25/2018

import java.util.Scanner;

public class lib {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome, " + name + ". Type 1 if you want to guess my number, or type 2 if you want me to guess your number.");
        int pickGame = input.nextInt();
        while ((pickGame!=1) && (pickGame!=2))
        {
            System.out.println("Sorry " + name + ", I didn't understand that. Type 1 if you want to guess my number, or type 2 if you want me to guess your number.");
            pickGame = input.nextInt();
        }
        int maxNum = 100;
        int numOfGuesses = 0;
        if (pickGame == 1) //objective 1
        {
            int randomNum = (int) (Math.random() * maxNum + 1);
            System.out.println(randomNum);
            System.out.println("Try giving me a number between 1 and " + maxNum + ", " + name + ".");
            int numGuess = input.nextInt();
            try {
                while (numGuess != randomNum) {
                    if (numGuess > randomNum) {
                        System.out.println("The number I am thinking of is less than the number you guessed. Try again " + name + "!");
                    }
                    if (numGuess < randomNum) {
                        System.out.println("The number I am thinking of is greater than the number you guessed. Try again " + name + "!");
                    }
                    numGuess = input.nextInt();
                    numOfGuesses++;
                }
                if (numGuess == randomNum) {
                    numOfGuesses++;
                    if (numOfGuesses > 1)
                        System.out.println("Congratulations " + name + ", you have guess the number correctly! It took you " + numOfGuesses + " tries!");
                    else
                        System.out.println("Congratulations " + name + ", you have guess the number correctly! It took you " + numOfGuesses + " try!");
                }
            }
            catch (Exception e)
            {
                System.out.println("Sorry" + name + ", I didn't understand that. Please give me a number between 1 and " + maxNum + ".");
            }
        }
        else //objective 2
        {
            System.out.println("Ok. Pick a number between 1 and " + maxNum + " for me to guess " + name + ".");
            int playerNum = input.nextInt();
            while (playerNum < 1 || playerNum > maxNum)
            {
                System.out.println("Sorry " + name + ", that number is not in the range for me to guess. Please pick another number");
                playerNum = input.nextInt();
            }

        }
    }
}
