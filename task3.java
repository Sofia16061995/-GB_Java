package homework.sem1;

import java.util.Scanner;

public class task3 {
    public static double Calc(double firstNumber, double secondNumber, String op) {
            double result = 0;
        // switch(op){
        //     case "+":
        //         return firstNumber + secondNumber;
        //     case "-":
        //         return firstNumber - secondNumber;
        //     case "*":
        //         return firstNumber * secondNumber;
        //     case "/":
        //         return firstNumber / secondNumber;  
        //     default:
        //         System.out.println("Введите операцию +, -, / или *");   
        //         break;        
        //     }        
        
        switch(op){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;  
                break;
            default:
                System.out.println("Введите операцию +, -, / или *");   
                break;        
            }     
        return result;
     }
    public static void main(String[] args) {
      
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double firstNumber = iScanner.nextDouble();
        System.out.println("Введите арифметическое действие +, -, * или /: ");
        String op = iScanner.next();
        System.out.printf("Введите второе число: ");
        double secondNumber = iScanner.nextDouble();
        double result = Calc(firstNumber, secondNumber, op);
        System.out.println(result);
        // System.out.printf("%d %s %d = %d", firstNumber, op, secondNumber, result);
        iScanner.close();
    }
      
  
}