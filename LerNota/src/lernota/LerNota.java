
package lernota;
// importação do pacote "JOptionPane" que contêm as classes e métodos
import javax.swing.JOptionPane;

//declaração da classe "LerNota" 
public class LerNota {
    public static void main(String[] args) {
        lerNota();
    }
    
    /*método estático "lerNota" sem valor de retorno;
    declaração das variáveis n1, n2 e nome;
    
    */
    static void lerNota(){
        double n1,n2;
            String nome;
            nome = JOptionPane.showInputDialog(null, "Digite um Nome:");
                n1=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
                n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
                JOptionPane.showMessageDialog(null, nome);
                calculaMedia(n1,n2);
    }
    private static void calculaMedia(double a1, double a2){
        double md;
        md = (a1+a2)/2;
        if (md>=7) {
            JOptionPane.showMessageDialog(null,"Aprovado: " + md);
        } else if (md<7){
            JOptionPane.showMessageDialog(null,"Reprovado" + md);
        }
        
    }
}
