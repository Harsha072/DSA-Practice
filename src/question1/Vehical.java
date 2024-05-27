package question1;

abstract class Vehical {
    private String make;
    private String model;
    private int year;

    Vehical(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

}

class Car extends Vehical{


    private int doors;
    private String  transmission;
    Car(String make, String model, int year,String transmission,int doors) {
        super(make, model, year);
        this.transmission = transmission;
        this.doors = doors;
    }

}
class  ElectricCar extends Car{
   private  int batteryCapacity;
    private String chargerType;

    ElectricCar(String make, String model, int year, String transmission, int doors,int batteryCapacity, String chargerType) {
        super(make, model, year, transmission, doors);
        this.chargerType = chargerType;
        this.batteryCapacity = batteryCapacity;
    }

}
