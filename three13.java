/*
    請設計一個程式，在輸入一行字串後，將字串內的所有 I 變成小寫，
    字串內的所有 hate則將其轉換為 Love，而當字串內出現java（大小寫不論）時，用JAVA取代
    在輸出的字串前後都加上***後，最後拿掉所有的空格符號進行輸出

    範例輸入
    I hate Java
    範例輸出
    ***iLoveJAVA***
    注意:
    1.hate或java可能不只出現一次
*/

import java.util.*;

class three13 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        str = str.replaceAll( "I", "i" );
        str = str.replaceAll( "hate", "Love");
        str = str.replaceAll( "(?i)java", "JAVA");
        
        Scanner skip = new Scanner(str);
        System.out.print("***");
        while( skip.hasNext()){
            System.out.print(skip.next());
        }
        System.out.print("***");
    }
}