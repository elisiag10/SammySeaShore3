import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int users_final_time = 0;
        rental_amount();
        displayBanner();
        compute_time(users_final_time);

    }

    public static int rental_amount() {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter number of minutes of rental: ");
        int user_input_time = myObj.nextInt(); // Read user input
        return user_input_time;
    }

    public static int compute_time(int x) {
        int price_per_rental = 40;
        int hours_rented = (x / 60);
        int minutes_added = x - (hours_rented * 60);
        int total = minutes_added * 1 + hours_rented * price_per_rental;
        return total;
    }

    public static void displayBanner() {

        System.out.println("SsSsSsSsSsSs Sammys makes it fun in the sun. SsSsSsSsSsSsSs" + "\r\n");
    }

}
