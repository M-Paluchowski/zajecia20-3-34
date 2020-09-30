package ex22;

public class VatStrategy implements CalculationStrategy {
    @Override
    public double calculate(double price) {
        return price * 1.23;
    }
}
