import java.util.Scanner;

public class StringInteger {
    public static void main(String[] args){
        System.out.printf("Please input an integer:\n");
        Scanner input = new Scanner(System.in);
        String intgr = input.nextLine();
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean inte = false;
        for (int i = 0; i < 9; i++)
        {
            if (intgr.charAt(0) == num[i]) {
                System.out.printf("The first character is an integer, so this is probably an integer. \n");
                inte = true;
            }   
        }


        // here i am trying to check if the whole string is an integer
        /*
        boolean totalinteger = false;

        for (int i = 0; i < intgr.length(); i++){

            for(int j = 0; j < 9; j++){
                              
                    
            }
        }*/

        if (inte == true){
            str2int(intgr);
        }

    }

    public static int str2int (String st){
        int theStrAsAnInt = 0;
        for (int i = 0; i < st.length(); i++){
            theStrAsAnInt = theStrAsAnInt * 10 + (st.charAt(i) - '0');
        }
        System.out.printf("The integer in int form is %d", theStrAsAnInt);
        return theStrAsAnInt;
    }
}