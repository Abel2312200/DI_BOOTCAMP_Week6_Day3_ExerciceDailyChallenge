import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declaration global variables
        Scanner se = new Scanner(System.in);
        int number, facto = 1,faccNumber1 = 0,faccNumber2 = 1,faccNumber3;

        // prompt the user to enter a number
        System.out.print("Please enter a number : ");
        number = se.nextInt();

        // display a multiplication table
        for (int i = 1; i < 11; i++) {
            System.out.println(String.format("%d x %d = %d", number,i, i*number));
        }

        // compute the factorial of number
        for (int i = number; i > 1; i--) {
            facto *= i;
        }
        // display the factorial of number
        System.out.println(String.format("\n%d! = %d\n", number,facto));

        // compute and display the fibonacci for number
        System.out.println(faccNumber1); // display first number : 0
        if(number != 0){
            System.out.println(faccNumber2); //display first number : 1
            do{
                faccNumber3 = faccNumber1 + faccNumber2;
                if(faccNumber3 < number)
                    System.out.println(faccNumber3); // display number fibonacci current valid
                // update values
                faccNumber1 = faccNumber2;
                faccNumber2 = faccNumber3;
            }while (faccNumber3 < number );
        }
    }
}