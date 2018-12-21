package shipping;

public class Sender extends Person {

    private String packageNumber;

    public Sender(String name, String address) {
        super(name, address);
    }

    String getPackageNumber() {return packageNumber;}

    void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }
}
