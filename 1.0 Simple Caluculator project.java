import java.util.Scanner;

public class BasicCalculator {

   public static void main(String[] args) {

   
      double num1=0.0, num2=0.0;
      char operator='\0';

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = scan.nextDouble();
      num2 = scan.nextDouble();

      
      System.out.println("Available Operators"
		+ "are::  (+ - * / % ^)");
      System.out.print("Enter operator: ");
      operator = scan.next().charAt(0);

      // switch-case 

      switch(operator) {

         case '+':
            System.out.println("Result = "+ (num1+num2));
		break;

	 case '-':
	    System.out.println("Result = "+ (num1-num2));
		break;

	 case '*':
	    System.out.println("Result = "+ (num1*num2));
		break;

	 case '/':
	    System.out.println("Result = "+ (num1/num2));
		break;

	 case '%':
	    System.out.println("Result = "+ (num1%num2));
		break;

	 case '^':
	    System.out.println("Result = "+ 
                               Math.pow(num1,num2));
		break;

	 default:
	    System.out.println("Invalid operator");
      } 

      scan.close();

   } 
}
