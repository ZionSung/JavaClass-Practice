/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入一字串，可包含空白及符號，將字串的所有字元改為小寫輸出
*/

import java.util.*;

class three17 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.print(str);
    }
}