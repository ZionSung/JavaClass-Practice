/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入三個字串 s1 ， s2 及 s3，由Enter分隔，在 s1 中尋找與 s2 一樣的所有子字串，
    並用 s3 取代 與 s2 一樣的子字串，大小寫要完全一樣才可取代，最後將取代後的結果輸出
*/

import java.util.*;

class three10{
    public static void main( String[] args ){

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        
        System.out.print( str1.replaceAll( str2, str3));


        /*

        ++++++++++++++ Algorithm 1 ++++++++++++++

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String ans = "";
        int begin = 0;

        for( int p = 0; str1.indexOf(str2,p) >= begin; p++ ){
            //System.out.println("Get in!");
            int last = str1.indexOf(str2,p);
            //System.out.println("p = " + p + " last = "+ last);

            for( int i = begin; i < last; i++ ){
                ans += str1.charAt(i);
                //System.out.println(ans);

            }
            
            ans += str3;
            begin = last + str2.length();
        }

        for( int i = begin; i < str1.length(); i++ ){
            ans += str1.charAt(i);
        }

        System.out.print(ans);
        */
    }
}