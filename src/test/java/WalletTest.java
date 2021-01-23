import com.thoughtworks.wallet.exception.LowAmountException;
import com.thoughtworks.wallet.wallet.Wallet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {
    @Test
    void shouldAbleToPutMoneyInWallet() {
        Wallet wallet = new Wallet(0);
        int value = 10;

        assertDoesNotThrow(() -> wallet.add(value));
    }

    @Test
    void shouldAbleToWithdrawMoneyFromWallet() throws LowAmountException {
        Wallet wallet = new Wallet(0);
        int value = 10;
        wallet.add(value);
        int withdrawAmount = 5;

        wallet.withdraw(withdrawAmount);
        int resultWithdrawAmount = wallet.getWithdrawMoney();

        assertThat(resultWithdrawAmount,is(equalTo(withdrawAmount)));
    }

    @Test
    void shouldThrowAnExceptionIfWithdrawAmountIsGreaterThanAmountInWallet() {
        Wallet wallet = new Wallet(0);
        int addValue = 100;
        wallet.add(addValue);
        int withdrawAmount = 500;

        assertThrows(LowAmountException.class,() -> wallet.withdraw(withdrawAmount));
    }
}
