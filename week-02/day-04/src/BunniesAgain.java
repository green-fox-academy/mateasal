public class BunniesAgain {

    public static void main(String[] args) {

        int bunnies = 3;

        System.out.println(bunnyEars(bunnies));
    }

    public static int bunnyEars (int bunnies){
        if (bunnies == 1){
            return 2;
        } else {
            if (bunnies % 2 == 0){
                return 3 + bunnyEars(bunnies-1);
            } else {
                return 2 + bunnyEars(bunnies-1);
            }
        }
    }
}
