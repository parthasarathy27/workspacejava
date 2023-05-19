package Generic_non_generic;

import java.util.ArrayList;
import java.util.List;

public class generic {

        public static void main(String[] args){
            List<String> countries = new ArrayList<>();
            countries.add(" north india");
            countries.add(" India");
            countries.add(" sri lanka");
            countries.add(" malaysia");

            for (int i = 0; i < countries.size(); i++) {
                System.out.println("Country "+i+ " ==>"+countries.get(i));
            }
        }
    }