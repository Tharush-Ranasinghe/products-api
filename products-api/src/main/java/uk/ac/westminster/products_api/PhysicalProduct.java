package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because…
//

public class PhysicalProduct extends Product implements Discountable{
    private double weightKG;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKG, String dimensions) {
        super(id, name, price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    @Override
    public String getSummary() { return "Physical: " + getName() + " | Weight: " + weightKG + "kg";}

    @Override
    public void applyDiscount(double rate){
        double cappedRate = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1-cappedRate);
    }

    @Override
    public double getDiscountPrice() {
        return 0;
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }

}
