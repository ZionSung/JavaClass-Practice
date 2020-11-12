/*
=======
字元轉換
=======
請設計一個字元轉換程式，會將所輸入的英文字母轉換。
字母小寫（a~e）將會轉換成大寫輸出（A~E）。
其餘所有其他輸入的字元將轉換成字母Z輸出。

範例輸入：
a b c h 1
範例輸出
A B C Z Z
*/


import java.util.*;

class char_switch{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String ans = "";
        for( int i = 0; i < str.length(); i++ ){
            switch(str.charAt(i)){
                case ' ':
                    ans += ' ';
                    break;
                case 'a':
                    ans += 'A';
                    break;
                case 'b':
                    ans += 'B';
                    break;
                case 'c':
                    ans += 'C';
                    break;
                case 'd':
                    ans += 'D';
                    break;
                case 'e':
                    ans += 'E';
                    break;
                default:
                    ans += 'Z';
                    break;

            }
        }
        System.out.print(ans);
        s.close(); 
    }
}