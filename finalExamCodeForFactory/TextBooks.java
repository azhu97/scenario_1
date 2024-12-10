public class TextBooks extends Services {
    public TextBooks(String date, double price) {
        this.date = date;
        this.price = price;
    }
    public String getDetails() {
        return "This is a listing for Dorm Supplies, listed on " + this.date + " for $" + this.price + ".";
    }
}