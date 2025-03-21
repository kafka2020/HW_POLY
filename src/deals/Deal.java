package deals;

public class Deal {
    private String comment;
    private int creditChange; // сумма расходов
    private int debitChange; // сумма доходов

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return comment;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public int getDebitChange() {
        return debitChange;
    }
}
