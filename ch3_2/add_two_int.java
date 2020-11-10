import java.util.Scanner;

class add_two_int {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int a, b;
        int result;
        a = keyin.nextInt();
        b = keyin.nextInt();
        result = a + b;
        System.out.print(result);
    }
}
