

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
        
        String resposta = c.calcular("DESENVOLVEDOR", 5000);
        
        assertEquals("4000.0", resposta);
    }
    
    @Test
    public void TestTestador(){
        CalcularSalario c = new CalcularSalario();
        Funcionario f = new Funcionario();
        
        f.setCargo("TESTADOR");
        f.setSalarioBase(5000);
        
        String resposta = c.calcular(f.getCargo(), 5000);
        
        assertEquals("3750.0", resposta);
        
    }
}
