public class Sofa implements Furniture{

    private double volume;

    public Sofa(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void accept(ShippingCost shippingCost) {
        shippingCost.visit(this);
    }
}
