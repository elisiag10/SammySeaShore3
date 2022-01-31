

public class Rental {

  //Two public final static fields that hold the number of minutes in an hour and the hourly rental rate 
    final static int MINUTES_IN_AN_HOUR = 60;
    final static int RENT_PER_HOUR = 40;

   
    private String contractNumber;
    private  int hoursRented;
    private  int additionalMinutes;
    private  int total;
    
    
    //Two public set methods
     public void setContractNumber (String conNumber)
     {

      String contractNumber = conNumber; 
    }

     public void setHoursAndMinutes(int x)
      {

          int hoursRented = x/MINUTES_IN_AN_HOUR;
          int additionalMinutes = x % MINUTES_IN_AN_HOUR; 
          int total = hoursRented * RENT_PER_HOUR + additionalMinutes; 
      }


    //Four public get methods that return the values in the four nonstatic fields.
     public String getcontractNumber()
      {

          return contractNumber; 
       
      }

     public int gethoursRented()
      {

        return hoursRented; 
      }


     public int getAdditionalMinutes()
      {

        return additionalMinutes;
      }

     public  int getTotal()
     {
       return total;
      }


}