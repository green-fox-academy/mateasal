package GardenApplication;

public class Plant {

    private String color;
    private double waterAmount;
    private String type;

    public Plant(String color) {
        this.color = color;
    }

    public Plant() {
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void absorbWater(double portion) {
            this.waterAmount += portion;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}