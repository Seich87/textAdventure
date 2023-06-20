import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import service.Forms;

import static org.junit.jupiter.api.Assertions.*;


public class FormsTest {

    @ParameterizedTest
    @NullSource
    public void execute(String title) {
        assertNull(Forms.getTitle());
    }


}
