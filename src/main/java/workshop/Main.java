package workshop;

public class Main {

    public static void main(String[] args) {

        Wheels wheels1 = new Wheels();
        Wheels wheels2 = new Wheels();
        Wheels wheels3 = new Wheels();
        Wheels wheels4 = new Wheels();

        Wheels[] wheels = {wheels1,wheels2,wheels3,wheels4};


        Car car = new Car(wheels);

        car.carCatchesFlatTire();

        Repair repair = new Repair();

        repair.repairACar(car);


    }
}
