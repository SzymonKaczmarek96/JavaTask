package workshop;

import java.util.Arrays;
import java.util.Random;

public class Car {

    Random random = new Random();

    private Wheels[] wheels;


    public Car(Wheels[] wheels) {
        this.wheels = wheels;
    }

    public void carCatchesFlatTire() {

        int randomIndex = random.nextInt(0, wheels.length);

        Wheels randomWheel = wheels[randomIndex];

        randomWheel.flatTireBecomesReality();


    }

    public Wheels[] getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Checking car: " + Arrays.toString(wheels);

    }

}
