/*
使用NumberFormat Class來撰寫程式輸出所要求的內容。
從鍵盤輸入包含小數點以下的數值x(也可以沒有包含小數) ，將x格式化的輸出為y，其格式要求如下：

(1)	輸出為金錢的表示方式，含小數點以下2位數字，例如NT$12,345.67。
(2) 未列印出的值以四捨五入到最後一位印出的數字。
(3)	使用預設的地區(台灣)，來恉定幣別
*/

import java.util.*;
import java.text.NumberFormat;

public class three5{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        double inputMoney = sc.nextDouble();
        NumberFormat moneyForm = NumberFormat.getCurrencyInstance();
        System.out.print(moneyForm.format(inputMoney));
    }
}