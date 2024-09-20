package main;
import java.util.Scanner;

public class InputWays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("enter the operation that you want to perform: ");
        char operation = sc.next().charAt(0);
        double result = 0.0;
        switch(operation)
        {
            case '+': 
            result = num1 + num2;
            break;

            case '-': 
            result = num1 - num2;
            break;

            case '*' : 
            result = num1 * num2;
            break;

            case '/' : 
            result = num1 / num2;
            break;

            case '^' : 
            result = Math.pow(num1,num2);
            break;

            case '%' : 
            if(num2 == 0)
            {
                System.out.println("error : modulo by zero");
            }
            else
            {
                result = num1 % num2;
            }
            break;

            default: System.out.println("you have entered invalid operation");
            break;



        }
        System.out.println("the result of " + operation + "on numbers " + num1 + "and "+ num2+ "is : "+ result);
        sc.close();

    }
    
}
