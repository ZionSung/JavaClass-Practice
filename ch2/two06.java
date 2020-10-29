import java.util.*;

class two06{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        Scanner mask = new Scanner(s1);
        mask.useDelimiter(s2);

        while(mask.hasNext()){
			System.out.println(mask.next());    
		}

        mask.close();


    }
}