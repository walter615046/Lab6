
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        boolean validGallons = false;
        boolean validFuel= false;
        boolean validPrice =false;

        do {
            System.out.println("Enter Current Number of Gallons of Gasoline in Vehicle: ");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                validGallons = true;
            } else
                System.out.println("You have entered an invalid value for gallons of gas Please try again.");
            scan.nextLine();
            if (gallons < 0) {
                System.out.println("You have entered an invalid value for gallons of gas Please try again.");
                validGallons = false;
            }
        }while (!validGallons);
        do {
            System.out.println("Enter Fuel Efficiency in MPG: ");
            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                validFuel = true;
            } else
                System.out.println("You have entered an invalid value for Fuel Efficiency. Please try again.");
            scan.nextLine();
            if (fuelEfficiency <= 0) {
                System.out.println("You have entered an invalid value for Fuel Efficiency. Please try again.");
                validFuel = false;
            }
        }while (!validFuel);
        do {
            System.out.println("Enter Current Price for Gallon of Gas: ");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                validPrice = true;
            } else
                System.out.println("You have entered an invalid value for Price per Gallon. Please try again.");
            scan.nextLine();
            if (pricePerGallon <= 0) {
                System.out.println("You have entered an invalid value for Price per Gallon. Please try again.");
                validPrice = false;
            }
        }while (!validPrice);

        //Give result
        System.out.printf("%-18s%10s", "Cost per 100 miles in $:", pricePerGallon/fuelEfficiency);
        System.out.printf("\n%-7s%10s", "Current Price for Gallon of Gas:", gallons*fuelEfficiency);
    }
}