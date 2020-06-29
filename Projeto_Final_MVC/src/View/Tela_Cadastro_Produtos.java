/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.numeros;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author luish
 */
public class Tela_Cadastro_Produtos extends javax.swing.JFrame {
    private String nome, tipo;
    private int qnts;
    private double valor;

    /**
     * Creates new form Cadastro_Produtos
     */
    public Tela_Cadastro_Produtos() {
        initComponents();
        nome = "";
        tipo = "";
        qnts = 0;
        valor = 0;
        TextField_Valor.setDocument(new numeros());
        TextField_Quantidade.setDocument(new numeros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fundo = new javax.swing.JPanel();
        fundo1 = new View.Images.fundo();
        Label_CadastroProdutos = new javax.swing.JLabel();
        Label_Tipo = new javax.swing.JLabel();
        Label_Valor = new javax.swing.JLabel();
        Label_Nome = new javax.swing.JLabel();
        Label_Quantidade = new javax.swing.JLabel();
        Label_RS = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextField_Nome = new javax.swing.JTextField();
        TextField_Valor = new javax.swing.JTextField();
        TextField_Quantidade = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ComboBox_Tipo = new javax.swing.JComboBox<>();
        Button_Cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        Panel_Fundo.setBackground(new java.awt.Color(51, 51, 51));

        fundo1.setImg(new ImageIcon("src/View/images/Fundo01.png"));

        Label_CadastroProdutos.setBackground(new java.awt.Color(0, 0, 0));
        Label_CadastroProdutos.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        Label_CadastroProdutos.setForeground(new java.awt.Color(0, 0, 0));
        Label_CadastroProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_CadastroProdutos.setText("Cadastro de Produtos");

        Label_Tipo.setBackground(new java.awt.Color(0, 0, 0));
        Label_Tipo.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Label_Tipo.setForeground(new java.awt.Color(0, 0, 0));
        Label_Tipo.setText("Tipo:");

        Label_Valor.setBackground(new java.awt.Color(0, 0, 0));
        Label_Valor.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Label_Valor.setForeground(new java.awt.Color(0, 0, 0));
        Label_Valor.setText("Valor:");

        Label_Nome.setBackground(new java.awt.Color(0, 0, 0));
        Label_Nome.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Label_Nome.setForeground(new java.awt.Color(0, 0, 0));
        Label_Nome.setText("Nome:");

        Label_Quantidade.setBackground(new java.awt.Color(0, 0, 0));
        Label_Quantidade.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Label_Quantidade.setForeground(new java.awt.Color(0, 0, 0));
        Label_Quantidade.setText("Quantidade:");

        Label_RS.setBackground(new java.awt.Color(0, 0, 0));
        Label_RS.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Label_RS.setForeground(new java.awt.Color(0, 0, 0));
        Label_RS.setText("R$:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        ComboBox_Tipo.setForeground(new java.awt.Color(0, 0, 0));
        ComboBox_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suplementos", "Acessórios", "Bebidas" }));

        Button_Cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        Button_Cadastrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Button_Cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        Button_Cadastrar.setText("Cadastrar");
        Button_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundo1Layout = new javax.swing.GroupLayout(fundo1);
        fundo1.setLayout(fundo1Layout);
        fundo1Layout.setHorizontalGroup(
            fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_CadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addComponent(Label_Tipo)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_Nome)
                    .addComponent(TextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Valor)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addComponent(Label_RS)
                        .addGap(6, 6, 6)
                        .addComponent(TextField_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_Quantidade)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addComponent(TextField_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Button_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        fundo1Layout.setVerticalGroup(
            fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_CadastroProdutos)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Label_Tipo))
                    .addComponent(ComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Label_Nome)
                .addGap(6, 6, 6)
                .addComponent(TextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Valor)
                .addGap(6, 6, 6)
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_RS)
                    .addComponent(TextField_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(Label_Quantidade)
                .addGap(6, 6, 6)
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextField_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_FundoLayout = new javax.swing.GroupLayout(Panel_Fundo);
        Panel_Fundo.setLayout(Panel_FundoLayout);
        Panel_FundoLayout.setHorizontalGroup(
            Panel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel_FundoLayout.setVerticalGroup(
            Panel_FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(314, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CadastrarActionPerformed
        // TODO add your handling code here:
        nome = TextField_Nome.getText();
        tipo = ComboBox_Tipo.getSelectedItem().toString();
        qnts = Integer.parseInt(TextField_Quantidade.getText());
        valor = Double.parseDouble(TextField_Valor.getText().replace(",", "."));
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/academia","root","");
            Statement stm = con.createStatement();
            if (stm.executeUpdate("insert into produtos values('"+nome+"','"+tipo+"','"+valor+"','"+qnts+"')")!=0){
                JOptionPane.showMessageDialog(null,"Cadastro realizado","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Erro no cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);

        }
        TextField_Nome.setText("");
        TextField_Valor.setText("");
        TextField_Quantidade.setText("");
    }//GEN-LAST:event_Button_CadastrarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cadastrar;
    private javax.swing.JComboBox<String> ComboBox_Tipo;
    private javax.swing.JLabel Label_CadastroProdutos;
    private javax.swing.JLabel Label_Nome;
    private javax.swing.JLabel Label_Quantidade;
    private javax.swing.JLabel Label_RS;
    private javax.swing.JLabel Label_Tipo;
    private javax.swing.JLabel Label_Valor;
    private javax.swing.JPanel Panel_Fundo;
    private javax.swing.JTextField TextField_Nome;
    private javax.swing.JTextField TextField_Quantidade;
    private javax.swing.JTextField TextField_Valor;
    private View.Images.fundo fundo1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
