import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Тест по Java."); // Вводные слова
        System.out.println("В тесте всего 3 вопроса, для прохождения данного теста нужно правильно ответить на 2.");

        String[] questions = {"Начнём с простого: что такое Java?",
                "Что из следующего является диапазоном char в Java?",
                "Какие из этих операторов можно использовать для объединения двух или более объектов String?"}; //Вопросы

        String[][] answers = {{"1. Мотоцикл", "2. Чай", "3. Язык программирования", "4. Остров"},
                {"1. От -128 до 127", "2. От 0 до 256", "3. От 0 до 65535"},
                {"1. +", "2. *=", "3. +=", "4. &&", "5. ||"}}; // Двумерный массив с вариантами ответов

        int[] correntAnswersIndexes = {3, 3, 1}; // Номера правильных ответов

        int counter = 0; // Счетчик верных ответов

        for (int i = 0; i < answers.length; i++) {
            Question.typeQuestions(i, questions);
            Answers.typeAnswers(i, answers);
            int userResponse = sc.nextInt();
            boolean correctOrNot = Answers.correctAnswerOrNot(i, userResponse, correntAnswersIndexes);
            if (correctOrNot == true) {
                System.out.println("Верно");
                counter++;
            } else {
                System.out.println("Неверно");
            }

        }
        System.out.println("Вы ответили верно на " + counter);
        System.out.println(counter >= 2 ? "Ты молодец! Тест пройден." : "Ничего страшного, попробуй еще раз.");
    }
}
