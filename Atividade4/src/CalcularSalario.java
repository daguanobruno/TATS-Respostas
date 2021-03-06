
import java.util.ArrayList;
import java.util.List;


public class CalcularSalario {
    public String calcular(String cargo, double salario){
        
        Funcionario f = new Funcionario();
        double salarioFinal = 0;
        
        if(cargo.equalsIgnoreCase("DESENVOLVEDOR")){
            if(salario < 3000){
                salarioFinal = salario * 0.1;
                salario = salario - salarioFinal;
            }
            else{
                salarioFinal = salario * 0.2;
                salario = salario - salarioFinal;
            }
        }
        
        else if(cargo.equalsIgnoreCase("TESTADOR")){
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
        
        else if (cargo.equalsIgnoreCase("GERENTE")){
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
            return "Cargo Invalido!";
        }
        
        return Double.toString(salario);
    }
      
    public double SalarioFinal(double salarioFinal){
        double salario;
        
        return salario = salarioFinal;
    }
}
