public abstract class Vehicle
{
    private String licensePlate;
    public String brand;
    public String model;
    protected int year;
    protected double rentalPricePerDay;
    protected boolean isAvailable;

    public Vehicle(String licensePlate, String brand, String model, int year, double rentalPrice)
    {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPrice;
        isAvailable = true;
    }

    public void rentVehicle()
    {
        if(!isAvailable)
        {
            System.out.println("Vehicle is not available");
            return;
        }

        isAvailable = false;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public void updateRentalPrice(double percent) {
        this.rentalPricePerDay = this.rentalPricePerDay * percent;
    }

    abstract public String toString();
}
/*
    i. private String licensePlate: Αριθμός πινακίδας κυκλοφορίας
    ii. public String brand: Μάρκα οχήματος (π.χ. Toyota)
    iii. public String model: Μοντέλο οχήματος (π.χ. Corolla)
    iv. protected int year: Έτος κατασκευής
    v. protected double rentalPricePerDay: Τιμή ενοικίασης ανά ημέρα
    vi. protected boolean isAvailable: Διαθεσιμότητα (true = διαθέσιμο)
*/