/*
    使用System.out Class的printf()方法來撰寫程式輸出所要求的內容。
    從鍵盤輸入1整數X，輸出內容為：
    You are X years old.

    要求如下：
    (1) 使用System.out.printf("You are %d years old.", ….); 來參考撰窵程式碼，要使用System.out.printf()方法
*/


import java.util.*;

class three1 {
    public static void main( String[] args ){
        Scanner scanner = new Scanner( System.in );
        int inputInt = scanner.nextInt();
        System.out.printf("You are %d years old.", inputInt );
        scanner.close();
    }
}