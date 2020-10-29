import java.util.Scanner;

class one15{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();

        int len = a*a + b*b;

        if( len < 10000 ){
            System.out.print("inside");
        }
        else{
            System.out.print("outside");        }
    }
}