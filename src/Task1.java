import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //variables
        double degreeFahrenheit;
        double degreeCelsius = 0;
        boolean valid=false;

        //Ask the temp in F
        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F: ");
            if (scan.hasNextDouble()){
                degreeCelsius = scan.nextDouble();
                valid=true;

            }
            else System.out.println(" You have entered an invalid temperature value. Please try again.");
            scan.nextLine();
            //Statement Conversion
            degreeFahrenheit = (degreeCelsius * 9/5) + 32;
        } while (!valid);

        //Output Celsius
        System.out.printf("%-13s%4s","Degrees C:", degreeCelsius);
        System.out.printf("\n%-13s%4s","Degrees F:", degreeFahrenheit);
    }
}