import java.util.*;

class TwoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row1 = s.nextInt();
        int col1 = s.nextInt();
        int[][] arr1 = new int[row1][col1];
        for( int i = 0; i < row1; i++ ){
            for( int j = 0; j < col1; j++ ){
                arr1[i][j] = s.nextInt();
            }
        }
        //System.out.println("=====================");
        int row2 = s.nextInt();
        int col2 = s.nextInt();
        int[][] arr2 = new int[row2][col2];
        for( int i = 0; i < row2; i++ ){
            for( int j = 0; j < col2; j++ ){
                arr2[i][j] = s.nextInt();
            }
        }

        // [0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0]
        // [1][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0]
        int[][] ans = new int[row1][col2];
        for( int i = 0; i < row1; i++ ){
            for( int j = 0; j < col2; j++ ){
                for( int k = 0; k < col1; k++ ){
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }

        for( int i = 0; i < row1; i++ ){
            if( i != 0 ){
                //System.out.println();
            }
            for( int j = 0; j < col2; j++ ){
                if( j != 0 ){
                    System.out.print(" ");
                }
                System.out.print(ans[i][j]);
            }
        }

    }    
}
