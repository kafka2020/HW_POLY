package taxes;

public class Tax15 extends TaxSystem {
    private static final double SIMPLE_TAX_RATE = 0.15;
    private static final int MIN_TAX = 0;
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) (SIMPLE_TAX_RATE * (debit - credit));
        return Math.max(MIN_TAX, tax);
    }
}
