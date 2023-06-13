public class Car extends Vehicle implements Driveable {

    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Car engine turned off.");
    }


    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car braking and is now going 80km/h.");
    }

    @Override
    public void changeGear() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Car changing gear from " + i + " to " + (i+1));
        }
    }
}
