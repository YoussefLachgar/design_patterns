package decorator;

public class Tonn extends SandwichDecorator{

    public Tonn(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tonn";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }
}
