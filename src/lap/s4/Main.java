package lap.s4;

public class Main {
    public static void main(String[] args){
        Account acc = new Account();
        acc.setBalance(20000);

        Account acc2 = new Account();
        acc2.setBalance(50000);
        acc.transferTo(acc2,10000);
        System.out.println("Acc 1"+acc.getBalance());
        System.out.println("Acc 2"+acc2.getBalance());
    }
}
