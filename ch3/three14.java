/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入三個字串 s1 ， s2 及 s3，由Enter分隔，
    在 s1 中尋找與 s2 一樣的所有子字串，並用 s3 取代 與 s2 一樣的子字串，
    不管 s2的大小寫都要取代，除了被取代的子字串要與 s3 的大小寫一致，
    未被取代的字串都要保留原本的大小寫一致，最後將取代後的結果輸出
*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class three14 {

    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        
        System.out.print( IgnoreCaseReplace(s1, s2, s3) );
    }

    public static String IgnoreCaseReplace(String original, String oldString, String newString) {  
        Pattern p = Pattern.compile(oldString, Pattern.CASE_INSENSITIVE);  
        Matcher m = p.matcher(original);  
        String result = m.replaceAll(newString);  
        return result;  
    }  
}