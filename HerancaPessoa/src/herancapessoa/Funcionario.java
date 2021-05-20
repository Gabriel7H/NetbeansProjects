package herancapessoa;
import java.util.Date;


public class Funcionario extends Pessoa{
    private int id;
    private String cargo;
    private Date data_Adm;

    public Funcionario(String nome, String cpf, Date data_nascimento, 
            Double salario, int id, String cargo, Date data_adm) {
        super(nome, cpf, data_nascimento, salario);
        this.id = id;
        this.cargo = cargo;
        this.data_Adm = data_adm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getData_Adm() {
        return data_Adm;
    }

    public void setData_Adm(Date data_Adm) {
        this.data_Adm = data_Adm;
    }
    
    
}
