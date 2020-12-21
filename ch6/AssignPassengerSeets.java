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