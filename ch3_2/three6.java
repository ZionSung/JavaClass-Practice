/*
使用NumberFormat Class 及Locale Class來撰寫程式輸出所要求的內容。

從鍵盤輸入包含小數點以下的數值x(也可以沒有包含小數) ，將x格式化的輸出為Y1及Y2，其格式要求如下：
(1)輸出為金錢的表示方式，含小數點以下2位數字，例如$12,345.67。
(2)未列印出的值以四捨五入到最後一位印出的數字。
(3)Y1使用美國地區幣別，Y2使用台灣地區幣別， Y1先印出，換行再印出Y2
*/

import java.util.*;
import java.text.NumberFormat;

class three6{
    public static void main( String[] args ){
        Scanner s = new Scanner(System.in);
        double inputMoney = s.nextDouble();
        NumberFormat taiwan = NumberFormat.getCurrencyInstance();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    
        System.out.println(us.format(inputMoney));
        System.out.print(taiwan.format(inputMoney));
        s.close();
    }
}