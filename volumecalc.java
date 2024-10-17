import java.util.Scanner;

public class volumecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;

        double height;
        double volume;
        String choice;
        boolean continueCalculation;

        System.out.println("CYLINDER VOLUME CALCULATOR! ");

        do {

            // Input

            System.out.print("Enter the radius of the cylinder: ");
            radius = sc.nextDouble();
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid! Please enter a valid number.");
                sc.nextLine();
                return;
            }

            System.out.print("Enter the height of the cylinder: ");
            height = sc.nextDouble();
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid! Please enter a valid number.");
                sc.nextLine();
                return;
            }

            // Process
            volume = 3.14159 * (radius * radius) * height;

            // Output
            System.out.println("The volume of the cylinder is: " + volume);

            // Loop end
            System.out.print("Do you want to continue (y/n)?: ");
            choice = sc.nextLine().toLowerCase();
            continueCalculation = choice.equals("y");
        }while (continueCalculation);

        sc.close();
    }
}