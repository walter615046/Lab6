import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //Variables
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(10);
        int userInt = 0;
        boolean valid = false;

        System.out.println("Welcome! Let's play a game");
        System.out.println("Try to guess my number!");
        do {
            System.out.println("Enter a number [1-10]:");
            if (scan.hasNextInt()){
                userInt= scan.nextInt();
                valid=true;
            }else
                System.out.println("Sorry, you're guess is invalid. Please try again.");
            scan.nextLine();
            if (userInt<1) {
                System.out.println("Sorry, you're guess is invalid. Please try again.");
                valid = false;
            }
            if (userInt>10) {
                System.out.println("Sorry, you're guess is invalid. Please try again.");
                valid = false;
            }

        }while (!valid);

        //Give the result
        System.out.println("My number was " + randomInt);
        if(userInt>randomInt){
            System.out.println("Your guess was too high.");
        }
        if (userInt<randomInt){
            System.out.println("Your guess was too low.");
        }
        if (randomInt==userInt){
            System.out.println("You got it right!");
        }


    }
}
