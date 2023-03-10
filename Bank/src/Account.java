public class Account {
    private int id;
    private int accountAmount;


    public Account(int id, int accountAmount) {
        this.id = id;
        this.accountAmount = accountAmount;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String toString() {
        return "Account: " + id + ", amount of gold coins: " + accountAmount;
    }
}
