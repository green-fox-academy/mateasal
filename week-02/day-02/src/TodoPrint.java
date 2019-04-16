public class TodoPrint {

    public static void main(String[] args){

        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        String title = "My todo:\n";
        String download = " - Download games\n";
        String diablo = " - Diablo\n";

        System.out.println(title.concat(todoText).concat(download).concat(diablo));

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //  - Diablo

        todoText = title + todoText + download + "  " + diablo;

        System.out.println(todoText);
    }

}
