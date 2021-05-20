
package testebanco;
public class ContaBanco2 {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco2(){
    this.saldo = 0;
    this.status = false;  
}
    public int getNumConta(){  
        return numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus (Boolean s){
        this.status = s;
    }
    
    public void estadoConta(){
        System.out.println("------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (this.getTipo() == "CC") {
            this.setSaldo(50);
        } else if (this.getTipo() == "CP"){
            this.setSaldo(150);
        }
        System.out.println("A conta foi aberta com sucesso.");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0 ){
            System.out.println("Impossível fechar a conta, pois ainda há saldo.");
        } else if (this.getSaldo() < 0){
            System.out.println("Impossível fechar a conta estando em débito.");
        } else{
            this.setStatus(false);
            System.out.println("A conta foi fechada com sucesso");
        }    
    }
    public void depositar(float dep){
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + dep);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar com a conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus() == true) {
            if(this.getSaldo() >=  v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Valor sacado com sucesso na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente.");
            }
        } else {
                System.out.println("Impossível sacar de um conta fechada.");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if(this.getStatus() == true){
            if (this.getTipo() == "CC") {
                v = 12f;
            } else if(this.getTipo() == "CP"){
                 v = 20f;
            } if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso na conta de " + this.getDono());
            } else if (this.getSaldo() < v){
                System.out.println("Impossível pagar a mensalidade, saldo insuficiente.");
            }      
        } else{
            System.out.println("Impossível pagar de uma conta fechada");
        }
    }
}
