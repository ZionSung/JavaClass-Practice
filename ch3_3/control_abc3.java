/*
===========
Control的綜合練習 (英文編碼3)
===========

假設A~J 每一個字母皆有代表相對應的整數值，其值可能為0~9

已知abc + gch = eeid
其中 a = 5, b = 4, c = 3, d =  0, g = 6, i = 8, e 與 h的值未知
請設計一個程式，求出e 與 h代表的整數值，請將結果 e 的值先輸出，然後換行再將h的值輸出

543 + 63h = ee80

*/
import java.util.*;

public class control_abc3 {
    public static void main(String[] args) {
        for( int e = 0; e < 10; e++ ){
            for( int h = 0; h < 10; h++ ){
                int c = e*1000 + e*100 + 80;
                int b = 630 + h;
                if( (c-b) == 543 ){
                    System.out.println(e);
                    System.out.print(h);
                }
                 
            }
        }
    }
}
