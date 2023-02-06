import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Задача 4
        //Заполнить двумерный массив, как показано на рисунке:

        Scanner sc = new Scanner(System.in);
        // Выводим и добавляем все необходимое для реализации программы
        System.out.println("Введите парамметры двумерного массива, где: arrayStrings - строки(высота) " +
                "и arrayColumns - стобцы(ширина)");
        System.out.println("Введите количество строк - arrayStrings");
        int arrayStrings = sc.nextInt();
        System.out.println("Введите количество столбцов - arrayColumns");
        int arrayColumns = sc.nextInt();
        int[][] arrayOfNumbers = new int[arrayStrings][arrayColumns];
        int counter = 1; //счетчик для залнения массива
        // Из условия задачи можно заметить что массив должен заполняться "змейкой"
        //Заполняем массив
        // Для этого мы должны определить четное ли количество строк в массиве т.е. как мы должны начать запонять массив
        if (arrayStrings % 2 !=0) { //если не четное
            for (int i = arrayStrings - 1; i >= 0; i--) { //заполняем снизу вверх т.е. с последней строчки массива
                if (i % 2 != 0) { //если строка не четная
                    for (int j = 0; j < arrayColumns; j++) { //то слева направо
                        arrayOfNumbers[i][j] = counter;
                        counter++;// начинаем с 1 и каждый проход добавляем единицу
                    }
                } else {
                    for (int j = arrayColumns - 1; j >= 0; j--) {// в другом случае справа налево
                        arrayOfNumbers[i][j] = counter;
                        counter++; // начинаем с 1 и каждый проход добавляем единицу
                    }
                }
            }
        } else { //тоже самое но если количество строк четное
            for (int i = arrayStrings - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    for (int j = 0; j < arrayColumns; j++) {
                        arrayOfNumbers[i][j] = counter;
                        counter++;
                    }
                } else {
                    for (int j = arrayColumns - 1; j >= 0; j--) {
                        arrayOfNumbers[i][j] = counter;
                        counter++;
                    }
                }
            }
        }
        // Выводим получившийся массив
        for (int i = 0; i < arrayStrings; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                System.out.print(arrayOfNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
