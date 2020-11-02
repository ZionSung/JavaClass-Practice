/*
    一串加密的字串，包含空白字元，其編碼的方式如下：

    1. 開始第一字元有意義。

    2. 開始字元起，每間隔兩個字元才有意義，此後依此類推。

    輸入說明： 
    例如：加密字串為 Ias eelxcowhvcneop sfJvbazevuiakp.

    解密結果為 I love Java.
*/


import java.util.*;

class three15 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "" + str.charAt(0); // add first char
        System.out.print(ans);
        //System.out.println("test 1 ");

        Scanner scan_str = new Scanner(str);

        // skip first 
        String first_next = scan_str.next();
        for( int i = 3; i < first_next.length(); i += 3 ){
            System.out.print(first_next.charAt(i));
        }


        while( scan_str.hasNext() ){
            //System.out.println("ans = " + ans);
            System.out.print(" ");
            String eachStr = scan_str.next();
            if( eachStr.length() > 2 ){
                for( int i = 2; i < eachStr.length(); i += 3 ){
                    System.out.print(eachStr.charAt(i));
                }
            }
        }
    }
}