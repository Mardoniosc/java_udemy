/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobentech01.views;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import projetobentech01.model.CadastroCliente;
import projetobentech01.model.CadastroClienteConexao;
import projetobentech01.conexao.Conexao;

/**
 *
 * @author p772920
 */
public class FrmAtualizarCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrmAtualizarCadastro
     */
    public FrmAtualizarCadastro() {
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

        jpnCadastroClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        rdbSexoMasculino = new javax.swing.JRadioButton();
        rdbSexoFeminino = new javax.swing.JRadioButton();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        btnAtualizar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        lblFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualiza dados");
        setMaximumSize(new java.awt.Dimension(657, 472));
        setMinimumSize(new java.awt.Dimension(657, 472));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpnCadastroClientes.setBackground(new java.awt.Color(51, 51, 51));
        jpnCadastroClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo cliente: ");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Atualizar Cliente");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome: ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Idade:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Nascimento:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sobrenome:");

        txtCodigoCliente.setEditable(false);
        txtCodigoCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtCodigoCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCodigoCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoCliente.setBorder(null);

        txtNome.setBackground(new java.awt.Color(153, 153, 153));
        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);

        txtSobreNome.setBackground(new java.awt.Color(153, 153, 153));
        txtSobreNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSobreNome.setForeground(new java.awt.Color(255, 255, 255));
        txtSobreNome.setBorder(null);

        txtIdade.setBackground(new java.awt.Color(153, 153, 153));
        txtIdade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(255, 255, 255));
        txtIdade.setBorder(null);

        rdbSexoMasculino.setBackground(new java.awt.Color(51, 51, 51));
        rdbSexoMasculino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdbSexoMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rdbSexoMasculino.setText("Masculino");

        rdbSexoFeminino.setBackground(new java.awt.Color(51, 51, 51));
        rdbSexoFeminino.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdbSexoFeminino.setForeground(new java.awt.Color(255, 255, 255));
        rdbSexoFeminino.setText("Feminino");

        txtDataNascimento.setBackground(new java.awt.Color(153, 153, 153));
        txtDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAtualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(null);
        btnAtualizar.setFocusable(false);
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseExited(evt);
            }
        });
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        txtCPF.setBackground(new java.awt.Color(153, 153, 153));
        txtCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFechar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(255, 255, 255));
        lblFechar.setText("X");
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnCadastroClientesLayout = new javax.swing.GroupLayout(jpnCadastroClientes);
        jpnCadastroClientes.setLayout(jpnCadastroClientesLayout);
        jpnCadastroClientesLayout.setHorizontalGroup(
            jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroClientesLayout.createSequentialGroup()
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCadastroClientesLayout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnCadastroClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpnCadastroClientesLayout.createSequentialGroup()
                                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(39, 39, 39)
                                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnCadastroClientesLayout.createSequentialGroup()
                                        .addComponent(rdbSexoMasculino)
                                        .addGap(170, 170, 170)
                                        .addComponent(rdbSexoFeminino))
                                    .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFechar)
                                        .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSobreNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                            .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnCadastroClientesLayout.setVerticalGroup(
            jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblFechar))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jpnCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbSexoMasculino)
                        .addComponent(rdbSexoFeminino)))
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpnCadastroClientes, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseEntered
        // Ao passar o mouse em cima
        btnAtualizar.setBackground(Color.red);
    }//GEN-LAST:event_btnAtualizarMouseEntered

    private void btnAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseExited
        // ao sair o mouse de cima do botão
        btnAtualizar.setBackground(new Color(102, 153, 255));
    }//GEN-LAST:event_btnAtualizarMouseExited

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
          //Pegar os dados dos componentes e jogar na classe CadastroCliente

        CadastroCliente.nome_cliente = txtNome.getText();
        CadastroCliente.sobrenome_cliente = txtSobreNome.getText();
        CadastroCliente.CPF_cliente = txtCPF.getText();
        CadastroCliente.idade_cliente = Integer.parseInt(txtIdade.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date date = sdf.parse(txtDataNascimento.getText());
            java.sql.Date dataSql = new java.sql.Date(date.getTime());
            CadastroCliente.data_nascimento_cliente = dataSql;
        } catch (ParseException ex){
            Logger.getLogger(FrmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rdbSexoMasculino.isSelected() == true){
            CadastroCliente.sexo_cliente = "M";
        }
        else{
            CadastroCliente.sexo_cliente = "F";
        }
        CadastroCliente.codigo_cliente = txtCodigoCliente.getText();
        
        atualizarDados();
        
        JOptionPane.showMessageDialog(null, "Dados do cliente atualizado com Sucesso!");
        
        this.dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Buscar os dados quando iniciar o formulário
        carregarJtable();
        
    }//GEN-LAST:event_formWindowOpened

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        // Fechar a aplicação quando clicar o mouse
        this.dispose();
    }//GEN-LAST:event_lblFecharMouseClicked

    //Metodo para buscar os dados selecionado no FrmMostrarCadastroCliente
    public void carregarJtable(){
        Connection conn = null;
        ResultSet rs = null;
        conn = Conexao.getConnection();//conectar ao banco
        String sql = "SELECT * FROM tb_cadastro where id_tb_cadastro = '"+ CadastroCliente.id_tb_cadastro +"'";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            rs = stmt.executeQuery();
            
            rs.next();
            
            txtCodigoCliente.setText(rs.getString("codigo_cliente"));
            txtNome.setText(rs.getString("nome"));
            txtCPF.setText(rs.getString("CPF"));
            txtSobreNome.setText(rs.getString("sobrenome"));
            txtIdade.setText(rs.getString("idade"));
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            txtDataNascimento.setText(data.format(rs.getDate("data_nascimento")));
           
            String sexoCliente = rs.getString("sexo");
            if (sexoCliente.equals("M")){
                rdbSexoMasculino.setSelected(true);
            }
            else{
                rdbSexoFeminino.setSelected(true);
            }
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados.\n Erro: " + ex);
        }
    }
    
    public void atualizarDados(){
        
        Connection conn = null;
        
        conn = Conexao.getConnection();
        
        String sql = "";
        
        String SQL = "UPDATE tb_cadastro "
                     + "SET nome = ?, sobrenome = ?, idade = ?, data_nascimento = ?, "
                     + "sexo = ?, CPF = ? "
                     + "WHERE codigo_cliente = ?;";

        PreparedStatement stmt = null;  

    
    try {
        
        stmt = conn.prepareStatement(SQL);
        stmt.setString(1, CadastroCliente.nome_cliente);
        stmt.setString(2, CadastroCliente.sobrenome_cliente);
        stmt.setInt(3, CadastroCliente.idade_cliente);
        stmt.setDate(4, CadastroCliente.data_nascimento_cliente);
        stmt.setString(5, CadastroCliente.sexo_cliente);
        stmt.setString(6, CadastroCliente.CPF_cliente);
        stmt.setString(7, CadastroCliente.codigo_cliente);

        
        stmt.executeUpdate();
        

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados.\n Erro: " + ex);
    }
    finally{
        Conexao.fecharConexao(conn, stmt);
    }
    }
    public void limparCampos(){
        txtNome.setText("");
        txtSobreNome.setText("");
        txtCodigoCliente.setText("");
        txtIdade.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        rdbSexoMasculino.setSelected(true);
    }
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
            java.util.logging.Logger.getLogger(FrmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAtualizarCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpnCadastroClientes;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JRadioButton rdbSexoFeminino;
    private javax.swing.JRadioButton rdbSexoMasculino;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobreNome;
    // End of variables declaration//GEN-END:variables
}
