import java.util.Scanner;
public class CellphoneApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Creating cellphone object
        Cellphone cellPhone = new Cellphone();

        // Asking user for information
        System.out.println("Phone serial number: ");
        cellPhone.setSerialNumber(read.nextInt());
        read.nextLine();

        System.out.println("Phone model: ");
        cellPhone.setModel(read.nextLine());

        System.out.println("Phone Carrier: ");
        cellPhone.setCarrier(read.nextLine());

        System.out.println("Phone Number: ");
        cellPhone.setPhoneNumber(read.nextLine());

        System.out.println("Phone Owner (Full Name): ");
        cellPhone.setOwner(read.nextLine());

        // Calling method
        cellPhone.displayPhoneInfo();

        read.close();
    }
}
