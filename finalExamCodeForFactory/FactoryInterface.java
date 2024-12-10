public abstract class FactoryInterface {
    public abstract Services createServices(ListingType type, String date, double price);
    public abstract void addNotifiers(NotificationType notification);
    public abstract void notifyUsers(ListingType listingType, double price);
}