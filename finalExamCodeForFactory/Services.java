public abstract class Services {
    protected String date;
    protected double price;
    protected abstract String getDetails();
    protected void printDetails() {
        System.out.println(getDetails());
    }
}