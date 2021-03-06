/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;
import Controller.Cliente;
import Model.ClienteBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author luish
 */
public class Tela_Clientes extends javax.swing.JFrame {
    private ClienteBD clienteBD;
    private Cliente cliente;
    private DefaultTableModel modelo;
    private String alterar;
    private JTable tabela;
    private String nome;
    private String endereco;
    private String telefone;
    private int matricula;
    private String DadosMatricula;

    /**
     * Creates new form Tela_Clientes
     */
    public Tela_Clientes() {
        initComponents();
        initComponents();
        clienteBD = new ClienteBD();
        cliente = new Cliente();
        jTextFieldNome.setEnabled(false);
        jTextFieldData.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldAltura.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldPeso.setEnabled(false);
        jTextFieldCardiaco.setEnabled(false);
        jTextFieldRespiratorio.setEnabled(false);
        jTextFieldLuta.setEnabled(false);
        jTextFieldTreino.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonPagamento.setEnabled(false);
    }
    
     public void esconderTextFild(){
        jTextFieldNome.setEnabled(false);
        jTextFieldData.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldAltura.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldPeso.setEnabled(false);
        jTextFieldCardiaco.setEnabled(false);
        jTextFieldRespiratorio.setEnabled(false);
        jTextFieldLuta.setEnabled(false);
        
        jButtonEditar.setEnabled(false);
        //jButtonAlterar.setEnabled(false);
        //jButtonPagamento.setEnabled(false);
       
        
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
        fundo1 = new View.Images.fundo();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldCardiaco = new javax.swing.JTextField();
        jTextFieldRespiratorio = new javax.swing.JTextField();
        jTextFieldLuta = new javax.swing.JTextField();
        jTextFieldTreino = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonEditar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonPagamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        fundo1.setImg(new ImageIcon("src/View/images/Fundo01.png"));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefone:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-mail:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Endereço:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Altura:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cardiaco:");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Respiratório:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Luta:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Treino:");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jTextFieldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoActionPerformed(evt);
            }
        });

        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }
        });

        jTextFieldCardiaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCardiacoActionPerformed(evt);
            }
        });

        jTextFieldRespiratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespiratorioActionPerformed(evt);
            }
        });

        jTextFieldLuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLutaActionPerformed(evt);
            }
        });

        jTextFieldTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTreinoActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAlterar.setText("Editar informações");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Consultar Clientes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonPagamento.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPagamento.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPagamento.setText("Pagamentos");
        jButtonPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagamentoActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout fundo1Layout = new javax.swing.GroupLayout(fundo1);
        fundo1.setLayout(fundo1Layout);
        fundo1Layout.setHorizontalGroup(
            fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo1Layout.createSequentialGroup()
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(jLabel8))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(590, 590, 590)
                        .addComponent(jTextFieldCardiaco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel10)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel11))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(641, 641, 641)
                        .addComponent(jTextFieldLuta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(523, 523, 523)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jLabel9))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jTextFieldRespiratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(628, 628, 628)
                        .addComponent(jButtonPagamento))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel6))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButtonAlterar))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(jTextFieldTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(jLabel12))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(579, 579, 579)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 124, Short.MAX_VALUE))
        );
        fundo1Layout.setVerticalGroup(
            fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo1Layout.createSequentialGroup()
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundo1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addComponent(jTextFieldCardiaco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldLuta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jTextFieldRespiratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jButtonPagamento))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel7))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jButtonAlterar))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jTextFieldTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel12))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(764, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesoActionPerformed

    private void jTextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaActionPerformed

    private void jTextFieldCardiacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCardiacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCardiacoActionPerformed

    private void jTextFieldRespiratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespiratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespiratorioActionPerformed

    private void jTextFieldLutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLutaActionPerformed

    private void jTextFieldTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTreinoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        cliente.setNome(jTextFieldNome.getText());
        cliente.setEmail(jTextFieldEmail.getText());
        cliente.setEndereco(jTextFieldEndereco.getText());
        cliente.setTelefone(jTextFieldTelefone.getText());
        cliente.setData(jTextFieldData.getText());
        cliente.setPeso(jTextFieldPeso.getText());
        cliente.setAltura(jTextFieldAltura.getText());
        cliente.setLuta(jTextFieldLuta.getText());
        cliente.setCardiaco(jTextFieldCardiaco.getText());
        cliente.setRespiratorio(jTextFieldRespiratorio.getText());
        cliente.setTipoTreino(jTextFieldTreino.getText());
        cliente.setMatricula(Integer.parseInt(DadosMatricula));
        
        try {
            clienteBD.atualizarCliente(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentoActionPerformed
        // TODO add your handling code here:3
        String desc = null;
        String nome = null;
        
        try
            {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/academia","root","");
           Statement stm = con.createStatement();
           ResultSet res = stm.executeQuery("Select * from informacoespessoais Where Matricula = "+DadosMatricula+" ");
           
           
           while(res.next())
           {
               
               desc = (res.getString("Desconto"));
               nome = (res.getString("Nome"));
               
               
         }
           
                      
       }
       catch(ClassNotFoundException e)
       {
           JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
       }
        JOptionPane.showMessageDialog(null,nome+" fez "+desc+" indicações" ,"Indicações",JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_jButtonPagamentoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try{

            DadosMatricula = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/academia","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("Select * from informacoespessoais where Matricula = "+DadosMatricula+" ");

            while(res.next())
            {

                jTextFieldNome.setText(res.getString("Nome"));
                jTextFieldAltura.setText(res.getString("Altura"));
                jTextFieldPeso.setText(res.getString("Peso"));
                jTextFieldEndereco.setText(res.getString("Endereço"));
                jTextFieldCardiaco.setText(res.getString("Cardiaco"));
                jTextFieldRespiratorio.setText(res.getString("Respiratorio"));
                jTextFieldLuta.setText(res.getString("Luta"));
                jTextFieldData.setText(res.getString("Data"));
                jTextFieldTreino.setText(res.getString("Treino"));
                jTextFieldEmail.setText(res.getString("Email"));
                jTextFieldTelefone.setText(res.getString("Telefone"));
                jButtonAlterar.setEnabled(true);
                jButtonEditar.setEnabled(true);
                jButtonPagamento.setEnabled(true);
                cliente.setNome(jTextFieldNome.getText());
                cliente.setAltura(jTextFieldAltura.getText());
                cliente.setPeso(jTextFieldPeso.getText());
                cliente.setEndereco(jTextFieldEndereco.getText());
                cliente.setCardiaco(jTextFieldCardiaco.getText());
                cliente.setRespiratorio(jTextFieldRespiratorio.getText());
                cliente.setTipoTreino(jTextFieldTreino.getText());
                cliente.setEmail(jTextFieldEmail.getText());
                cliente.setTelefone(jTextFieldTelefone.getText());
                cliente.setData(jTextFieldData.getText());
                cliente.setLuta(jTextFieldLuta.getText());

                esconderTextFild();
            }

        }catch(Exception  e){

        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/academia","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("Select * from informacoespessoais ");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            jTable1.setRowSorter(new TableRowSorter(model));
            model.setNumRows(0);
            
            
             
                 while(res.next())
            {
                
                    nome = (res.getString("Nome"));
                endereco = res.getString("Endereço");
                telefone = res.getString("Telefone");
                matricula = res.getInt("Matricula");
                model.addRow(new Object[]{matricula, nome,endereco,telefone});
                
                
            }
             
            

        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(true);
        jTextFieldData.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldPeso.setEnabled(true);
        jTextFieldAltura.setEnabled(true);
        jTextFieldCardiaco.setEnabled(true);
        jTextFieldRespiratorio.setEnabled(true);
        jTextFieldTreino.setEnabled(true);
        jTextFieldLuta.setEnabled(true);
        jButtonEditar.setEnabled(true);
        
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Images.fundo fundo1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldCardiaco;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldLuta;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldRespiratorio;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTreino;
    // End of variables declaration//GEN-END:variables
}
