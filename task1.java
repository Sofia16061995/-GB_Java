package homework.sem1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", getSumNumbers(n));
        System.out.printf("n!: %d\n", getFactorial(n));
        iScanner.close();
    }

    public static int getSumNumbers(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
        }
    
}