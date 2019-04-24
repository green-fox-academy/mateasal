package GardenApplication;

public class Flower extends Plant {

    private String type;
    private double waterAmount = 1;
    private boolean needsWater;

    public Flower(String color) {
        super(color);
        this.type = "Flower";
        this.needsWater = true;
    }

    public Flower() {
        this.type = "Flower";
    }

    @Override
    public void absorbWater(double portion) {
        if (waterAmount < 10){
            this.waterAmount += portion += 0.75;
        } else {
            this.needsWater = false;
        }
    }

    public void checkStatus() {
        if (this.waterAmount < 5) {
            System.out.println("The " + getColor() + type + " needs water.");
        } else {
            System.out.println("The " + getColor() + type + " doesn't need water.");
        }
    }

    @Override
    public double getWaterAmount() {
        return waterAmount;
    }

    public String getType() {
        return type;
    }
}