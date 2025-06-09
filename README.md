# TUGAS AKHIR PEMROGRAMAN VISUAL

# Konfigurasi Klik Menu Pada File [MainForm.java](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/application/login/MainForm.java)

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

# Konfigurasi Penamaan Menu Pada File [Menu.java](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/menu/Menu.java)

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

# Konfigurasi Icon Pada Folder [Icon](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/menu/icon)

# Pembuatan Form Pada Folder [Form](https://github.com/TobyG74/tugas-akhir-pemvis/blob/master/src/com/tugas/application/form)

# Special Credits :

-   [DJ-Raven](https://github.com/DJ-Raven)
