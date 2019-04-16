import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP addresses.
        // Write a function that returns the GET / POST request ratio.

        System.out.println(IPAdresses("assets/log.txt"));

        System.out.println(getPostRatio("assets/log.txt"));
    }

    public static List<String> IPAdresses (String filename){

        try{
            Path filePath = Paths.get(filename);
            List<String> log = Files.readAllLines(filePath);

            List<String> IPs= new ArrayList<>();

            for (String line : log){
                String[] list = line.split("  ");
                IPs.add(list[2]);
            }
            return IPs;

        } catch (Exception e){
            List<String> error = new ArrayList<>();
            return error;
        }
    }

    public static double getPostRatio (String filename){

        try{
            Path filePath = Paths.get(filename);
            List<String> log = Files.readAllLines(filePath);

            List<String> getPost = new ArrayList<>();

            for (String line : log){
                String[] list = line.split("  ");
                getPost.add(list[3]);
            }

            int getCounter = 0;
            int postCounter = 0;

            for (String element : getPost){
                if (element.contains("POST")){
                    postCounter ++;
                } else if (element.contains("GET")) {
                    getCounter ++;
                }
            }

            return (float) getCounter / postCounter;

        } catch (Exception e){
            return 0;
        }
    }
}
