public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;

    @Override
    public String toString(){
        return "color: " + color;
    }

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
    }


    public void use(){
        this.inkAmount--;
    }

    public float getInkAmount() {
        return inkAmount;
    }
}
