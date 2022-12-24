/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 * Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */
package Hometask04;

import java.util.*;

public class task0403 {
    public static void main(String[] args) {

        LinkedList<Integer> actions = new LinkedList<Integer>();
        calculator(actions);
    }

    public static void calculator(LinkedList<Integer> actions) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = iScanner.nextInt();
        System.out.print("Введите знак (+*-/): ");
        String deistvie = iScanner.next();

        iScanner.close();

        StringBuilder result = new StringBuilder();
        int res = 0;
        switch (deistvie) {
            case "/": {
                if (secondNum != 0) {
                    res = firstNum / secondNum;
                    System.out.println(firstNum / secondNum);
                    result.append(firstNum).append(deistvie).append(secondNum).append("=").append(res);
                } else {
                    System.out.println("Деление на ноль");
                }
            }
            case "*":
                res = firstNum * secondNum;
                System.out.println(firstNum * secondNum);
                result.append(firstNum).append(deistvie).append(secondNum).append("=").append(res);
            case "-":
                res = firstNum - secondNum;
                System.out.println(firstNum - secondNum);
                result.append(firstNum).append(deistvie).append(secondNum).append("=").append(res);
            case "+":
                res = firstNum + secondNum;
                result.append(firstNum).append(deistvie).append(secondNum).append("=").append(res);
                System.out.println(firstNum + secondNum);
            case "undo":
                actions.removeLast();
                System.out.println("Последнее действие отменено");
            default:
                System.out.println("Ошибка");

        }
        actions.add(res);
    }

}