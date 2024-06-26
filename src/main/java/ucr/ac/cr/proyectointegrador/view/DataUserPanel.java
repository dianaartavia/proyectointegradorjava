/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.view;

import ucr.ac.cr.proyectointegrador.model.User;

/**
 *
 * @author familiacr
 */
public class DataUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form DataUserPanel
     */
    public DataUserPanel() {
        initComponents();
    }

    public int getId() {
        return Integer.parseInt(this.txtId.getText());
    }

    public User getUser() {
        return new User(Integer.parseInt(this.txtId.getText()),
                this.txtName.getText(),
                this.txtUsername.getText(),
                this.jpPassword.getText(),
                this.txaDescription.getText(),
                this.cbUserType.getSelectedItem().toString());
    }

    public void setUser(User user) {
        this.txtId.setText(Integer.toString(user.getId()));
        this.txtName.setText(user.getName());
        this.txtUsername.setText(user.getUserName());
        this.jpPassword.setText(user.getPassword());
        this.txaDescription.setText(user.getDescription());
        this.cbUserType.setSelectedItem(user.getUserType());
    }

    public void clean() {
        this.txtId.setText("");
        this.txtName.setText("");
        this.txtUsername.setText("");
        this.jpPassword.setText("");
        this.txaDescription.setText("");
        this.cbUserType.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTel = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        cbUserType = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtLastNames = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jpPassword = new javax.swing.JPasswordField();
        Text = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 650, 40));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 650, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txaDescription.setRows(5);
        txaDescription.setBorder(null);
        jScrollPane1.setViewportView(txaDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 650, 60));

        cbUserType.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select item", "Administrator", "Student", "Career coordinator", "Asistent", "Teacher" }));
        add(cbUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 650, 60));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 650, 40));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 650, 40));

        txtLastNames.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtLastNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 650, 40));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 650, 40));

        jpPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jpPassword.setBorder(null);
        add(jpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 650, 40));

        Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/textUser.png"))); // NOI18N
        add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 780, 690));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text;
    private javax.swing.JComboBox<String> cbUserType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastNames;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
