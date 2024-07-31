public class Main {
    public static void main(String[] args) {
        // Create instances of the third-party payment gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapter instances for each payment gateway
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using the adapters
        System.out.println("Testing PayPal Adapter:");
        payPalProcessor.processPayment(100.00);

        System.out.println("\nTesting Stripe Adapter:");
        stripeProcessor.processPayment(250.00);
    }
}
