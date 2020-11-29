import java.util.Scanner;


public class temperature
{
    private double degrees; //Celsius

    public temperature( )
    {
        degrees = 0;
    }

    public temperature(double initialDegrees)
    {
        degrees = initialDegrees;
    }

    public void setDegrees(double newDegrees)
    {
        degrees = newDegrees;
    }

    public double getDegrees( )
    {
        return degrees;
    }    

    public String toString( )
    {
        return (degrees + " C"); 
    }

    public boolean equals(temperature othertemperature)
    {
        if( degrees == othertemperature.degrees ){
            return true;
        }
        else{
            return false;
        }
    }



    public static double toCelsius(double degreesF)
    {
        return (degreesF - 32)*5 / 9;
    }
    public static void main(String[] args)
    {
            double degreesF, degreesC;
                          
            Scanner keyboard = new Scanner(System.in);
            
            degreesF = keyboard.nextDouble( );
    
            degreesC = toCelsius(degreesF);
    
            temperature temperatureObject = new temperature(degreesC);
            System.out.print("Equivalent Celsius temperature is "+ temperatureObject.toString( ));
    }
}

