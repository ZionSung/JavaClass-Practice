/*
    使用System.out Class的println()方法來撰寫程式輸出所要求的內容。
    從鍵盤輸入包含小數點以下的數值x(也可以沒有包含小數) ，將x格式化的輸出為Y1, Y2，其格式輸出例子如下：
    (假設輸入12.123, 其輸出結果為如下)
    (第一列：中間Start與End中間有10個字元空間，數字靠右)
    (第二列：中間Start與End中間有10個字元空間，數字靠左)
    Start     12.12End
    Start12.12     End

    要求如下：
    (1) 使用System.out.println("Start%8.2fEnd.", ….); 來參考撰窵程式碼，要使用System.out.println()方法。
    (2) 輸出兩列，不同的格式化方式。
    (3) 第一列：中間Start與End中間有10個字元空間，數字靠右，列出小數點以下2位小數)
    (4) 第二列：中間Start與End中間有10個字元空間，數字靠左，列出小數點以下2位小數)
    (5) 未列印出的值以四捨五入到最後一位印出的數字。
*/


import java.util.*;

class three4 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        float a = sc.nextFloat();
        String ans = String.format("Start%10.2fEnd", a );
        String ans2 = String.format("Start%-10.2fEnd", a );
        System.out.println(ans);
        System.out.print(ans2);
        sc.close();
    }
}
