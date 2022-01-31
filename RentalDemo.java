import java.util.Scanner;  

public class RentalDemo
{
   public static void main (String[] args)
   {
     int users_final_time = 0;
     users_final_time = rental_amount(users_final_time);
    String user_contract_number; 
    user_contract_number = setContractNumber(contractMethod());

	  displayBanner();
    compute_time(users_final_time); 
    Rental rent = new Rental(); 
    rent.setHoursAndMinutes(rental_amount());
   }

  public static int rental_amount(int user_input_time) {
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
  System.out.println("Enter number of minutes of rental: ");	
 	user_input_time = myObj.nextInt();  // Read user input
  return user_input_time;
  }

  public static String contractMethod(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter contract number > ");
    String user_contract_number = myObj.nextLine();
    return user_contract_number;
  }

  public static void displayBanner (){

  System.out.println("SsSsSsSsSsSs Sammys makes it fun in the sun. SsSsSsSsSsSsSs" + "\r\n");
  }

  public static void compute_time (int x){
    int price_per_rental = 40;
    int hours_rented = (x / 60);
   int  minutes_added = x - (hours_rented * 60);
   int total = minutes_added * 1  +  hours_rented * price_per_rental;
    System.out.println("Price per rental " + price_per_rental);
	  System.out.println("Number of additional minutes is: " + minutes_added); 
  // Output number of additional minutes
	 System.out.println("Total: " + total + "\r\n");
   
  }


}
