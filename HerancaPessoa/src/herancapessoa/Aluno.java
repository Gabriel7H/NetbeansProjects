package herancapessoa;

import java.util.Date;

public class Aluno extends Pessoa{
    private int RM;

    public Aluno(String nome, String cpf, Date data_nascimento, Double salario, int RM) {
        super(nome, cpf, data_nascimento, salario);
        this.RM = RM;
    }
    
    public double tirarCopias(int qtd){
    return (qtd); 
    }
    
}
