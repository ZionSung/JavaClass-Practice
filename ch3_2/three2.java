/*
    使用System.out Class的printf()方法來撰寫程式輸出所要求的內容。
    從鍵盤輸入2整數X, 及Y，計算 (X+Y)的和，並將答案輸出，輸出內容例子如下：
    3 add 5 are 8.

    要求如下：
    (1) 使用System.out.printf("%d add %d are %d.”, ….); 來參考撰窵程式碼，要使用System.out.printf()方法。
*/

import java.util.*;

class three2 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d add %d are %d.", a, b, a+b );
        sc.close();
    }
}