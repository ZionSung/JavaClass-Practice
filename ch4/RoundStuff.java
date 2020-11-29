
/**
Class with static methods for circles and spheres.
*/
public class RoundStuff
{
    public static double PI = 3.14159;

    /**
     Return the area of a circle of the given radius.
    */
    public static double area(double radius)
    {
        return (PI*radius*radius);
    }
    
    /**
     Return the volume of a sphere of the given radius.
    */
    public static double volume(double radius)
    {
        return ((4.0/3.0)*PI*radius*radius*radius);
    }


    /**
     Return the circumference of a circle of the given radius.
    */
    public static double circumference(double radius)
    {
        return (2.0*PI*radius);
    }
    
    /**
     Return the surface are of a sphere of the given radius.
    */
    public static double surfacearea(double radius)
    {
        return (4.0*PI*radius*radius);
    }


}