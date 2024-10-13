package facade;

public class MainFacadeTask {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        bankFacade.performBankOperations();
    }
}
