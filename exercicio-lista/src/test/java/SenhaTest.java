import com.example.senha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SenhaTest {

    @Test
    public void testSenhaValida() {
        senha s = new senha();
        assertTrue(s.senhaValida("12345678"));
    }

    @Test
    public void testSenhaInvalida() {
        senha s = new senha();
        assertFalse(s.senhaValida("1234567"));
    }
}
