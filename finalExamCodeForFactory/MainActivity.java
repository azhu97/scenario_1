public class MainActivity {
    public static void generateOutput() {
        Factory factory = new Factory();
        NotificationType emailNotification = new EmailNotification();
        NotificationType smsNotification = new SMSNotification();
        NotificationType pushNotification = new PushNotification();
        factory.addNotifiers(emailNotification);
        factory.addNotifiers(smsNotification);
        factory.addNotifiers(pushNotification);

        GTProfile user1 = new GTProfile("username1", "12345", "John Doe", "Cool Dude");
        GTProfile user2 = new GTProfile("username2", "12345", "Jane Doe", "Cool Dude");
        GTProfile user3 = new GTProfile("username1", "12345", "Jack Doe", "Cool Dude");
        GTProfile user4 = new GTProfile("username1", "12345", "Joe Doe", "Cool Dude");

        GTProfileList.addProfile(user1);
        GTProfileList.addProfile(user2);
        GTProfileList.addProfile(user3);
        GTProfileList.addProfile(user4);

        user1.getPreferences().addPreference(new Preference(75.00, ListingType.DORMSUPPLIES));
        user2.getPreferences().addPreference(new Preference(75.00, ListingType.TUTORINGSERVICES));
        user3.getPreferences().addPreference(new Preference(75.00, ListingType.TEXTBOOKS));


        Services janDormSuppliesPosting = factory.createServices(ListingType.DORMSUPPLIES, "January", 65.99);
        janDormSuppliesPosting.printDetails();

        Services decTutorintServices = factory.createServices(ListingType.TUTORINGSERVICES, "December", 27.99);
        decTutorintServices.printDetails();

        Services juneTextBooks = factory.createServices(ListingType.TEXTBOOKS, "June", 35.99);
        juneTextBooks.printDetails();
    }
    public static void main(String[] args) {
        generateOutput();
    }
}