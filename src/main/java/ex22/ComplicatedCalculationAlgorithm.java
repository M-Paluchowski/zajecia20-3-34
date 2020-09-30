package ex22;

public class ComplicatedCalculationAlgorithm implements CalculationStrategy {
    @Override
    public double calculate(double price) {
        //specyficzne obliczenia
        return (price * 0.9) + 55 * 0.7;
    }
}
