/*
使用DecimalFormat Class 的method來撰寫程式輸出所要求的內容。
從鍵盤輸入包含小數點以下的數值x(也可以沒有包含小數) ，將x格式化的輸出為y，其格式要求如下：
(1)輸出為百分比的表示方式，百分比包含小數點以下2位數字，例如98.32%。
(2)未列印出的值以四捨五入到最後一位印出的數字。
*/

import java.util.*;
import java.text.DecimalFormat;

class DecimalFormat_mode{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double input = s.nextDouble();
        DecimalFormat mode = new DecimalFormat("0.00%");
        System.out.print(mode.format(input));
    }
}