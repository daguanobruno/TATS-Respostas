public class Proposta {
    float total, valorParcelas;
    int numeroParcelas;

     
    Proposta(float total, int numeroParcelas){
        this.total = total;
        this.numeroParcelas = numeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getValorParcelas() {
        return total / numeroParcelas;
    }

    public void setValorParcelas(float valorParcelas) {
        this.valorParcelas = valorParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

}
