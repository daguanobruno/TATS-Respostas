
import java.util.ArrayList;
import java.util.List;


public class CalcularSalario {
    public String calcular(String cargo, double salario){
        
        Funcionario f = new Funcionario();
        double salarioFinal = 0;
        
        if(cargo.equals("DESENVOLVEDOR")){
            if(salario < 3000){
                salarioFinal = salario * 0.1;
                salario = salario - salarioFinal;
            }
            else{
                salarioFinal = salario * 0.2;
                salario = salario - salarioFinal;
            }
        }
        
        else if(cargo.equals("TESTADOR")){
            if(salario < 2000){
                salarioFinal = salario * 0.15;
                salario = salario - salarioFinal;
            }
            else{
                salarioFinal = salario * 0.25;
                salario = salario - salarioFinal;
            }
        }
        
        else if(cargo.equalsIgnoreCase("DBA")){
            if(salario < 2000){
                salarioFinal = salario * 0.15;
                salario = salario - salarioFinal;
            }
            else{
                salarioFinal = salario * 0.25;
                salario = salario - salarioFinal;
            }
        }
        
        else if (cargo.equals("GERENTE")){
            if(salario < 5000){
                salarioFinal = salario * 0.2;
                salario = salario - salarioFinal;
            }
            else{
                salarioFinal = salario * 0.3;
                salario = salario - salarioFinal;
            }
        }
        
        else{
            return Double.toString(salario);
        }
        
        return Double.toString(salario);
    }
    
      
    public String MensagemErro(String mensagem){
        
        String mensagemErro = "";
        
        return mensagemErro = mensagem;
    }
    
    
    public double SalarioFinal(double salarioFinal){
        double salario;
        
        return salario = salarioFinal;
    }
}
