import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 2.
        // Написать программу, в которую пользователь вводит две строки неограниченной длины, содержащие версии программ.

        //Версия программы – это строка их 4-х чисел, разделенных точками. Числа целые положительные или ноль.
        // Могут начинаться с нулей. Обработка должна определить, какая из версий старше.

        //Примеры версий:

        //8.1.13.41
        //8.1.009.125

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите на разных строчках версии программ в виде '12.23.34.45', которые хотите сравнить");
        String str1 = sc.nextLine(); //получаем версии программ в строковом представлении
        String str2 = sc.nextLine();
        int counter = 0; // Счетчик который поможет нам в дальнейшем понять равны версии или нет

        String[] words1 = str1.split("\\."); // разделим строки с версиями на массив подстрок разделенных точками
        String[] words2 = str2.split("\\.");

        for (int i=0; i< words1.length; i++) { // из условия версия это строка из "... 4-х чисел, разделенных точками."
                                               // поэтому можем сделать вывод что обе строки разделяться на 4 подстроки
            int index1 = Integer.parseInt(words1[i]); //перебираем массив и подстроки превращаем в числа
            int index2 = Integer.parseInt(words2[i]);

            // перебираем до первого неравенства и выводим ответ
            if (index1 > index2) {
                System.out.println(str1 + " старше, чем " + str2);
                counter++;
                break;
            }else if (index1 < index2){
                System.out.println(str2 + " старше, чем " + str1);
                counter++;
                break;
            }
        }
        //если все элементы равны то выводим, что версии равны
        if (counter == 0){
            System.out.println(str2 + " и " + str1 + " равны.");
        }

    }
}