
import java.util.Scanner;

/**
Illustrate the use of a static method from the class Character.
*/

public class StringProcessor
{
    public static void main(String[] args)
    {
        //System.out.println("Enter a one line sentence:");
        Scanner keyboard = new Scanner(System.in);
        String sentence = keyboard.nextLine( );
        String ans = "";

        int flag = 0;

        for( int i = 0; i < sentence.length(); i++ ){

            if( sentence.charAt(i) == ' ' && flag == 0){
                flag = 1;
            }

            if( flag == 0){
                ans += sentence.charAt(i);
            }
            else{
                ans += Character.toUpperCase(sentence.charAt(i));
            }
        }
        System.out.print(ans);
        keyboard.close();
    }
}
