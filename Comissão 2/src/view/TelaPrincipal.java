/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import principal2.Vendedor1;
import principal2.ConversorNumeros1;
import principal2.Principal2;


public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldVENDA = new javax.swing.JTextField();
        jButtonCA = new javax.swing.JButton();
        jButtonCance = new javax.swing.JButton();
        jTextFieldVE = new javax.swing.JTextField();
        jLabelNOMEVE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSAL = new javax.swing.JTextField();
        jButtonCad = new javax.swing.JButton();
        jLabelSALVE = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCriar = new javax.swing.JMenu();
        jMenuCalCriar = new javax.swing.JMenuItem();
        jMenuExi2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuOut2 = new javax.swing.JMenuItem();
        jMenuCalc = new javax.swing.JMenu();
        jMenuExi = new javax.swing.JMenu();
        jMenuOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaPrincipal");
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        jTextFieldVENDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldVENDAKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldVENDA);
        jTextFieldVENDA.setBounds(20, 400, 200, 30);
        jTextFieldVENDA.setVisible(false);

        jButtonCA.setText("Calcular");
        jButtonCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCAActionPerformed(evt);
            }
        });
        jButtonCA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCAKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonCA);
        jButtonCA.setBounds(70, 440, 90, 30);
        jButtonCA.setVisible(false);

        jButtonCance.setText("Cancelar");
        jButtonCance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanceActionPerformed(evt);
            }
        });
        jButtonCance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCanceKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonCance);
        jButtonCance.setBounds(70, 480, 90, 30);
        jButtonCance.setVisible(false);

        jTextFieldVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVEActionPerformed(evt);
            }
        });
        jTextFieldVE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldVEKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldVE);
        jTextFieldVE.setBounds(20, 320, 200, 30);
        jTextFieldVE.setVisible(false);

        jLabelNOMEVE.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNOMEVE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelNOMEVE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNOMEVE.setText("NOME DO VENDEDOR");
        jPanel1.add(jLabelNOMEVE);
        jLabelNOMEVE.setBounds(20, 270, 230, 60);
        jLabelNOMEVE.setVisible(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedores.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 40, 620, 500);

        jTextFieldSAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSALKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldSAL);
        jTextFieldSAL.setBounds(20, 400, 200, 30);
        jTextFieldSAL.setVisible(false);

        jButtonCad.setText("Cadastrar");
        jButtonCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadActionPerformed(evt);
            }
        });
        jButtonCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCadKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonCad);
        jButtonCad.setBounds(70, 440, 90, 30);
        jButtonCad.setVisible(false);

        jLabelSALVE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSALVE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSALVE.setText("SAL??RIO BASE");
        jPanel1.add(jLabelSALVE);
        jLabelSALVE.setBounds(20, 360, 200, 40);
        jLabelSALVE.setVisible(false);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -20, 720, 580);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");

        jMenuCriar.setText("In??cio");
        jMenuCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCriarMouseClicked(evt);
            }
        });

        jMenuCalCriar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCalCriar.setText("Criar Vendedor");
        jMenuCalCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCalCriarMouseClicked(evt);
            }
        });
        jMenuCalCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCalCriarActionPerformed(evt);
            }
        });
        jMenuCriar.add(jMenuCalCriar);

        jMenuExi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuExi2.setText("Exibir Vendedor");
        jMenuExi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExi2ActionPerformed(evt);
            }
        });
        jMenuCriar.add(jMenuExi2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Voltar Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCriar.add(jMenuItem1);

        jMenuOut2.setText("Sair");
        jMenuOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOut2ActionPerformed(evt);
            }
        });
        jMenuCriar.add(jMenuOut2);

        jMenuBar1.add(jMenuCriar);

        jMenuCalc.setText("Calcular Comiss??o");
        jMenuCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCalcMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCalc);

        jMenuExi.setText("Exibir Vendedor");
        jMenuExi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExiMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuExi);

        jMenuOut.setText("Sair");
        jMenuOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuOut);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(731, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVEActionPerformed

    private void jButtonCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadActionPerformed
        Vendedor1 v1 = new Vendedor1();
        ConversorNumeros1 c1 = new ConversorNumeros1();
        DecimalFormat deci = new DecimalFormat("0.00");
        
        nome = jTextFieldVE.getText();
        sal1 = c1.stringToDouble(jTextFieldSAL.getText());
        
        jTextFieldSAL.setText(null);
        jTextFieldVE.setText(null);
        
        JOptionPane.showMessageDialog(null, " Nome: " + nome + "\n Salario: R$ "
        + deci.format(sal1));
        
    }//GEN-LAST:event_jButtonCadActionPerformed

    private void jButtonCanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanceActionPerformed
        jLabelNOMEVE.setVisible(false);
        jLabelSALVE.setVisible(false);
        jTextFieldSAL.setVisible(false);
        jTextFieldVE.setVisible(false);
        jButtonCad.setVisible(false);
        jButtonCance.setVisible(false);
        jButtonCA.setVisible(false);
        jTextFieldVENDA.setVisible(false);
        
        jTextFieldSAL.setText(null);
        jTextFieldVE.setText(null);
        jTextFieldVENDA.setText(null);
    }//GEN-LAST:event_jButtonCanceActionPerformed

    private void jMenuCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarMouseClicked
        
    }//GEN-LAST:event_jMenuCriarMouseClicked

    private void jMenuCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCalcMouseClicked
        jButtonCance.setVisible(true);
        jButtonCad.setVisible(false);
        jTextFieldSAL.setVisible(false);
        jTextFieldVENDA.setVisible(true);
        jLabelNOMEVE.setVisible(false);
        jTextFieldVE.setVisible(false);
        jButtonCA.setVisible(true);
        jLabelSALVE.setVisible(true);
        jLabelSALVE.setText("VALOR VENDIDO");
        jTextFieldVENDA.requestFocus();

        
    }//GEN-LAST:event_jMenuCalcMouseClicked

    private void jMenuOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuOutMouseClicked

    private void jMenuExi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExi2ActionPerformed
        Comi2 c2 = new Comi2();
        ConversorNumeros1 c1 = new ConversorNumeros1();
        DecimalFormat deci2 = new DecimalFormat("0.00");
        c2.setVisible(true);
        c2.jButton1.requestFocus();
        String.valueOf(sal1);
        String.valueOf(result);
        String.valueOf(vendido);
        
        c2.jLabel3.setText(nome);
        c2.jLabel4.setText("" + deci2.format(sal1));
        c2.jLabel7.setText("" + deci2.format(result));
        c2.jLabel12.setText("" + deci2.format(vendido));
    }//GEN-LAST:event_jMenuExi2ActionPerformed

    private void jMenuExiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExiMouseClicked
        Comi2 c2 = new Comi2();
        ConversorNumeros1 c1 = new ConversorNumeros1();
        DecimalFormat deci2 = new DecimalFormat("0.00");
        c2.setVisible(true);
        c2.jButton1.requestFocus();
        String.valueOf(sal1);
        String.valueOf(result);
        String.valueOf(vendido);
        
        c2.jLabel3.setText(nome);
        c2.jLabel4.setText("" + deci2.format(sal1));
        c2.jLabel7.setText("" + deci2.format(result));
        c2.jLabel12.setText("" + deci2.format(vendido));
        
        
        
    }//GEN-LAST:event_jMenuExiMouseClicked

    private void jButtonCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCAActionPerformed
        Vendedor1 v1 = new Vendedor1();
        ConversorNumeros1 c1 = new ConversorNumeros1();
        DecimalFormat deci = new DecimalFormat("0.00"); 
        

        v1.setSalarioBase(sal1);
        vendido = c1.stringToDouble(jTextFieldVENDA.getText());
        result = v1.calcularComiss??o(vendido);

        JOptionPane.showMessageDialog(null, " Comiss??o: R$ " + deci.format(result));
        jTextFieldVENDA.setText(null);
    }//GEN-LAST:event_jButtonCAActionPerformed

    private void jMenuCalCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCalCriarMouseClicked
        
    }//GEN-LAST:event_jMenuCalCriarMouseClicked

    private void jMenuCalCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCalCriarActionPerformed
        jLabelSALVE.setText("SALARIO BASE");
        jLabelNOMEVE.setVisible(true);
        jLabelSALVE.setVisible(true);
        jTextFieldSAL.setVisible(true);
        jTextFieldVE.setVisible(true);
        jButtonCA.setVisible(false);
        jTextFieldVENDA.setVisible(false);
        jButtonCad.setVisible(true);
        jButtonCance.setVisible(true);
        jTextFieldVE.requestFocus();
        
    }//GEN-LAST:event_jMenuCalCriarActionPerformed

    private void jMenuOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOut2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuOut2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        TelaLogin t2 = new TelaLogin();
        t2.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextFieldVEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVEKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            jTextFieldSAL.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldVEKeyPressed

    private void jTextFieldSALKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSALKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            
            jButtonCad.requestFocus();
        } else {
            if (evt.getKeyCode() == evt.VK_UP){
                jTextFieldVE.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextFieldSALKeyPressed

    private void jButtonCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            Vendedor1 v1 = new Vendedor1();
            ConversorNumeros1 c1 = new ConversorNumeros1();
            DecimalFormat deci = new DecimalFormat("0.00");
        
            nome = jTextFieldVE.getText();
            sal1 = c1.stringToDouble(jTextFieldSAL.getText());
        
            jTextFieldSAL.setText(null);
            jTextFieldVE.setText(null);
        
            JOptionPane.showMessageDialog(null, " Nome: " + nome + "\n Salario: R$ "
            + deci.format(sal1)); 
        }else{
            if (evt.getKeyCode() == evt.VK_UP){
                jTextFieldSAL.requestFocus();
            } else {
                if (evt.getKeyCode() == evt.VK_DOWN){
                    jButtonCance.requestFocus();
                }
            }
        }
        
           
    }//GEN-LAST:event_jButtonCadKeyPressed

    private void jTextFieldVENDAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVENDAKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
           jButtonCA.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldVENDAKeyPressed

    private void jButtonCAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCAKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            Vendedor1 v1 = new Vendedor1();
            ConversorNumeros1 c1 = new ConversorNumeros1();
            DecimalFormat deci = new DecimalFormat("0.00"); 
        
            v1.setSalarioBase(sal1);
            vendido = c1.stringToDouble(jTextFieldVENDA.getText());
            result = v1.calcularComiss??o(vendido);

        JOptionPane.showMessageDialog(null, " Comiss??o: R$ " + deci.format(result));
        jTextFieldVENDA.setText(null);
        } else {
            if (evt.getKeyCode() == evt.VK_DOWN){
                jButtonCance.requestFocus();
            } else{
                if (evt.getKeyCode() == evt.VK_UP){
                    jTextFieldVENDA.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_jButtonCAKeyPressed

    private void jButtonCanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCanceKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
          jLabelNOMEVE.setVisible(false);
          jLabelSALVE.setVisible(false);
          jTextFieldSAL.setVisible(false);
          jTextFieldVE.setVisible(false);
          jButtonCad.setVisible(false);
          jButtonCance.setVisible(false);
          jButtonCA.setVisible(false);
          jTextFieldVENDA.setVisible(false);
    
          jTextFieldSAL.setText(null);
          jTextFieldVE.setText(null);
          jTextFieldVENDA.setText(null);
        } else {
            if (evt.getKeyCode() == evt.VK_UP){
                jButtonCA.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonCanceKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                Vendedor1 v1 = new Vendedor1();
                
            }
        });
        
       
    }
        
    public double sal1;
    public String nome;
    public double result;
    public double vendido;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCA;
    private javax.swing.JButton jButtonCad;
    private javax.swing.JButton jButtonCance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNOMEVE;
    private javax.swing.JLabel jLabelSALVE;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCalCriar;
    private javax.swing.JMenu jMenuCalc;
    private javax.swing.JMenu jMenuCriar;
    private javax.swing.JMenu jMenuExi;
    private javax.swing.JMenuItem jMenuExi2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuOut;
    private javax.swing.JMenuItem jMenuOut2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldSAL;
    private javax.swing.JTextField jTextFieldVE;
    private javax.swing.JTextField jTextFieldVENDA;
    // End of variables declaration//GEN-END:variables
}
