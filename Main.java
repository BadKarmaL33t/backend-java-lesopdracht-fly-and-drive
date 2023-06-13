public class Main {

    public static void main(String[] args) {
        FlyingCar flyingCar = new FlyingCar(100,1400);
        flyingCar.startEngine();
        flyingCar.takeOff();
        flyingCar.changeHeight();
        flyingCar.land();
        flyingCar.accelerate();
        flyingCar.changeGear();
        System.out.println("Flying car is now going " + flyingCar.getSpeed() + " km/h");
        flyingCar.brake();
        flyingCar.setSpeed(80);
        System.out.println("Flying car is now going " + flyingCar.getSpeed() + " km/h");

        Airport airport = new Airport();
        airport.randomFillAirport(5);
        airport.printFlyingVehicles();
    }
}
