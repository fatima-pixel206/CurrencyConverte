
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> rates;

    // Constructor: store 5 currency rates (base USD)
    public CurrencyConverter() {
        rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("PKR", 280.0);
        rates.put("EUR", 0.91);
        rates.put("INR", 84.0);
        rates.put("GBP", 0.78);
    }

    // Method to convert between any two currencies
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Currency not supported");
        }

        double fromRate = rates.get(fromCurrency);
        double toRate = rates.get(toCurrency);

        return amount * (toRate / fromRate);
    }

    // Test the logic
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert(110, "PKR", "INR");
        System.out.println("Converted Amount: " + result + " PKR");
    }
}
