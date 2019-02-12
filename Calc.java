import java.util.*;
import java.io.*;

public class Calc{
    public static void main(String[] args){
        float a, b, res;
        char choice, ch;
         do
        {
            System.out.print("1. Addition \n");
            System.out.print("2. Subtraction \n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Power of 2\n");
            System.out.print("6. Squareroot\n");
            System.out.print("7. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' :
                case '2' : 
                case '3' :
                case '4' :
                case '5' :
                case '6' :
                case '7' : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5); 
    }
}