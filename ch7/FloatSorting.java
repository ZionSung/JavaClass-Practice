import java.util.*;

import javax.sound.midi.SysexMessage;

class FloatSorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputData = s.nextLine();
        String[] tokens = inputData.split("\\s+");
        float f[];
        f = new float[10];

        // init f
        for( float fl : f ){
            fl = 0;
        }

        int counter = 0;
        for( String token : tokens ){
            f[counter] = Float.parseFloat(token);
            counter++;
        }

        // sorting
        Arrays.sort(f);

        // print
        System.out.print("Large to small:");
        for( int i = 0, j = 9; i < counter; i++, j-- ){
            System.out.print(" ");
            System.out.print(f[j]);
        }
        System.out.println("");
    }
}
