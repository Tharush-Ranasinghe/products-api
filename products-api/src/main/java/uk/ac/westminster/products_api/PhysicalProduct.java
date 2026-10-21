package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because…
//

public class PhysicalProduct extends Product {
    private double weightKG;
    private String dimensions;

    public PhysicalProduct(Long id, String name, double price, double weightKG, String dimensions) {
        super(id, name, price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }
}
