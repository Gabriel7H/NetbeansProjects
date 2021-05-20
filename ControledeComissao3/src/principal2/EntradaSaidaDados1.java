package principal2;
import javax.swing.JOptionPane;

public class EntradaSaidaDados1 {
    public String entradaDados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    public void saidaDados(String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
