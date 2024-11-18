import java.util.Scanner;

public class volumecalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double height;
        double volume;
        String choice;
        boolean Continuecalculation = true;

        //START

        System.out.println("CYLINDER VOLUME CALCULATOR!");

        while(Continuecalculation){

        //INPUT

            System.out.println("Enter radius of the cylinder: ");
                if(!sc.hasNextDouble()){
                    System.out.println("Please enter a valid radius of the cylinder! ");
                    return;
                }else{
                    radius = sc.nextDouble();
                }

            System.out.println("Enter height of the cylinder: ");
                if(!sc.hasNextDouble()){
                    System.out.println("Please enter a valid height of the cylinder! ");
                    return;
                }else {
                    height = sc.nextDouble();
                }

        //PROCESS

            volume = 3.14159 * (radius * radius) * height;

        //OUTPUT

            System.out.println("Volume of the cylinder: " + volume);


        //LOOP END
            System.out.print("do you want to perform another calculation? (y/n): ");
            choice = sc.next().toLowerCase();
                if (!choice.equals("y")) {
                    Continuecalculation = false;
                }



        }
            System.out.println("THANK YOU! ");

    }
}
