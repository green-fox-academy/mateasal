package Instrument;

public abstract class Instrument {

    protected String name;

    public abstract void play();

    public void setName(String name) {
        this.name = name;
    }
}
