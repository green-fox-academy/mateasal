package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private String name;
    private List<Plant> plants;

    public Garden(String name) {
        this.name = name;
        this.plants = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        this.plants.add(flower);
    }

    public void addTree(Tree tree) {
        this.plants.add(tree);
    }

    public void water(double wateringAmount){
        int inNeedOfWater = 0;
        for (Plant plant : plants) {
            if ((plant.getType() == "Tree") && (plant.getWaterAmount() < 10)){
                inNeedOfWater++;
            } else if ((plant.getType() == "Flower") && (plant.getWaterAmount() < 5)){
                inNeedOfWater++;
            }
        }
        double portion = wateringAmount / inNeedOfWater;

        for (Plant plant : plants) {
            plant.absorbWater(portion);
        }
    }
}