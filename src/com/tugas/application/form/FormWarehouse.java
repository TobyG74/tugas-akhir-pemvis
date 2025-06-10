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
public class FormWarehouse extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    public FormWarehouse() {
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

        String sql = "SELECT * FROM gudang";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getString("kode_gudang"),
                    rs.getString("nama_gudang"),
                    rs.getString("id_kepala_gudang"),
                    rs.getString("lokasi")
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

        roundPanel1 = new com.tugas.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        roundPanel2 = new com.tugas.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputKodeGudang = new javax.swing.JTextField();
        inputNamaGudang = new javax.swing.JTextField();
        inputIdKepalaGudang = new javax.swing.JTextField();
        inputNamaKepalaGudang = new javax.swing.JTextField();
        cariUseriBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        inputLokasiGudang = new javax.swing.JTextField();
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
        cariGudangBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        roundPanel4 = new com.tugas.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        inputCariGudang = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(830, 621));
        setMinimumSize(new java.awt.Dimension(830, 621));
        setPreferredSize(new java.awt.Dimension(830, 621));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORM GUDANG");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Kode Gudang");

        jLabel3.setText("Nama Gudang");

        jLabel4.setText("ID Kepala Gudang");

        jLabel5.setText("Lokasi");

        cariUseriBtn.setText("Cari");
        cariUseriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariUseriBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Nama Kepala Gudang");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addGap(56, 56, 56)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputLokasiGudang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNamaKepalaGudang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputKodeGudang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNamaGudang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel2Layout.createSequentialGroup()
                        .addComponent(inputIdKepalaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cariUseriBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputKodeGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNamaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputIdKepalaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariUseriBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputNamaKepalaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputLokasiGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Navigasi");

        jLabel11.setText("1. Klik \"Simpan\" Untuk Menyimpan Data Gudang");

        jLabel12.setText("2. Klik \"Edit\" Untuk Mengubah Data Gudang");

        jLabel13.setText("3. Klik \"Delete\" Untuk Menghapus Data Gudang");

        jLabel14.setText("4. Klik \"Ulang\" Untuk Mengulang Input Data Gudang");

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

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
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

        cariGudangBtn.setText("Cari");
        cariGudangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariGudangBtnActionPerformed(evt);
            }
        });

        jLabel15.setText("Kode");

        roundPanel4.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Gudang", "ID Kepala Gudang", "Lokasi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
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
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(saveButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(editButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(inputCariGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(cariGudangBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(clearButton)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(inputCariGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cariGudangBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (inputKodeGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Kode Gudang!");
            return; 
        }
        String sql = "SELECT * FROM gudang WHERE kode_gudang=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputKodeGudang.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "UPDATE gudang SET nama_gudang=?, id_kepala_gudang=?, lokasi=? WHERE kode_gudang=?";
                PreparedStatement updatePs = conn.prepareStatement(sql);
                updatePs.setString(1, inputNamaGudang.getText().isEmpty() ? rs.getString("nama_barang") : inputNamaGudang.getText());
                updatePs.setString(2, inputIdKepalaGudang.getText().isEmpty() ? rs.getString("id_kategori") : inputIdKepalaGudang.getText());
                updatePs.setString(3, inputLokasiGudang.getText().isEmpty() ? rs.getString("harga_beli") : inputLokasiGudang.getText());
                updatePs.setString(4, inputKodeGudang.getText().toUpperCase()); // Primary Key
                updatePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Gudang Dengan Kode : " + inputKodeGudang.getText().toUpperCase() + " Berhasil Diubah!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Gudang Dengan Kode : " + inputKodeGudang.getText().toUpperCase() + " Tidak Terdaftar!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mengubah Data Gudang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (inputKodeGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Kode Gudang!");
            return; 
        }
        String sql = "SELECT * FROM gudang WHERE kode_gudang=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputKodeGudang.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "DELETE FROM gudang WHERE kode_gudang=?";
                PreparedStatement deletePs = conn.prepareStatement(sql);
                deletePs.setString(1, inputKodeGudang.getText().toUpperCase()); // Primary Key
                deletePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Gudang Dengan Kode : " + inputCariGudang.getText().toUpperCase() + " Berhasil Dihapus!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Gudang Dengan Kode : " + inputCariGudang.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menghapus Data Gudang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputKodeGudang.setText("");
        inputNamaGudang.setText("");
        inputIdKepalaGudang.setText("");
        inputLokasiGudang.setText("");
        inputNamaKepalaGudang.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cariGudangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariGudangBtnActionPerformed
        if (inputCariGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Kode Gudang Pada Pencarian!");
            return;
        }
        String sql = "SELECT * FROM gudang WHERE kode_gudang=?";
        try (Connection conn = Connector.getConnection(); 
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputCariGudang.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tableModel = (DefaultTableModel) table.getModel();
                tableModel.setRowCount(0);
                do {
                    Object[] row = new Object[]{
                        rs.getString("kode_gudang"),
                        rs.getString("nama_gudang"),
                        rs.getString("id_kepala_gudang"),
                        rs.getString("lokasi")
                    };
                    tableModel.addRow(row);
                } while (rs.next());
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Gudang Dengan Kode : " + inputCariGudang.getText().toUpperCase() + " Berhasil Ditemukan!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Gudang Dengan Kode : " + inputCariGudang.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mencari Data Gudang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_cariGudangBtnActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (inputKodeGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Kode Gudang!");
            return; 
        }
        if (inputNamaGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Nama Gudang!");
            return;
        }
        if (inputIdKepalaGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID User!");
            return;
        }
        if (inputLokasiGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Harga Beli Gudang!");
            return;
        }

        String sqlCheck = "SELECT * FROM gudang WHERE kode_gudang=?";
        String sqlInsert = "INSERT INTO barang (kode_gudang, nama_gudang, id_kepala_gudang, lokasi) VALUES (?, ?, ?, ?)";

        try (Connection conn = Connector.getConnection(); PreparedStatement psCheck = conn.prepareStatement(sqlCheck)) {
            psCheck.setString(1, inputKodeGudang.getText());
            ResultSet rs = psCheck.executeQuery();
            if (rs.next()) {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                        "Data Gudang Dengan Kode : " + inputKodeGudang.getText().toUpperCase() + " Sudah Terdaftar!");
            } else {
                try (PreparedStatement psInsert = conn.prepareStatement(sqlInsert)) {
                    psInsert.setString(1, inputKodeGudang.getText().toUpperCase());
                    psInsert.setString(2, inputNamaGudang.getText());
                    psInsert.setString(3, inputIdKepalaGudang.getText());
                    psInsert.setString(4, inputLokasiGudang.getText());
                    int affectedRows = psInsert.executeUpdate();
                    if (affectedRows > 0) {
                        loadDataTable();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                            "Data Gudang Dengan Kode : " + inputKodeGudang.getText().toUpperCase() + " Berhasil Di Simpan!");
                    }
                }
            }
            
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menyimpan Data Gudang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void cariUseriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariUseriBtnActionPerformed
        if (inputIdKepalaGudang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID User Pada Pencarian!");
        }
        String sql = "SELECT * FROM users WHERE id_user=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdKepalaGudang.getText());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                        "Data User Dengan Kode : " + inputIdKepalaGudang.getText().toUpperCase() + " Berhasil Ditemukan!");
                    inputNamaKepalaGudang.setText(rs.getString("fullname"));
                    inputNamaKepalaGudang.setEnabled(false);
                } else {
                    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                        "Data User Dengan Kode : " + inputIdKepalaGudang.getText().toUpperCase() + " Tidak Ditemukan!");
                }
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mencari Data User");
            e.printStackTrace();
        }
    }//GEN-LAST:event_cariUseriBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariGudangBtn;
    private javax.swing.JButton cariUseriBtn;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField inputCariGudang;
    private javax.swing.JTextField inputIdKepalaGudang;
    private javax.swing.JTextField inputKodeGudang;
    private javax.swing.JTextField inputLokasiGudang;
    private javax.swing.JTextField inputNamaGudang;
    private javax.swing.JTextField inputNamaKepalaGudang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.tugas.swing.RoundPanel roundPanel1;
    private com.tugas.swing.RoundPanel roundPanel2;
    private com.tugas.swing.RoundPanel roundPanel3;
    private com.tugas.swing.RoundPanel roundPanel4;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
