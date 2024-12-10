import java.util.HashMap;

public class SMSNotification implements NotificationType{
    @Override
    public void sendNotification(Double price, ListingType listingType) {
        int length = GTProfileList.users.size();
        for(int i = 0; i < length; i++){
            GTProfile user = GTProfileList.users.get(i);
            Preference newPreference = new Preference(price, listingType);
            HashMap<ListingType, Double> preferenceList = user.getPreferenceList();
            if(preferenceList.get(newPreference.listingType) != null && preferenceList.get(newPreference.listingType) >= newPreference.getPrice()){
                System.out.println("Sending a SMS to " + user.getName() + " for a " +
                        newPreference.listingType + " priced at $" + newPreference.maxPrice);
            }
        }
    }
}
