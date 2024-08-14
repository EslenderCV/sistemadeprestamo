package com.richardm.sistemadeprestamo;

import com.richardm.entity.guarantor;
import com.richardm.service.Services;
import java.util.Objects;
import javax.swing.JOptionPane;

public class fiadores extends javax.swing.JFrame {
    Services fiador = new Services();
    
    public fiadores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        ID = new javax.swing.JFormattedTextField();
        last1 = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        last2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        ced = new javax.swing.JTextField();
        salary = new javax.swing.JFormattedTextField();
        company = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        position1 = new javax.swing.JTextField();

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);

        setResizable(false);

        jLabel1.setText("ID");

        jLabel2.setText("Empresa");

        jLabel3.setText("Telefono");

        jLabel4.setText("Cedula");

        jLabel5.setText("Direccion");

        jLabel6.setText("Apellido 2");

        jLabel7.setText("Apellido 1");

        jLabel8.setText("Nombre");

        jLabel10.setText("Sexo");

        jLabel11.setText("Sueldo");

        jLabel12.setText("Ocupacion");

        jRadioButton1.setText("M");
        jRadioButton1.setSelected(true);

        jRadioButton2.setText("F");

        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFocusLost(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel8)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel7)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(last1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(last2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel4)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ced, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(position1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton2)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(position1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!(ID.getText().equals("") || Name.getText().equals("") || last1.getText().equals("")
          || last2.getText().equals("") || address.getText().equals("") || ced.getText().equals("")
          || number.getText().equals("") || company.getText().equals("") || position1.getText().equals("")
          || salary.getText().equals(""))){
            int id = Integer.parseInt(ID.getText());
            String name = Name.getText();
            String last = last1.getText();
            String Last2 = last2.getText();
            String add = address.getText();
            String cd = ced.getText();
            String phone = number.getText();
            String compan = company.getText();
            String ocupation = position1.getText();
            Double sal = Double.valueOf(salary.getText());
            boolean gen = true;
            
            if(!jRadioButton1.isSelected()){
                gen = false;
            }
            
            guarantor fiador1 = new guarantor(id, name, last, Last2, add, cd, phone, compan, ocupation, sal, gen);
            guarantor find = fiador.getGuarantor(fiador1.getId());
           
            System.out.println(find);
           
            if(Objects.isNull(find)){
               if(!Objects.isNull(fiador.saveGuarantor(fiador1))){
                   JOptionPane.showMessageDialog(this, "Fiador guardado existosamente!");
               } else {
                   JOptionPane.showMessageDialog(this, "Error inesperado, intente nuevamente!");
               }
            } else {
               if(JOptionPane.showOptionDialog(this,
                    "Fiador ya existe, desea actualizar?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Si", "No"},
                    "Yes") == JOptionPane.YES_OPTION){
                   if(!Objects.isNull(fiador.updateGuarantor(fiador1))){
                       JOptionPane.showMessageDialog(this, "Fiador modificado exitosamente!");
                   } else {
                       JOptionPane.showMessageDialog(this, "Error inesperado, intente nuevamente!");
                   }
               }
            }
           
            ID.setText("");
            Name.setText("");
            last1.setText("");
            last2.setText("");
            address.setText("");
            ced.setText("");
            number.setText("");
            company.setText("");
            position1.setText("");
            salary.setText("");
        } else {
           JOptionPane.showMessageDialog(this, "Ingrese todos los datos necesarios!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusLost
        try{
            int IDfiador = Integer.parseInt(ID.getText());
            
            if(IDfiador > 0){
                guarantor fiador1 = fiador.getGuarantor(IDfiador);
                
                if(!Objects.isNull(fiador1)){
                    JOptionPane.showMessageDialog(this, "Modificando");
                    Name.setText(fiador1.getName());
                    last1.setText(fiador1.getLastName());
                    last2.setText(fiador1.getLast2Name());
                    address.setText(fiador1.getAddress());
                    ced.setText(fiador1.getCed());
                    number.setText(fiador1.getPhone());
                    company.setText(fiador1.getCompany());
                    position1.setText(fiador1.getPosition());
                    salary.setText(Double.toString(fiador1.getSalary()));
                    
                    if(fiador1.isGen()){
                        jRadioButton1.setSelected(true);
                    } else {
                        jRadioButton2.setSelected(true);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Creando");
                    Name.setText("");
                    last1.setText("");
                    last2.setText("");
                    address.setText("");
                    ced.setText("");
                    number.setText("");
                    company.setText("");
                    position1.setText("");
                    salary.setText("");
                    jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                }
            }
        } catch(NumberFormatException e){
            ID.setText("");
        }
        
    }//GEN-LAST:event_IDFocusLost

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

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
            java.util.logging.Logger.getLogger(fiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new fiadores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ced;
    private javax.swing.JTextField company;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last1;
    private javax.swing.JTextField last2;
    private javax.swing.JTextField number;
    private javax.swing.JTextField position1;
    private javax.swing.JFormattedTextField salary;
    // End of variables declaration//GEN-END:variables
}
