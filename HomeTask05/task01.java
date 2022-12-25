// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.*;

public class task01 {
    public static void main(String[] args) {
        Map<String, String> TelSpr = new HashMap<>();
        TelSpr.putIfAbsent("Абрамов", "100");
        TelSpr.put("Кукухин", "100");
        TelSpr.put("Захаров", "200");
        TelSpr.put("Петров", "150, 500");
        TelSpr.put("Бойко", "600, 700");
        TelSpr.put("Майданов", "800, 750");
        TelSpr.put("Галкин", "900, 1750");
        System.out.println(TelSpr);
        System.out.println();

        //Добавление новой записи - по аналогии с тем что выше
        TelSpr.put("Харламов", "2000");
        TelSpr.put("Шабарчин", "3000");
        System.out.println(TelSpr);
        System.out.println();

        // Удаление пары ключ значение - по ключу
        TelSpr.remove("Шабарчин");
        System.out.println(TelSpr);
    }
}