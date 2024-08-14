package com.richardm.sistemadeprestamo;

import com.richardm.entity.customer;
import com.richardm.entity.fee;
import com.richardm.entity.guarantee;
import com.richardm.entity.guarantor;
import com.richardm.entity.loan;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;
import com.richardm.service.Services;
import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class prestamos extends javax.swing.JFrame {
    Services prestamos = new Services();
    JFileChooser chooser;
    File file; 
    
    public prestamos() {
        initComponents();
        
        HashMap<Integer, customer> clientes = prestamos.getAllCustomers();
        HashMap<Integer, guarantor> fiadores = prestamos.getAllGuarantors();
        HashMap<Integer, guarantee> garantias = prestamos.getAllGuarantees();
        
        for (Map.Entry<Integer, customer> cliente : clientes.entrySet()) {
            jComboBox1.addItem(Integer.toString(cliente.getValue().getId()) + "-" + cliente.getValue().getName());
        }
        
        for (Map.Entry<Integer, guarantor> fiador : fiadores.entrySet()) {
            jComboBox2.addItem(Integer.toString(fiador.getValue().getId()) + "-" + fiador.getValue().getName());
        }
        
        for (Map.Entry<Integer, guarantee> garantia : garantias.entrySet()) {
            jComboBox4.addItem(Integer.toString(garantia.getValue().getIdGarantia()) + "-" + garantia.getValue().getDescripcionGarantia());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ID = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        plazo = new javax.swing.JFormattedTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        monto = new javax.swing.JFormattedTextField();
        tasa = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        select1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        cuota = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setText("ID");

        jLabel2.setText("ID - Cliente");

        jLabel3.setText("ID - Fiador");

        jLabel4.setText("Estado");

        jLabel5.setText("Tipo - Garantias");

        jLabel6.setText("Plazo");

        jLabel9.setText("Cutoa fija");

        jLabel10.setText("Balance");

        jLabel11.setText("Tasa");

        jLabel12.setText("Monto");

        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFocusLost(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        plazo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                plazoFocusLost(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jLabel13.setText("Foto Garantia");

        monto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                montoFocusLost(evt);
            }
        });
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });

        tasa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tasaFocusLost(evt);
            }
        });
        tasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasaActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label.setText("...");

        select1.setText("Select file");
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Activo");

        balance.setText("...");

        cuota.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel9)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(tasa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(balance)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tasa)
                        .addComponent(cuota))
                    .addComponent(select1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(label)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusLost
        try{
        } catch(NumberFormatException e){
            ID.setText("");
        }
    }//GEN-LAST:event_IDFocusLost

    private void plazoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plazoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plazoFocusLost

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void tasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tasaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!(ID.getText().equals("") || plazo.getText().equals("") || monto.getText().equals("") 
        || balance.getText().equals("")|| tasa.getText().equals("") || cuota.getText().equals("") 
        || jComboBox1.getSelectedIndex() == 0 || jComboBox2.getSelectedIndex() == 0 
        || jComboBox4.getSelectedIndex() == 0 )){
            int id = Integer.parseInt(ID.getText());
            int plazoP = Integer.parseInt(plazo.getText());
            double montoo = Double.parseDouble(monto.getText());
            double balancee = Double.parseDouble(balance.getText());
            double tasaa = Double.parseDouble(tasa.getText());
            double cuotaa = Double.parseDouble(cuota.getText());
            int idCte = Integer.parseInt(jComboBox1.getSelectedItem().toString().split("-")[0]);
            int idFiador = Integer.parseInt(jComboBox2.getSelectedItem().toString().split("-")[0]);
            int idGarantia = Integer.parseInt(jComboBox4.getSelectedItem().toString().split("-")[0]);
            boolean estado = true;
            if(!jLabel7.getText().equals("Activo")){
                estado = false;
            }
            
            String foto = label.getText();
            
            try {
                LocalDate fecha = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String formattedDate = fecha.format(formatter);
                
                Date fechai = new SimpleDateFormat("dd/MM/yyyy").parse(formattedDate);
                LocalDate newDate = fecha.plusMonths(plazoP);
                String newFormattedDate = newDate.format(formatter);
                Date fechaf = new SimpleDateFormat("dd/MM/yyyy").parse(newFormattedDate);
                
                loan prestamo1 = new loan(id, idCte, idFiador, estado, fechai, plazoP, fechaf, idGarantia, montoo, balancee, tasaa, cuotaa, foto);
                loan find;
                try {
                    find  = prestamos.getLoan(prestamo1.getId());

                    if(Objects.isNull(find)){
                        if(!Objects.isNull(prestamos.saveLoan(prestamo1))){
                                                        
                            for(int i = 1; i <= plazoP; i++){
                                LocalDate newDatee = fecha.plusMonths(i);
                                String newFormattedDatee = newDatee.format(formatter);
                                Date fechaff = new SimpleDateFormat("dd/MM/yyyy").parse(newFormattedDatee);
                                
                                LocalDate lastDate = fecha;
                                int b = i - 1;
                                
                                if(i != 1){
                                    lastDate = fecha.plusMonths(b);
                                }
                                
                                LocalDate start = lastDate;
                                LocalDate end   = newDatee;

                                long diffInDays = ChronoUnit.DAYS.between(start, end);
                                DecimalFormat df = new DecimalFormat("#.00");
            
                                double tassa = (double) Double.parseDouble(tasa.getText())/100;
                                double tasa2 = (double) 1 + tassa;
                                double plazo2 = (double) diffInDays / 365;
                                double tasaE = (double) (Math.pow(tasa2, plazo2)) - 1; 
                                double interesMensual = montoo * tasaE;
                                double capital = (double)  cuotaa - interesMensual;
                                montoo -= (double)capital;
                                
                                cuotaa = Double.parseDouble(df.format(cuotaa));
                                capital = Double.parseDouble(df.format(capital));
                                interesMensual = Double.parseDouble(df.format(interesMensual));
                                
                                fee cuotaC = new fee(id, i, idCte, fechaff, cuotaa, capital, interesMensual, false);
                                if(Objects.isNull(prestamos.saveFee(cuotaC))){
                                    System.out.println("Error al guardar cuota");
                                }
                            } 
                            
                            JOptionPane.showMessageDialog(this, "Prestamo guardado existosamente!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Error inesperado, intente nuevamente!");
                        }
                    } else {
                        if(JOptionPane.showOptionDialog(this,
                        "Cliente ya existe, desea actualizar?",
                        "Confirmacion",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new String[]{"Si", "No"},
                        "Yes") == JOptionPane.YES_OPTION){
                            if(!Objects.isNull(prestamos.updateLoan(prestamo1))){
                                JOptionPane.showMessageDialog(this, "Prestamo modificado exitosamente!");
                            } else {
                                JOptionPane.showMessageDialog(this, "Error inesperado, intente nuevamente!");
                            }
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(prestamos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ParseException ex) {
                Logger.getLogger(prestamos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ID.setText("");
            monto.setText("");
            plazo.setText("");
            balance.setText("");
            tasa.setText("");
            cuota.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jLabel7.setText("Activo");
            jComboBox4.setSelectedIndex(0);
        
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos necesarios!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        chooser = new JFileChooser();

        
        if (evt.getSource() == select1) {
            chooser.showOpenDialog(null);
            file = chooser.getSelectedFile();
            label.setText(file.getAbsolutePath()); 

                
        }
    }//GEN-LAST:event_select1ActionPerformed

    private void montoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoFocusLost
        balance.setText(monto.getText());
    }//GEN-LAST:event_montoFocusLost

    private void tasaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tasaFocusLost
        if(!(monto.getText().equals("") || plazo.getText().equals("") || tasa.getText().equals(""))){
            double tasaa = (double) Double.parseDouble(tasa.getText())/100;
            double montoo = (double) Double.parseDouble(monto.getText());
            int plazoo = Integer.parseInt(plazo.getText());
            double tasa2 = (double) 1 + tasaa;
            double plazo2 = (double) 1 / plazoo;
            double interesM = (double) (Math.pow(tasa2, plazo2)) - 1 ;
            double interesM2 = (double) 1 + interesM; 
            double cuotaa = (double) (montoo * interesM) / (1 - (Math.pow(interesM2 , -plazoo)));
            DecimalFormat df = new DecimalFormat("#.00");
            String cuotaRounded = df.format(cuotaa);
            
            cuota.setText(cuotaRounded);
        }
    }//GEN-LAST:event_tasaFocusLost

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
            java.util.logging.Logger.getLogger(prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new prestamos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ID;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel cuota;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JFormattedTextField monto;
    private javax.swing.JFormattedTextField plazo;
    private javax.swing.JToggleButton select1;
    private javax.swing.JFormattedTextField tasa;
    // End of variables declaration//GEN-END:variables
}
