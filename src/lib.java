//Jackie fang 9/25/2018

import java.util.Scanner;

public class lib {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        int inputNum = 0;
        while (inputNum != 1 || inputNum != 2 || inputNum != 3 || inputNum != 4)
        {
            System.out.println("Welcome, " + name + ". Please pick a difficulty of 1, 2, 3, or 4.");
            inputNum = (input.nextInt());
            int maxGuess = 0;
            if (inputNum == 1) maxGuess = 10;
            if (inputNum == 2) maxGuess = 100;
            if (inputNum == 3) maxGuess = 1000;
            if (inputNum == 4) maxGuess = 10000;
        }
        System.out.println("Now would like me to guess a number or would you like to guess one," + name + ".");
    }
}
