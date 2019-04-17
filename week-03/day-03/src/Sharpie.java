public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;

    public Sharpie (String color, float width){
    }

    public Sharpie(){

    }

    public void use(){
        inkAmount--;
    }

    public float getInkAmount() {
        return inkAmount;
    }
}
