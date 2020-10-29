import java.util.*;

class two14{
   public static void main( String[] args ){
      Scanner sc = new Scanner(System.in);
      long inputData = sc.nextLong();
      long dayTime = 24 * 60 * 60 * 1000;
      long day = inputData /  dayTime;
      // day = 24 * 60 * 60 * 1000

      System.out.print(day + " ");

      inputData = inputData - day*dayTime;

      long hourTime = 3600000;
      long hour = inputData / hourTime;

      System.out.print(hour + " ");

      inputData = inputData - hour*hourTime;

      long minsTime = 60000;
      long mins = inputData / minsTime;

      System.out.print(mins + " ");

      long second = inputData - minsTime*mins;

      System.out.print(second/1000);


   }
}