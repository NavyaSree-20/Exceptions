package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    private Scanner scanner;
    public DivisionCalculator(Scanner scanner){
        this.scanner=scanner;
    }
    public void performDivision(){
        while(true){
            try{
                System.out.print("Enter first number");
                int num1=scanner.nextInt();
                System.out.print("Enter second number ");
                int num2=scanner.nextInt();
                double result=num1/num2;
                System.out.println("Result :"+result);
            }
            catch(InputMismatchException e){
                System.out.println("invalid input");
                scanner.next();
            }
            catch (ArithmeticException e){
                System.out.println("Division not allowed");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DivisionCalculator calculator=new DivisionCalculator(scanner);
        System.out.println("Testing with various inputs");
        //Valid numbers
        System.out.println("Valid numbers");
        calculator.performDivision();
        // Zero as divisor
        System.out.println("Zero as divisor");
        calculator.performDivision();
        //With non integer value
        System.out.println(" Non-integer value");
        calculator.performDivision();
scanner.close();
    }
}
