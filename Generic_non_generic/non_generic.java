package Generic_non_generic;

import java.util.ArrayList;
import java.util.List;

public class non_generic {

    public static void main(String[] args){
        List countries = new ArrayList<>();
        countries.add(1);
        countries.add("India");
        countries.add(2);
        countries.add("malaysia");

        for (int i = 0; i < countries.size(); i++) {
            System.out.println("Country "+i+ " ==>"+countries.get(i));
        }
    }
}
