package strategy;

public class PaymentContext {
    private final PaymentCard strategy;

    public PaymentContext(PaymentCard strategy) {
        this.strategy = strategy;
    }

    public void doPayment(String buyer, int amount) {
        this.strategy.pay(buyer, amount);
    }
}