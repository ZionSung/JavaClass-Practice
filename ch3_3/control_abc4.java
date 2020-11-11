/*
In cryptarithmetic puzzles, mathematical equations are written using letters. Each letter can be a digit from 0 to 9, but no two letters can be the same. Here is a sample problem:

SEND + MORE = MONEY

A solution to the puzzle is
S = 9, R = 8, O = 0, M = 1, Y = 2, E = 5, N = 6, D = 7

Write a program that finds a solution to the cryptarithmetic puzzle of:

TOO + TOO + TOO + TOO = GOOD

The simplest technique is to use a nested loop for each unique letter (in this case T, O, G, D). 
The loops would systematically assign the digits from 0 to 9 to each
letter. 

For example, 
it might first try T = 0, O = 0, G = 0, D = 0, 
then T = 0, O = 0, G =0, D = 1, 
then T = 0, O = 0, G = 0, D = 2, etc., up to T = 9, O = 9, G = 9, D = 9. 

In the loop body, test that each variable is unique and that the equation is satisfied. Output the values for the letters that satisfy the equation.

If there is more than one answer, then choose the answer whose T is minimum.

simple output
T = 0 O = 0 G = 0 D = 0

*/

public class control_abc4 {
    public static void main(String[] args) {
        for( int T = 0; T < 10; T++ ){
            for( int O = 0; O < 10; O++ ){
                for( int G = 0; G < 10; G++ ){
                    for( int D = 0; D < 10; D++ ){
                        int TOO = T*100 + O*11;
                        int GOOD = G*1000+O*110+D;
                        if( TOO*4 == GOOD ){
                            if( T != O && O != G && G != D && T != G && T != D && O != D ){
                                System.out.print( "T = " + T + " O = " + O + " G = " + G + " D = " + D );
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
    }
}
