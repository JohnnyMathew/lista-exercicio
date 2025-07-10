import com.example.aluno;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class alunotest {

    @Test
    public void testAprovado() {
        aluno a = new aluno();
        assertEquals("Aprovado", a.verificarSituacao(7.5));
    }

    @Test
    public void testRecuperacao() {
        aluno a = new aluno();
        assertEquals("Recuperação", a.verificarSituacao(5.5));
    }

    @Test
    public void testReprovado() {
        aluno a = new aluno();
        assertEquals("Reprovado", a.verificarSituacao(4.0));
    }
}

