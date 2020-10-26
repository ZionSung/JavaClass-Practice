/*
    請利用給定的程式樣板，撰寫程式碼，功能要求如下：
    由鍵盤輸入一字串 S，以Enter做結束，再輸入一整數 n，以Enter做結束，
    輸出結果為將字串 s 中第 n 個字元印出，若超出範圍則輸出 error
*/


import java.util.*;

class three6{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int point = sc.nextInt();

        if(point < str.length()){
            System.out.print( str.charAt(point));
        }
        else{
            System.out.print("error");
        }
    }
}