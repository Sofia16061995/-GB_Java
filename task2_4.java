/* Дана json строка (можно сохранить в файл и читать из файла) (Коллеги, если сложно будет распарсить .json -> можно работать как со строкой обычной)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4получилИнформатика.
Студент Краснов получил 5 по предмету Физика.
 */
import java.util.ArrayList;

public class task2_4 {
    public static void main(String[] args) {
        String initialString = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}";
        jsonParse(initialString);
    }

    private static void jsonParse(String data) {
        String initial = data.substring(1, data.length() - 1);
        ArrayList<String> arrayList = new ArrayList<String>();

        String[] stringArr = initial.split(",");
        for (int i = 0; i < stringArr.length; i++) {
            String[] tempArr = stringArr[i].split(":");
            arrayList.add(tempArr[1].replace("\"", ""));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        StringBuilder phrase = new StringBuilder("Студент ");
        phrase.append(arrayList.get(0));
        phrase.append(" получил ");
        phrase.append(arrayList.get(1));
        phrase.append(" по предмету ");
        phrase.append(arrayList.get(2));

        System.out.println(phrase);
    }
}