public class TextBooks extends Services {
    public TextBooks(String date) {
        this.date = date;
    }
    public String getDetails() {
        return "This is a listing for Text Books, listed on " + this.date + ".";
    }
}