package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        this.name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        sound();
    }

    @Override
    public void sound() {
        System.out.println(name + " a " + numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
    }
}
