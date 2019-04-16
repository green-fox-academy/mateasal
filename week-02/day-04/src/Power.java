public class Power {

    public static void main(String[] args) {
        int base = 2;
        int powerRaised = 1;

        System.out.println(power(base, powerRaised));
    }

    public static int power(int base, int powerRaised){
        if (powerRaised == 0){
            return 1;
        } else if (powerRaised == 1){
            return base;
        } else {
            return base * power(base,powerRaised -1);
        }
    }
}
