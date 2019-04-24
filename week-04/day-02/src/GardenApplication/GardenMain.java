package GardenApplication;

import java.util.List;

public class GardenMain {
    public static void main(String[] args) {

        Garden myGarden = new Garden("myGarden");

        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");

        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        myGarden.addFlower(yellowFlower);
        myGarden.addFlower(blueFlower);
        myGarden.addTree(purpleTree);
        myGarden.addTree(orangeTree);

        myGarden.water(40);

        System.out.println(purpleTree.getWaterAmount());
        System.out.println(orangeTree.getWaterAmount());
        System.out.println(yellowFlower.getWaterAmount());
        System.out.println(blueFlower.getWaterAmount());

        purpleTree.checkStatus();
        orangeTree.checkStatus();
        yellowFlower.checkStatus();
        blueFlower.checkStatus();

        myGarden.water(70);

        System.out.println(purpleTree.getWaterAmount());
        System.out.println(orangeTree.getWaterAmount());
        System.out.println(yellowFlower.getWaterAmount());
        System.out.println(blueFlower.getWaterAmount());

        purpleTree.checkStatus();
        orangeTree.checkStatus();
        yellowFlower.checkStatus();
        blueFlower.checkStatus();

    }
}