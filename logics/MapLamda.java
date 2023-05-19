package logics;

import java.util.HashMap;
import java.util.Map;

public class MapLamda {

    public static void main(String[] args) {

        Map<String, String> mapVal = new HashMap<>();
        mapVal.put("id", "1");
        mapVal.put("name", "Madhesh Velu");
        mapVal.put("Designation", "CEO OF ASTROVERSE");

        mapVal.forEach((k,v) -> System.out.println("Key "+ k
                  + " and Values is : "+v));

        mapVal.forEach((i,j) -> {
            System.out.println("Key ===> " +i+ " - " + "value ===> " + j);
        });
    }
}