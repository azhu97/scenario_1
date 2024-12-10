import java.util.ArrayList;
import java.util.List;

public class GTProfileList {
    private static GTProfileList gtProfileList;
    static List<GTProfile> users;

    public static void addProfile(GTProfile gtProfile){
        if(gtProfileList == null){
            gtProfileList = new GTProfileList();
            users = new ArrayList<>();
        }
        users.add(gtProfile);
    }


}
