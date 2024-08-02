public class Invoice {
    Book book;
    int quantity;
     double discout;
     double tax;
     double total;

    public Invoice(Book book, int quantity, double discout, double tax) {
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
    // Second responsibility
    public void printInvoice(){
        System.out.println(book.price + " " + quantity + " " + discout + " " + tax);
        System.out.println("Discount : "+ discout);
        System.out.println("Taxes : "+ tax);
        System.out.println("Total : "+ total);
    }
    // third responsibility
    public void saveToFile(String filename){}
}
