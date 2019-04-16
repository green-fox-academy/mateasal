public class UrlFixer {
    public static void main(String[] args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a critical component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        url = url.replace("bots", "odds");

        System.out.println(url);

        System.out.println(addChar(url, ':', 5));
    }

    public static String addChar(String str, char ch, int position){
        return str.substring(0, position) + ch + str.substring(position);
    }
}
