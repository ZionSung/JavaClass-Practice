/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入兩個字串，可由空白或Enter分隔，並比對兩字串是否相等，忽略大小寫，若相等則輸出1，若不相等則輸出0
*/


import java.util.*;

class three3{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        // transfer to same case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // compare  
        int ans = (str1.equals(str2)) ? 1 : 0;
        System.out.print(ans);
    }
}