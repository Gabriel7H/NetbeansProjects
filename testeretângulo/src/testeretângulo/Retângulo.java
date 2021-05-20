package testeretângulo;
import javax.swing.JOptionPane;

//declaração da classe retângulo e seus atributos
public class Retângulo {
    private double comprimento;
    private double altura;
    private int opcao;
    
    //Métedo Contrutor sem parâmetro
    public Retângulo(){
        this.comprimento = 1;
        this.altura = 1;
    }
    
    //Métodos getter e setter
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
    
    /*pequeno menu para o usuário selecionar a opção desejada,
    veja, que existe um chamamento para o método "calculoRetângulo".*/
    public void menuRetangulo(){
      String opção = JOptionPane.showInputDialog("BEM VINDO A CALCULADORA DE RETÂNGULO" 
                + "\n Selecione uma opção para o retângulo: "
                + "\n [1] - Calcular Perímetro: "
                + "\n [2] - Calcular Área: ");
      this.setOpcao(Integer.parseInt(opção));
      this.calculoRetangulo();
   }
   
   /*neste método avalia-se a opção escolhida e executa uma ação, seja a
   de cáculo de perímetro, seja a de cálculo de área
    */ 
   public void calculoRetangulo(){
       double peri;
       double area;
       this.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
       this.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Comprimento: ")));
 
       if (this.getOpcao() == 1) {
           peri = (this.getAltura() * 2) + (this.getComprimento() * 2);
           JOptionPane.showMessageDialog(null," RESULTADO: " + peri);
       } else if (this.getOpcao() == 2) {
           area = (this.getAltura() * this.getComprimento());
           JOptionPane.showMessageDialog(null," RESULTADO: " + area);
       }  
   }
    
}
