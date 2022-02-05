import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {

        Rental rent = new Rental();
        rent.setContractNumber(contract_number());
        rent.setHoursAndMinutes(rental_amount());
        Main.displayBanner();
        displayDetails(rent.getcontractNumber(), rent.RENT_PER_HOUR, rent.getAdditionalMinutes(), rent.getTotal());

    }

    public static String contract_number() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello enter contract number > ");
        String user_contract_number = myObj.nextLine();
        return user_contract_number;
    }

    public static int rental_amount() {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter number of minutes of rental: ");
        int user_input_time = myObj.nextInt(); // Read user input
        return user_input_time;
    }

    public static void displayDetails(String w, int x, int y, int z) {

        System.out.println("Contract Number: " + w);
        System.out.println("Hourly Rate: " + x);
        System.out.println("Additional minutes: " + y);
        System.out.println("Total: " + z);
    }

}
