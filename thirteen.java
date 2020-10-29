// 1 -13
import java.util.Scanner;

class thirteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double speed = (100 - 30 * 2.54)/100;

        d = d / speed;
        d *= 10;

        if( (d%10) > 0 ){
            d += 10;
        }

        int ans = (int)d / 10;

        System.out.print(ans);
    }
}