package java8_foreach;

import java.util.ArrayList;
import java.util.List;

public class foreachloop {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("pineapple");
        list.add("Banana");

        list.forEach(System.out::println);

        list.forEach(i -> System.out.println(i));

        list.forEach(i -> {
            String name = "Fruit";
            System.out.println(name+" ==>"+i);
        });
    }
}