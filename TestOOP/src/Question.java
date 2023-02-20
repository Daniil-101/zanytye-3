import java.util.Arrays;
import java.util.Scanner;

public class Question {
    boolean correctAnswerOrNot;
    public int number;
    public String questions;
    static Scanner sc = new Scanner(System.in);
    static int count = 0;


    public static void passTest(String[] questions, String[][] answers, int[] textAnswer) {
        for (int i=0; i<answers.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.println(answers[i][j]);
            }
            System.out.print("Ваш ответ: ");
            int userResponse = sc.nextInt();
            boolean result = correctAnswerOrNot(i, userResponse, textAnswer);
            if (result == true) {
                count++;
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }
        }
        System.out.println("Вы ответили верно на " + count);
        System.out.println(count >= 2 ? "Ты молодец! Тест пройден." : "Ничего страшного, попробуй еще раз.");
    }

    public static boolean correctAnswerOrNot(int numberAnswer, int userResponse, int[] textAnswer) {
        if (userResponse == textAnswer[numberAnswer]) {
            return true;
        } else {
            return false;
        }
    }

    /*for (int i = 0; i < answers.length; i++) {
        Question.typeQuestions(i, questions);
        Answers.typeAnswers(i, answers);
        int userResponse = sc.nextInt();
        boolean correctOrNot = Answers.correctAnswerOrNot(i, userResponse, correntAnswersIndexes);
*/
}
