package interfacegrafica3;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.*;

public class InterfaceGrafica3 extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, sair, limpar;
    //vai ter que: somar, subtrair, dividir, multiplicar, sair;
    public InterfaceGrafica3(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1ºNúmero: ");
        rotulo2 = new JLabel("2ºNúmero: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        sair = new JButton("Sair");
        limpar = new JButton("Limpar");
        
 
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,220,200,20);
        somar.setBounds(150,100,100,20);
        subtrair.setBounds(150,123,100,20);
        multiplicar.setBounds(150,146,100,20);
        dividir.setBounds(150,170,100,20);
        sair.setBounds(150,195,100,20);
        limpar.setBounds(50,240,100,20);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1, num2, soma;
                        soma = 0;
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        soma = num1 + num2;
                        exibir.setText("A soma é: " + soma);
                        
                    }  
                }   
        );
        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1, num2, sub;
                        sub = 0;
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        sub = num1 - num2;
                        exibir.setText("A subtração é: " + sub);
                        
                    }  
                }   
        );
        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1, num2, mul;
                        mul = 0;
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        mul = num1 * num2;
                        exibir.setText("A multiplicação é: " + mul);
                        
                    }  
                }   
        );
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1, num2, div;
                        div = 0;
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        div = num1 / num2;
                        exibir.setText("A divisão é: " + div);
          
                    }  
                }   
        );
        sair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }  
                }   
        );
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setText(null);
                        texto2.setText(null);
                        exibir.setText(null);
                        texto1.requestFocus();
                    }  
                }   
        );
        
        exibir.setVisible(true);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(sair);
        tela.add(limpar);
        
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        tela.setBackground(Color.GRAY);
    }
     
    
    public static void main(String[] args) {
        InterfaceGrafica3 app = new InterfaceGrafica3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
