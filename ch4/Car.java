public class Car{
    public int speed;
    public int mileage;
    public String color;
    public String brand;

    public Car(){
        speed = 0;
        mileage = 0;
        color = "NoColor";
        brand = "NoBrand";
    }

    public Car( int speed ){
        this.speed = speed;
        mileage = 0;
        color = "NoColor";
        brand = "NoBrand";
    }

    public Car( String brand ){
        this.brand = brand;
        speed = 0;
        mileage = 0;
        color = "NoColor";
    }

    public Car( String color, String brand ){
        this.color = color;
        this.brand = brand;
        speed = 0;
        mileage = 0;
    }


    public Car( int a, int b, String c, String d ){
        speed = a;
        mileage = b;
        color = c;
        brand = d;
    }
/*
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

    public boolean setCar( String color, String brand ){
        this.color = color;
        this.brand = brand;
        return true;
    }

    public boolean setCar( int speed, int mileage, String color, String brand ){
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
        return true;
    }

    public boolean setColor( String color, String brand ){
        this.color = color;
        this.brand = brand;
        return true;
    }

    public boolean setColor( int speed, int mileage, String color, String brand ){
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
        return true;
    }
    */
}