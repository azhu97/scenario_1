public class DormSupplies extends Services {
    public DormSupplies(String date) {
        this.date = date;
    }
    public String getDetails() {
        return "This is a listing for Dorm Supplies, listed on " + this.date + ".";
    }
}