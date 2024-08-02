public class InvoicePrint {
    private Invoice invoice;
    public InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }
    public void print() {
        System.out.println(invoice.book.price + " " + invoice.quantity + " " + invoice.discout );
        System.out.println("Discount : "+ invoice.discout);
        System.out.println("Taxes : "+ invoice.tax);
        System.out.println("Total : "+ invoice.total);

    }
}
