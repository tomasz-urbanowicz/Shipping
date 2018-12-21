package shipping;

import java.util.ArrayList;
import java.util.Date;

public class Shipper extends Person {

    private ArrayList<Package> listOfPackages;

    public Shipper(String name, ArrayList<Package> listOfPackages) {
        super(name, "");
        this.listOfPackages = listOfPackages;
    }

    public String enterPackageToSystem(String senderName, String senderAddress,
                                       String reciverName, String reciverAddress) {
        if (this.listOfPackages == null)
            return ""; // List of packages has not been created
        int date = (int) new Date().getTime();
        Package pack = new Package(senderName, senderAddress, reciverName, reciverAddress, String.valueOf(Math.abs(date)), 10);
        this.listOfPackages.add(pack);
        return pack.getPackageNumber();
    }
}
