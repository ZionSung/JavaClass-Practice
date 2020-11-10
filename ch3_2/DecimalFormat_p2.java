/*
使用DecimalFormat Class及String pattern('0'及'#')的概念( II)。
從鍵盤輸入包含小數點以下的數值x(也可以沒有包含小數)，將x格式化的輸出為y，其格式要求如下：
(1).One or more digits before the decimal point 
(2).Two or three digits after the decimal point
(3).未列印出的值以四捨五入到最後一位印出的數字。
*/

import java.util.*;
import java.text.DecimalFormat;

class DecimalFormat_p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double input = s.nextDouble();
        DecimalFormat f = new DecimalFormat("#0.0##");
        System.out.print(f.format(input));
    }    
}
