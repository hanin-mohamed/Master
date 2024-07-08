package HotelSystem;

public class Guest {
    private int id;
    private String firstName;
    private String email;
    private int discount;

    public Guest(int id, String firstName, String email, int discount) {
        this.id = id;
        this.discount = discount;
        this.firstName = firstName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void display() {
        System.out.println("ID: " + id + " First Name: " + firstName + " Email: " + email+" Discount: " + discount);
    }
}
