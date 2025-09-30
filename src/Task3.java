import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sideOne = 0;
        double sideTwo = 0;
        boolean validOne = false;
        boolean validTwo = false;

        do {
            System.out.println("Enter Length of side 1:");
            if (scan.hasNextDouble()) {
                sideOne = scan.nextDouble();
                validOne = true;
            }else
                System.out.println("You have an invalid side length. Please try again.");
            scan.nextLine();
                if (sideOne < 0) {
                    System.out.println("You have an invalid side length. Please try again.");
                    validOne = false;


            }}while (!validOne);

        do {
            System.out.println("Enter Length of side 2:");
            if (scan.hasNextDouble()) {
                sideTwo = scan.nextDouble();
                validTwo = true;
            }else
                System.out.println("You have an invalid side length. Please try again.");
            scan.nextLine();
            if (sideTwo < 0) {
                System.out.println("You have an invalid side length. Please try again.");
                validTwo = false;


            }}while (!validTwo);

        System.out.printf("%-7s%10s", "Side 1:", sideOne);
        System.out.printf("\n%-7s%10s", "Side 2:", sideTwo);
        System.out.printf("\n%-7s%11s", "Area:", sideTwo * sideOne);
        System.out.printf("\n%-7s%7s", "Perimeter:", sideTwo + sideTwo+sideOne+sideOne);
        System.out.printf("\n%-7s%8s", "Diagonal:",Math.sqrt(sideOne*sideOne + sideTwo * sideTwo) );
        }
    }

