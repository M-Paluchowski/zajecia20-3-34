package ex22;

public interface CalculationStrategy {
    double calculate(double price);

    default int methodA() {
        return methodC();
    }

    static int methodB() {
        return 2;
    }

    private int methodC() {
        return 3;
    }
}
