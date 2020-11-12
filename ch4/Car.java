public class Car {
    int speed = 0;
    int mileage = 0;
    String color = "";
    String brand = "";

    public boolean setSpeed( int speed ){
        boolean speed_state = true;
        return speed_state;
    }

    public boolean setMileage( int mileage ){
        boolean mileage_state = true;
        return mileage_state;
    }

    public boolean setColor( String color ){
        boolean color_state = true;
        return color_state;
    }

    public boolean setBrand( String brand ){
        boolean brand_state = true;
        return brand_state;
    }

    public boolean setCar( String color, String brand ){
        boolean car_state = true;
        return car_state;
    }

    public boolean setCar( int speed, int mileage, String color, String brand ){
        boolean car_state = true;
        return car_state;
    }
}

