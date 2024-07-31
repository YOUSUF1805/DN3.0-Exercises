public class Main {
    public static void main(String[] args) {
        // Create a StockMarket instance (Subject)
        StockMarket stockMarket = new StockMarket();

        // Create observer instances
        Observer mobileApp = new MobileApp("Mobile App 1");
        Observer webApp = new WebApp("Web App 1");

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        System.out.println("Updating stock price to $100.00");
        stockMarket.setStockPrice(100.00);

        // Unregister an observer and change stock price again
        stockMarket.deregisterObserver(mobileApp);
        System.out.println("\nUpdating stock price to $150.00");
        stockMarket.setStockPrice(150.00);
    }
}
