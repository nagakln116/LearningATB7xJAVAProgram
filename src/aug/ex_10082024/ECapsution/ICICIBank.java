package aug.ex_10082024.ECapsution;

public class ICICIBank {
    private String name;
    private long balance;

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if (isAdmin)
        this.balance = balance;
        else System.out.println("Setting balance is not allowed as you are NOT admin");
    }
}
