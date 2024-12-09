public class MainActivity {
    public static void generateOutput() {
        Factory factory = new Factory();

        Services janDormSuppliesPosting = factory.createServices(ListingType.DORMSUPPLIES, "January");
        janDormSuppliesPosting.printDetails();

        Services decTutorintServices = factory.createServices(ListingType.TUTORINGSERVICES, "December");
        decTutorintServices.printDetails();

        Services juneTextBooks = factory.createServices(ListingType.TEXTBOOKS, "June");
        juneTextBooks.printDetails();
    }
    public static void main(String[] args) {
        generateOutput();
    }
}