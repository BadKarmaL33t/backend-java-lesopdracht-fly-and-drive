import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Airport {
    private final List<Flyable> flyingVehicles;

    public Airport() {
        flyingVehicles = new ArrayList<>();
    }

    public void addFlyableVehicle(Flyable vehicle) {
        flyingVehicles.add(vehicle);
    }

    public void randomFillAirport(int numberOfVehicles) {
        Random random = new Random();
        for (int i = 0; i < numberOfVehicles; i++) {
            int randomChoice = random.nextInt(2);
            if (randomChoice == 0) {
                addFlyableVehicle(new Plane(900, 200000));
            } else {
                addFlyableVehicle(new FlyingCar(400, 3000));
            }
        }
    }

    public void printFlyingVehicles() {
        for (Flyable vehicle : flyingVehicles) {
            System.out.println(vehicle.getClass().getSimpleName());
        }
    }
}
