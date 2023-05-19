package example_2;

import java.util.HashSet;
import java.util.Set;

public class example_1 {

    public static final void duplicateChars(String input) {

        char[] chInput = input.toCharArray();
        Set setDuplicated = new HashSet<>();
        Set distinctChars = new HashSet<>();

        for (char ch : chInput) {
            if (distinctChars.add(ch) == false)
                setDuplicated.add(ch);
        }

        System.out.print("Duplicate characters are: ");
        setDuplicated.forEach(ch -> System.out.print(ch + " "));
    }


    public static void main(String[] args) {
        System.out.println("\n---------------------------");
        String input = "MALAYALAM";
        System.out.println("Input string is: " + input);
        duplicateChars(input);

        System.out.println("\n---------------------------");
        input = "ACSCACARYTYCACAYCSYCACA";
        System.out.println("\nInput string is: " + input);
        duplicateChars(input);
        System.out.println("\n---------------------------");
    }
}