import java.util.ArrayList;
import java.util.List;

public class Factory extends FactoryInterface {
    static List<NotificationType> notifiers = new ArrayList<>();
    @Override
    public Services createServices(ListingType type, String date, double price) {
        if (type.equals(ListingType.TUTORINGSERVICES)) {
            notifyUsers(type, price);
            return new TutoringServices(date, price);
        } else if (type.equals(ListingType.DORMSUPPLIES)) {
            notifyUsers(type, price);
            return new DormSupplies(date, price);
        } else if (type.equals(ListingType.TEXTBOOKS)) {
            notifyUsers(type, price);
            return new TextBooks(date, price);
        }
        return null;
    }

    public void addNotifiers(NotificationType notification) {
        notifiers.add(notification);
    }

    public void notifyUsers(ListingType listingType, double price){
        int size = notifiers.size();
        for(int i = 0; i < size; i++){
            notifiers.get(i).sendNotification(price, listingType);
        }
    }
}