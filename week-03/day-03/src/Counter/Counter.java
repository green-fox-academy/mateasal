package Counter;

public class Counter {

    int count;
    int initialValue;

    public Counter(int count){
        this.count = count;
        initialValue = count;
    }

    public void add (int number){
        count += number;
    }

    public void add(){
        count++;
    }

    public int get(){
        return count;
    }

    public void reset(){
        count = initialValue;
    }
}
