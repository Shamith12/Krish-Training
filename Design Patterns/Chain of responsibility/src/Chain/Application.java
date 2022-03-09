package Chain;

public class Application {
    public static void main(String[] args) {
        VAT vat = new VAT();
        NBT nbt = new NBT();
        SFF sff = new SFF();
        BTT btt = new BTT();
        Tax tax = new Tax();

        tax.setSuccessor(vat);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(btt);
        btt.setSuccessor(sff);

        Invoice invoice = new Invoice(1,50);
        System.out.println(tax.applyTax(invoice));

        Invoice invoice1 = new Invoice(2,150);
        System.out.println(tax.applyTax(invoice1));

        Invoice invoice2 = new Invoice(3,250);
        System.out.println(tax.applyTax(invoice2));

        Invoice invoice3 = new Invoice(4,350);
        System.out.println(tax.applyTax(invoice3));

        Invoice invoice4 = new Invoice(5,450);
        System.out.println(tax.applyTax(invoice4));

    }
}
