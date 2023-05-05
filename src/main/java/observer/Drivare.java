package observer;

public class Drivare {
    public static void main(String[] args) {
        Car car = new Car("Bugati");

        Person othman = new Person("othman");
        Person mouad = new Person("mouad");
        Person imade = new Person("imade");

        car.add(othman);
        car.add(mouad);
        car.add(imade);

        /*for ( int i = 0; i < 5; i++){
            Boolean availble = i % 3 == 0;
            car.setAvailablity(false);
            if (i == 2){
                car.remove(mouad);
                car.setAvailablity(true);
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            System.out.println("-----------------------");
        }*/


    }
}
