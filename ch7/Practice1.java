import java.util.*;
import java.lang.*;

class Practice1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        StringBuilder check = new StringBuilder();

         // apend a string into StringBuilder input1
         check.append(input);
         check.reverse();
         String checkInput = check.toString();
         if( checkInput.equals(input)){
             System.out.print("Yes");
         }
         else{
             System.out.println("No");
         }

    }
}