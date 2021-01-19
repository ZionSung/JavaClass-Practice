import java.util.*;
import java.lang.*;

public class GradeBook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stuNum = s.nextInt();
        int testNum = s.nextInt();
        double[][] stu = new double[stuNum][testNum];
        for( int i = 0; i < stuNum; i++ ){
            for( int j = 0; j < testNum; j++ ){
                stu[i][j] = s.nextDouble();
            }
        }

        double[] exam = new double[testNum];
        double[] st = new double[stuNum];

        for( int i = 0; i < testNum; i++ ){
            for( int j = 0; j < stuNum; j++ ){
                exam[i] += stu[j][i];
            }
            System.out.println("exam" + (i+1) + ":" + Math.round(exam[i]/stuNum));
        }

        for( int i = 0; i < stuNum; i++ ){
            for( int j = 0; j < testNum; j++ ){
                st[i] += stu[i][j];
            }
            if( i == stuNum-1){
                System.out.print("st" + (i+1) + ":" + Math.round(st[i]/testNum));
            }
            else{
                System.out.println("st" + (i+1) + ":" + Math.round(st[i]/testNum));
            }
        }

        


    }
}
