import java.util.*;
import java.lang.*;
class Find_Limit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] tokens = input.split("\\s+");
        float f[];
        int checkInt = 1;
        f = new float[5];

        // init f
        for( float fl : f ){
            fl = 0;
        }

        int counter = 0;
        for( String token : tokens ){
            // check if it is int
            for( int i = 0; i < token.length(); i++ ){
                if( token.charAt(i) == '.'){
                    checkInt = 0;
                    f[counter] = Float.parseFloat(token);
                    break;
                }
                else{
                    f[counter] = Float.parseFloat(token);
                }
            }

            counter++;
        }

        Arrays.sort(f);
        System.out.println("Output");
        if( checkInt == 1){
            System.out.println("The least score is " + (int)f[0]);
        }
        else{
            System.out.println("The least score is " + f[0]);
        }
        System.out.println("The scores are:");
        int no = 0;
        for( float f1 : f ){
            no++;
            if( no == 5 ){
                if( checkInt == 1){
                    System.out.print( (int)f1 +" differs from min by " + (f1 - f[0]));
                }
                else{
                    System.out.print( f1 +" differs from min by " + Math.round((f1 - f[0])*10.0) / 10.0);
                }
            }
            else{
                if( checkInt == 1 ){
                    System.out.println( (int)f1 +" differs from min by " + (f1 - f[0]));
                }
                else{
                    System.out.println( f1 +" differs from min by " +  Math.round((f1 - f[0])*10.0) / 10.0);
                }
            }
            
        }
    }
}
