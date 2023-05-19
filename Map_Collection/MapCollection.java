package Map_Collection;

import javax.xml.parsers.SAXParser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCollection {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("id", "1");
        hm.put("name", "praveen");
        hm.put("designation", "Software engineer");
        System.out.println(hm.get("id"));

        for (Map.Entry<String, String> mapVal : hm.entrySet()) {
            System.out.println("Key ===> " + mapVal.getKey() +
                    " Value ==> " + mapVal.getValue());
        }

        for (String name : hm.keySet()) {
            String value = hm.get(name);
            System.out.println("Key: " + name + "Value: "+value);
        }

        for (String url : hm.values()){
            System.out.println("Value: " +url);
        }

        Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
        whlie (itr.hasNext()); {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key =" +entry.getKey() + ", Value =" +entry.getValue());
        }
    }

    private static void whlie(boolean hasNext) {
    }
}
