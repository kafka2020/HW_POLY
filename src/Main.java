import taxes.TaxEarnings;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {
        Company company_1 = new Company("Apple", new TaxEarnings());
        company_1.shiftMoney(10_000_000);
        company_1.shiftMoney(-500_000);
        company_1.payTaxes();

        Company company_2 = new Company("Яндекс", new TaxEarningsMinusSpendings());
        company_2.shiftMoney(500_000);
        company_2.shiftMoney(-100_000);
        System.out.println(company_2.getDebit());
        System.out.println(company_2.getCredit());
        company_2.payTaxes();
        System.out.println(company_2.getDebit());
        System.out.println(company_2.getCredit());

        // Смена налоговой системы
        company_2.setTaxSystem(new TaxEarnings());
        company_2.shiftMoney(300_000);
        company_2.shiftMoney(200_000);
        System.out.println(company_2.getDebit());
        company_2.shiftMoney(-60_000);
        company_2.shiftMoney(-40_000);
        System.out.println(company_2.getCredit());
        company_2.payTaxes();
    }
}