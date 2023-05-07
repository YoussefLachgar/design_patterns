package adapter;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        playWithVehicale(car);
        playWithVehicale(bicycle);
    }

    private static void playWithVehicale(Vehicle vehicle) {

        vehicle.accelerate();
        vehicle.soundHorn();
        vehicle.pushBreak();
        System.out.println("\n");
    }
}
