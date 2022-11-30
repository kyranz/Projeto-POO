/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Atendente;
import fatec.poo.model.Hospede;
import fatec.poo.model.QuartoHotel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class GuiReservarLiberar extends javax.swing.JFrame {

    private ArrayList<QuartoHotel> hotel;
    private ArrayList<Atendente> atendente;
    private ArrayList<Hospede> hospede;
    private int numHotel, numAt, numHosp;
    
    /**
     * Creates new form GuiReservarLiberar
     * @param hotel
     * @param atendente
     * @param hospede
     */
    public GuiReservarLiberar(ArrayList<QuartoHotel> hotel, ArrayList<Atendente> atendente, ArrayList<Hospede> hospede) {
        initComponents();
        this.hotel = hotel;
        this.atendente = atendente;
        this.hospede = hospede;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblValPagar = new javax.swing.JLabel();
        txtRegFunc = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtNQuarto = new javax.swing.JTextField();
        txtDtEntrada = new javax.swing.JTextField();
        txtDtSaida = new javax.swing.JTextField();
        btnPesquisarHosp = new javax.swing.JButton();
        btnPesquisarAt = new javax.swing.JButton();
        btnPesquisarQuarto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblSitQuarto = new javax.swing.JLabel();
        lblNomeHosp = new javax.swing.JLabel();
        lblNomeAt = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reg. Função");

        jLabel2.setText("CPF Hóspede");

        jLabel3.setText("Nº Quarto");

        jLabel4.setText("Data Entrada");

        jLabel5.setText("Data Saida");

        jLabel6.setText("Valor a Pagar");

        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Inserir.png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Remover.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblValPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtCpf.setEnabled(false);

        txtNQuarto.setEnabled(false);

        txtDtEntrada.setEnabled(false);

        txtDtSaida.setEnabled(false);

        btnPesquisarHosp.setText("...");
        btnPesquisarHosp.setEnabled(false);
        btnPesquisarHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarHospActionPerformed(evt);
            }
        });

        btnPesquisarAt.setText("...");
        btnPesquisarAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAtActionPerformed(evt);
            }
        });

        btnPesquisarQuarto.setText("...");
        btnPesquisarQuarto.setEnabled(false);
        btnPesquisarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarQuartoActionPerformed(evt);
            }
        });

        jLabel9.setText("Situação:");

        lblSitQuarto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblNomeHosp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblNomeAt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReservar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLiberar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtDtEntrada))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtDtSaida))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(lblValPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisarHosp)
                                .addGap(18, 18, 18)
                                .addComponent(lblNomeHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisarAt)
                                .addGap(18, 18, 18)
                                .addComponent(lblNomeAt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisarQuarto)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblSitQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLiberar, btnReservar, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeAt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtRegFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarAt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeHosp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarHosp)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSitQuarto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarQuarto)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblValPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservar)
                    .addComponent(btnLiberar)
                    .addComponent(btnSair))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, lblNomeAt, lblNomeHosp, lblSitQuarto, lblValPagar, txtCpf, txtDtEntrada, txtDtSaida, txtNQuarto, txtRegFunc});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAtActionPerformed
        int i;
        for (i = 0; i < atendente.size(); i++) {
            if (atendente.get(i).getRegFunc().equals(txtRegFunc.getText())) {
                break;
            }
        }
        
        if (i < atendente.size()) {
            numAt = i;
            lblNomeAt.setText(atendente.get(numAt).getNome());
            txtRegFunc.setEnabled(false);
            txtCpf.setEnabled(true);
            btnPesquisarAt.setEnabled(false);
            btnPesquisarHosp.setEnabled(true);
            txtCpf.requestFocus();
        }
        else {
            lblNomeAt.setText("Atendente não cadastrado");
            txtRegFunc.setText(null);
            txtRegFunc.requestFocus();
        }
        
    }//GEN-LAST:event_btnPesquisarAtActionPerformed

    private void btnPesquisarHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarHospActionPerformed
        int i;
        for (i = 0; i < hospede.size(); i++) {
            if (hospede.get(i).getCpf().equals(txtCpf.getText())) {
                break;
            }
        }
        
        if (i < hospede.size()) {
            numHosp = i;
            lblNomeHosp.setText(hospede.get(numHosp).getNome());
            txtCpf.setEnabled(false);
            
            if (hospede.get(numHosp).getQuartoHotel() != null) {
                txtNQuarto.setText(String.valueOf(hospede.get(numHosp).getQuartoHotel().getNumQuarto()));
                lblSitQuarto.setText("Quarto Ocupado");
                txtDtEntrada.setText(hospede.get(numHosp).getQuartoHotel().getDataEntrada());
                
                btnPesquisarHosp.setEnabled(false);
                txtDtSaida.setEnabled(true);
                btnLiberar.setEnabled(true);
                txtDtSaida.requestFocus();
            }
            else {
                btnPesquisarHosp.setEnabled(false);
                txtNQuarto.setEnabled(true);
                btnPesquisarQuarto.setEnabled(true);
                txtNQuarto.requestFocus();
            }
            
        }
        else {
            lblNomeHosp.setText("Hóspede não cadastrado");
            txtCpf.setText(null);
            txtCpf.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarHospActionPerformed

    private void btnPesquisarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarQuartoActionPerformed
        int i;
        for (i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getNumQuarto() == Integer.parseInt(txtNQuarto.getText())) {
                break;
            }
        }
        
        if (i < hotel.size()) {
            numHotel = i;
            if (hotel.get(i).isSituacao()) {
                lblSitQuarto.setText("Quarto Ocupado");
                txtNQuarto.setText(null);
                txtNQuarto.requestFocus();
            }
            else {
                lblSitQuarto.setText("Quarto Livre");
                txtNQuarto.setEnabled(false);
                btnPesquisarQuarto.setEnabled(false);
                txtDtEntrada.setEnabled(true);
                btnReservar.setEnabled(true);
                txtDtEntrada.requestFocus();
            }
        }
        else {
            lblSitQuarto.setText("Quarto não cadastrado");
            txtNQuarto.setText(null);
            txtNQuarto.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarQuartoActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        hotel.get(numHotel).reservar(hospede.get(numHosp), atendente.get(numAt));
        hotel.get(numHotel).setDataEntrada(txtDtEntrada.getText());
        
        btnReservar.setEnabled(false);
        txtDtEntrada.setEnabled(false);
        txtRegFunc.setEnabled(true);
        btnPesquisarAt.setEnabled(true);
        
        txtRegFunc.setText(null);
        txtCpf.setText(null);
        txtNQuarto.setText(null);
        txtDtEntrada.setText(null);
        txtDtSaida.setText(null);
        lblNomeAt.setText(null);
        lblNomeHosp.setText(null);
        lblSitQuarto.setText(null);
        txtRegFunc.requestFocus();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dtEntrada = Calendar.getInstance();
        Calendar dtSaida = Calendar.getInstance();
        
        int dias;
        try {
              dtEntrada.setTime(sdf.parse(txtDtEntrada.getText()));
              dtSaida.setTime(sdf.parse(txtDtSaida.getText()));
        } catch (java.text.ParseException e ) { }
        dias = dtSaida.get(Calendar.DAY_OF_YEAR) - dtEntrada.get(Calendar.DAY_OF_YEAR);
        
        lblValPagar.setText(String.valueOf(hotel.get(numHotel).liberar(dias, hotel.get(numHotel).getHospede().getTxDesconto())));
        
        btnLiberar.setEnabled(false);
        txtDtEntrada.setEnabled(false);
        txtDtSaida.setEnabled(false);
        txtRegFunc.setEnabled(true);
        btnPesquisarAt.setEnabled(true);
        
        txtRegFunc.setText(null);
        txtCpf.setText(null);
        txtNQuarto.setText(null);
        txtDtEntrada.setText(null);
        txtDtSaida.setText(null);
        lblNomeAt.setText(null);
        lblNomeHosp.setText(null);
        lblSitQuarto.setText(null);
        txtRegFunc.requestFocus();
    }//GEN-LAST:event_btnLiberarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnPesquisarAt;
    private javax.swing.JButton btnPesquisarHosp;
    private javax.swing.JButton btnPesquisarQuarto;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNomeAt;
    private javax.swing.JLabel lblNomeHosp;
    private javax.swing.JLabel lblSitQuarto;
    private javax.swing.JLabel lblValPagar;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDtEntrada;
    private javax.swing.JTextField txtDtSaida;
    private javax.swing.JTextField txtNQuarto;
    private javax.swing.JTextField txtRegFunc;
    // End of variables declaration//GEN-END:variables
}
