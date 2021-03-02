package lap.s4;

public class Account {
    int id;
    String name;
    double balance;

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(int amuont){
        if (amuont > 0){
            setBalance(getBalance()+amuont);
        } else System.out.println("nap tien that bai");
    }

    public void debit(int amuont){
        if (this.balance>amuont){
            this.balance -= amuont;
        } else System.out.println("thanh toan khong thanh cong");
    }

    public void transferTo(Account account,int amuont){
        if (amuont > 0 && amuont <= getBalance()){
            debit(amuont);
            account.credit(amuont);
        } else System.out.println("Error 404");
    }
}
