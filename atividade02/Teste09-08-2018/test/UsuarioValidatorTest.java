
import java.util.ArrayList;
import javafx.beans.binding.When;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsuarioValidatorTest {

    public UsuarioValidatorTest() {
    }

    @Test(expected = Exception.class)
    public void Teste1() throws Exception {

        UsuarioDAO usuarioDao;
        SenhaValidator senha;
        UsuarioValidator usuarioValidator;

        usuarioDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDao);
        usuarioValidator.setSenhaValidator(senha);

        Usuario u = new Usuario();
        u.setNome("Ana");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");

        usuarioValidator.ehUsuarioValido(u);
    }

    @Test(expected = Exception.class)
    public void Teste2() throws Exception {

        UsuarioDAO usuarioDao;
        SenhaValidator senha;
        UsuarioValidator usuarioValidator;

        usuarioDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDao);
        usuarioValidator.setSenhaValidator(senha);

        Usuario u = new Usuario();
        u.setNome("Bruno Daguano");
        u.setSenha("aaaaa");
        u.setSenhaConfirmada("bbbbb");

        usuarioValidator.ehUsuarioValido(u);

    }

    @Test(expected = Exception.class)
    public void Teste3() throws Exception {

        UsuarioDAO usuarioDao;
        SenhaValidator senha;
        UsuarioValidator usuarioValidator;

        usuarioDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDao);
        usuarioValidator.setSenhaValidator(senha);

        Usuario u = new Usuario();
        u.setNome("Carolina");
        u.setSenha("aaaaa");
        u.setSenhaConfirmada("aaaaa");

        when(usuarioDao.getByName("Carolina")).thenReturn(u);

        usuarioValidator.ehUsuarioValido(u);
    }

    @Test(expected = Exception.class)
    public void Teste4() throws Exception {

        UsuarioDAO usuarioDao;
        SenhaValidator senha;
        UsuarioValidator usuarioValidator;

        usuarioDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDao);
        usuarioValidator.setSenhaValidator(senha);

        Usuario u = new Usuario();
        u.setNome("Carolina");
        u.setSenha("aaaaa");
        u.setSenhaConfirmada("aaaaa");

        when(usuarioDao.getByName("Carolina"))
                .thenReturn(u);

        when(senha.verificar("aaaaa"))
                .thenReturn(Boolean.TRUE);

        usuarioValidator.ehUsuarioValido(u);
    }

    @Test
    public void Teste5() throws Exception {

        UsuarioDAO usuarioDao;
        SenhaValidator senha;
        UsuarioValidator usuarioValidator;

        usuarioDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDao);
        usuarioValidator.setSenhaValidator(senha);

        Usuario u = new Usuario();
        u.setNome("Carolina");
        u.setSenha("aaaaa");
        u.setSenhaConfirmada("aaaaa");

        when(usuarioDao.getByName(null))
                .thenReturn(u);

        when(senha.verificar("aaaaa"))
                .thenReturn(Boolean.FALSE);

        assertTrue(usuarioValidator.ehUsuarioValido(u));
    }

    @Test
    public void Teste6() throws Exception {

        UsuarioDAO usuarioDao;
        SenhaValidator senha;
        UsuarioValidator usuarioValidator;

        usuarioDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDao);
        usuarioValidator.setSenhaValidator(senha);

        Usuario u = new Usuario();
        u.setNome("B123@");
        u.setSenha("aaaaa");
        u.setSenhaConfirmada("aaaaa");

        when(senha.verificar("aaaaa"))
                .thenReturn(Boolean.FALSE);

        assertFalse(usuarioValidator.ehUsuarioValido(u));
    }

}
