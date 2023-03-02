import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        Question question = new Question("Начнём с простого: что такое Java?");
        Answer answer = new Answer(1, "Мотоцикл", false);
        question.addAnswers(answer);
        question.addAnswers(new Answer(2,"Чай", false));
        question.addAnswers(new Answer(3,"Язык программирования", true));
        question.addAnswers(new Answer(4,"Остров", false));

        Question question1 = new Question("Что из следующего является диапазоном char в Java?");
        question1.addAnswers(new Answer(1,"От -128 до 127", false));
        question1.addAnswers(new Answer(2,"От 0 до 256", false));
        question1.addAnswers(new Answer(3,"От 0 до 65535", true));

        Question question2 = new Question("Какие из этих операторов можно использовать для объединения двух или более объектов String?");
        question2.addAnswers(new Answer(1,"+", true));
        question2.addAnswers(new Answer(2,"+=", false));
        question2.addAnswers(new Answer(3,"*=", false));
        question2.addAnswers(new Answer(4,"&", false));
        question2.addAnswers(new Answer(5,"||", false));

        Question[] questions ={question,question1,question2};

        for(Question questionAndAnswers : questions){
            questionAndAnswers.printQuestion();

            int userResponse = sc.nextInt();

            if (userResponse == questionAndAnswers.getRightAnswers()){
                System.out.println("Верно!" + "\n");
                count++;
            }else {
                System.out.println("Неверно." + "\n");
            }
        }
        System.out.println("Вы ответили верно на " + count + " вопросов");
        System.out.println(count >=2 ? "Вы молодец. Тест пройден!" : "Попробуйде еще раз.");
    }
}