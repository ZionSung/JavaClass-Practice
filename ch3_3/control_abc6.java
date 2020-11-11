/*
假設A~J 每一個字母皆有代表相對應的整數值，其值可能為0~9

已知abc + gch = eeid , 且數字不重複,
程式將透過鍵盤以int依序讀入 a,b,c,d,e,的值 ,
請設計一個程式，分別將 g,h,i 代表的整數值換行輸出,
若 g,h,i 值無解，則輸出-1

-----------------------------------------
範例輸入
7 6 3 8 1

範例輸出
4
5
9

*/

import java.util.*;

public class control_abc6 {
    public static void main( String[] args ){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

        int abc = a*100 + b*10 + c;
        int gch = c*10;
        int eeid = e*1100 + d;

        for( int g = 0; g < 10; g++ ){
            for( int h = 0; h < 10; h++ ){
                for( int i = 0; i < 10; i++ ){
                    if( ((eeid+i*10) - (g*100+gch+h)) == abc ){
                        System.out.println(g);
                        System.out.println(h);
                        System.out.print(i);
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println(-1);
        s.close();
    }
}
