class Account{
    protected int account_number;
    protected float balance;
    public void setAccount(int account_number,float initial_balance) {
        this.account_number=account_number;
        this.balance=initial_balance;
    }
}
class SavingAccount extends Account{
    public void setdeposite(float amount){
        balance+=amount;
    }
    public void setwithdraw(float amount) {
        balance-=amount;
    }
    public void print() {
        System.out.println(account_number);
        System.out.println(balance);
    }
}
public class Main {
    public static void main(String[] args) {
        SavingAccount obj=new SavingAccount();
        obj.setAccount(1001,(float)5000); obj.setdeposite((float)1000);
        obj.setwithdraw((float)1000);
        obj.print();
    }
}