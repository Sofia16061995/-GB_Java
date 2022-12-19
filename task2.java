package homework.sem1;

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

// Вывести все числа от 1 до 10

// package homework.sem1;

// import java.util.Arrays;

// public class task2 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// for (int i = 0; i < arr.length; i++) {
// arr[i] = i + 1;
// }
// System.out.println(Arrays.toString(arr));
// }
// }
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
