/*
    使用System.out Class的printf()方法來撰寫程式輸出所要求的內容。
    從鍵盤輸入1字串X，輸出內容為：
    Hello X, how are you. X is a undergraduate student.

    要求如下：
    (1) 使用System.out.printf("Hello %s, how are you.", ….); 來參考撰窵程式碼，要使用System.out.printf()方法。
*/

import java.util.*;

class three3{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.printf("Hello %s, how are you. %s is a undergraduate student.", str, str );
      sc.close();
   }
}