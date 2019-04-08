public class Doubling {

    public static void main(String[] args) {

        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`

        int baseNum = 111;

        int doubled = Doubling(baseNum);

        System.out.println(doubled);

    }

    public static int Doubling(int a){
        int doubled = a * 2;

        return doubled;
    }

}
