import java.util.Scanner;

public class stringsplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  n = scan.nextLine();
        if(n.length() == 0){
            System.out.println(0);
            return;
        }
        //split string
        String[] tokens = n.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        //.split("[^A-Za-z]+") → Uses regular expressions (regex) to split the string.
        // [^A-Za-z]+ means one or more non-alphabetic characters (anything except A-Z and a-z).
        // This effectively removes spaces, punctuation, and numbers, leaving only words.
        // Example:
        // Input: "Hello, World! 123 Java."
        // Tokens: ["Hello", "World", "Java"

        for(String token:tokens){
            System.out.println(token);
        }

    }
}
