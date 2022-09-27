import java.util.*;

class ArrayListExample {
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Sachin");
        list1.add("Dhoni");
        list1.add("Kohli");
        list1.add("Raina");
        Collections.sort(list1);
        for (String players : list1)
            System.out.println(players);

        System.out.println("Sorting numbers...");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(7);
        list2.add(18);
        list2.add(48);

        Collections.sort(list2);
        for (Integer number : list2)
            System.out.println(number);
    }

}      