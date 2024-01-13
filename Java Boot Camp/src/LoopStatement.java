import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        int Option = input.nextInt();

        while (Option <= 20) {
            if(Option%2 == 0) {
                System.out.println(Option);
            }
            Option++;
        }
    }
}