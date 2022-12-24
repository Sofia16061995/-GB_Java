/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */

 package Hometask04;

 import java.util.*;
 
 public class task4_2 {
     public static void main(String[] args) {
 
         LinkedList<Integer> list = new LinkedList<Integer>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.add(70);
 
         LinkedList<Integer> finallist = new LinkedList<Integer>();
 
         for (Integer zztemp : list) {
             finallist.add(zztemp);
         }
         System.out.println(finallist);
 
         enqueue(finallist, 42);
         System.out.println(finallist);
 
         System.out.print(dequeue(finallist) + " ");
         System.out.println(finallist);
 
         System.out.print(first(finallist) + " ");
         System.out.println(finallist);
     }
 
     public static void enqueue(LinkedList<Integer> list, int number) {
         list.addLast(number);
     }
 
     public static int dequeue(LinkedList<Integer> list) {
         int number = 0;
         number = list.get(0);
         list.remove(0);
         return number;
     }
 
     public static int first(LinkedList<Integer> list) {
         int number = 0;
         number = list.get(0);
         return number;
     }
 
 }