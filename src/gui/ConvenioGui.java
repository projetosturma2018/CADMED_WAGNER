
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConvenioGui extends javax.swing.JFrame {

    /**
     * Creates new form ConvenioGui
     */
    public ConvenioGui() {
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

        lblNomeCon = new javax.swing.JLabel();
        txtNomeCon = new javax.swing.JTextField();
        lblIdCon = new javax.swing.JLabel();
        txtIdCon = new javax.swing.JTextField();
        lblIdPac = new javax.swing.JLabel();
        txtIdPac = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jbSalvarCon = new javax.swing.JButton();
        jbEditarCon = new javax.swing.JButton();
        jbExcluirCon = new javax.swing.JButton();
        jbSairCon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeCon.setText("Convênio");

        txtNomeCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeConActionPerformed(evt);
            }
        });

        lblIdCon.setText("Código do Convênio");

        txtIdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConActionPerformed(evt);
            }
        });

        lblIdPac.setText("Código do Paciente");

        lblDesc.setText("Descrição");

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        jbSalvarCon.setText("Salvar");
        jbSalvarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarConActionPerformed(evt);
            }
        });

        jbEditarCon.setText("Editar");
        jbEditarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarConActionPerformed(evt);
            }
        });

        jbExcluirCon.setText("Excluir");
        jbExcluirCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirConActionPerformed(evt);
            }
        });

        jbSairCon.setText("Sair");
        jbSairCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdCon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addComponent(lblIdPac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSalvarCon)
                .addGap(35, 35, 35)
                .addComponent(jbEditarCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jbExcluirCon)
                .addGap(47, 47, 47)
                .addComponent(jbSairCon)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNomeCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCon)
                    .addComponent(lblIdPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(lblDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarCon)
                    .addComponent(jbEditarCon)
                    .addComponent(jbExcluirCon)
                    .addComponent(jbSairCon))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeConActionPerformed

    private void txtIdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConActionPerformed

    private void jbSairConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairConActionPerformed
            
        System.exit(0);        
    }//GEN-LAST:event_jbSairConActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void jbSalvarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarConActionPerformed
        
       try {
            
            Class.forName("com.postgres.jdbc.Driver");
 
           
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CADMED", "postgres", "postgres");
 
            
            java.sql.Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO convenio (id_convenio,nome_convenio,id_paciente, descricao) VALUES ("
                    + this.txtIdCon.getText() + "'"
                    + this.txtNomeCon.getText() + "','"
                    + this.txtIdPac.getText() + "')"
                    + this.txtDesc.getText()+ "')") ;                              
 
            JOptionPane.showMessageDialog(rootPane, "Convenio cadastrado");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Driver não encontrado");
        }
    }//GEN-LAST:event_jbSalvarConActionPerformed

    private void jbEditarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarConActionPerformed
        
        try {
            
            Class.forName("com.postgres.jdbc.Driver");
            
            
        
           Connection  conexao = DriverManager.getConnection("jdbc:postgresql: //localhost:5432/CADMED", "postgres", "postgres");
            
            
           
            java.sql.Statement st = conexao.createStatement();
            st.executeUpdate("' WHERE id = ?'"
                    + "UPDATE convenio SET id_convenio ='"
                    + this.txtIdCon.getText() + "',nome _convenio ='"
                    + this.txtNomeCon.getText() + "',id_paciente ='"
                    + this.txtIdPac.getText() + "',descricao ='");
            JOptionPane.showMessageDialog(rootPane, "Atualizado");
       
        }catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
  
    }//GEN-LAST:event_jbEditarConActionPerformed

    private void jbExcluirConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirConActionPerformed
     
   try {
            
            Class.forName("com.mysql.jdbc.Driver");
 
           
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?zeroDateTimeBehavior=convertToNull", "", "");
 
            
            java.sql.Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM convenio WHERE id= ?'");
            JOptionPane.showMessageDialog(rootPane, "Excuído");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "Exclusão feita com sucesso");
        }      





    }//GEN-LAST:event_jbExcluirConActionPerformed

   
  
    /**
     *
     * @param args
     */
     public static void main(String args[]) { 
           
         java.awt.EventQueue.invokeLater(() ->{
            new ConvenioGui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbEditarCon;
    private javax.swing.JButton jbExcluirCon;
    private javax.swing.JButton jbSairCon;
    private javax.swing.JButton jbSalvarCon;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblIdCon;
    private javax.swing.JLabel lblIdPac;
    private javax.swing.JLabel lblNomeCon;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIdCon;
    private javax.swing.JTextField txtIdPac;
    private javax.swing.JTextField txtNomeCon;
    // End of variables declaration//GEN-END:variables
}
