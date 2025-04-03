import java.util.ArrayList;

public class TestFleetManagment
{
    Car bmwM3 = new Car("IEE 2345", "BMW", "M3", 2020, 45.0, true, 5 );
    Car toyotaYaris = new Car("XAA 4567", "Toyota", "Yaris", 2003, 32.43, false, 5);
    Car smart4Two = new Car("BIM 2894", "Smart", "4Two", 2014, 20.4, true, 2);

    Motorcycle ducatiPanigale = new Motorcycle("XAO 2398", "Ducati", "Panigale", 2023, 40.0, false);
    Motorcycle ktmAdventure = new Motorcycle("BIN 3452", "KTM", "Adventure", 2004, 32.5, true);
    Motorcycle hondaGLX = new Motorcycle("IHH 3578", "Honda", "GLX C50", 1998, 20.5, false);

    Truck scaniaS770 = new Truck("BIN 2379", "Scania", "S770", 2020, 60.5, 12511);
    Truck volvoFH16 = new Truck("XAO 2090", "Volvo", "FH16", 2021, 54.9, 325000);
    Truck mercedesActros = new Truck("IHX", "Mercedes-Benz", "Actros", 2008, 49.0, 190000);

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public TestFleetManagment() {
        vehicles.add(bmwM3);
        vehicles.add(toyotaYaris);
        vehicles.add(smart4Two);
        vehicles.add(ducatiPanigale);
        vehicles.add(ktmAdventure);
        vehicles.add(hondaGLX);
        vehicles.add(scaniaS770);
        vehicles.add(volvoFH16);
        vehicles.add(mercedesActros);
    }

    public static void main(String[] args) {
        TestFleetManagment fleet = new TestFleetManagment();

        System.out.println("Vehicles older than 10 years\n");
        for (Vehicle current : fleet.vehicles)
         {
             if(2025 - current.year > 10)
             {
                 System.out.println(current.toString());
             }
         }

         for (Vehicle current : fleet.vehicles)
         {
             if(current.getClass() == Truck.class && 2025 - current.year > 15)
            {
                current.updateRentalPrice(0.9);
            }
         }

         System.out.println("Cars: \n");
         for (Vehicle current : fleet.vehicles)
         {
             if(current.getClass() == Car.class)
             {
                 System.out.println(current.toString());
             }
         }

         System.out.println("Motorcycles: \n");
         for (Vehicle current : fleet.vehicles)
         {
            if(current.getClass() == Motorcycle.class)
            {
                System.out.println(current.toString());
            }
         }

         System.out.println("Trucks: \n");
        for (Vehicle current : fleet.vehicles)
        {
            if(current.getClass() == Truck.class)
            {
                System.out.println(current.toString());
            }
        }
    }
}
