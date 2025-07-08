# Sistem Manajemen Inventory - Tugas Akhir Pemrograman Visual

![Java](https://img.shields.io/badge/Java-11+-orange)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![NetBeans](https://img.shields.io/badge/IDE-NetBeans-green)

## Anggota Kelompok

1. Endriyan Ramadhan - 2595
2. Azizan Ramadhan - 2583
3. Ridho Alfiansyah Yuharian - 2644
4. Satrio Baskoro - 2589
5. Tobi Saputra - 2612
6. Fachri Akbar - 2642
7. Ishafakhri Akbar - 2587
8. Muhammad Zulfahmi - 2609

## 📑 Daftar Isi

-   [📋 Deskripsi Project](#-deskripsi-project)
-   [✨ Fitur Utama](#-fitur-utama)
    -   [🏢 Manajemen Master Data](#-manajemen-master-data)
    -   [📊 Laporan dan Transaksi](#-laporan-dan-transaksi)
    -   [🔐 Sistem Keamanan](#-sistem-keamanan)
    -   [🎨 User Interface](#-user-interface)
-   [🛠 Teknologi yang Digunakan](#-teknologi-yang-digunakan)
    -   [Backend](#backend)
    -   [Frontend](#frontend)
    -   [Libraries dan Dependencies](#libraries-dan-dependencies)
-   [📁 Struktur Project](#-struktur-project)
-   [⚙️ Setup dan Instalasi](#️-setup-dan-instalasi)
    -   [Prerequisites](#prerequisites)
    -   [Langkah Instalasi](#langkah-instalasi)
    -   [Langkah Instalasi Plugin NetBeans](#langkah-instalasi-plugin-netbeans)
-   [🗄️ Struktur Database](#️-struktur-database)
    -   [Tabel Utama](#tabel-utama)
    -   [Relasi Database](#relasi-database)
    -   [Konfigurasi Menu dan Form](#konfigurasi-menu-dan-form)
-   [🎯 Cara Penggunaan](#-cara-penggunaan)
    -   [Login System](#login-system)
    -   [Navigasi Menu](#navigasi-menu)
    -   [Form Management](#form-management)
-   [📊 Fitur Laporan](#-fitur-laporan)
    -   [Export Capabilities](#export-capabilities)
    -   [Jenis Laporan](#jenis-laporan)
-   [🎨 Customization](#-customization)
    -   [Theme Configuration](#theme-configuration)
    -   [Custom Components](#custom-components)
-   [🔧 Maintenance dan Development](#-maintenance-dan-development)
    -   [Code Structure](#code-structure)
    -   [Best Practices](#best-practices)
-   [🐛 Troubleshooting](#-troubleshooting)
    -   [Common Issues](#common-issues)
-   [👥 Special Credits](#-special-credits)

## 📋 Deskripsi Project

Sistem Manajemen Inventory adalah aplikasi desktop berbasis Java Swing yang dirancang untuk mengelola stok barang, gudang, dan operasi inventory perusahaan. Aplikasi ini menyediakan interface yang user-friendly dengan tema modern menggunakan FlatLaf dan dilengkapi dengan fitur manajemen yang komprehensif.

## ✨ Fitur Utama

### 🏢 Manajemen Master Data

-   **Barang**: Kelola data barang dengan kategori, harga, dan stok
-   **Kategori**: Manajemen kategori produk
-   **Pemasok**: Data supplier dan vendor
-   **Pelanggan**: Database customer dan klien
-   **Gudang**: Manajemen lokasi penyimpanan
-   **Karyawan**: Data pegawai dan user sistem

### 📊 Laporan dan Transaksi

-   **Barang Masuk**: Pencatatan barang yang masuk ke gudang
-   **Barang Keluar**: Tracking barang yang keluar
-   **Penjualan**: Laporan transaksi penjualan
-   **Stok**: Monitoring inventory real-time
-   **Export PDF/Excel**: Ekspor laporan ke berbagai format

### 🔐 Sistem Keamanan

-   **Login System**: Autentikasi user dengan role-based access
-   **Password Management**: Fitur ganti password
-   **Role Manager**: Pengelolaan hak akses user

### 🎨 User Interface

-   **Modern Theme**: Menggunakan FlatLaf dengan tema dark/light
-   **Responsive Design**: Layout yang adaptif
-   **Toast Notifications**: Notifikasi real-time
-   **Custom Components**: Komponen UI yang disesuaikan

## 🛠 Teknologi yang Digunakan

### Backend

-   **Java 11+**: Bahasa pemrograman utama
-   **JDBC**: Koneksi database
-   **MySQL**: Database management system

### Frontend

-   **Java Swing**: GUI framework
-   **FlatLaf**: Modern look and feel
-   **MigLayout**: Layout manager
-   **JFreeChart**: Charting library

### Libraries dan Dependencies

-   **FlatLaf 3.6**: Modern UI theme
-   **MySQL Connector 9.3.0**: Database connectivity
-   **dotenv-java 3.2.0**: Environment variable management
-   **iText 5.5.13**: PDF generation
-   **JCalendar 1.4**: Date picker component
-   **Swing Toast Notifications**: User feedback
-   **JasperReports 5.5.0**: Report generation

## 📁 Struktur Project

```
tugas-pemvis/
├── src/
│   └── com/tugas/
│       ├── application/           # Main application logic
│       │   ├── form/             # Form components
│       │   ├── login/            # Authentication
│       │   └── report/           # Report modules
│       ├── database/             # Database connectivity
│       ├── manager/              # Business logic managers
│       ├── menu/                 # Navigation components
│       ├── swing/                # Custom UI components
│       ├── theme/                # UI themes
│       ├── toast/                # Notification system
│       └── utils/                # Utility classes
├── lib/                          # External libraries
```

## ⚙️ Setup dan Instalasi

### Prerequisites

-   Java Development Kit (JDK) 11 atau lebih tinggi
-   MySQL Server 5.7+
-   NetBeans IDE (recommended)

### Langkah Instalasi

1. **Clone Repository**

    ```bash
    git clone [repository-url]
    cd tugas-pemvis
    ```

2. **Setup Database**

    - Buat database MySQL baru
    - Import skema database (jika tersedia)
    - Konfigurasi koneksi database

3. **Environment Configuration**

    - Buat file `.env` di root directory

    ```env
    DATABASE_URL=jdbc:mysql://localhost:3306/nama_database
    DATABASE_USER=username
    DATABASE_PASSWORD=password
    ```

4. **Import Project**

    - Buka NetBeans IDE
    - Import project sebagai Java Application
    - Pastikan semua dependencies ter-load

5. **Run Application**
    - Build project (F11)
    - Run main class `Application.java`

### Langkah Instalasi Plugin NetBeans

1. **Buka NetBeans IDE**
2. **Buka Menu Tools > Plugins**
3. **Pilih Tab Downloaded**
4. **Klik Add Plugins**
5. **Pilih file plugin yang ada di folder `plugin`**

## 🗄️ Struktur Database

### Tabel Utama

-   `barang` - Data produk dan inventory
-   `kategori` - Kategori produk
-   `pemasok` - Data supplier
-   `pelanggan` - Data customer
-   `gudang` - Lokasi penyimpanan
-   `users` - Data pengguna sistem
-   `barang_masuk` - Transaksi barang masuk
-   `barang_keluar` - Transaksi barang keluar

### Relasi Database

```sql
-- Contoh struktur tabel gudang
CREATE TABLE gudang (
    id_gudang VARCHAR(20) PRIMARY KEY,
    nama_gudang VARCHAR(100) NOT NULL,
    id_kepala_gudang VARCHAR(20),
    lokasi TEXT,
    FOREIGN KEY (id_kepala_gudang) REFERENCES users(id_user)
);
```

### Konfigurasi Klik Menu Pada File [MainForm.java](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/application/login/MainForm.java)

```java
private void initMenuEvent() {
    menu.addMenuEvent((int index, int subIndex, MenuAction action) -> {
        if (index == 0 && subIndex == 0) {
                Application.showForm(new FormDashboard());
        } else if (index == 1 && subIndex == 0) {
                Application.showForm(new FormItems());
        } else if (index == 12 && subIndex == 0) {
                Application.logout();
        }
    });
}
```

### Konfigurasi Penamaan Menu Pada File [Menu.java](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/menu/Menu.java)

```java
private final String menuItems[][] = {
        {"~Menu Utama~"},
        {"Beranda"},
        {"~Menu Form~"},
        {"Barang"},
        {"Kategori"},
        {"Pemasok"},
        {"Pelanggan"},
        {"Gudang"},
        {"Karyawan"},
        {"~Menu Laporan~"},
        {"Barang Masuk"},
        {"Barang Keluar"},
        {"Penjualan"},
        {"Stok"},
        {"~Menu Pengguna~"},
        {"Ganti Password"},
        {"Logout"}
    };
```

### Konfigurasi Icon Pada Folder [Icon](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/menu/icon)

### Pembuatan Form Pada Folder [Form](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/application/form)

## 🎯 Cara Penggunaan

### Login System

1. Jalankan aplikasi
2. Masukkan credentials user
3. Sistem akan memvalidasi dan mengarahkan ke dashboard

### Navigasi Menu

-   **Menu Utama**: Dashboard dan overview
-   **Menu Form**: CRUD operations untuk master data
-   **Menu Laporan**: Generate dan view reports
-   **Menu Pengguna**: User management

### Form Management

Setiap form dilengkapi dengan operasi CRUD:

-   **Simpan**: Menambah data baru
-   **Ubah**: Modifikasi data existing
-   **Hapus**: Delete data
-   **Ulang**: Reset form input
-   **Cari**: Search dan filter data

### Contoh Penggunaan Form Gudang

```java
// Konfigurasi event handler untuk form
private void saveButtonActionPerformed(ActionEvent evt) {
    // Validasi input
    if (inputIdGudang.getText().isEmpty()) {
        showNotification("ID Gudang tidak boleh kosong!");
        return;
    }

    // Simpan ke database
    saveToDatabase();

    // Refresh table
    loadDataTable();
}
```

## 📊 Fitur Laporan

### Export Capabilities

-   **PDF Export**: Menggunakan iText library
-   **Excel Export**: Format spreadsheet
-   **Print Preview**: Preview sebelum print

### Jenis Laporan

-   Laporan Stok Real-time
-   Laporan Barang Masuk/Keluar
-   Laporan Penjualan Periodic
-   Laporan Inventory Analysis

## 🎨 Customization

### Theme Configuration

```java
// Setup FlatLaf theme
FlatMacDarkLaf.setup();
UIManager.setLookAndFeel(new FlatMacDarkLaf());

// Custom styling
component.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
```

### Custom Components

Project menggunakan komponen custom seperti:

-   `RoundPanel`: Panel dengan rounded corners
-   Custom buttons dengan styling
-   Toast notifications untuk feedback

## 🔧 Maintenance dan Development

### Code Structure

-   **MVC Pattern**: Separation of concerns
-   **Database Layer**: Centralized in `Connector.java`
-   **UI Components**: Modular design
-   **Error Handling**: Comprehensive exception handling

### Best Practices

-   Input validation pada setiap form
-   Transaction management untuk database operations
-   Resource cleanup (Connection, PreparedStatement, ResultSet)
-   User feedback melalui notifications

## 🐛 Troubleshooting

### Common Issues

1. **Database Connection Error**

    - Periksa konfigurasi `.env` file
    - Pastikan MySQL service running
    - Verify credentials dan database name

2. **UI Not Loading Properly**

    - Pastikan FlatLaf library ter-load
    - Check Java version compatibility
    - Verify all resources available

3. **Memory Issues**
    - Increase JVM heap size
    - Implement proper resource cleanup
    - Optimize database queries

## 📄 License

Project ini menggunakan lisensi sesuai dengan ketentuan tugas akhir pemrograman visual.

## 👥 Special Credits

-   [DJ-Raven](https://github.com/DJ-Raven)

## 📞 Support

Untuk pertanyaan atau dukungan teknis, silakan hubungi:

-   Email: tobisaputra11@gmail.com
-   GitHub Issues: [repository-issues-url](https://github.com/TobyG74/tugas-akhir-pemvis/issues)

## 🔄 Version History

-   **v1.0.0**: Initial release dengan fitur dasar CRUD
-   **v1.1.0**: Penambahan sistem laporan
-   **v1.2.0**: UI improvements dan optimisasi

---
