package Dominoes;

public class Domino implements Comparable<Domino>, Printable {

    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    public void printAllFields(){
        System.out.println(left + " " + right);
    }

    @Override
    public int compareTo(Domino otherDomino) {
        int result = Integer.compare(this.getLeftSide(), otherDomino.getLeftSide());
        if (result == 0) {
            result = Integer.compare(this.getRightSide(), otherDomino.getRightSide());
        }
        return result;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

}
