/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Formulario extends javax.swing.JFrame {
       
    /**
     * Creates new form Principal
     */
    public Formulario() {
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

        lbl_titulo = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Convertir = new javax.swing.JButton();
        lbl_rtaConversion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Transaccion = new javax.swing.JButton();
        txt_Transaccion = new javax.swing.JTextField();
        lbl_rtaTransaccion = new javax.swing.JLabel();
        JCDivisa = new javax.swing.JComboBox<>();
        JCDias = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JC_compra_venta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtTaza = new javax.swing.JLabel();
        btnProm = new javax.swing.JButton();
        txtProm = new javax.swing.JLabel();
        txtCompra_venta = new javax.swing.JLabel();
        btnLimpiar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setBackground(new java.awt.Color(51, 153, 255));
        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Conversor de Divisas");
        lbl_titulo.setOpaque(true);

        jLabel1.setText("Digite la cantidad  que necesita convertir :");
        jLabel1.setToolTipText("");

        btn_Convertir.setText("Convertir");
        btn_Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConvertirActionPerformed(evt);
            }
        });

        lbl_rtaConversion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Seleccione si quiere comprar o vender dolares");

        btn_Transaccion.setText("Realizar transaccion");
        btn_Transaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransaccionActionPerformed(evt);
            }
        });

        lbl_rtaTransaccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JCDivisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------", "dolares a pesos", "pesos a dolares" }));

        JCDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        JCDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCDiasActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione el dia de la semana:");

        JC_compra_venta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "Compra", "Venta" }));

        jLabel5.setText("David Santiago Aldana Pita Cod 20192578066");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnProm.setText("Calcular Promedio Semanal");
        btnProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromActionPerformed(evt);
            }
        });

        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_rtaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JCDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTaza, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_rtaTransaccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Transaccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(176, 176, 176)
                                        .addComponent(btnLimpiar2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btn_Transaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel5)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnProm, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProm, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JC_compra_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCompra_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTaza, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(JCDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Convertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_rtaConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JC_compra_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCompra_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Transaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Transaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_rtaTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar2))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProm, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(151, 151, 151)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TransaccionActionPerformed

    private void JCDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCDiasActionPerformed

    private void btn_ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConvertirActionPerformed
        int cont=0;
        cont+=1;
                if (cont==2) {
            this.txt_Cantidad.setText(" ");
            this.lbl_rtaConversion.setText(" "); 
            cont=0;
        }
        
    }//GEN-LAST:event_btn_ConvertirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       this.txt_Cantidad.setText(" ");
       this.lbl_rtaConversion.setText(" ");
       this.getJCDias().setSelectedItem("--------");
       this.getJCDivisa().setSelectedItem("------------------");
       this.getTxtTaza().setText(" ");
       this.txtProm.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromActionPerformed
        
    }//GEN-LAST:event_btnPromActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        this.txtCompra_venta.setText("");
        this.txt_Transaccion.setText(" ");
        this.lbl_rtaTransaccion.setText(" ");
        this.getJC_compra_venta().setSelectedItem("--------");
        this.txtProm.setText(" ");
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    public JButton getBtn_Convertir() {
        return btn_Convertir;
    }

    public void setBtn_Convertir(JButton btn_Convertir) {
        this.btn_Convertir = btn_Convertir;
    }

    public JComboBox<String> getJCDias() {
        return JCDias;
    }

    public void setJCDias(JComboBox<String> JCDias) {
        this.JCDias = JCDias;
    }

    public JComboBox<String> getJCDivisa() {
        return JCDivisa;
    }

    public void setJCDivisa(JComboBox<String> JCDivisa) {
        this.JCDivisa = JCDivisa;
    }

    public JComboBox<String> getJC_compra_venta() {
        return JC_compra_venta;
    }

    public void setJC_compra_venta(JComboBox<String> JC_compra_venta) {
        this.JC_compra_venta = JC_compra_venta;
    }

    public JButton getBtn_Transaccion() {
        return btn_Transaccion;
    }

    public void setBtn_Transaccion(JButton btn_Transaccion) {
        this.btn_Transaccion = btn_Transaccion;
    }

    public JTextField getTxt_Cantidad() {
        return txt_Cantidad;
    }

    public void setTxt_Cantidad(JTextField txt_Cantidad) {
        this.txt_Cantidad = txt_Cantidad;
    }

    public JTextField getTxt_Transaccion() {
        return txt_Transaccion;
    }

    public void setTxt_Transaccion(JTextField txt_Transaccion) {
        this.txt_Transaccion = txt_Transaccion;
    }

    public JLabel getLbl_rtaConversion() {
        return lbl_rtaConversion;
    }

    public void setLbl_rtaConversion(JLabel lbl_rtaConversion) {
        this.lbl_rtaConversion = lbl_rtaConversion;
    }

    public JLabel getLbl_rtaTransaccion() {
        return lbl_rtaTransaccion;
    }

    public JLabel getTxtTaza() {
        return txtTaza;
    }

    public void setTxtTaza(JLabel txtTaza) {
        this.txtTaza = txtTaza;
    }

    public JLabel getTxtProm() {
        return txtProm;
    }

    public JButton getBtnProm() {
        return btnProm;
    }

    public void setBtnProm(JButton btnProm) {
        this.btnProm = btnProm;
    }

    public void setTxtProm(JLabel txtProm) {
        this.txtProm = txtProm;
    }

    public void setLbl_rtaTransaccion(JLabel lbl_rtaTransaccion) {
        this.lbl_rtaTransaccion = lbl_rtaTransaccion;
    }

    public JLabel getTxtCompra_venta() {
        return txtCompra_venta;
    }

    public void setTxtCompra_venta(JLabel txtCompra_venta) {
        this.txtCompra_venta = txtCompra_venta;
    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCDias;
    private javax.swing.JComboBox<String> JCDivisa;
    private javax.swing.JComboBox<String> JC_compra_venta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnProm;
    private javax.swing.JButton btn_Convertir;
    private javax.swing.JButton btn_Transaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_rtaConversion;
    private javax.swing.JLabel lbl_rtaTransaccion;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel txtCompra_venta;
    private javax.swing.JLabel txtProm;
    private javax.swing.JLabel txtTaza;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Transaccion;
    // End of variables declaration//GEN-END:variables
}
