/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入兩個字串，可由空白或Enter分隔，並比對兩字串是否相等，
    大小寫皆要比較，若相等則輸出1，若不相等則輸出0
*/ 

import java.util.*;

class three16 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int ans = str1.equals(str2) ? 1 : 0;
        System.out.print(ans);
    }
}