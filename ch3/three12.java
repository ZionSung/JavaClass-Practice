/*
    ==================
    「行動代號」產生程式
    ==================
    某國情報人員的「行動代號」產生方式如下：
    (1)依據情報人員的First name及Last name來產生。
    (2)先把First name的第一個字母搬到First name的最後，
    並在其結尾加上ay，產生新的First name
    (3)再把Last name的最後一個字母搬到Last name的最前，
    並在其結尾換上er，產生新的Last name
    (4)新產生的「行動代號」為
    First name + Last name
    ex:
    輸入: Tom Lin
    輸出: Omtay Nlier
*/


import java.util.*;

class three12{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        String firstName = sc.next();
        String lastName = sc.next();
        String ans1 = "";
        String ans2 = "";

        // first name
        ans1 += Character.toUpperCase(firstName.charAt(1)); 
        ans1 += firstName.substring(2, firstName.length());
        ans1 = ans1 + Character.toLowerCase(firstName.charAt(0)) + "ay";

        // last name
        int len_lastName = lastName.length();
        ans2 += Character.toUpperCase(lastName.charAt(len_lastName-1));
        ans2 += Character.toLowerCase(lastName.charAt(0));
        ans2 = ans2 + lastName.substring(1, len_lastName-1) + "er";

        System.out.print( ans1 + " " + ans2 );
    }
}