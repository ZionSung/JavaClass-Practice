/*
使用DecimalFormat Class 的method來撰寫程式輸出所要求的內容。
從鍵盤輸入包含小數點以的數值x(也可以沒有包含小數) ，將x格式化的輸出，其格式要求如下：
(1)	將x輸出為包含小數2位的數值及包含小數3位的數值，分2行輸出。
(2)	未列印出的值以四捨五入到前一位數。
*/

import java.util.*;
import java.text.DecimalFormat;

class three7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double input = s.nextDouble();
        DecimalFormat df1 = new DecimalFormat("#0.00");
        DecimalFormat df2 = new DecimalFormat("#0.000");
        System.out.println(df1.format(input));
        System.out.print(df2.format(input));
    }  
}
