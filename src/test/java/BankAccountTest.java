import org.example.BackAccount;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {

    @Test
    public void  testDeposit(){
        BackAccount bankAccount = new BackAccount(007, "James", 10000);
        double deposit = bankAccount.deposit(10000);
        Assert.assertEquals(deposit, 20000);
    }

    @Test
    public void testFullWithdraw(){
        BackAccount bankAccount = new BackAccount(007, "James", 10000);
        double withdraw = bankAccount.withdraw(10000);
        Assert.assertEquals(withdraw, 0);
    }

    @Test
    public void testWithdraw(){
        BackAccount bankAccount = new BackAccount(007, "James", 10000);
        double withdraw = bankAccount.withdraw(3000);
        Assert.assertEquals(withdraw, 7000);
    }

    @Test
    public void InsufficientBalance(){
        BackAccount bankAccount = new BackAccount(007, "James", 10000);
        double withdraw = bankAccount.withdraw(12000);
        Assert.assertEquals(withdraw, 10000);
    }
    
    
}
