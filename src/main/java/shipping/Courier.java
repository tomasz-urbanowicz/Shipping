package shipping;

import java.util.ArrayList;

public class Courier extends Person {

    public String pack;
    private ArrayList<Package> listOfPackages;

    public Courier(String name, String address, ArrayList<Package> listOfPackages) {
        super(name, "");
        this.listOfPackages = listOfPackages;
        this.pack = "";
    }

    public int receivePackage(String numberOfParcel) {
        for (Package packages : this.listOfPackages) {
            if (packages.getPackageNumber().equals(numberOfParcel)) {
                if (packages.getStatus() == Status.ACCEPTED) {
                    packages.changePackageStatus(Status.DELIVERY);
                    this.pack = numberOfParcel;
                    return 0;
                } else if (packages.getStatus() == Status.DELIVERED) {
                    return -1;
                } else if (packages.getStatus() == Status.DELIVERY) {
                    return -2;
                }
            }
        }
        return -3;
    }

    public int deliverParcel() {
        if (pack.equals("")) return -1;
        for (Package packages : this.listOfPackages) {
            if (packages.getPackageNumber().equals(this.pack)) {
                packages.changePackageStatus(Status.DELIVERED);
                this.pack = "";
                return 0;
            }
        }
        return -2;
    }
}
