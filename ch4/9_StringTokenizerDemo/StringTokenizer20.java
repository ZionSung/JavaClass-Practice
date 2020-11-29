import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer20 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
        StringTokenizer st = new StringTokenizer(str, "%|abcdefghijklmnopqrstuvwxyz");

        while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}