package Hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

    public static void main(String[] args) {

        System.out.println("<---------- String --------->");
        Set<String> hash_set = new HashSet<>();
        hash_set.add("Java");
        hash_set.add("C");
        hash_set.add("C++");
        hash_set.add("R");
        hash_set.add("Python");
        hash_set.add("koltin");

        Iterator<String> iterate = hash_set.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println("<--------- Integer -------->");
        Set<Integer> listnum = new HashSet<>();
        listnum.add(10);
        listnum.add(20);
        listnum.add(30);
        listnum.add(40);
        listnum.add(50);
        for (Integer numbers : listnum){
            System.out.println("Integer ==> "+ numbers);
        }

        System.out.println("<------ Double ------>");
        Set<Double> listdouble = new HashSet<>();
        listdouble.add(10.0);
        listdouble.add(100.5);
        listdouble.add(20.45);
        listdouble.add(300.0);
        listdouble.add(102.5);
        listdouble.add(100.8);
        for (double numbers : listdouble){
            System.out.println("Double ==>" + numbers);
        }
    }
}
