import java.util.Scanner;

class MyMain{
   public static void main( String[] args ){
      Scanner sc = new Scanner(System.in);
      double begin = sc.nextDouble();
      begin = 1 / begin;
      begin = begin * 10;
      if( ( begin % 10 ) > 5 ){
         begin += 10;
      }
      begin /= 10;
      int ans = (int)begin;
      System.out.print( ans );
   }
}