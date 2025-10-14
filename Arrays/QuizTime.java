import java.util.ArrayList;
import java.util.Scanner;

public class QuizTime {
    public static void main(String[] args) {
        ArrayList<Quiz> quizList = new ArrayList<Quiz>(25);

        Scanner sc = new Scanner(System.in);

        int score = 0;

        Quiz one = new Quiz("What colour is the sky?", "blue");
        quizList.add(one);

        Quiz two = new Quiz("Is coffee nice?", "yes");
        quizList.add(two);

        for (Quiz quiz : quizList) {
            System.out.println(quiz.giveQuiz());
            System.out.println("Answer: ");
            String answer = sc.nextLine();

            if (answer.equals(quiz.answer)) {
                System.out.println("Correct");
                score += 1;
            }

            else {
                System.out.println("Incorrect");
                System.out.println("The correct answer is " + quiz.answer);
            }

            System.out.println("\n");
        }

        System.out.println("You got " + score + " question(s) right");
    }
}
