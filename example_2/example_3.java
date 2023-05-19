package example_2;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;

public class example_3 {
    public class DuplicateCharacters {
        public static void main(String[] args) {
            String input = "Hello World";
            Map<Character, Long> charCount = input.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            charCount.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        }
    }
}
