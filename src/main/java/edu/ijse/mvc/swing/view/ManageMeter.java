/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ijse.mvc.swing.view;

import com.mysql.cj.xdevapi.Column;
import edu.ijse.mvc.swing.controller.MeterController;
import edu.ijse.mvc.swing.dto.MeterDto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class

ManageMeter extends javax.swing.JPanel {

    private final MeterController meterController = new MeterController();

    /**
     * Creates new form ManageMeter
     */
    public ManageMeter() {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        meterIdTxt = new javax.swing.JTextField();
        meterTypeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        statusTypeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTabel = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        meterTypeCmb = new javax.swing.JComboBox<>();
        statusCmb = new javax.swing.JComboBox<>();
        datePicker = new de.wannawork.jcalendar.JCalendarComboBox();
        customerLabel = new javax.swing.JLabel();
        customerTxt = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1052, 768));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1052, 768));

        titleLabel.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        titleLabel.setText("Meter Management System");

        idLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        idLabel.setText("Meter ID :");

        meterIdTxt.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        meterTypeLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        meterTypeLabel.setText("Meter Type :");

        dateLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        dateLabel.setText("Date :");

        statusTypeLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        statusTypeLabel.setText("Status Type :");

        locationLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        locationLabel.setText("Location :");

        locationTxt.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        saveBtn.setBackground(new java.awt.Color(0, 102, 204));
        saveBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        detailsTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "meter_type", "date", "status_type", "location", "customer_id"
            }
        ));
        detailsTabel.setRowHeight(25);
        detailsTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(detailsTabel);

        updateBtn.setBackground(new java.awt.Color(0, 102, 204));
        updateBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(204, 204, 255));
        resetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        meterTypeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analog", "Digital" }));

        statusCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        customerLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        customerLabel.setText("Customer ID :");

        customerTxt.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(meterIdTxt)
                                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(meterTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(statusTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(statusCmb, 0, 254, Short.MAX_VALUE)
                                            .addComponent(meterTypeCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(customerTxt))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(meterTypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusCmb)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(meterIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(meterTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        saveMeter();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        updateMeter();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deleteMeter();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void detailsTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabelMouseClicked
        searchMeter();
    }//GEN-LAST:event_detailsTabelMouseClicked

    public void reset() {
        meterIdTxt.setText("");
        meterTypeCmb.setSelectedIndex(-1);
        datePicker.setDate(null);
        statusCmb.setSelectedIndex(-1);
        locationTxt.setText("");
    }

    public void saveMeter() {
        try {
            java.util.Date utilDate = datePicker.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            MeterDto meterDto = new MeterDto(
                    meterIdTxt.getText(),
                    meterTypeCmb.getSelectedItem().toString(),
                    sqlDate,
                    statusCmb.getSelectedItem().toString(),
                    locationTxt.getText(),
                    customerTxt.getText()
            );
            String rsp = meterController.addMeter(meterDto);
            JOptionPane.showMessageDialog(this, rsp);
            reset();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void updateMeter() {
        try {
            java.util.Date utilDate = datePicker.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            MeterDto meterDto = new MeterDto(
                    meterIdTxt.getText(),
                    meterTypeCmb.getSelectedItem().toString(),
                    sqlDate,
                    statusCmb.getSelectedItem().toString(),
                    locationTxt.getText(),
                    customerTxt.getText()
            );

            JOptionPane.showMessageDialog(this, meterController.updateMeter(meterDto));
            reset();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void deleteMeter() {
        try {
            String rsp = meterController.deleteMeter(meterIdTxt.getText());
            JOptionPane.showMessageDialog(this, rsp);
            reset();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void searchMeter() {
        try {
            MeterDto meterDto = meterController.selectMeter((String) detailsTabel.getValueAt(detailsTabel.getSelectedRow(),0));
            meterIdTxt.setText(meterDto.getMeterId());
            meterTypeCmb.setSelectedItem(meterDto.getMeterType());
            datePicker.setDate(meterDto.getInstallion_date());
            statusCmb.setSelectedItem(meterDto.getStatus_type());
            locationTxt.setText(meterDto.getLocation());
            customerTxt.setText(meterDto.getCustomerID());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }

    public void loadTable(){

        DefaultTableModel dtm = (DefaultTableModel) detailsTabel.getModel();
        dtm.setRowCount(0);

        try {
            for(MeterDto meterDto : meterController.getAllMeter()){
                ArrayList <Object> row = new ArrayList<>();
                row.add(meterDto.getMeterId());
                row.add(meterDto.getMeterType());
                row.add(meterDto.getInstallion_date());
                row.add(meterDto.getStatus_type());
                row.add(meterDto.getLocation());
                row.add(meterDto.getCustomerID());
                dtm.addRow(row.toArray());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerLabel;
    private javax.swing.JTextField customerTxt;
    private javax.swing.JLabel dateLabel;
    private de.wannawork.jcalendar.JCalendarComboBox datePicker;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable detailsTabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField meterIdTxt;
    private javax.swing.JComboBox<String> meterTypeCmb;
    private javax.swing.JLabel meterTypeLabel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> statusCmb;
    private javax.swing.JLabel statusTypeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
