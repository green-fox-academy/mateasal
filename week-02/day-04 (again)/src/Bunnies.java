public class Bunnies {
    public static void main(String[] args) {

        int number = 7;

        System.out.println(bunnyCounter(number ));

        System.out.println();
    }

    public static int bunnyCounter(int bunnies){
        if (bunnies == 1){
            return 2;
        } else {
            return 2 + bunnyCounter(bunnies -1);
        }
    }
}
