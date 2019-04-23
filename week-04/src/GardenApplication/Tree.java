package GardenApplication;

public class Tree extends Plant {

    private String type;
    private double waterAmount = 1;
    private boolean needsWater;

    public Tree(String color) {
        super(color);
        this.type = "Tree";
        this.needsWater = true;
    }

    public Tree(){
        this.type = "Tree";
    }

    @Override
    public void absorbWater(double portion) {
        if (waterAmount < 10){
            this.waterAmount += portion *= 0.4;
        } else {
            this.needsWater = false;
        }
    }

    public void checkStatus() {
        if (this.waterAmount < 10) {
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