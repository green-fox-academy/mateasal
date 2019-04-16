public class MoreBunnies {
    public static void main(String[] args) {

        int bunnies = 7;

        System.out.println(BunnyHunter(bunnies));
    }

    public static int BunnyHunter(int bunnies){
        if (bunnies == 1){
            return 2;
        } else {
            if (bunnies % 2 == 0){
                return 3 + BunnyHunter(bunnies -1);
            } else {
                return 2 + BunnyHunter(bunnies -1);
            }
        }
    }
}
