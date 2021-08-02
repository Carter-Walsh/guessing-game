import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args){
    System.out.println("What is your name?");

    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "! I am thinking of a number between 1 and 100");

    Random rand = new Random();
    int randomNumber = rand.nextInt(100);

    int numberOfGuesses = 0;

    System.out.println("Try to guess my number");

    while (true) {

      try {
        int userGuess = scanner.nextInt();

        if (userGuess < 1 || userGuess > 100) {
          System.out.println("I told you my number was between 1 and 100... Let's try again.");
        }

        if (userGuess == randomNumber) {
          System.out.println("Congrats, " + name + "! You found my number in " + numberOfGuesses + " tries!");
          break;
        }

        if (userGuess < randomNumber) {
          System.out.println("Your guess was too low, try again");
          numberOfGuesses++;
        } else {
          System.out.println("Your guess was too high, try again");
          numberOfGuesses++;
        }

      } catch(Exception e) {
        String bad_input = scanner.next();
        System.out.println("That's not an integer, try again");
        continue;
      }

      }
    }
  }
