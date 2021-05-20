package herancapessoa;

import java.util.Date;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, String cpf, Date data_nascimento, Double salario, String disciplina) {
        super(nome, cpf, data_nascimento, salario);
        this.disciplina = disciplina;     
    }
    
    public void ministraAula(){
        System.out.println("Ministrando Aula");
    }
    
}
