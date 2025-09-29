import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        double gallons;
        double fuelEfficiency;
        double pricePerGallon;

        do {
            System.out.println("Enter Current Number of Gallons of Gasoline in Vehicle: ");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                System.out.println("Enter Fuel Efficiency in MPG: ");
                if (scan.hasNextDouble()) {
                    fuelEfficiency = scan.nextDouble();
                    System.out.println("Enter Current Price for Gallon of Gas: ");
                    if (scan.hasNextDouble()) {
                        pricePerGallon = scan.nextDouble();
                    }
                }
            }
        } while ()

    }
}
