/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopessoa;
import javax.swing.JOptionPane;
/**
 *
 * @author ghaam
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private String país;
    
    public Pessoa (){
    this("","","");
    
}
public Pessoa (String nome, String sexo, String país ){
    this.nome = nome;
    this.sexo = sexo;
    this.país = país;
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the país
     */
    public String getPaís() {
        return país;
    }

    /**
     * @param país the país to set
     */
    public void setPaís(String país) {
        this.país = país;
    }
     
    public void andar (){
        System.out.println("Andando...");
    }
    public void falar (){
        System.out.println("Falando...");
    }
    public void correr (){
        System.out.println("Correndo...");
    }
    public void estudar (){
        System.out.println("Estudando...");
    }
    public void brincar (){
        System.out.println("Brincando...");
    }
    public void entraDadoss (){
        String nome = JOptionPane.showInputDialog("Nome: ");
        setNome (nome);
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        setSexo (sexo);
        String pais = JOptionPane.showInputDialog("País: ");
        setPaís (pais);
     }
    public void provarExistencia (){
        JOptionPane.showMessageDialog(null, " Nome: " + this.getNome() + "\n Sexo: "
        + this.getSexo() + "\n País: " + this.getPaís());
        
    }
}
