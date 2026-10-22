import java.util.Scanner;
public class CellphoneApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Creating cellphone object
        Cellphone cellPhone1 = new Cellphone();

        // Asking user for information
        // .set(setter) allows to change the value of a variable in a class
        System.out.println("Phone serial number: ");
        cellPhone1.setSerialNumber(read.nextInt());
        read.nextLine();

        System.out.println("Phone model: ");
        cellPhone1.setModel(read.nextLine());

        System.out.println("Phone Carrier: ");
        cellPhone1.setCarrier(read.nextLine());

        System.out.println("Phone Number: ");
        cellPhone1.setPhoneNumber(read.nextLine());

        System.out.println("Phone Owner (Full Name): ");
        cellPhone1.setOwner(read.nextLine());

        // Creating cellPhone2
        Cellphone cellPhone2 = new Cellphone();
        System.out.println("Phone serial number: ");
        cellPhone2.setSerialNumber(read.nextInt());
        read.nextLine();

        System.out.println("Phone model: ");
        cellPhone2.setModel(read.nextLine());

        System.out.println("Phone Carrier: ");
        cellPhone2.setCarrier(read.nextLine());

        System.out.println("Phone Number: ");
        cellPhone2.setPhoneNumber(read.nextLine());

        System.out.println("Phone Owner (Full Name): ");
        cellPhone2.setOwner(read.nextLine());

        // Creating cellPhone3
        Cellphone cellPhone3 = new Cellphone(999999, "Iphone Duo", "T-Mobile",
                "555-555-6666", "Remsey");

        read.close();
        // Display cellPhones
        displayPhoneInfo(cellPhone1);
        displayPhoneInfo(cellPhone2);

        // Dialing phones(Using String Method)
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        // Dialing using Cellphone
        cellPhone1.dial(cellPhone3);

    }
    // Method for displaying information
    public static void displayPhoneInfo(Cellphone cellPhone) {
        System.out.println("=== Phone Information ===");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
        System.out.println("==========================");
    }
}
