

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
        
        String erro = f.verificarCargo("DESEN0VOLVEDOR");
        String resposta = c.calcular("DESENVOLVEDOR", 5000);
        
        
        assertEquals("Cargo não aceito", erro);
        assertEquals("4000.0", resposta);
    }
    
    @Test
    public void TestTestador(){
        CalcularSalario c = new CalcularSalario();
        Funcionario f = new Funcionario();
        
        f.setCargo("TESTADOR");
        f.setSalarioBase(5000);
        
        String resposta = c.calcular(f.getCargo(), 5000);
        String erro = f.verificarCargo("TESTADOR");
        
        assertEquals("Cargo Aceito", erro);
        assertEquals("3750.0", resposta);
        
    }    
    

    @Test
    public void TestDBA(){
        CalcularSalario c = new CalcularSalario();
        Funcionario f = new Funcionario();
        
        f.setCargo("Dba");
        f.setSalarioBase(3000);
        
        String resposta = c.calcular(f.getCargo(), 5000);
        String erro = f.verificarCargo("Dba");
        
        assertEquals("Cargo Aceito", erro);
        assertEquals("2250.0", resposta);
    
    }
    
}

