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
public class ExemploProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Professor professor1 = new Professor();
        
        professor1.setNome("Gabriel");
        professor1.setSexo("Masculino");
        professor1.setPaís("Brasil");
        professor1.setFormacao("Licenciatura em Matemática");
        
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Sexo: " + professor1.getSexo());
        System.out.println("Pais: " + professor1.getPaís());
        System.out.println("Formação: " + professor1.getFormacao());
    
    
    professor1.ministraAula();
    professor1.estuda();
    professor1.explicaMaterial();
    professor1.corrigeProva();
    
    }
    
}
