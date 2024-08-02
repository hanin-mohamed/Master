public class InvoiceEntity {
    private Book book;
    private int quantity;
    private double discout;
    private double tax;
    private double total;

    public InvoiceEntity(Book book, int quantity, double discout, double tax) {
        this.book = book;
        this.quantity = quantity;
        this.discout = discout;
        this.tax = tax;
        this.total = this.calcTotal();
    }
    // First responsibility
    public double calcTotal() {
        double price = ((book.price - book.price * this.discout) * this.quantity);
        double priceWithTaxes = price * (1 + this.tax);
        return priceWithTaxes;

    }
}
