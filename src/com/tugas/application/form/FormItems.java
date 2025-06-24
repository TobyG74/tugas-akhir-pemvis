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
public class FormItems extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    public FormItems() {
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

        String sql = "SELECT * FROM barang";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getString("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("id_kategori"),
                    rs.getString("harga_beli"),
                    rs.getString("harga_jual"),
                    rs.getString("stok"),
                    rs.getString("satuan"),
                    rs.getString("added_by")
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputIdBarang = new javax.swing.JTextField();
        inputNamaBarang = new javax.swing.JTextField();
        inputIdKategoriBarang = new javax.swing.JTextField();
        inputNamaKategoriBarang = new javax.swing.JTextField();
        inputHargaJualBarang = new javax.swing.JTextField();
        inputStokBarang = new javax.swing.JTextField();
        inputSatuanBarang = new javax.swing.JTextField();
        cariKategoriBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        inputHargaBeliBarang = new javax.swing.JTextField();
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
        cariBarangBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        roundPanel4 = new com.tugas.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        inputCariBarang = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(830, 621));
        setMinimumSize(new java.awt.Dimension(830, 621));
        setPreferredSize(new java.awt.Dimension(830, 621));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORM BARANG");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("ID Kategori");

        jLabel5.setText("Harga Beli");

        jLabel6.setText("Harga Jual");

        jLabel7.setText("Stok");

        jLabel8.setText("Satuan");

        inputIdKategoriBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdKategoriBarangActionPerformed(evt);
            }
        });

        inputHargaJualBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaJualBarangActionPerformed(evt);
            }
        });

        inputSatuanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSatuanBarangActionPerformed(evt);
            }
        });

        cariKategoriBtn.setText("Cari");
        cariKategoriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariKategoriBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Nama Kategori");

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
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(56, 56, 56)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputStokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputHargaJualBarang)
                        .addComponent(inputHargaBeliBarang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNamaKategoriBarang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputIdBarang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNamaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel2Layout.createSequentialGroup()
                            .addComponent(inputIdKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cariKategoriBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)))
                    .addComponent(inputSatuanBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputIdKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariKategoriBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputNamaKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputHargaBeliBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputHargaJualBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputStokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inputSatuanBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Navigasi");

        jLabel11.setText("1. Klik \"Simpan\" Untuk Menyimpan Data Barang");

        jLabel12.setText("2. Klik \"Ubah\" Untuk Mengubah Data Barang");

        jLabel13.setText("3. Klik \"Hapus\" Untuk Menghapus Data Barang");

        jLabel14.setText("4. Klik \"Ulang\" Untuk Mengulang Input Data Barang");

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

        cariBarangBtn.setText("Cari");
        cariBarangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBarangBtnActionPerformed(evt);
            }
        });

        jLabel15.setText("ID");

        roundPanel4.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "ID Kategori", "Harga Beli", "Harga Jual", "Stok", "Satuan", "Ditambahkan Oleh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            table.getColumnModel().getColumn(3).setPreferredWidth(10);
            table.getColumnModel().getColumn(4).setPreferredWidth(10);
            table.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
            .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                                .addComponent(inputCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(cariBarangBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(clearButton)))
                                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
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
                                .addComponent(inputCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cariBarangBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (inputIdBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Barang!");
            return; 
        }
        String sql = "SELECT * FROM barang WHERE id_barang=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdBarang.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "UPDATE barang SET nama_barang=?, id_kategori=?, harga_beli=?, harga_jual=?, stok=?, satuan=? WHERE id_barang=?";
                PreparedStatement updatePs = conn.prepareStatement(sql);
                updatePs.setString(1, inputNamaBarang.getText().isEmpty() ? rs.getString("nama_barang") : inputNamaBarang.getText());
                updatePs.setString(2, inputIdKategoriBarang.getText().isEmpty() ? rs.getString("id_kategori") : inputIdKategoriBarang.getText());
                updatePs.setString(3, inputHargaBeliBarang.getText().isEmpty() ? rs.getString("harga_beli") : inputHargaBeliBarang.getText());
                updatePs.setString(4, inputHargaJualBarang.getText().isEmpty() ? rs.getString("harga_jual") : inputHargaJualBarang.getText());
                updatePs.setString(5, inputStokBarang.getText().isEmpty() ? rs.getString("stok") : inputStokBarang.getText());
                updatePs.setString(6, inputSatuanBarang.getText().isEmpty() ? rs.getString("satuan") : inputSatuanBarang.getText());
                updatePs.setString(7, inputIdBarang.getText().toUpperCase()); // Primary Key
                updatePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Barang Dengan ID : " + inputIdBarang.getText().toUpperCase() + " Berhasil Diubah!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Barang Dengan ID : " + inputIdBarang.getText().toUpperCase() + " Tidak Terdaftar!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mengubah Data Barang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (inputIdBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Barang!");
            return; 
        }
        String sql = "SELECT * FROM barang WHERE id_barang=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdBarang.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sql = "DELETE FROM barang WHERE id_barang=?";
                PreparedStatement deletePs = conn.prepareStatement(sql);
                deletePs.setString(1, inputIdBarang.getText().toUpperCase()); // Primary Key
                deletePs.executeUpdate();
                loadDataTable();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Barang Dengan ID : " + inputCariBarang.getText().toUpperCase() + " Berhasil Dihapus!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Barang Dengan ID : " + inputCariBarang.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menghapus Data Barang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputIdBarang.setText("");
        inputNamaBarang.setText("");
        inputIdKategoriBarang.setText("");
        inputHargaBeliBarang.setText("");
        inputHargaJualBarang.setText("");
        inputStokBarang.setText("");
        inputSatuanBarang.setText("");
        inputNamaKategoriBarang.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cariBarangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBarangBtnActionPerformed
        if (inputCariBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Barang Pada Pencarian!");
            return;
        }
        String sql = "SELECT * FROM barang WHERE id_barang=?";
        try (Connection conn = Connector.getConnection(); 
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputCariBarang.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tableModel = (DefaultTableModel) table.getModel();
                tableModel.setRowCount(0);
                do {
                    Object[] row = new Object[]{
                        rs.getString("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getString("id_kategori"),
                        rs.getString("harga_beli"),
                        rs.getString("harga_jual"),
                        rs.getString("stok"),
                        rs.getString("satuan"),
                        rs.getString("added_by")
                    };
                    tableModel.addRow(row);
                } while (rs.next());
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                    "Data Barang Dengan ID : " + inputCariBarang.getText().toUpperCase() + " Berhasil Ditemukan!");
            } else {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                    "Data Barang Dengan ID : " + inputCariBarang.getText().toUpperCase() + " Tidak Ditemukan!");
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mencari Data Barang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_cariBarangBtnActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (inputIdBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Barang!");
            return; 
        }
        if (inputNamaBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Nama Barang!");
            return;
        }
        if (inputIdKategoriBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Kategori Barang!");
            return;
        }
        if (inputHargaBeliBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Harga Beli Barang!");
            return;
        }
        if (inputHargaJualBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Harga Jual Barang!");
            return;
        }
        if (inputStokBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Stok Barang!");
            return;
        }
        if (inputSatuanBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                    "Tidak Dapat Menyimpan Data Kamu Belum Mengisi Satuan Barang!");
            return;
        }

        String sqlCheck = "SELECT * FROM barang WHERE id_barang=?";
        String sqlInsert = "INSERT INTO barang (id_barang, nama_barang, id_kategori, harga_beli, harga_jual, stok, satuan, added_by) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Connector.getConnection(); PreparedStatement psCheck = conn.prepareStatement(sqlCheck)) {
            psCheck.setString(1, inputIdBarang.getText());
            ResultSet rs = psCheck.executeQuery();
            if (rs.next()) {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                        "Data Barang Dengan ID : " + inputIdBarang.getText().toUpperCase() + " Sudah Terdaftar!");
            } else {
                try (PreparedStatement psInsert = conn.prepareStatement(sqlInsert)) {
                    psInsert.setString(1, inputIdBarang.getText().toUpperCase());
                    psInsert.setString(2, inputNamaBarang.getText());
                    psInsert.setString(3, inputIdKategoriBarang.getText());
                    psInsert.setString(4, inputHargaBeliBarang.getText());
                    psInsert.setString(5, inputHargaJualBarang.getText());
                    psInsert.setString(6, inputStokBarang.getText());
                    psInsert.setString(7, inputSatuanBarang.getText());
                    psInsert.setString(8, RoleManager.getUsernameFromFile());
                    int affectedRows = psInsert.executeUpdate();
                    if (affectedRows > 0) {
                        loadDataTable();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                            "Data Barang Dengan ID : " + inputIdBarang.getText().toUpperCase() + " Berhasil Di Simpan!");
                    }
                }
            }
            
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Menyimpan Data Barang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void cariKategoriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariKategoriBtnActionPerformed
        if (inputIdKategoriBarang.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.BOTTOM_RIGHT,
                "Tidak Dapat Menyimpan Data Kamu Belum Mengisi ID Kategori Barang Pada Pencarian!");
        }
        String sql = "SELECT * FROM kategori WHERE kode_kategori=?";
        try (Connection conn = Connector.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inputIdKategoriBarang.getText());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                        "Data Kategori Barang Dengan ID : " + inputIdKategoriBarang.getText().toUpperCase() + " Berhasil Ditemukan!");
                    inputNamaKategoriBarang.setText(rs.getString("nama_kategori"));
                    inputNamaKategoriBarang.setEnabled(false);
                } else {
                    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_RIGHT,
                        "Data Kategori Barang Dengan ID : " + inputIdKategoriBarang.getText().toUpperCase() + " Tidak Ditemukan!");
                }
            }
        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                "Terjadi Kesalahan Saat Mencari Data Kategori Barang");
            e.printStackTrace();
        }
    }//GEN-LAST:event_cariKategoriBtnActionPerformed

    private void inputSatuanBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSatuanBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSatuanBarangActionPerformed

    private void inputHargaJualBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaJualBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaJualBarangActionPerformed

    private void inputIdKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdKategoriBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdKategoriBarangActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariBarangBtn;
    private javax.swing.JButton cariKategoriBtn;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField inputCariBarang;
    private javax.swing.JTextField inputHargaBeliBarang;
    private javax.swing.JTextField inputHargaJualBarang;
    private javax.swing.JTextField inputIdBarang;
    private javax.swing.JTextField inputIdKategoriBarang;
    private javax.swing.JTextField inputNamaBarang;
    private javax.swing.JTextField inputNamaKategoriBarang;
    private javax.swing.JTextField inputSatuanBarang;
    private javax.swing.JTextField inputStokBarang;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
