public class Main {
    public static void main(String[] args) {
        // Create payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");

        // Create payment context with CreditCardPayment strategy
        PaymentContext paymentContext = new PaymentContext(creditCard);
        System.out.println("Making payment with Credit Card:");
        paymentContext.executePayment(150.00);

        System.out.println();

        // Change payment strategy to PayPalPayment
        paymentContext = new PaymentContext(payPal);
        System.out.println("Making payment with PayPal:");
        paymentContext.executePayment(200.00);
    }
}
