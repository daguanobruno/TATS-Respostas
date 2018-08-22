
public class CalcularSalario {

    Funcionario f = new Funcionario();

    String MensagemErro = "Calculo Aceito";

    public void calcular(String cargo, float salario) {


        if (cargo.equals("DESENVOLVEDOR") && salario < 3000) {
            salario = (float) (f.getSalarioBase() * 0.2);
        } else if (cargo.equals("DESENVOLVEDOR") && salario >= 3000) {
            salario = (float) (f.getSalarioBase() * 0.2);
        } else if (cargo.equals("DBA") && salario < 2000) {
            salario = (float) (f.getSalarioBase() * 0.15);
        } else if (cargo.equals("DBA") && salario >= 2000) {
            salario = (float) (f.getSalarioBase() * 0.25);
        } else if (cargo.equals("TESTADOR") && salario < 2000) {
            salario = (float) (f.getSalarioBase() * 0.15);
        } else if (cargo.equals("TESTADOR") && salario >= 2000) {
            salario = (float) (f.getSalarioBase() * 0.25);
        } else if (cargo.equals("GERENTE") && salario < 5000) {
            salario = (float) (f.getSalarioBase() * 0.2);
        } else if (cargo.equals("GERENTE") && salario >= 5000) {
            salario = (float) (f.getSalarioBase() * 0.3);
        } else {
            MensagemErro = "Dado Invalido";
        }
    }
}
