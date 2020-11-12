/*
===========
Control的綜合練習 (英文編碼5)
===========

假設A~J 每一個字母皆有代表相對應的整數值，其值可能為0~9,

已知eec + cde = beb,
程式將透過鍵盤以int依序讀入 b,d,e的值 , b,d,e值必須相異,
請設計一個程式，求出c代表的整數值,
若c值無解，則輸出-1
*/

import java.util.*;

class control_abc5{
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        int b = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

        int num1 = e*110;
        int num2 = d*10 + e;
        int beb = b*101 + e*10;

        for( int c = 0; c < 10; c++ ){
            if( ((num1+c) + (c*100+num2)) == beb ){
                System.out.print(c);
                System.exit(0);
            }
        }
        System.out.print(-1);

    }
}