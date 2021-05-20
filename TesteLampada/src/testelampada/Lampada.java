
package testelampada;
import javax.swing.JOptionPane;

public class Lampada {
    private String cor;
    private String tamanho;
    private String estadodaLampada;

   public Lampada () {
       this ("","","");  
}
   public Lampada (String cor, String tamanho, String estadodaLampada){
       this.cor = cor;
       this.tamanho = tamanho;
       this.estadodaLampada = estadodaLampada;
   }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the estadodaLampada
     */
    public String getEstadodaLampada() {
        return estadodaLampada;
    }

    /**
     * @param estadodaLampada the estadodaLampada to set
     */
    public void setEstadodaLampada(String estadodaLampada) {
        this.estadodaLampada = estadodaLampada;
    }
    
    
    public void entraDados (){
        String cor = JOptionPane.showInputDialog("Cor: ");
        setCor (cor);
        String tamanho = JOptionPane.showInputDialog("Tamanho: ");
        setTamanho (tamanho);
        String estadodaLampada = JOptionPane.showInputDialog("Estado da Lâmpada: ");
        setEstadodaLampada (estadodaLampada);
} 
    
    public void provarExistencia (){
        JOptionPane.showMessageDialog(null, " Cor: " + this.getCor() + "\n Tamanho: "
        + this.getTamanho() + "\n Estado da Lâmpada: " + this.getEstadodaLampada());
    }
}