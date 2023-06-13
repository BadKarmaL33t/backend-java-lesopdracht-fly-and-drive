public class FlyingCar extends Vehicle implements Flyable, Driveable {

    public FlyingCar(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void startEngine() {
        System.out.println("Flying car engine started.");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Flying car engine turned off.");
    }

    @Override
    public void takeOff() {
        System.out.println("Flying car taking off.");
    }

    @Override
    public void land() {
        System.out.println("Flying car is landing.");
    }

    @Override
    public void changeHeight() {
        System.out.println("Flying car changing altitude.");
    }

    @Override
    public void accelerate() {
        System.out.println("Flying car accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Flying car braking.");
    }

    @Override
    public void changeGear() {
        System.out.println("Flying car changing gear.");
    }
}
