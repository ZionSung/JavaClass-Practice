/*
==========
switch練習
==========
小明在便利商店打工，每週一到周五值日班，
週六值夜班，週日放假
請幫小明設計一個程式，當輸入1~7代表週一到週日時，
程式可以輸出該天的輪值狀況如下:
(1)值日班: 輸出 day
(2)值夜班: 輸出 night
(3)放假  : 輸出 rest

------------
Example1
------------
範例輸入
1

範例輸出
day 
------------
Example2
------------
範例輸入
7

範例輸出
rest 

注意:
(a)當輸入非1~7時，輸出Input Error!
*/

import java.util.*;


class switch_p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char input = s.next().charAt(0);
        
        
        switch(input){
            case '1':
                System.out.print("day");
                break;
            case '2':
                System.out.print("day");
                break;
            case '3':
                System.out.print("day");
                break;
            case '4':
                System.out.print("day");
                break;
            case '5':
                System.out.print("day");
                break;
            case '6':
                System.out.print("night");
                break;
            case '7':
                System.out.print("rest");
                break;
            default:
                System.out.print("Input Error");
                break;

        }
        s.close();
    }
}
