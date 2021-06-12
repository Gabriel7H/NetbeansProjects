package interfacegrafica2;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class InterfaceGrafica2 extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8,rotulo9,rotulo10,rotulo11,rotulo12;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10;
    JButton btn1,btn2,btn3,btn4,btn5;
    JComboBox box1;
    JRadioButton fem, mas;
    ImageIcon inc, con, lim, ct, sai;
    MaskFormatter mascep, mastel, masdat, mascel;
    
    
    public InterfaceGrafica2(){
        super("Cadastro de Cliente");
        Container tela = getContentPane();
        setLayout(null);
        
            rotulo1 = new JLabel("Código do cliente");
            rotulo2 = new JLabel("Nome completo");
            rotulo3 = new JLabel("Endereço");
            rotulo4 = new JLabel("Bairro");
            rotulo5 = new JLabel("Cidade");
            rotulo6 = new JLabel("Estado");
            rotulo7 = new JLabel ("C.E.P");
            rotulo8 = new JLabel("Sexo");
            rotulo9 = new JLabel("Celular");
            rotulo10 = new JLabel("Telefone");
            rotulo11 = new JLabel("Data do Aniversário");
            rotulo12 = new JLabel("Data de Cadastro");
            
                texto1 = new JTextField(50);
                texto2 = new JTextField(50);
                texto3 = new JTextField(50);
                texto4 = new JTextField(50);
                texto5 = new JTextField(50);
                texto6 = new JTextField(50);
                texto7 = new JTextField(50);
                texto8 = new JTextField(50);
                texto9 = new JTextField(50);
                texto10 = new JTextField(50);
                
                inc = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/file_(add)_16x16.gif");
                con = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/consulting.png");
                lim = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/file_16x16.gif");
                ct = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/database_form_16x16.gif");
                sai = new ImageIcon("C:/Users/ghaam/Downloads/ICONES/ICONES/Exit.png");
                    btn1 = new JButton("Incluir", inc);
                    btn2 = new JButton("Consultar", con);
                    btn3 = new JButton("Limpar", lim);
                    btn4 = new JButton("Consultar Todos", ct);
                    btn5 = new JButton("Sair", sai);
        
                        box1 = new JComboBox();
                        fem = new JRadioButton("Feminino");
                        mas = new JRadioButton("Masculino");
                        
                        try{
                           mastel = new MaskFormatter("(##)####-####");
                           mascel = new MaskFormatter("(##)#####-####");
                           mascep = new MaskFormatter("#####-###");
                           masdat = new MaskFormatter("##/##/####");
                           mastel.setPlaceholderCharacter('_');
                           mascel.setPlaceholderCharacter('_');
                           mascep.setPlaceholderCharacter('_');
                           masdat.setPlaceholderCharacter('_');
                        }catch (ParseException excp){}
                            texto6 = new JFormattedTextField(mascep);
                            texto7 = new JFormattedTextField(masdat);
                            texto8 = new JFormattedTextField(mascel);
                            texto10 = new JFormattedTextField(masdat);
                            texto9 = new JFormattedTextField(mastel);
                            
                        //coluna, linha, comprimento, largura
                        rotulo1.setBounds(10,10,110,20);
                        rotulo2.setBounds(10,40,110,20);
                        rotulo3.setBounds(10,70,110,20);
                        rotulo4.setBounds(10,100,110,20);
                        rotulo5.setBounds(10,130,110,20);
                        rotulo6.setBounds(10,160,110,20);
                        rotulo7.setBounds(10,190,110,20);
                        rotulo8.setBounds(10,220,110,20);
                        rotulo9.setBounds(10,250,110,20);
                        rotulo10.setBounds(10,280,110,20);
                        rotulo11.setBounds(10,310,120,20);
                        rotulo12.setBounds(10,340,110,20);
                        
                            texto1.setBounds(200,10,190,23);
                            texto2.setBounds(200,40,190,23);
                            texto3.setBounds(200,70,190,23);
                            texto4.setBounds(200,100,190,23);
                            texto5.setBounds(200,130,190,23);
                            texto6.setBounds(200,190,190,23);
                            texto7.setBounds(200,340,190,23);
                            texto8.setBounds(200,250,190,23);
                            texto9.setBounds(200,280,190,23);
                            texto10.setBounds(200,310,190,23);
                                
                                btn1.setBounds(10,373,160,30);
                                btn2.setBounds(10,408,160,30);
                                btn3.setBounds(180,373,160,30);
                                btn4.setBounds(180,408,160,30);
                                btn5.setBounds(350,373,160,30);
                                
                                    box1.setBounds(200,160,190,23);
                                    fem.setBounds(200,213,90,35);
                                    mas.setBounds(300,213,90,35);
                            
                            tela.add(rotulo1);
                            tela.add(rotulo2);
                            tela.add(rotulo3);
                            tela.add(rotulo4);
                            tela.add(rotulo5);
                            tela.add(rotulo6);
                            tela.add(rotulo7);
                            tela.add(rotulo8);
                            tela.add(rotulo9);
                            tela.add(rotulo10);
                            tela.add(rotulo11);
                            tela.add(rotulo12);
                            tela.add(texto1);
                            tela.add(texto2);
                            tela.add(texto3);
                            tela.add(texto4);
                            tela.add(texto5);
                            tela.add(texto6);
                            tela.add(texto7);
                            tela.add(texto8);
                            tela.add(texto9);
                            tela.add(texto10);
                            tela.add(btn1);
                            tela.add(btn2);
                            tela.add(btn3);
                            tela.add(btn4);
                            tela.add(btn5);
                            tela.add(box1);
                            tela.add(fem);
                            tela.add(mas);
                            setVisible(true);
                            setSize(540,500);
                            setLocationRelativeTo(null);
                            setResizable(false);
    }
    public static void main(String[] args) {
        InterfaceGrafica2 app = new InterfaceGrafica2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
