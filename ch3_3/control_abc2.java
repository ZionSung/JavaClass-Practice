/*
===========
Control的綜合練習 (英文編碼2)
===========

假設A~J 每一個字母皆有代表相對應的整數值，其值可能為0~9

已知eec + cde = beb
其中 b = 4, d =  0, e = 1, c的值未知
請設計一個程式，求出c代表的整數值

11c + c01 = 414


*/

import java.util.*;

public class control_abc2 {
    public static void main(String[] args) {
        for( int c = 0; c < 10; c++ ){
            int a = 110 + c;
            int b = c*100 + 1;
            /*
            System.out.print("a = " + a );
            System.out.print(" b = " + b + "=> ");
            System.out.println(a+b);
            */
            if( (a+b) == 414 ){
                //System.out.println("!!!!!!!");
                System.out.print(c);
            } 
        }
        
    }
}
