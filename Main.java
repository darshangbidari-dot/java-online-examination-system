
import java.util.Scanner;

public class Main {

    static String[] questions = {
        "Which keyword is used to inherit a class in Java?",
        "Which method is the entry point of a Java program?",
        "Which data type stores true or false?",
        "Which symbol ends a Java statement?",
        "Which keyword creates an object?"
    };

    static String[][] options = {
        {"A. implements", "B. extends", "C. inherits", "D. super"},
        {"A. start()", "B. run()", "C. main()", "D. execute()"},
        {"A. int", "B. char", "C. boolean", "D. String"},
        {"A. .", "B. :", "C. ,", "D. ;"},
        {"A. class", "B. new", "C. void", "D. this"}
    };

    static char[] answers = {'B', 'C', 'C', 'D', 'B'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("==================================");
        System.out.println("   JAVA ONLINE EXAMINATION SYSTEM");
        System.out.println("==================================");
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            name = "Student";
        }

        System.out.println("\nWelcome, " + name + "!");
        System.out.println("Each question carries 1 mark.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            char choice;

            while (true) {
                System.out.print("Your answer (A/B/C/D): ");
                String input = sc.nextLine().trim().toUpperCase();

                if (input.length() == 1 &&
                    "ABCD".indexOf(input.charAt(0)) >= 0) {
                    choice = input.charAt(0);
                    break;
                }

                System.out.println("Invalid input. Enter A, B, C, or D.");
            }

            if (choice == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. Correct answer: "
                        + answers[i] + "\n");
            }
        }

        double percentage = score * 100.0 / questions.length;

        String grade;
        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 40) {
            grade = "C";
        } else {
            grade = "Needs Improvement";
        }

        System.out.println("==================================");
        System.out.println("           EXAM RESULT");
        System.out.println("==================================");
        System.out.println("Student: " + name);
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("==================================");

        sc.close();
    }
}
