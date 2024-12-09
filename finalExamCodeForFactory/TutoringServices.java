public class TutoringServices extends Services {
    public TutoringServices(String date) {
        this.date = date;
    }
    public String getDetails() {
        return "This is a listing for Tutoring Services, listed on " + this.date + ".";
    }
}