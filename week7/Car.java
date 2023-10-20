package week7;

public class Car {
    public static int wheels = 4;
    private String color;

    public Car(){
        this.color = "";
    }
    public Car(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public static void startCar(){
        System.out.println("Car started");
    }
}
