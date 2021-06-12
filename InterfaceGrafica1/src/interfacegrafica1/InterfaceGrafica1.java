package interfacegrafica1;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import javax.swing.text.MaskFormatter;
public class InterfaceGrafica1 extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JTextField texto1,texto2,texto3, texto4;
    JButton cad, con;
    ImageIcon cadi, coni;
    JFormattedTextField texto5, texto6;
    MaskFormatter mascaratexto05, mascaratexto06;
    JComboBox gabriel;
    JRadioButton hue;
    
public InterfaceGrafica1(){
super("Exemplo com JTextField");
Container tela = getContentPane();
// setLayout é nulo pois, senão não conseguimos alinhar os objetos na tela
setLayout(null);
    rotulo1 = new JLabel ("Nome");
    rotulo2 = new JLabel ("ldade");
    rotulo3 = new JLabel ("Telefone");
    rotulo4 = new JLabel ("Celular");
        
        rotulo1.setForeground(new Color (150,120,80));
        rotulo2.setForeground(new Color (150,120,80));
        rotulo3.setForeground(new Color (150,120,80));
        rotulo4.setForeground(new Color (150,120,80));
        
    
        //adicionar dois botões com ícone cadastrar e consultar, mudar background para cor margeta;  tela não pode ser redimensionada;
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        
            cadi = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/check.png");
            coni = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/Clock.png");
            cad = new JButton("cadastrar", cadi);
            con = new JButton("consultar", coni);
            cad.setBounds(50,185,140,30);
            con.setBounds(200,185,140,30);
            
            gabriel = new JComboBox();
            gabriel.setBounds(110, 80, 80, 20);
         
            //coluna, linha, comprimento, largura
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,200,20);
            rotulo3.setBounds(50,100,80,20);
            rotulo4.setBounds(50,140,80,20);
            
                //coluna, linha, comprimento, largura
                texto1.setBounds(110,20,200,20);
                texto2.setBounds(110,60,50,20);
                texto3.setBounds(110,100,80,20);
                texto4.setBounds(110,140,80,20);

                    tela.add(rotulo1);
                    tela.add(rotulo2);
                    tela.add(rotulo3);
                    tela.add(rotulo4);
                    tela.add(texto1);
                    tela.add(texto2);
                    tela.add(texto3);
                    tela.add(texto4);
                    tela.add(cad);
                    tela.add(con);
                    tela.add(gabriel);
                        setSize(400, 250);
                        setVisible(true);
                        setResizable(false);
                        setLocationRelativeTo(null);
                        tela.setBackground(Color.yellow);
}  

    public static void main(String[] args) {
        InterfaceGrafica1 app = new InterfaceGrafica1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
