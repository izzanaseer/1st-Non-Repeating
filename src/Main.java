import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirstNonRepeating stream = new FirstNonRepeating();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type '/' to exit");
        System.out.println("Stream: ");
        char userInput;

        do {
            userInput = scanner.next().charAt(0);
            if (userInput == '/') {
                break;
            }

            stream.add(userInput);
        } while (true);

        System.out.print("First Non Repeating Character = " + stream.getFirstNonRepeating());
    }
}