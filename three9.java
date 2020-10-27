/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入兩個字串 s1 與 s2，可由空白或Enter分隔，比較 s1 與 s2 的大小，
    將較大的字串輸出，若相等則輸出0；比較的規則為，從第一個字元開始以ACSII的質來比較，
    若第一個字元相等，則比較第二個字元，以此類推。
*/

import java.util.*;

class three9{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int p = str1.compareTo(str2);

        if( p > 0 ){
            System.out.print( str1 );
        }
        else if( p < 0 ){
            System.out.print( str2 );
        }
        else{
            System.out.print(0);
        }

        //System.out.print(str1.compareTo(str2));
    }
}