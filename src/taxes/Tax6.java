package taxes;

public class Tax6 extends TaxSystem {
    private static final double SIMPLE_TAX_RATE = 0.06;
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * SIMPLE_TAX_RATE);
    }
}
