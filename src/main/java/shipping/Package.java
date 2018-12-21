package shipping;

enum Status {ACCEPTED, DELIVERY, DELIVERED}

public class Package {
    private Status status = Status.ACCEPTED;
    private String senderName, senderAddress;
    private String recipientName, recipientAddress;
    private String packageNumber;
    private double weight;

    public Package() {
    }

    public Package(String senderName, String senderAddress, String recipientName,
                   String recipientAddress, String packageNumber, double weight) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.packageNumber = packageNumber;
        this.weight = weight;
    }

    public Status getStatus() {return status;}

    public String getPackageNumber() { return packageNumber;}

    public void changePackageStatus(Status status) {
        this.status = status;
    }

    public String getCurrentStatus() {
        switch (status) {
            case ACCEPTED:
                return "accepted";
            case DELIVERY:
                return "delivery";
            case DELIVERED:
                return "delivered";
            default:
                return "wrong status";
        }
    }

}
