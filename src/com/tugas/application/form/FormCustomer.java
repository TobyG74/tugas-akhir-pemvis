package com.tugas.application.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.tugas.database.Connector;
import com.tugas.toast.Notifications;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tobi
 */
public class FormCustomer extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    public FormCustomer() {
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

        String sql = "SELECT * FROM pelanggan";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getString("id_pelanggan"),
                    rs.getString("nama_pelanggan"),
                    rs.getString("alamat"),
                    rs.getString("no_telp"),
                    rs.getString("email"),
                    rs.getString("jenis_kelamin")
                };
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        roundPanel1 = new com.tugas.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        roundPanel2 = new com.tugas.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputIdPelanggan = new javax.swing.JTextField();
        inputNamaPelanggan = new javax.swing.JTextField();
        inputAlamatPelanggan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputNoTelpPelanggan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        inputEmailPelanggan = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        radioLaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
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
        inputCariPelanggan = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(830, 621));
        setMinimumSize(new java.awt.Dimension(830, 621));
        setPreferredSize(new java.awt.Dimension(830, 621));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORM PELANGGAN");

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

        jLabel2.setText("ID Pelanggan");

        jLabel3.setText("Nama Pelanggan");

        jLabel9.setText("Alamat");

        jLabel16.setText("No Telp");

        jLabel17.setText("Email");

        jLabel18.setText("Jenis Kelamin");

        genderBtnGroup.add(radioLaki);
        radioLaki.setText("Laki - Laki");
        radioLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLakiActionPerformed(evt);
            }
        });

        genderBtnGroup.add(radioPerempuan);
        radioPerempuan.setText("Perempuan");

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
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(56, 56, 56)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(radioLaki)
                        .addGap(18, 18, 18)
                        .addComponent(radioPerempuan))
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputAlamatPelanggan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(inputIdPelanggan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNamaPelanggan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNoTelpPelanggan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(inputEmailPelanggan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputAlamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNoTelpPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmailPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(radioLaki)
                    .addComponent(radioPerempuan))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Navigasi");

        jLabel11.setText("1. Klik \"Simpan\" Untuk Menyimpan Data Pelanggan");

        jLabel12.setText("2. Klik \"Ubah\" Untuk Mengubah Data Pelanggan");

        jLabel13.setText("3. Klik \"Hapus\" Untuk Menghapus Data Pelanggan");

        jLabel14.setText("4. Klik \"Ulang\" Untuk Mengulang Input Data Pelanggan");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Pelanggan", "Alamat", "No Telp", "Email", "Jenis Kelamin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            .addGap(0, 776, Short.MAX_VALUE)
            .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(inputCariPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(cariKategoriBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(27, Short.MAX_VALUE))
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
                            .addComponent(inputCariPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cariKategoriBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (inputIdPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Pelanggan!");
            return; 
        }
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdPelanggan.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "UPDATE pelanggan SET nama_pelanggan=?, alamat=?, no_telp=?, email=?, jenis_kelamin=? WHERE id_pelanggan=?";
                PreparedStatement updatePs = conn.prepareStatement(sql);
                updatePs.setString(1, inputNamaPelanggan.getText().isEmpty() ? rs.getString("nama_pelanggan") : inputNamaPelanggan.getText());
                updatePs.setString(2, inputAlamatPelanggan.getText().isEmpty() ? rs.getString("alamat") : inputAlamatPelanggan.getText());
                updatePs.setString(3, inputNoTelpPelanggan.getText().isEmpty() ? rs.getString("no_telp") : inputNoTelpPelanggan.getText());
                updatePs.setString(4, inputEmailPelanggan.getText().isEmpty() ? rs.getString("email") : inputEmailPelanggan.getText());
                updatePs.setString(5, getSelectedGender().isEmpty() ? rs.getString("jenis_kelamin") : getSelectedGender());
                updatePs.setString(6, inputIdPelanggan.getText().toUpperCase()); // Primary Key
                updatePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Pelanggan Dengan Kode : " + inputIdPelanggan.getText().toUpperCase() + " Berhasil Diubah!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Pelanggan Dengan Kode : " + inputIdPelanggan.getText().toUpperCase() + " Tidak Terdaftar!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mengubah Data Pelanggan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (inputIdPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Pelanggan!");
            return; 
        }
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdPelanggan.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "DELETE FROM pelanggan WHERE id_pelanggan=?";
                PreparedStatement deletePs = conn.prepareStatement(sql);
                deletePs.setString(1, inputIdPelanggan.getText().toUpperCase()); // Primary Key
                deletePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Pelanggan Dengan Kode : " + inputCariPelanggan.getText().toUpperCase() + " Berhasil Dihapus!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Pelanggan Dengan Kode : " + inputCariPelanggan.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menghapus Data Pelanggan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputIdPelanggan.setText("");
        inputNamaPelanggan.setText("");
        inputAlamatPelanggan.setText("");
        inputNoTelpPelanggan.setText("");
        inputEmailPelanggan.setText("");
        genderBtnGroup.clearSelection();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cariKategoriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariKategoriBtnActionPerformed
        if (inputCariPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Pelanggan Pada Pencarian!");
            return;
        }
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan=?";
        try (Connection conn = Connector.getConnection(); 
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputCariPelanggan.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tableModel = (DefaultTableModel) table.getModel();
                tableModel.setRowCount(0);
                do {
                    Object[] row = new Object[]{
                        rs.getString("id_pelanggan"),
                        rs.getString("nama_pelanggan"),
                        rs.getString("alamat"),
                        rs.getString("no_telp"),
                        rs.getString("email"),
                        rs.getString("jenis_kelamin")
                    };
                    tableModel.addRow(row);
                } while (rs.next());
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Pelanggan Dengan Kode : " + inputCariPelanggan.getText().toUpperCase() + " Berhasil Ditemukan!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Pelanggan Dengan Kode : " + inputCariPelanggan.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mencari Data Pelanggan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_cariKategoriBtnActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (inputIdPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Pelanggan!");
            return; 
        }
        if (inputNamaPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Nama Pelanggan!");
            return;
        }
        if (inputAlamatPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Alamat Pelanggan!");
            return;
        }
        if (inputNoTelpPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Nomor Telepon Pelanggan!");
            return;
        }
        if (inputEmailPelanggan.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Email Pelanggan!");
            return;
        }
        if (getSelectedGender().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Jenis Kelamin Pelanggan!");
            return;
        }

        String sqlCheck = "SELECT * FROM pelanggan WHERE id_pelanggan=?";
        String sqlInsert = "INSERT INTO pelanggan (id_pelanggan, nama_pelanggan, alamat, no_telp, email, jenis_kelamin) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Connector.getConnection(); PreparedStatement psCheck = conn.prepareStatement(sqlCheck)) {
            psCheck.setString(1, inputIdPelanggan.getText());
            ResultSet rs = psCheck.executeQuery();
            if (rs.next()) {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                        "Data Pelanggan Dengan Kode : " + inputIdPelanggan.getText().toUpperCase() + " Sudah Terdaftar!");
            } else {
                try (PreparedStatement psInsert = conn.prepareStatement(sqlInsert)) {
                    psInsert.setString(1, inputIdPelanggan.getText().toUpperCase());
                    psInsert.setString(2, inputNamaPelanggan.getText());
                    psInsert.setString(3, inputAlamatPelanggan.getText());
                    psInsert.setString(4, inputNoTelpPelanggan.getText());
                    psInsert.setString(5, inputEmailPelanggan.getText());
                    psInsert.setString(6, getSelectedGender());
                    int affectedRows = psInsert.executeUpdate();
                    if (affectedRows > 0) {
                        loadDataTable();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                            "Data Pelanggan Dengan Kode : " + inputIdPelanggan.getText().toUpperCase() + " Berhasil Di Simpan!");
                    }
                }
            }
            
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menyimpan Data Pelanggan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private String getSelectedGender() {
        if (radioLaki.isSelected()) {
            return radioLaki.getText();
        } else if (radioPerempuan.isSelected()) {
            return radioPerempuan.getText();
        }
        return null;
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void radioLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLakiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariKategoriBtn;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JTextField inputAlamatPelanggan;
    private javax.swing.JTextField inputCariPelanggan;
    private javax.swing.JTextField inputEmailPelanggan;
    private javax.swing.JTextField inputIdPelanggan;
    private javax.swing.JTextField inputNamaPelanggan;
    private javax.swing.JTextField inputNoTelpPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioLaki;
    private javax.swing.JRadioButton radioPerempuan;
    private com.tugas.swing.RoundPanel roundPanel1;
    private com.tugas.swing.RoundPanel roundPanel2;
    private com.tugas.swing.RoundPanel roundPanel3;
    private com.tugas.swing.RoundPanel roundPanel4;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
