package FoodClassification;

/**
 * Created by SunKa on 12/13/15.
 */
abstract public class Food {
    private String productName;
    private double weight; // in pounds
    private int caloricity; // calories per pound

    public Food(String productName, int caloricity, double weight) {
        this.productName = productName;
        this.caloricity = caloricity;
        this. weight = weight;
    }

    public String getProductName() {
        return productName;
    }

    public int getCaloricity() {
        return caloricity;
    }

    public double getWeight() {
        return weight;
    }

    public double getTotalIngridientCaloricity() { // returns double
        return caloricity*weight;
    }
}
