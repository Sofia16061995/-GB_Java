//1
import java.util.Arrays;
//2
//3
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        //01 
        System.out.println("Задание 1");
        int[] arr = { 18, 10, -13, 25, 66, 91, 38, -42, 22, -199, 143 };
        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
        System.out.println();

        
        System.out.println("Задание 2");

        deleteEven();
        System.out.println();

        //03
        System.out.println("Задание 3");

        getMaxMinAverage();
        System.out.println();

    }

    //01
    public static int[] mergeSort(int[] arr) {
        int[] buffer1 = Arrays.copyOf(arr, arr.length);
        int[] buffer2 = new int[arr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, arr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    //01

    //02
    public static void deleteEven() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int val = random.nextInt(30);
            arr.add(val);
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size();) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(arr);
    }

    //02

    //03
    public static void getMaxMinAverage() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int val = random.nextInt(30);
            arr.add(val);
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(arr.get(arr.size() / 2));
    }
    //03
}