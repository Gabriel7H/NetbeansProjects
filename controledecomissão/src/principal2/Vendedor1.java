package principal2;

public class Vendedor1 {
    private String nome;
    private double SalarioBase;
    private double resultado;

    public Vendedor1(){
        this("",0);
     
    }
    public Vendedor1(String nome, double SalarioBase){
        this.nome = nome;
        this.SalarioBase = SalarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double calcularComissão(double valorVendido){
        double resultado = valorVendido * (0.03 +(this.getSalarioBase() * 0.00001));
        this.setResultado(resultado);
        return resultado;
    }
    
    public void sair(){
        System.exit(0);
    }

    
}
