package com.company;

import java.util.Random;
import java.util.Scanner;

class Game  {
    int number;
    int noOfGuesses=0;
    int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int NoOfGuesses) {
        this.noOfGuesses = NoOfGuesses;
    }

    public Game()  {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public void takeUserInput() {
        System.out.println("Guess the no.");
        Scanner sc = new Scanner(System.in);
           inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("YES YOU GUESSED IT RIGHT,IT WAS %d\nYOU GUESSED IT IN %d ATTEMPTS", number,noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("too low");
        } else if (inputNumber > number) {
            System.out.println("too high");
        }
        return false;

    }
    }

public class CWH_L43_EXERCISE_3_Guess_the_number_OOPS_edition {
    public static void main(String[] args) {
        /*
            Create a class Game,which allows a user to "Guess the Number" game once
            Game should have the following methods :
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. use getters and setters for no. of choices
               Use properties such as noOfGuesses(int),etc to get this task done.

            */

        Game G1 = new Game();
        boolean b= false;
        while(!b) {
            G1.takeUserInput();
            b = G1.isCorrectNumber();

        }

    }
}
