import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args){

    while (true) {
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      int numberOfGuesses = 0;
      int randomNumber = rand.nextInt(100);

      System.out.println("What is your name?");
      String name = scanner.nextLine();
      System.out.println("Hello, " + name + "! I am thinking of a number between 1 and 100");
      System.out.println("Try to guess my number");

      try {

        while (true) {
          int userGuess = scanner.nextInt();

          if (userGuess < 1 || userGuess > 100) {
          System.out.println("I told you my number was between 1 and 100... Let's try again.");
          } else if (userGuess == randomNumber) {
          System.out.println("Congrats, " + name + "! You found my number in " + numberOfGuesses + " tries!");
          break;
          } else if (userGuess < randomNumber) {
          System.out.println("Your guess was too low, try again");
          numberOfGuesses++;
          } else {
          System.out.println("Your guess was too high, try again");
          numberOfGuesses++;
        }
      }
    } catch (Exception e) {
        scanner.next();
        System.out.println("That's not an integer, try again");
        continue;
      }

      System.out.println("Do you want to play again? 1:y 2:n");
      if (scanner.nextInt() != 1) break;

      }

    }
  }
