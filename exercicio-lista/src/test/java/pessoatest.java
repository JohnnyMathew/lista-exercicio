import com.example.pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class pessoatest {

    @Test
    public void testMaiorDeIdade() {
        pessoa p = new pessoa();
        assertTrue(p.ehMaiorDeIdade(18));
        assertTrue(p.ehMaiorDeIdade(30));
    }

    @Test
    public void testMenorDeIdade() {
        pessoa p = new pessoa();
        assertFalse(p.ehMaiorDeIdade(17));
        assertFalse(p.ehMaiorDeIdade(5));
    }
}
