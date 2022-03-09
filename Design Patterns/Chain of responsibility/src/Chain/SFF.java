package Chain;

public class SFF extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.04);
        System.out.println("SFF Calculated");
        return  invoice.getTax();
    }
}
