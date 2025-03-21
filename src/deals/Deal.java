package deals;

public class Deal {
    private String comment;
    public int debitChange;
    private int creditChange;

    public Deal(String comment, int debitChange, int creditChange) {
        this.comment = comment;
        this.debitChange = debitChange;
        this.creditChange = creditChange;
    }

    public String getComment() {
        return comment;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public int getCreditChange() {
        return creditChange;
    }
}
