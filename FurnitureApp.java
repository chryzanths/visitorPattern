public class FurnitureApp {
    public static void main(String[] args) {
        Furniture chair = new Chair(5.0);
        Furniture table = new Table(2.0, 3.0);
        Furniture sofa = new Sofa(10.0);

        ShippingCost shippingCost = new ShippingCostCalculator();

        chair.accept(shippingCost);
        table.accept(shippingCost);
        sofa.accept(shippingCost);

        System.out.println("Total shipping cost: " + ((ShippingCostCalculator) shippingCost).getTotalCost());
    }
}
