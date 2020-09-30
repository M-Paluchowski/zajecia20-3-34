package ex22;

public class TaxCalculator {

    public double calculateTax(double price, CalculationStrategy strategy) {
        //zapytania do baz danych / serwisów
        return strategy.calculate(price);
    }
}
