public class Cellphone {
    // Properties
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Parameterless constructor
    public Cellphone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    // Overloading Constructor
    public Cellphone(int serialNumber, String model, String carrier,
                     String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    // Creating Getter and Setter for serialNumber
    // Getter allows to read the value of a variable in a class
    // Setter allows change of a variable in a class
    public int getSerialNumber() {
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    // Getter and Setter for model
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    // Getter and Setter for carrier
    public String getCarrier() {
        return this.carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // Getter and Setter for owner
    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    // Method for dialing
    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s%n", getOwner(), phoneNumber);
    }
    // Method for dialing with Cellphone (overloading)
    public void dial(Cellphone cellPhone) {
        System.out.printf("%s 's phone is calling %s%n", getOwner(), cellPhone.getPhoneNumber());
    }
}
