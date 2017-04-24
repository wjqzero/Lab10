package wjqzero.uic.lab10;

/**
 * Created by UIC on 4/24/2017.
 */

public class BankRunnable implements Runnable {
    private Bank bank;
    public BankRunnable(Bank bank){
        this.bank = bank;
    }
    public void run(){
        try {
            int i;
            for (i = 0; i <= 99; i++) {
                bank.withdraw("Philippe", 1000);
                bank.withdraw("Philippe", -1000);
            }
        } catch (UnknownCustomerException e) {
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
}
