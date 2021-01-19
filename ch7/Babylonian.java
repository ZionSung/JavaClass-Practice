// Reference Stackflow https://stackoverflow.com/questions/24092196/babylonian-algorithm-in-java

import java.util.*;

class Babylonian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n = input.nextDouble();
        double guess = n / 2;

        double pctDiff = Double.MAX_VALUE;
        double lastGuess = guess;

        while (Math.abs(pctDiff) >= 0.01)
        {                        
            double r = n / guess;
            guess = (guess + r) / 2;
            pctDiff = ((guess-lastGuess)/lastGuess); // normally, multiply by 100, but don't need to necessarily...
            lastGuess = guess;
        }
        System.out.println((int)guess);
    }    
}
