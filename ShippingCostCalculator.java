public class ShippingCostCalculator implements ShippingCost {
    private double totalCost;

    @Override
    public void visit(Chair chair) {
        double cost = 10; // Flat rate for chairs
        totalCost += cost;
        System.out.println("Chair shipping cost: " + cost);
    }

    @Override
    public void visit(Table table) {
        double cost = table.getLength() * table.getWidth() * 0.5; // Area-based cost for tables
        totalCost += cost;
        System.out.println("Table shipping cost: " + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = sofa.getVolume() * 1.2; // Volume-based cost for sofas
        totalCost += cost;
        System.out.println("Sofa shipping cost: " + cost);
    }

    public double getTotalCost() {
        return totalCost;
    }
}