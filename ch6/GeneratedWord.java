import java.util.*;

import java.util.*;

class GeneratedWord {
    public static void main( String[] args ){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.toUpperCase();
        String word = s.next();
        word = word.toUpperCase();
        int word_count = 0;

        for( int i = 0; i < str.length(); i++ ){
            
            if( word_count == word.length())break;

            if( word.charAt(word_count) == str.charAt(i)){
                word_count++;
            }
        }
        //System.out.println(word_count);
        if( word_count == word.length()){
            System.out.print("Y");
        }
        else{
            System.out.print("N");
        }
        s.close();
    }
}
