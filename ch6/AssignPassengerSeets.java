/*
Write a program to assign passengers seats in an airplane. Assume a small airplane
with seat numberings as follows:
1 A B C D
2 A B C D
3 A B C D
4 A B C D
5 A B C D
6 A B C D
7 A B C D
The program should display the seat pattern, with an 'X' marking the seats already
assigned. For example, after seats 1A, 2B, and 4C are taken, the display should look
like the following:
1 X B C D
2 A X C D
3 A B C D
4 A B X D
5 A B C D
6 A B C D
7 A B C D

輸入：在鍵盤輸入要登記的座位，可輸入多個，以空白分開，輸入一列。英文大小寫皆可。
輸出：如上面所列。(每一列用一個空白分隔，每一列結束，以換行)(以及文大寫輸出)
註：
1‧輸入座位有重複時，則忽略重複的, 程式仍需正常運作。
2.若輸入座位格式有錯誤時，直接輸出"ERROR"

範例1：
-----------------------------
1A 2B 4C
1 X B C D
2 A X C D
3 A B C D
4 A B X D
5 A B C D
6 A B C D
7 A B C D
------------------------------
------------------------------


範例2：
-----------------------------
2A 2B 4C 7D 7d
1 A B C D
2 X X C D
3 A B C D
4 A B X D
5 A B C D
6 A B C D
7 A B C X
------------------------------
------------------------------


範例3：
-----------------------------
2A 2B C4 7D 7d
ERROR
*/

import java.util.*;

class AssignPassengerSeets{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String tokens[] = str.split(" ");

        char[][] answer = new char[7][4];

        for( String token : tokens ){
            //System.out.println(token);
            // check length
            if( token.length() != 2 ){
                System.out.print("ERROR");
                System.exit(0);
            }
            else if( Character.isDigit(token.charAt(0))){
                //System.out.println("token(0) = " + token.charAt(0));
                int num = Character.getNumericValue(token.charAt(0));
                //System.out.println("num = " + num );
                char ch = token.charAt(1);
                //System.out.println("token(1) = " + ch);
                if( ch == 'A' || ch == 'a'){
                    answer[num-1][0] = 'X';
                }
                else if( ch == 'B' || ch == 'b'){
                    answer[num-1][1] = 'X';
                }
                else if( ch == 'C' || ch == 'c'){
                    answer[num-1][2] = 'X';
                }
                else if( ch == 'D' || ch == 'd'){
                    answer[num-1][3] = 'X';
                }
                else{
                    System.out.print("ERROR");
                    System.exit(0);
                }
            }
            else{
                System.out.print("ERROR");
                System.exit(0);
            }
        }
        
        for( int i = 0; i < 7; i++ ){
            System.out.print((i+1) + " ");
            for( int j = 0; j < 4; j++ ){
                if(answer[i][j] == 'X' ){
                    System.out.print(answer[i][j]);
                }
                else{
                    switch(j){
                        case 0:
                            System.out.print('A');
                            break;
                        case 1:
                            System.out.print('B');
                            break;
                        case 2:
                            System.out.print('C');
                            break;
                        case 3:
                            System.out.print('D');
                            break;
                    }
                } // end else
                if( j != 3 ){
                    System.out.print(" ");
                }
            } // end for j
            if( i == 6 ){
                System.exit(0);
            }
            System.out.println();
        } // end for i
    }
}