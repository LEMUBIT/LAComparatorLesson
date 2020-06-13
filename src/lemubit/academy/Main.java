package lemubit.academy;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        var comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 > o2) {
                    return 1;
                } else if (o1 == o2) {
                    return 0;
                } else {
                    return -1;
                }

            }
        };

        var treeSet = new TreeSet<Integer>(comparator);

        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(100);

        System.out.println(treeSet);

    }
}
