/*
===========
for迴圈應用
===========

法老王想建造新的金字塔
你身為法老王的王家建築師
請設計一個程式，當輸入一個高度正整數n的時候

會在螢幕上輸出一個高度為n的金字塔。



範例輸入

3


範例輸出
  *
 ***
*****

注意
(a)當*號印完後不能有空白直接換行
(b)輸出的格式需與要求完全相同
*/


import java.util.*;

class pyramid_for{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        for( int i = 1; i <= input; i++ ){
            for( int j = 1; j <= input+i-1; j++ ){
                if( j >= input - i+1 ){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            if(i != input) System.out.println();
        }
        s.close();
    }
}