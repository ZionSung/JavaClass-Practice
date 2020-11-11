/*
===========
Control的綜合練習 (英文編碼1)
===========

假設A~J 代表的整數數值為 0~9(Ex: A = 0, B = 1, C = 2, ..., J = 9)

請設計一個程式，輸入為兩組A~J的組合

輸出為其兩組合轉換成數字後的相加，範例如下

-----------------------------------------
範例輸入
ABC
BCD

範例輸出
135
-----------------------------------------
範例輸入
GJI
BBB
 
範例輸出
809
-----------------------------------------
範例輸入
DCB
HJI 

範例輸出
1119
*/
import java.util.*;

public class control_abc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        double a = 0;
        double b = 0;
        double carry = 1;
        carry = Math.pow(10, str1.length());
        for( int i = 0; i < str1.length(); i++ ){
            carry /= 10;
            a += (str1.charAt(i) - 65)*carry;
        }

        carry = Math.pow(10, str2.length());

        
        for( int i = 0; i < str2.length(); i++ ){
            carry /= 10;
            b += (str2.charAt(i) - 65)*carry;
        }
        //System.out.println("a = " + a + " b = " + b);
        System.out.print((int)(a+b));
    }
}
