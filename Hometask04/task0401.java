// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


package Hometask04;

import java.util.*;

public class task0401 {
    public static void main(String[] args) {
        
        reverseLl();
    };

    
    public static void reverseLl() {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        llist.add(6);
        llist.add(7);
        llist.add(8);
        llist.add(9);

        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        System.out.println("reversed linkList:" + revLinkedList);
    }

};