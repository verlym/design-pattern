package strategy;

public class Main {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext(new CreditCard());
        paymentContext.doPayment("salitha", 100);

        paymentContext = new PaymentContext(new DebitCard());
        paymentContext.doPayment("salitha", 100);

    }
}
