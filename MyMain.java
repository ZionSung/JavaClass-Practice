import java.util.Scanner;

class MyMain{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      
      double ans;
      ans = a * ( b * 2 / 9.8 );

      System.out.printf("%.2f\n", ans );
      
   }
}