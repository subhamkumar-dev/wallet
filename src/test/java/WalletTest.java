import com.thoughtworks.wallet.wallet.Wallet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class WalletTest {
    @Test
    void shouldAbleToPutMoneyInWallet() {
        Wallet wallet = new Wallet(0);
        int value = 10;
        
        assertDoesNotThrow(() -> wallet.add(value));
    }
}
