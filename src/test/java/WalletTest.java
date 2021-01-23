import com.thoughtworks.wallet.wallet.Wallet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class WalletTest {
    @Test
    void shouldAbleToPutMoneyInWallet() {
        Wallet wallet = new Wallet(0);
        int value = 10;

        assertDoesNotThrow(() -> wallet.add(value));
    }

    @Test
    void shouldAbleToWithdrawMoneyFromWallet() {
        Wallet wallet = new Wallet(0);
        int value = 10;
        wallet.add(value);
        int withdrawAmount = 5;

        wallet.withdraw(withdrawAmount);
        int resultWithdrawAmount = wallet.getWithdrawMoney();

        assertThat(resultWithdrawAmount,is(equalTo(withdrawAmount)));
    }
}
