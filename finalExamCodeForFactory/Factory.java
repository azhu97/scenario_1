public class Factory extends FactoryInterface {
    @Override
    public Services createServices(ListingType type, String date) {
        if (type.equals(ListingType.TUTORINGSERVICES)) {
            return new TutoringServices(date);
        } else if (type.equals(ListingType.DORMSUPPLIES)) {
            return new DormSupplies(date);
        } else if (type.equals(ListingType.TEXTBOOKS)) {
            return new TextBooks(date);
        }
        return null;
    }
}