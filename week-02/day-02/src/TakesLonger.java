public class TakesLonger {
    public static void main(String[] args){

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        int position = quote.indexOf("you");

        System.out.println(addStrings(quote, "always takes longer than ", position));

    }

    public static String addStrings(String str, String st, int position){
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, st);
        return sb.toString();
    }
}
