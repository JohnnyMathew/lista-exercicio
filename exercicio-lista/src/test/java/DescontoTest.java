import com.example.desconto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescontoTest {

    @Test
    public void testDescontoMaiorQue100() {
        desconto d = new desconto();
        assertEquals(15.0, d.calcularDesconto(150.0), 0.01);
    }

    @Test
    public void testDescontoMenorOuIgualA100() {
        desconto d = new desconto();
        assertEquals(5.0, d.calcularDesconto(100.0), 0.01);
    }
}
