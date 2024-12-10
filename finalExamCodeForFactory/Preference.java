public class Preference {
    double maxPrice;
    ListingType listingType;
    public Preference(Double maxPrice, ListingType listingType){
        this.maxPrice = maxPrice;
        this.listingType = listingType;
    }

    public double getPrice(){
        return maxPrice;
    }
}
