
public class Funcionario {
    
    String nome, email, cargo, mensagemErro;
    double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, String cargo, String mensagemErro, float salarioBase) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.mensagemErro = mensagemErro;
        this.salarioBase = salarioBase;
    }

    
    public String verificarCargo(String cargo){
        
        if(cargo.equals("DESENVOLVEDOR")){
            cargo = "DESENVOLVEDOR";
        }
        else if(cargo.equals("TESTEDOR")){
            cargo = "TESTADOR";
        }
        else if(cargo.equals("DBA")){
            cargo = "DBA";
        }
        else if(cargo.equals("GERENTE")){
            cargo = "GERENTE";
        }
        else{
            cargo = "Nome não aceito";
        }
        
        return cargo;
    }
    
    
    public String getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
