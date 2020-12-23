import java.util.Scanner;

class Array {
    public static void main( String[] args ){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int[] arr1 = new int[num1];
        for( int i = 0; i < num1; i++ ){
            arr1[i] = s.nextInt();
        }
        int num2 = s.nextInt();
        int[] arr2 = new int[num2];
        for( int i = 0; i < num2; i++ ){
            arr2[i] = s.nextInt();
        }
        if( num1 != num2 ){
            System.out.print("false");
            System.exit(0);
        }
        
        for( int i = 0; i < num1; i++ ){
            if( arr1[i] != arr2[i] ){
                System.out.print("false");
                System.exit(0);
            }
        }
        System.out.print("true");
        s.close();
    }    
}
