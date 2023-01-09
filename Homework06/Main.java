import org.homework.tools.ConsoleHelper;
import org.homework.tools.NotebookGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar06");
        System.out.println("Магазин ПК\n");

        List<Notebook> notebooks = generateNotebooks(new Random().nextInt(15, 20));

        var fb = new FilterBuilder();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");

        while (true) {
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Продолжить (вывести список)");

            var answer = ConsoleHelper.getNaturalInteger("> ", x -> x >= 0 && x <= 4);

            if (answer == 0) {
                break;
            }

            if (answer == 1) {
                fb.chooseMinMax("Выберите ОЗУ от 4 Gb до 64 Gb", "ОЗУ", 4, 64);
            }
            if (answer == 2) {
                fb.chooseMinMax("Выберите HDD от 256 Gb до 4096 Gb", "HDD", 256, 4096);
            }
            if (answer == 3) {
                fb.chooseValue("Доступные операционные системы:", "OS", getAvailableOs(notebooks));
            }
            if (answer == 4) {
                fb.chooseValue("Доступные цвета:", "color", getAvailableColors(notebooks));
            }

            System.out.println();
        }

        System.out.println("Текущий фильтр:");
        System.out.println(fb.getMap());

        System.out.println("ПК, удовлетворяющие выбранным критериям:");
        var nbList = notebooks.stream().filter(x -> x.isPerfect(fb.getMap())).sorted(Comparator.comparing(Notebook::toString)).toList();

        for (var nb : nbList) {
            System.out.println(nb);
        }
    }

    private static Set<String> getAvailableColors(List<Notebook> notebooks) {
        Set<String> osAll = new HashSet<>();
        for (var nb : notebooks) {
            osAll.add(nb.color);
        }
        return osAll;
    }

    private static Set<String> getAvailableOs(List<Notebook> notebooks) {
        Set<String> osAll = new HashSet<>();
        for (var nb : notebooks) {
            osAll.add(nb.os);
        }
        return osAll;
    }

    private static List<Notebook> generateNotebooks(int count) {
        List<Notebook> nbList = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            String name = NotebookGenerator.getName();
            var nb = new Notebook(name + " " + NotebookGenerator.getLetter());
            nb.ram = NotebookGenerator.getRam();
            nb.hd = NotebookGenerator.getHdd();
            nb.os = NotebookGenerator.getOs(name);
            nb.color = NotebookGenerator.getColor();
            nbList.add(nb);
        }
        return nbList;
    }
}