import java.lang.Math;
import java.util.Scanner;

class MyMain{
   public static void main( String[] args ){
      Scanner sc = new Scanner(System.in);
      double moore = sc.nextDouble();
      double ph = 14 + Math.log10(moore);
      System.out.printf("%.2f", ph );
   }
}