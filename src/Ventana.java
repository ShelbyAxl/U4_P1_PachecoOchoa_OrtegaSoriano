
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Ventana extends javax.swing.JFrame {

    DataBase mySQL = new DataBase();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        
        model = (DefaultTableModel)tblData.getModel();
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCreate = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtExistence = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlReadNDelete = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pnlUpdate = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNameUp = new javax.swing.JTextField();
        txtPriceUp = new javax.swing.JTextField();
        txtExistenceUp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Precio:");

        jLabel3.setText("Existencia:");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setText("INSERTAR DATOS");

        javax.swing.GroupLayout pnlCreateLayout = new javax.swing.GroupLayout(pnlCreate);
        pnlCreate.setLayout(pnlCreateLayout);
        pnlCreateLayout.setHorizontalGroup(
            pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(74, 74, 74))
            .addGroup(pnlCreateLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExistence, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlCreateLayout.setVerticalGroup(
            pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExistence, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CREATE", pnlCreate);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Existencia"
            }
        ));
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setPreferredWidth(2);
            tblData.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblData.getColumnModel().getColumn(2).setPreferredWidth(25);
            tblData.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReadNDeleteLayout = new javax.swing.GroupLayout(pnlReadNDelete);
        pnlReadNDelete.setLayout(pnlReadNDeleteLayout);
        pnlReadNDeleteLayout.setHorizontalGroup(
            pnlReadNDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReadNDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlReadNDeleteLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        pnlReadNDeleteLayout.setVerticalGroup(
            pnlReadNDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReadNDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("READ AND DELETE", pnlReadNDelete);

        jLabel5.setText("ID:");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Existencia:");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnID.setText("OK");
        btnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUpdateLayout = new javax.swing.GroupLayout(pnlUpdate);
        pnlUpdate.setLayout(pnlUpdateLayout);
        pnlUpdateLayout.setHorizontalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNameUp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlUpdateLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtExistenceUp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPriceUp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate)
                            .addComponent(btnCancel)))
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnID)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUpdateLayout.setVerticalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnID))
                        .addGap(29, 29, 29)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameUp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPriceUp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExistenceUp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UPDATE", pnlUpdate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        Producto pro = new Producto(txtName.getText(), txtPrice.getText(), txtExistence.getText());
        boolean pase = mySQL.Create(pro);
        showMessageDialog(null, pase ? "Datos guardados con exito!" : "¡Hubo un error durante el guardado!");
        if(pase)refresh();
    }//GEN-LAST:event_btnOKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tblData.getSelectedRow();
        if(row == -1){
            showMessageDialog(this,"Error, seleccione el renglón a eliminar");
            return;
        }
        int option = showConfirmDialog(this,"Esta seguro de que desea eliminar a " + model.getValueAt(row, 1).toString() + "?");
        if(option == 0){
            if(mySQL.delete(model.getValueAt(row, 0).toString())){            
                refresh();  
                showMessageDialog(this,"Dato Eliminado!");
            }
            else showMessageDialog(this,"Error, el dato no se pudo borrar!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDActionPerformed
        String id = txtID.getText();
        
        Producto pro = mySQL.queryID(id);
        if(pro != null){
            txtNameUp.setText(pro.nombre);
            txtPriceUp.setText(pro.precio);
            txtExistenceUp.setText(pro.existencia);

            txtID.setEditable(false);
        }
        else showMessageDialog(this,"Error, el dato no se pudo encontrar!");
    }//GEN-LAST:event_btnIDActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Producto pro = new Producto(txtNameUp.getText(), txtPriceUp.getText(), txtExistence.getText());
        pro.id = Integer.parseInt(txtID.getText());
        if(mySQL.update(pro)){
            refresh();
            txtID.setEditable(true);
            JOptionPane.showMessageDialog(this,"¡Dato Actualizado correctamente!");
        }
        else JOptionPane.showMessageDialog(this,"¡Error! el dato no se actualizó");
        
        txtID.setEditable(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        refresh();
    }//GEN-LAST:event_btnCancelActionPerformed

    public void refresh(){
        txtName.setText("");
        txtPrice.setText("");
        txtExistence.setText("");
        
        txtNameUp.setText("");
        txtPriceUp.setText("");
        txtExistenceUp.setText("");
        
        txtID.setEditable(true);
        
        ArrayList<String[]> lista = mySQL.Read();
        if(lista.isEmpty())return;
        
        for(int j=0; j < tblData.getRowCount(); j++)model.removeRow(j--);
        
        for(int i = 0; i < lista.size(); i++)model.addRow(lista.get(i));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(UnsupportedLookAndFeelException e){
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnID;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlCreate;
    private javax.swing.JPanel pnlReadNDelete;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtExistence;
    private javax.swing.JTextField txtExistenceUp;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameUp;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceUp;
    // End of variables declaration//GEN-END:variables
}
