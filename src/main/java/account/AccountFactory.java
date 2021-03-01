package account;

public class AccountFactory {


    public Account addAccount(){
        Account account=new Account("12232","giogio",20000);
        return account;
    }

    public static Account createAccount() {
        Account account=new Account("312312","joojoo",10000);
        return account;
    }
}
