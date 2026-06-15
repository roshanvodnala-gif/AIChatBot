import java.util.Scanner;

public class AIChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot Started!");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("hi") || input.equals("hello")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.equals("how are you")) {
                System.out.println("Bot: I am fine. Thank you!");
            }
            else if (input.equals("bye") || input.equals("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}