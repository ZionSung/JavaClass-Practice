import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String firstName, lastName, pigLatin;
        String temp = ""; // record chars before vowel 
        Scanner scan = new Scanner(System.in);
        int flag = 0;

        firstName = scan.next();
        lastName = scan.next();

        // transfer to lower words
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        // firstName transfer
        char word1 = firstName.charAt(0);

        System.out.print(Character.toUpperCase(firstName.charAt(1)));

        for( int i = 2; i < firstName.length(); i++ ){
            System.out.print(firstName.charAt(i));
        }
        System.out.print( word1 + "ay " );

        // lastName transfer
        char word2 = lastName.charAt(0);

        System.out.print(Character.toUpperCase(lastName.charAt(1)));

        for( int i = 2; i < lastName.length(); i++ ){
            System.out.print(lastName.charAt(i));
        }
        System.out.println( word2 + "ay" );


        /*
        // second transfer
        for( int i = 0; i < lastName.length(); i++ ){
            if( flag == 0 ){
                if( lastName.charAt(i) == 'a' || 
                    lastName.charAt(i) == 'e' ||
                    lastName.charAt(i) == 'i' || 
                    lastName.charAt(i) == 'o' || 
                    lastName.charAt(i) == 'u' ){
                        char word = Character.toUpperCase(lastName.charAt(i));
                        System.out.print(word);
                        flag = 1;
                }
                else{
                    //System.out.println(firstName.charAt(i));
                    temp = temp + lastName.charAt(i);
                }  
            }
            else{
                System.out.print(lastName.charAt(i));
            }
        }
        System.out.println(temp + "ay" );
        */
    }
}