import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Тест по Java."); // Вводные слова
        System.out.println("В тесте всего 3 вопроса, для прохождения данного теста нужно правильно ответить на 2.");
        //2 замечание: разбил на массивы questions, answers, correntAnswersIndexes
        String[] questions = {"Начнём с простого: что такое Java?",
                "Что из следующего является диапазоном char в Java?",
                "Какие из этих операторов можно использовать для объединения двух или более объектов String?"}; //Вопросы
        String[][] answers = {{"1. Мотоцикл", "2. Чай", "3. Язык программирования", "4. Остров"},
                              {"1. От -128 до 127", "2. От 0 до 256", "3. От 0 до 65535"},
                              {"1. +", "2. *=", "3. +=", "4. &&", "5. ||"}}; // Двумерный массив с вариантами ответов
        double[] correntAnswersIndexes = {3.0, 3.0, 1.0}; // Номера правильных ответов
        int counter = 0; // Счетчик верных ответов
        // Далее "логика" программы
        // 1 замечание: использовал длину массива
        for (int i=0; i<answers.length; i++) { // обращаемся к строке двумерного массива
            System.out.println(questions[i]); // Выводим элементы строки
            for (int j=0; j<answers[i].length; j++) { // обращаемся к столбцу(элементу в стороке) в  двумерного массива
                System.out.println(answers[i][j]);
            }
            double otvet = sc.nextDouble(); //получаем ответ от пользователя
            //3 замечание: Проверка попадает ли ответ пользователя в диапазон ответ
            while (true) {
                if (otvet < 1.0 || otvet > answers[i].length){
                    System.out.println("Нет ответа с таким номером. Попробуй еще раз.");
                    otvet = sc.nextDouble();
                }else {
                    break;
                }
            }
            if (otvet == correntAnswersIndexes[i]) { //проверяем совпадает ли ответ пользователя с верным
                // вариантом ответа соответствующим номеру строки в массиве array
                System.out.println("Верно"); // выводим соответствие
                counter++; //добавляем 1 к счетчику верных вариантов ответов
            } else { //если не совпадает
                System.out.println("Неверно");
            }

        }
        // После прохождения теста отображаем результат
        System.out.println("Вы ответили верно на " + counter);
        System.out.println(counter >= 2 ? "Ты молодец! Тест пройден." : "Ничего страшного, попробуй еще раз.");
    }
}