import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    private static Map<Integer, Double> memo = new HashMap<>();

    // Recursive method with memoization to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }

        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        double futureValue = calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial investment
        double growthRate = 0.05;     // Annual growth rate (5%)
        int years = 10;               // Number of years to forecast

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("The future value of an investment of $%.2f over %d years at an annual growth rate of %.2f%% is $%.2f%n",
                          presentValue, years, growthRate * 100, futureValue);
    }
}
