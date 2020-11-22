public class Car{
    private int speed;
    private int mileage;
    private String color;
    private String brand;

    public Car(){
        speed = 0;
        mileage = 0;
        color = "NoColor";
        brand = "NoBrand";
    }

    public Car( int a, int b, String c, String d ){

    }

    public int getSpeed(){
        return speed;
    }

    public int getMileage(){
        return mileage;
    }

    public String getColor(){
        return color;
    }

    public String getBrand(){
        return brand;
    }

    public boolean setSpeed( int speed ){
        this.speed = speed;
        return true;
    }

    public boolean setMileage( int mileage ){
        this.mileage = mileage;
        return true;
    }

    public boolean setColor( String color ){
        this.color = color;
        return true;
    }

    public boolean setBrand( String brand ){
        this.brand = brand;
        return true;
    }
}