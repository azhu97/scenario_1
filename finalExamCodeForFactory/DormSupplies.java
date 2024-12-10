public class DormSupplies extends Services {
    public DormSupplies(String date, Double price) {
        this.date = date;
        this.price = price;
    }
    public String getDetails() {
        return "This is a listing for Dorm Supplies, listed on " + this.date + " for $" + this.price + ".";
    }
}