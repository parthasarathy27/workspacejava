import java.util.Scanner;

public class ForLoopStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        int num = input.nextInt();
        while (num <= 500) {
            System.out.println(num);
            num++;
        }
    }
}
