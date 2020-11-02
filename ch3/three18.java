/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入一字串 S，以Enter做結束；再輸入一整數 x與y，以空白為間隔，
    以Enter做結束；輸出結果為將字串 s 中第 x 個字元(包含)開始，到第 y - 1 個字元(包含)印出
*/

import java.util.*;

class three18 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int x = sc.nextInt();
        int y = sc.nextInt();

        String ans = str.substring( x, y );
        System.out.print(ans);
    }
}