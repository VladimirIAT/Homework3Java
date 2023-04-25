import java.util.*;

public class Task1 {

    public static void main(String[] args) {

//Реализовать алгоритм обратной сортировки списков компаратором.
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Fish");
        list.add("Oil");
        list.add("Two");
        list.add("Chiese");
        list.add("Fishmonger");
        list.add("Butcher");
        list.add("Compolsury");

        System.out.println(list);

        list.sort(Comparator.reverseOrder());
 
        System.out.println(list);

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
        Integer[] list2  = {1, 4, 7, 8, 5, 2, 8, 6, 9, 8, 5, 21, 47, 3};
        System.out.println(Arrays.toString(list2));
        ArrayList<Integer> listI2 = new ArrayList<>();
        for (int index = 0; index < list2.length; index++) {
            if (list2[index]%2 == 0) {
                listI2.add(list2[index]);
            }
        }
        System.out.println(listI2);

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        ArrayList<Integer> listI3 = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 5, 2, 8, 6, 9, 8, 5, 21, 47, 3));
        int min = listI3.get(0);
        int max = 0;
        double count = 0;
        double average;
        for (int index = 0; index < listI3.size(); index++) {
            if (listI3.get(index) < min){
                min = listI3.get(index);
            }
            if (listI3.get(index) > max){
                max = listI3.get(index);
            }
            count +=listI3.get(index);                
        }
        average = count / listI3.size();
        System.out.println(min);
        System.out.println(max);
        System.out.printf("%.2f",average);
        System.out.println();
//Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 5, 2));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(8, 6, 1, 8, 5, 2, 47, 3));
        arrayList2.removeAll(arrayList1);
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
//Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        double begin = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            arrayList3.add(0);
        }
        double end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));
//Повторить пятый пункт но с LinkedList.
        LinkedList<Integer> arrayList4 = new LinkedList<>();
        double begin1 = System.currentTimeMillis();
        for (int index = 0; index < 10000; index++) {
            arrayList4.add(0);
        }
        double end1 = System.currentTimeMillis();
        System.out.println("Время: " + (end1 - begin1));
    }
//Сравнить время работы пятого и шестого пунктов.
//LinkedList работает быстрее    
}