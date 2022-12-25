//Пусть дан список сотрудников:Иван Иванов
// Светлана Петрова Кристина Белова Анна Мусина Анна Крутова 
//Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова 
//Марина Светлова Мария Савина Мария Рыкова Марина Лугова 
//Анна Владимирова Иван Мечников Петр Петин Иван Ежов

import java.util.*;

public class task02 {
    public static void main(String[] args) {
        ArrayList<String> Spr = new ArrayList<>();
        Spr.add("Cветлана");
        Spr.add("Кристина");
        Spr.add("Анна");
        Spr.add("Анна");
        Spr.add("Иван");
        Spr.add("Петр");
        Spr.add("Павел");
        Spr.add("Петр");
        Spr.add("Мария");
        Spr.add("Марина");
        Spr.add("Мария");
        Spr.add("Мария");
        Spr.add("Марина");
        Spr.add("Анна");
        Spr.add("Иван");
        Spr.add("Петр");
        Spr.add("Иван");

        Map<String, Integer> map = countsWords(Spr);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static HashMap<String, Integer> countsWords(ArrayList<String> empls) {
        HashMap<String, Integer> unique = new HashMap<>();
        for (String name : empls) {
            if (unique.containsKey(name)) {
                unique.replace(name, unique.get(name) + 1);
            } else {
                unique.put(name, 1);
            }
        }
        return unique;
    }
}