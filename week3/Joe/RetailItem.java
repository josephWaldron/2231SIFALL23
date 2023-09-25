package week3.Joe;

public class RetailItem {
    String description;
    int unitsOnHand;
    double price;

    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public String getDescription(){
        return description;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public boolean isExpensive(){
        return price > 100;
    }
}
