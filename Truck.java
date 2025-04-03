public class Truck extends Vehicle
{
    private double maxLoadCapacity;

    public Truck(String licensePlate, String brand, String model, int year, double rentalPrice, double maxLoad)
    {
        super(licensePlate, brand, model, year, rentalPrice);

        this.maxLoadCapacity = maxLoad;
    }

    public String toString()
    {
        String isAvailableString;
        if(isAvailable)
        {
            isAvailableString = "Yes";
        }else
        {
            isAvailableString = "No";
        }

        return "Truck Brand: " + brand + "\nModel: " + model + "\nYear: " + year + "\nRental Price(Daily): " + rentalPricePerDay + "\nIs Available? : " + isAvailableString + "\nMax Load Capacity: " + maxLoadCapacity + "\n";
    }
}
