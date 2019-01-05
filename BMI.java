import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.printf("Please enter your weight in pounds: \n");
        Scanner input = new Scanner (System.in);
        double weight = input.nextDouble();

            while (weight < 100 || weight > 1000)
            {
                System.out.printf("Sorry that is either to small or to big of a number for your weight please enter again: \n");
                weight = input.nextDouble();
            }

        System.out.printf("Please enter your height in inches: \n");
        double inches = input.nextDouble();

            while (inches < 24 || inches > 90)
            {
                System.out.printf("Sorry this height does not make sense, please enter again: \n");
                inches = input.nextDouble();
            }

        double mass = weight * 0.453592;
        double meters = inches * 0.0254;
        double bodymass = mass / (meters * meters);
        System.out.printf("Your BMI is %f", bodymass);

        input.close();
    }
}