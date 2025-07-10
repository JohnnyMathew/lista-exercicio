import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.numero;

public class numerotest {

    @Test
    public void testPar() {
        numero n = new numero();
        assertEquals("par", n.parOuImpar(2));
    }

    @Test
    public void testImpar() {
        numero n = new numero();
        assertEquals("ímpar", n.parOuImpar(3));
    }
}
