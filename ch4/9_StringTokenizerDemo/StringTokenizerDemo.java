

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        /*
        System.out.println("Enter your last name");
        System.out.println("followed by your first and middle names.");
        System.out.println("If you have no middle name,");
        System.out.println("enter \"None\".");
        */
        String inputLine = keyboard.nextLine( );

        String delimiters = ", "; //Comma and blank space
        StringTokenizer nameFactory = new StringTokenizer(inputLine, delimiters);

        String a = nameFactory.nextToken( );
        String b = nameFactory.nextToken( );
        String c = nameFactory.nextToken( );

        System.out.print("Hello");

        if (b.equalsIgnoreCase("None")){
            b = "";
        }
        else{
            System.out.print(" "+b);
        }

        if( c.equalsIgnoreCase("None")){
            c = "";
        }
        else{
            System.out.print(" " + c );
        }

        if( a.equalsIgnoreCase("None")){
            a = "";
        }
        else{
            System.out.print(" " + a );
        }

     }
}
