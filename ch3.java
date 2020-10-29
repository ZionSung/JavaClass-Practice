import java.util.Scanner;

class ch3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double pay = 0;

        if( salary < 15000 ){
            //
        }
        else if( salary >= 15000 && salary <= 30000 ){
            pay = ( salary - 15000 ) * 0.05;
        }
        else{
            pay += 15000 * 0.05;
            pay += ( salary - 30000 ) * 0.1;
        }

        System.out.printf("%.2f", pay);
    }
}