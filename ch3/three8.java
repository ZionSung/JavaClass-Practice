/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入兩個字串 s1 與 s2，可由空白或Enter分隔，在 s1 中尋找是否有包含 s2 的子字串，
    若找到輸出包含 s2 子字串的開始位置，若無則輸出-1
*/


import java.util.*;

class three8{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        System.out.print(str.indexOf(str2));
    }
}