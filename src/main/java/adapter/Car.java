package adapter;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car starts to move");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car Stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beep Beep The Car Make Sound");
    }
}
