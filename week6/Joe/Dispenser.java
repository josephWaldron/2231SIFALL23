package week6.Joe;

public class Dispenser {
    private String name;
    private double price;
    private int count;

    public Dispenser(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
    public void makeSale() {
        count--;
    }
}
