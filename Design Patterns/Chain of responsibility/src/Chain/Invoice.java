package Chain;

public class Invoice {
    private  int invoiceNumber;
    private double amount;
    private double tax;

    public Invoice(int invoiceNumber,double amount) {
        this.invoiceNumber =invoiceNumber;
        this.amount = amount;
    }

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

}
