package interfacegrafica1;
import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica1 extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JTextField texto1,texto2,texto3, texto4;
    
public InterfaceGrafica1(){
super("Exemplo com JTextField");
Container tela = getContentPane();
setLayout(null);
    rotulo1 = new JLabel ("Nome");
    rotulo2 = new JLabel ("ldade");
    rotulo3 = new JLabel ("Telefone");
    rotulo4 = new JLabel ("Celular");
    
    
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        
        
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,80,20);
            rotulo4.setBounds(50,140,80,20);
            
            
                texto1.setBounds(110,20,200,20);
                texto2.setBounds(110,60,20,20);
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
                        
setSize(400, 250);
setVisible(true);
setLocationRelativeTo(null);
}  

    public static void main(String[] args) {
        InterfaceGrafica1 app = new InterfaceGrafica1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}