import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Client, ArrayList<Account>> allCustomerAccounts = new HashMap<>();
        HashMap<String, Client> findClient = new HashMap<>();


        Client vladimir = new Client("vladimir", 57);
        vladimir.addAccount(new Account(123456, 501));
        vladimir.addAccount(new Account(123555, 4023));

        Client andrey = new Client("andrey", 31);
        andrey.addAccount(new Account(111111, 1));
        andrey.addAccount(new Account(222222, 23));
        andrey.addAccount(new Account(333333, 456));

        Client pety = new Client("pety", 20);
        pety.addAccount(new Account(444444, 0));
        pety.addAccount(new Account(555555, 13));
        pety.addAccount(new Account(666666, 56));

        clientCard(allCustomerAccounts, findClient, vladimir);
        clientCard(allCustomerAccounts, findClient, andrey);
        clientCard(allCustomerAccounts, findClient, pety);

        bankFunctionality(allCustomerAccounts, findClient);

    }

    private static void bankFunctionality(HashMap<Client, ArrayList<Account>> allCustomerAccounts, HashMap<String, Client> findClient) {
        System.out.print("Здравствуйте, что Вы хотите узнать?" + "\n"
                + "1. Счета клиента и баланс на них?" + "\n"
                + "2. Кому принадлежит счет?" + "\n" + "Введите номер запроса: ");

        Scanner sc = new Scanner(System.in);
        int customerResponse = sc.nextInt();
        if (customerResponse == 1) {
            printAccount(allCustomerAccounts);
        } else if (customerResponse == 2) {
            printClient(findClient);
        } else {
            System.out.println("Данная операция отсутствует.");
        }
    }

    private static void printClient(HashMap<String, Client> findClient) {
        System.out.println("Введите номер счета: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println(findClient.get(id));
    }

    private static void printAccount(HashMap<Client, ArrayList<Account>> allCustomerAccounts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя клиента: ");
        String name = sc.next();
        System.out.println("Введите возраст клиента: ");
        int age = sc.nextInt();
        Client client = new Client(name, age);
        for (Account account : allCustomerAccounts.get(client)) {
            System.out.println(account);
        }
    }

    private static void clientCard(HashMap<Client, ArrayList<Account>> allCustomerAccounts,
                                   HashMap<String, Client> findClient, Client client) {
        allCustomerAccounts.put(client, client.getAccounts());
        for (Account account : allCustomerAccounts.get(client)) {
            findClient.put(account.getId(), client);
        }
    }

}