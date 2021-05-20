package projetopessoas;
public class Professor extends Pessoa{
    private String espcialidade;
    private double salario;
    
    public void ReceberAum(float aum){
        this.salario += aum;
    }

    public String getEspcialidade() {
        return espcialidade;
    }

    public void setEspcialidade(String espcialidade) {
        this.espcialidade = espcialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
