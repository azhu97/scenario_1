import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PreferenceList {
    private HashMap<ListingType, Double> preferenceList;
    public PreferenceList(){
        this.preferenceList = new HashMap<ListingType, Double>();
    }

    public void addPreference(Preference preference){
        preferenceList.put(preference.listingType, preference.maxPrice);
    }

    public HashMap list(){
        return preferenceList;
    }
}
