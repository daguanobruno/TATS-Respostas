
public class CalcularSalario {

    Funcionario f = new Funcionario();

    String MensagemErro = "";

    public void calcular(String cargo) {

        float salario = 0;

        if (f.getCargo().equals("DESENVOLVEDOR") && f.getSalarioBase() < 3000) {
            salario = (float) (f.getSalarioBase() * 0.2);
        } else if (f.getCargo().equals("DESENVOLVEDOR") && f.getSalarioBase() >= 3000) {
            salario = (float) (f.getSalarioBase() * 0.2);
        } else if (f.getCargo().equals("DBA") && f.getSalarioBase() < 2000) {
            salario = (float) (f.getSalarioBase() * 0.15);
        } else if (f.getCargo().equals("DBA") && f.getSalarioBase() >= 2000) {
            salario = (float) (f.getSalarioBase() * 0.25);
        } else if (f.getCargo().equals("TESTADOR") && f.getSalarioBase() < 2000) {
            salario = (float) (f.getSalarioBase() * 0.15);
        } else if (f.getCargo().equals("TESTADOR") && f.getSalarioBase() >= 2000) {
            salario = (float) (f.getSalarioBase() * 0.25);
        } else if (f.getCargo().equals("GERENTE") && f.getSalarioBase() < 5000) {
            salario = (float) (f.getSalarioBase() * 0.2);
        } else if (f.getCargo().equals("GERENTE") && f.getSalarioBase() >= 5000) {
            salario = (float) (f.getSalarioBase() * 0.3);
        } else {
            MensagemErro = "Dado Invalido";
        }
    }
}
