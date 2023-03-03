import java.util.Base64; //импортируем класс, который позволяет считывать данные из разных источников.
import java.util.Scanner; //импортируем класс, для получения кодировщиков и декодеров для схемы кодирования Base64

public class HomeWork { // создаем общедоступный класс домашняя работа
    public static void main(String[] args) { //создаем метод main
        Scanner sc = new Scanner(System.in);  //добавляем сканер
        System.out.println("Please enter you full name"); //выводим "Please enter you full name"
        String fullName = sc.nextLine(); //считываем данные с клавиатуры
        String encodedFullName = Base64.getEncoder().encodeToString(fullName.getBytes()); //кодируем переменныю "fullName"
        System.out.println("Program result: " + encodedFullName); //выводим результат
    }

}
