

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalcularSalarioTest {
    
    public CalcularSalarioTest() {
    }
    
    @Test
    public void TestDesenvolvedor(){
        CalcularSalario c = new CalcularSalario();
        Funcionario f = new Funcionario();
        
        f.setCargo("DESENVOLVEDOR");
        f.setSalarioBase(5000);
        
        String mensagem = c.calcular("DESENVOLVEDOR", 5000);
        
        assertEquals("Calculo Aceito", c.MensagemErro(mensagem));
    
    
    }

 
}
