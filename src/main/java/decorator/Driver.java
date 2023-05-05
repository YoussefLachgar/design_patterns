package decorator;

public class Driver {

    public static void main(String[] args) {
        //Sandwich basicSandwich = new BasicSandwich();

        Sandwich basicSandwich = new Tonn(new Salt(new BasicSandwich()));

        System.out.printf("Descriptiohn : %s%n",basicSandwich.getDescription());
        System.out.printf("Cost : %.2f",basicSandwich.getCost());
    }
}
