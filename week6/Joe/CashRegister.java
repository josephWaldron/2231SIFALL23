package week6.Joe;

public class CashRegister {
    private double cashOnHand;

    public CashRegister() {
        cashOnHand = 200;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }
    public void acceptAmount(double amount) {
        cashOnHand += amount;
    }

}
