public class Car extends Vehicle
{

    private int seats;
    private boolean automatic;

    public Car(String licensePlate, String brand, String model, int year, double rentalPrice, boolean isAutomatic, int numOfSeats)
    {
        super(licensePlate, brand, model, year, rentalPrice);
        automatic = isAutomatic;
        seats = numOfSeats;
    }

    public String toString()
    {
        String isAvailableString, isAutomaticString;
        if(isAvailable)
        {
            isAvailableString = "Yes";
        }else
        {
            isAvailableString = "No";
        }

        if(automatic)
        {
            isAutomaticString = "Yes";
        }else
        {
            isAutomaticString = "No";
        }

        return "Car Brand: " + brand + "\nModel: " + model + "\nYear: " + year + "\nRental Price(Daily): " + rentalPricePerDay + "\nIs Available? : " + isAvailableString + "\nIs Automatic? : " + isAutomaticString + "\nNumber of seats: " + seats + "\n";
    }
}
/*
    i. private String licensePlate: Αριθμός πινακίδας κυκλοφορίας
    ii. public String brand: Μάρκα οχήματος (π.χ. Toyota)
    iii. public String model: Μοντέλο οχήματος (π.χ. Corolla)
    iv. protected int year: Έτος κατασκευής
    v. protected double rentalPricePerDay: Τιμή ενοικίασης ανά ημέρα
    vi. protected boolean isAvailable: Διαθεσιμότητα (true = διαθέσιμο)
    vii. private int seats: Αριθμός θέσεων
    viii. private boolean automatic: Αυτόματο ή χειροκίνητο κιβώτιο
*/