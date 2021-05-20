/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprofessor;

/**
 *
 * @author ghaam
 */
public class Professor {
    
    private String nome;
    private String sexo;
    private String país;
    private String formacao;
    
    public Professor (){
        this("","","",""); 
    }
    public Professor (String nome, String sexo, String país, String formacao ){
        this.nome = nome;
        this.sexo = sexo;
        this.país = país;
        this.formacao = formacao;
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

    /**
     * @return the formacao
     */
    public String getFormacao() {
        return formacao;
    }

    /**
     * @param formacao the formacao to set
     */
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void ministraAula (){
        System.out.println("Ministrando aula...");
    }
    public void estuda (){
        System.out.println("Estudando...");
    }
    public void explicaMaterial (){
        System.out.println("Explicando...");
    }
    public void corrigeProva (){
        System.out.println("Corrigindo...");
    } 
}

