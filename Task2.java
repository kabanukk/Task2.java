import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println("a/b");
        System.out.println(a/b);
        System.out.println("Остаток");
        System.out.println(a%b);
    }
}