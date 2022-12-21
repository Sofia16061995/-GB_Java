// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import java.io.PrintWriter;

public class task2_3 {

    static Logger logger = Logger.getLogger(task2_3.class.getName());

    public static void main(String[] args) {
        int[] initialArr = { 42, 15, 23, 16, 4, 8 };
        System.out.println(Arrays.toString(initialArr));

        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < initialArr.length - 1; i++) {
                if (initialArr[i] > initialArr[i + 1]) {
                    isSorted = false;

                    tmp = initialArr[i];
                    initialArr[i] = initialArr[i + 1];
                    initialArr[i + 1] = tmp;
                }
            }
        }
        System.out.println("Each 108 minutes enter:");
        System.out.println(Arrays.toString(initialArr));

        try (PrintWriter out = new PrintWriter("tasklog.txt")) {
            out.println(Arrays.toString(initialArr));
            logger.info("Строка записана");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}