package week3.Joe;

public class Car {
    private String name;
    private String color;
    private int speed;
    private int horsepower;
    public Car(){}
    public Car(String name, String color, int speed, int horsepower) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.horsepower = horsepower;
    }
    public String getColor() {
        return color;
    }
    public int getHorsepower() {
        return horsepower;
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void accelerate(int speed){
        this.speed += speed;
    }
    public void brake(int speed){
        this.speed -= speed;
    }
    public void printCar(){
        System.out.println("Name: " + name + " Color: " + color + " Speed: " + speed + " Horsepower: " + horsepower);
    }

}
