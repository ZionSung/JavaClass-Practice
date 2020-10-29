import java.util.Scanner;

class one14{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        int seconds = sc.nextInt();
        int dayMins = 24 * 60 * 60;
        int hourMins = 60 * 60;
        int ans = 0;
        
        if( seconds > dayMins ){
            seconds = seconds % dayMins;
            if( seconds > hourMins ){
                seconds %= hourMins;
            } 
        }
    
        ans = seconds / 60;

        System.out.print( ans );

        
    }
}