package proxy;

public class MainProxyTask {
    public static void main(String[] args) {
        BankAccount authorizedAccount = new BankAccountProxy("authorizedUser");
        authorizedAccount.accessAccount();  // Access granted

        BankAccount unauthorizedAccount = new BankAccountProxy("unauthorizedUser");
        unauthorizedAccount.accessAccount();  // Access denied
    }
}
