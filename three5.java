/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入一字串，字串的起始、中間、結尾可包含多個空白字元，輸出結果則將起始與結尾的空白字元裁掉
*/

import java.util.*;

class three5{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int begin = 0;
        int last = 0;

        for( int i = 0; i < str.length(); i++ ){
            if( str.charAt(i) != ' ' ){
                begin = i;
                break;
            }
        }

        for( int i = str.length()-1; i > 0; i-- ){
            if( str.charAt(i) != ' ' ){
                last = i;
                break;
            }
        }

        for( int i = begin; i <= last; i++ ){
            System.out.print( str.charAt(i) );
        } 

    }
}