package shipping;

import java.util.ArrayList;

public class Administrator extends Person {

    private ArrayList<Courier> listOfCouriers;

    public Administrator(String name, ArrayList<Courier> listOfCouriers) {
        super(name, "");
        this.listOfCouriers = listOfCouriers;
    }

    public void addCourier(ArrayList<Package> listOfPackages, String name) {
        if (this.listOfCouriers != null) {
            Courier courier = new Courier(name, "", listOfPackages);
            listOfCouriers.add(courier);
        }
    }

    public int removeCourier(int index) {
        if (this.listOfCouriers == null) return -3; //this collection doesn't exist
        if (listOfCouriers.size() == 0) return -1; //no couriers in the collection
        if (index == -1) return -2;
        if (index < 0 || index > listOfCouriers.size() - 1) return -3; // wrong index
        Courier courier = listOfCouriers.get(index);

        if (courier.pack.equals("")) {
            listOfCouriers.remove(index);
            return 0;
        } else return -4; // courier has a package

    }
}
