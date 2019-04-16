public class DrawChessTable {

    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        for (int a = 1; a <= 8; a++){

            for (int b = 1; b <= 4; b++){

                if(a % 2 == 0){

                    System.out.print("% ");

                } else{

                    System.out.print(" %");

                }

            }

            System.out.println("");

        }

    }

}
