import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
           System.out.printf("Please enter a number between %d and %d\n", 10, 100);
           Scanner input = new Scanner(System.in);
           int num = input.nextInt();

           while (num < 10 || num > 100) {
               System.out.printf("Sorry that is not an acceptable number, please enter an integer between 10 and 100: \n");
               num = input.nextInt();
           }

           for (int i = 0; i < num; i++)
           {
               int evod = (i+1) % 2;
               if(evod == 0)
                    System.out.printf("\n" + (i + 1) + " is even ");
               else 
                    System.out.printf("\n" + (i + 1) + " is odd ");   
           }
           input.close();
    }
}