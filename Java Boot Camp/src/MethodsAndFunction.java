import java.util.Scanner;

public class MethodsAndFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First input : ");
        int inp1 = sc.nextInt();
        System.out.print("Enter the Second input : ");
        int inp2 = sc.nextInt();
        Sum(inp1,inp2);
        Sum(10, 20);
        Sum(20, 20);
        Sum(50, 20);
        Sum(60, 20);
    }

    public static void Sum(int a, int b) {
        int Sum = a + b;
        System.out.println(Sum);
    }
}
