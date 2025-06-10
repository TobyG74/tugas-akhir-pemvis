package com.tugas.application.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.tugas.database.Connector;
import com.tugas.swing.card.ModelCard;
import com.tugas.toast.Notifications;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tobi
 */
public class FormDashboard extends javax.swing.JPanel {
    private DefaultTableModel tableModel;

    public FormDashboard() {
        initComponents();
        init();
    }
    
    public void init() {
        tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        
        String sql = "SELECT * FROM users";
        try (Connection conn = Connector.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getString("id_user"), // ID
                        rs.getString("fullname"), // Nama
                        rs.getString("username"), // Username
                        rs.getString("role"), // Role
                        rs.getString("created_at"), // Tanggal Bergabung
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Terjadi Kesalahan Saat Mencoba Mengupdate Data Tabel!");
        }

        card1.setData(new ModelCard(null, null, null, "$ 500.00", "Report Income Monthly"));
        card2.setData(new ModelCard(null, null, null, "$ 800.00", "Report Expense Monthly"));
        card3.setData(new ModelCard(null, null, null, "$ 300.00", "Report Profit Monthly"));
        
        card1.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        card2.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        card3.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        
        java.awt.Color labelColor = javax.swing.UIManager.getColor("Menu.title.foreground");
        card1.setDescriptionColor(labelColor);
        card1.setValuesColor(labelColor);
        card2.setDescriptionColor(labelColor);
        card2.setValuesColor(labelColor);
        card3.setDescriptionColor(labelColor);
        card3.setValuesColor(labelColor);
        
        jScrollPane1.putClientProperty(FlatClientProperties.STYLE, ""
            + "border:null");
        
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        table.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        roundPanel1.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        
        card1.setValues(totalBarang());
        card1.setDescription("Total Barang");
        
        card2.setValues("Rp100.000");
        card3.setDescription("Total Penjualan");
        
        card3.setValues(totalUser());
        card3.setDescription("Total Pengguna");
    }
    
    private String totalBarang() {
        String sql = "select count(*) from barang";
        try (Connection conn = Connector.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0";
    }
    
    private String totalUser() {
        String sql = "select count(*) from users";
        try (Connection conn = Connector.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.tugas.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        card1 = new com.tugas.swing.card.Card();
        card3 = new com.tugas.swing.card.Card();
        card2 = new com.tugas.swing.card.Card();

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Lengkap", "Username", "Posisi", "Tanggal Bergabung"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card1.setColor1(new java.awt.Color(255, 255, 0));
        card1.setColor2(new java.awt.Color(255, 153, 0));
        card1.setDescription("Total Barang");
        card1.setIcon(com.tugas.utils.iconfont.GoogleMaterialDesignIcon.SHOP_TWO);
        card1.setValues("0");

        card3.setDescription("Total Pengguna");
        card3.setIcon(com.tugas.utils.iconfont.GoogleMaterialDesignIcon.PEOPLE);
        card3.setValues("0");

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDescription("Pendapatan Bulanan");
        card2.setIcon(com.tugas.utils.iconfont.GoogleMaterialDesignIcon.PIE_CHART);
        card2.setValues("Rp100.000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.tugas.swing.card.Card card1;
    private com.tugas.swing.card.Card card2;
    private com.tugas.swing.card.Card card3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.tugas.swing.RoundPanel roundPanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
