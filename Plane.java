public class Plane extends Vehicle implements Flyable {
    public Plane(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void startEngine() {
        System.out.println("Plane engine started.");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Plane engine turned off.");
    }

    @Override
    public void takeOff() {
        System.out.println("Plane taking off.");
    }

    @Override
    public void land() {
        System.out.println("Plane landing.");
    }

    @Override
    public void changeHeight() {
        System.out.println("Plane changing height.");
    }
}
