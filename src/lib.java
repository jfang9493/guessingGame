//Jackie fang 9/25/2018

import java.util.Scanner;

public class lib {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        int inputNum = 0;
        System.out.println("Welcome, " + name + ". Type 1 if you want to guess my number, or type 2 if you want me to guess your number.");
        int pickGame = input.nextInt();
        while ((pickGame!=1) && (pickGame!=2))
        {
            System.out.println("Sorry" + name + ", I didn't understand that. Type 1 if you want to guess my number, or type 2 if you want me to guess your number.");
            pickGame = input.nextInt();
        }

        if (pickGame == 1) //objective 1
        {
            System.out.println("Try giving me a number between 1 and 100" + name + ".");
            Scanner input2 = new Scanner(System.in);
            double randomNum = Math.random();
            while (input2.nextDouble()!= randomNum)
            {
                if (input2.nextDouble() == randomNum)
                {
                    System.out.println("Congratulations " + name + ", you have guess the number correctly.");
                }
                if (input2.nextDouble() > randomNum)
                {
                    System.out.println("The number I am thinking of is less than the number you guessed. Try again" + name + "!");
                }
                if(input2.nextDouble() < randomNum)
                {
                    System.out.println("The number I am thinking of is greater than the number you guessed. Try again" + name + "!");
                }
            }
        }
        else //objective 2
        {
            return;
        }
    }
}
