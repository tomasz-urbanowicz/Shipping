package shipping;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Package> listOfPackage = new ArrayList<Package>();
    public static ArrayList<Courier> listOfCouriers = new ArrayList<Courier>();
    public static Administrator admin;
    public static Sender sender;
    public static Recipient recipient;
    public static Shipper shipper;

    public static void main(String[] args) {
        listOfCouriers.add(new Courier("Andrzej", "123", listOfPackage));
        listOfCouriers.add(new Courier("Karol", "532", listOfPackage));
        admin = new Administrator("Józek", listOfCouriers);
        sender = new Sender("Marcin asdasdf", "as123");
        shipper = new Shipper("Olaf", listOfPackage);


    }
}
