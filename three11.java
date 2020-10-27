import java.util.*;

class three11{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag = 0;
        int ans = 0;
        int len = str.length();

        char p = str.charAt(0);

        if( len != 10 ){
            ans = 0;
        }
        else{
            if( (p > 64 && p < 91) || ( p > 96 && p < 123 )){
                p = str.charAt(1);
                ans = 1;
                if( p != 49 && p != 50 ){
                    ans = 0;
                }
            }
            else{
                ans = 0; // false
                //System.out.println("2")
            }
        }
        System.out.print(ans);
    }
}

/*

++++++++++ hard one ++++++++++

class three11{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag = 0;
        int ans = 0;
        int len = str.length();

        for( int i = 0; i < len; i++ ){

            if( len != 10 ){
                ans = 0;
                //System.out.println("1");
                break;
            }

            char p = str.charAt(i);
            //System.out.println(p + " " + i + " " + flag);

            if(( p != 49 && p != 50 ) && flag == 1 ){
                flag = 2;
                ans = 0;
                //System.out.println("3");
                break;
            }

            
            if( flag == 1 ){
                flag = 2; // recovery to the next char, or the judge of first char would be wrong.
            }

            // first char
            if( p != ' ' && flag == 0 ){
                flag = 1;
                if( (p > 64 && p < 91) || ( p > 96 && p < 123 )){
                    ans = 1; // first char is fit
                }
                else{
                    ans = 0; // false
                    //System.out.println("2");
                    break;
                }
            }
        }

        System.out.print(ans);
    }
}
*/