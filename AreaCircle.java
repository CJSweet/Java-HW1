import java.util.Scanner;

public class AreaCircle {
  
  public static final double PI = 3.14;
    public static void main(String[] args) {
        System.out.printf("Please enter a radius of a circle:\n");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

            while (radius < 0) {

                System.out.printf("Sorry that is not a positive real number, please try again: \n");
                radius = input.nextDouble();
            }
            
        double Area = (radius * radius) * PI;
        System.out.printf("The area of the circle with radius of %f is: %f \n", radius, Area);

        input.close();
    }
}