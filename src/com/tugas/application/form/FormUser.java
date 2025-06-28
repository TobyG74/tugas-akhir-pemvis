package com.tugas.application.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.tugas.database.Connector;
import com.tugas.manager.RoleManager;
import com.tugas.toast.Notifications;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tobi
 */
public class FormUser extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    public FormUser() {
        initComponents();
        init();
        loadDataTable();
    }
    
    private void init() {
        roundPanel1.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        roundPanel2.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        roundPanel3.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        roundPanel4.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        
        saveButton.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        editButton.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        deleteButton.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        clearButton.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        table.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
    }
    
    private void loadDataTable() {
        tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);

        String sql = "SELECT * FROM users";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                switch (RoleManager.getRoleFromFile()) {
                    case "Admin": {
                        Object[] row = new Object[]{
                            rs.getString("id_user"),
                            rs.getString("fullname"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("role"),
                        };
                        tableModel.addRow(row);
                        break;
                    }
                    default: {
                        Object[] row = new Object[]{
                            rs.getString("id_user"),
                            rs.getString("fullname"),
                            rs.getString("username"),
                            rs.getString("role"),
                        };
                        tableModel.addRow(row);
                        break;
                    }
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roleBtnGroup = new javax.swing.ButtonGroup();
        roundPanel1 = new com.tugas.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        roundPanel2 = new com.tugas.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputIdKaryawan = new javax.swing.JTextField();
        inputNamaKaryawan = new javax.swing.JTextField();
        inputUsernameKaryawan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputPasswordKaryawan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        inputPosisiKaryawan = new javax.swing.JLabel();
        radioManager = new javax.swing.JRadioButton();
        radioStaff = new javax.swing.JRadioButton();
        radioKepalaGudang = new javax.swing.JRadioButton();
        radioAdmin = new javax.swing.JRadioButton();
        roundPanel3 = new com.tugas.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cariKategoriBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        roundPanel4 = new com.tugas.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        inputCariKaryawan = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(830, 621));
        setMinimumSize(new java.awt.Dimension(830, 621));
        setPreferredSize(new java.awt.Dimension(830, 621));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORM KARYAWAN");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID Karyawan");

        jLabel3.setText("Nama Karyawan");

        jLabel9.setText("Username");

        jLabel16.setText("Password");

        inputPosisiKaryawan.setText("Role");

        roleBtnGroup.add(radioManager);
        radioManager.setText("Manager");
        radioManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioManagerActionPerformed(evt);
            }
        });

        roleBtnGroup.add(radioStaff);
        radioStaff.setText("Staff");
        radioStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStaffActionPerformed(evt);
            }
        });

        roleBtnGroup.add(radioKepalaGudang);
        radioKepalaGudang.setText("Kepala Gudang");
        radioKepalaGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioKepalaGudangActionPerformed(evt);
            }
        });

        roleBtnGroup.add(radioAdmin);
        radioAdmin.setText("Admin");
        radioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(inputPosisiKaryawan))
                .addGap(56, 56, 56)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioAdmin)
                    .addComponent(radioKepalaGudang)
                    .addComponent(radioStaff)
                    .addComponent(radioManager)
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputUsernameKaryawan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(inputIdKaryawan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNamaKaryawan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputPasswordKaryawan, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputUsernameKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPasswordKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPosisiKaryawan)
                    .addComponent(radioManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioKepalaGudang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioAdmin)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Navigasi");

        jLabel11.setText("1. Klik \"Simpan\" Untuk Menyimpan Data Karyawan");

        jLabel12.setText("2. Klik \"Ubah\" Untuk Mengubah Data Karyawan");

        jLabel13.setText("3. Klik \"Hapus\" Untuk Menghapus Data Karyawan");

        jLabel14.setText("4. Klik \"Ulang\" Untuk Mengulang Input Data Karyawan");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        saveButton.setText("Simpan");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        editButton.setText("Ubah");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Ulang");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        cariKategoriBtn.setText("Cari");
        cariKategoriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariKategoriBtnActionPerformed(evt);
            }
        });

        jLabel15.setText("ID");

        roundPanel4.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Karyawan", "Username", "Password", "Posisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(10);
            table.getColumnModel().getColumn(2).setPreferredWidth(10);
            table.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(inputCariKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(saveButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(editButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteButton)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(clearButton))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(cariKategoriBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(inputCariKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cariKategoriBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (inputIdKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Karyawan!");
            return; 
        }
        String sql = "SELECT * FROM users WHERE id_user=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdKaryawan.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "UPDATE users SET fullname=?, username=?, password=?, role=? WHERE id_user=?";
                PreparedStatement updatePs = conn.prepareStatement(sql);
                updatePs.setString(1, inputNamaKaryawan.getText().isEmpty() ? rs.getString("fullname") : inputNamaKaryawan.getText());
                updatePs.setString(2, inputUsernameKaryawan.getText().isEmpty() ? rs.getString("username") : inputUsernameKaryawan.getText());
                updatePs.setString(3, inputPasswordKaryawan.getText().isEmpty() ? rs.getString("password") : inputPasswordKaryawan.getText());
                updatePs.setString(4, getSelectedPosisi().isEmpty() ? rs.getString("role") : getSelectedPosisi());
                updatePs.setString(5, inputIdKaryawan.getText().toUpperCase()); // Primary Key
                updatePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Karyawan Dengan ID : " + inputIdKaryawan.getText().toUpperCase() + " Berhasil Diubah!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Karyawan Dengan ID : " + inputIdKaryawan.getText().toUpperCase() + " Tidak Terdaftar!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mengubah Data Karyawan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (inputIdKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Karyawan!");
            return; 
        }
        String sql = "SELECT * FROM users WHERE id_user=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdKaryawan.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "DELETE FROM users WHERE id_user=?";
                PreparedStatement deletePs = conn.prepareStatement(sql);
                deletePs.setString(1, inputIdKaryawan.getText().toUpperCase()); // Primary Key
                deletePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Karyawan Dengan ID : " + inputCariKaryawan.getText().toUpperCase() + " Berhasil Dihapus!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Karyawan Dengan ID : " + inputCariKaryawan.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menghapus Data Karyawan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputIdKaryawan.setText("");
        inputNamaKaryawan.setText("");
        inputUsernameKaryawan.setText("");
        inputPasswordKaryawan.setText("");
        roleBtnGroup.clearSelection();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cariKategoriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariKategoriBtnActionPerformed
        if (inputCariKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Karyawan Pada Pencarian!");
            return;
        }
        String sql = "SELECT * FROM users WHERE id_user=?";
        try (Connection conn = Connector.getConnection(); 
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputCariKaryawan.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tableModel = (DefaultTableModel) table.getModel();
                tableModel.setRowCount(0);
                switch (RoleManager.getRoleFromFile()) {
                    case "Admin": {
                        do {
                            Object[] row = new Object[]{
                                rs.getString("id_user"),
                                rs.getString("fullname"),
                                rs.getString("username"),
                                rs.getString("password"),
                                rs.getString("role"),
                            };
                            tableModel.addRow(row);
                        } while (rs.next());
                        break;
                    }
                    default: {
                        do {
                            Object[] row = new Object[]{
                                rs.getString("id_user"),
                                rs.getString("fullname"),
                                rs.getString("username"),
                                rs.getString("password"),
                            };
                            tableModel.addRow(row);
                        } while (rs.next());
                        break;
                    }
                }
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Karyawan Dengan ID : " + inputCariKaryawan.getText().toUpperCase() + " Berhasil Ditemukan!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Karyawan Dengan ID : " + inputCariKaryawan.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mencari Data Karyawan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_cariKategoriBtnActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (inputIdKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Karyawan!");
            return; 
        }
        if (inputNamaKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Nama Karyawan!");
            return;
        }
        if (inputUsernameKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Username Karyawan!");
            return;
        }
        if (inputPasswordKaryawan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Password Karyawan!");
            return;
        }
        if (getSelectedPosisi().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Posisi Karyawan!");
            return;
        }

        String sqlCheck = "SELECT * FROM users WHERE id_user=?";
        String sqlInsert = "INSERT INTO users (id_user, fullname, username, password, role) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Connector.getConnection(); PreparedStatement psCheck = conn.prepareStatement(sqlCheck)) {
            psCheck.setString(1, inputIdKaryawan.getText());
            ResultSet rs = psCheck.executeQuery();
            if (rs.next()) {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                        "Data Karyawan Dengan ID : " + inputIdKaryawan.getText().toUpperCase() + " Sudah Terdaftar!");
            } else {
                try (PreparedStatement psInsert = conn.prepareStatement(sqlInsert)) {
                    psInsert.setString(1, inputIdKaryawan.getText().toUpperCase());
                    psInsert.setString(2, inputNamaKaryawan.getText());
                    psInsert.setString(3, inputUsernameKaryawan.getText());
                    psInsert.setString(4, inputPasswordKaryawan.getText());
                    psInsert.setString(5, getSelectedPosisi());
                    int affectedRows = psInsert.executeUpdate();
                    if (affectedRows > 0) {
                        loadDataTable();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                            "Data Karyawan Dengan ID : " + inputIdKaryawan.getText().toUpperCase() + " Berhasil Di Simpan!");
                    }
                }
            }
            
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menyimpan Data Karyawan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private String getSelectedPosisi() {
        if (radioManager.isSelected()) {
            return radioManager.getText();
        } else if (radioStaff.isSelected()) {
            return radioStaff.getText();
        } else if (radioKepalaGudang.isSelected()) {
            return radioKepalaGudang.getText();
        } else if (radioAdmin.isSelected()) {
            return radioAdmin.getText();
        }
        return null;
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void radioManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioManagerActionPerformed

    private void radioStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioStaffActionPerformed

    private void radioKepalaGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioKepalaGudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioKepalaGudangActionPerformed

    private void radioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariKategoriBtn;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField inputCariKaryawan;
    private javax.swing.JTextField inputIdKaryawan;
    private javax.swing.JTextField inputNamaKaryawan;
    private javax.swing.JTextField inputPasswordKaryawan;
    private javax.swing.JLabel inputPosisiKaryawan;
    private javax.swing.JTextField inputUsernameKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioKepalaGudang;
    private javax.swing.JRadioButton radioManager;
    private javax.swing.JRadioButton radioStaff;
    private javax.swing.ButtonGroup roleBtnGroup;
    private com.tugas.swing.RoundPanel roundPanel1;
    private com.tugas.swing.RoundPanel roundPanel2;
    private com.tugas.swing.RoundPanel roundPanel3;
    private com.tugas.swing.RoundPanel roundPanel4;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
