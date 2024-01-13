import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        int Option = input.nextInt();

        do {
            System.out.println(Option);
        } while (false);
    }
}
