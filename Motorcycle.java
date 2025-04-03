public class Motorcycle extends Vehicle
{
    private boolean hasLuggageRack;

    public Motorcycle(String licensePlate, String brand, String model, int year, double rentalPrice, boolean hasLuggageRack)
    {
        super(licensePlate, brand, model, year, rentalPrice);
        this.hasLuggageRack = hasLuggageRack;
    }

    public String toString()
    {
        String isAvailableString, hasLuggageRackString;
        if(isAvailable)
        {
            isAvailableString = "Yes";
        }else
        {
            isAvailableString = "No";
        }

        if(hasLuggageRack)
        {
            hasLuggageRackString = "Yes";
        }else
        {
            hasLuggageRackString = "No";
        }

        return "Motorcycle Brand: " + brand + "\nModel: " + model + "\nYear: " + year + "\nRental Price(Daily): " + rentalPricePerDay + "\nIs Available? : " + isAvailableString + "\nHas Luggage Rack? : " + hasLuggageRackString + "\n";
    }
}
/*
    i. private String licensePlate: Αριθμός πινακίδας κυκλοφορίας
    ii. public String brand: Μάρκα οχήματος (π.χ. Toyota)
    iii. public String model: Μοντέλο οχήματος (π.χ. Corolla)
    iv. protected int year: Έτος κατασκευής
    v. protected double rentalPricePerDay: Τιμή ενοικίασης ανά ημέρα
    vi. protected boolean isAvailable: Διαθεσιμότητα (true = διαθέσιμο)
    vii. private boolean hasLuggageRack: Διαθέτει μπαγαζιέρες (true/false)
*/