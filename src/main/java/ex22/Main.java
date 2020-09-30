package ex22;

class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        double vat = taxCalculator.calculateTax(1000, new VatStrategy());
        System.out.println(vat);
        double calculateTax = taxCalculator.calculateTax(2000, new ComplicatedCalculationAlgorithm());
        System.out.println(calculateTax);
    }
}
