package testefunc;
import javax.swing.JOptionPane;

//declaração da classe e seus atributos
public class Funcionario {
    private String nome;
    private int idade;
    private String salario;
    
//método construtor sem parâmetro  
public Funcionario (){
    this("",00,"");
    
}
//método construtor com parâmetro
public Funcionario (String nome, int idade, String salario){
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
}

// métodos especiais getter e setter   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSalario() {
        return salario;
    }
    public void setSalario (String salario){
        this.salario = salario;
    }
    public void entraDados(){
        this.setNome(JOptionPane.showInputDialog("Nome: "));
        this.calcularIdade();
        this.setSalario(JOptionPane.showInputDialog("Salário (R$): "));
    }
    
    // método para calcular a idade com base no ano de nascimento e ano atual
    public void calcularIdade(){
        int nasc = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: "));
        int atual = Integer.parseInt(JOptionPane.showInputDialog("Ano atual: "));
        int id = atual - nasc;
        this.setIdade(id);
    }
    
    // 
    public void mostrarDados(){
        JOptionPane.showMessageDialog(null, " Nome: " + this.getNome() + "\n Idade: "
        + this.getIdade() + "\n Salario: R$ " + this.getSalario());
    }
}

