-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2025 at 12:05 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugas`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `id_kategori` int(11) NOT NULL,
  `harga_beli` decimal(15,2) NOT NULL,
  `harga_jual` decimal(15,2) NOT NULL,
  `stok` int(11) NOT NULL DEFAULT 0,
  `satuan` varchar(50) NOT NULL,
  `added_by` varchar(12) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `id_kategori`, `harga_beli`, `harga_jual`, `stok`, `satuan`, `added_by`, `created_at`, `updated_at`) VALUES
('BRG001', 'Oli', 1, 35000.00, 40000.00, 100, 'Botol', 'tobz', '2025-06-16 11:39:31', '2025-06-16 11:39:31'),
('BRG002', 'Kampas Rem Depan', 1, 50000.00, 65000.00, 50, 'Set', 'tobz', '2025-06-16 11:39:31', '2025-06-16 11:39:31'),
('BRG003', 'Spion Motor Vario', 2, 25000.00, 40000.00, 70, 'Pasang', 'tobz', '2025-06-16 11:39:31', '2025-06-16 11:39:31');

-- --------------------------------------------------------

--
-- Table structure for table `barang_keluar`
--

CREATE TABLE `barang_keluar` (
  `id_keluar` varchar(10) NOT NULL,
  `id_barang` varchar(10) DEFAULT NULL,
  `id_pelanggan` varchar(10) DEFAULT NULL,
  `tanggal_keluar` timestamp NOT NULL DEFAULT current_timestamp(),
  `jumlah` int(11) DEFAULT NULL,
  `harga_keluar` decimal(15,2) DEFAULT NULL,
  `id_gudang` varchar(10) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_keluar`
--

INSERT INTO `barang_keluar` (`id_keluar`, `id_barang`, `id_pelanggan`, `tanggal_keluar`, `jumlah`, `harga_keluar`, `id_gudang`, `updated_at`) VALUES
('BK001', 'BRG001', 'PG001', '2025-06-24 05:20:04', 20, 20000.00, 'GD001', '2025-06-24 05:20:04');

-- --------------------------------------------------------

--
-- Table structure for table `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `id_masuk` varchar(10) NOT NULL,
  `id_barang` varchar(10) DEFAULT NULL,
  `id_pemasok` varchar(10) DEFAULT NULL,
  `tanggal_masuk` timestamp NOT NULL DEFAULT current_timestamp(),
  `jumlah` int(11) DEFAULT NULL,
  `harga_masuk` int(11) DEFAULT NULL,
  `id_gudang` varchar(10) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_masuk`
--

INSERT INTO `barang_masuk` (`id_masuk`, `id_barang`, `id_pemasok`, `tanggal_masuk`, `jumlah`, `harga_masuk`, `id_gudang`, `updated_at`) VALUES
('BM001', 'BRG001', 'PM001', '2025-06-23 18:45:34', 100, 100000, 'GD001', '2025-06-23 18:45:34');

-- --------------------------------------------------------

--
-- Table structure for table `gudang`
--

CREATE TABLE `gudang` (
  `id_gudang` varchar(20) NOT NULL,
  `nama_gudang` varchar(100) NOT NULL,
  `lokasi` text DEFAULT NULL,
  `id_kepala_gudang` varchar(12) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `gudang`
--

INSERT INTO `gudang` (`id_gudang`, `nama_gudang`, `lokasi`, `id_kepala_gudang`, `created_at`, `updated_at`) VALUES
('GD001', 'Gudang Pusat', 'Jl. Merdeka No.1', 'admin_001', '2025-06-16 11:40:03', '2025-06-23 18:36:34');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(11) NOT NULL,
  `kode_kategori` varchar(10) NOT NULL,
  `nama_kategori` varchar(100) NOT NULL,
  `deskripsi` text DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `kode_kategori`, `nama_kategori`, `deskripsi`, `created_at`, `updated_at`) VALUES
(1, 'KG001', 'Sparepart', 'Komponen kendaraan bermotor', '2025-06-16 11:40:18', '2025-06-24 07:46:38'),
(2, 'KG002', 'Aksesoris', 'Perlengkapan tambahan untuk kendaraan', '2025-06-16 11:40:18', '2025-06-24 07:46:47'),
(3, 'KG003', 'Motor', 'Unit kendaraan bermotor lengkap', '2025-06-16 11:40:18', '2025-06-24 07:46:58'),
(5, 'KG004', 'Mobil', 'Unit kendaraan roda empat', '2025-07-08 10:01:30', '2025-07-08 10:01:30');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` varchar(100) NOT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `jenis_kelamin` enum('Laki - laki','Perempuan') DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `no_telp`, `email`, `jenis_kelamin`, `created_at`, `updated_at`) VALUES
('PG001', 'Siti Aminah', 'Jl. Kenanga No.45, Bekasi', '085612345678', 'sitiaminah@gmail.com', 'Perempuan', '2025-06-16 12:34:50', '2025-06-16 13:38:51'),
('PG002', 'Dian Purnama', 'Jl. Anggrek No.15, Bandung', '081234111222', 'dian.purnama@gmail.com', 'Laki - laki', '2025-06-16 13:37:16', '2025-06-16 13:37:16'),
('PG003', 'Hendra Wijaya', 'Jl. Mangga Besar No.88, Jakarta Barat', '082134556677', 'hendra.wijaya@ymail.com', 'Laki - laki', '2025-06-16 13:37:16', '2025-06-16 13:37:16'),
('PG004', 'Fitri Rahmawati', 'Jl. Kalimantan No.17, Surabaya', '085677889900', 'fitri.rahma@mail.com', 'Perempuan', '2025-06-16 13:37:16', '2025-06-16 13:37:16'),
('PG005', 'Rizky Maulana', 'Jl. Sisingamangaraja No.21, Medan', '089512347890', 'rizky.maulana@outlook.com', 'Laki - laki', '2025-06-16 13:37:16', '2025-06-16 13:37:16'),
('PG006', 'Yuliana Tania', 'Jl. Cempaka Putih No.3, Yogyakarta', '087712344321', 'yuliana.tania@gmail.com', 'Perempuan', '2025-06-16 13:37:16', '2025-06-16 13:37:16');

-- --------------------------------------------------------

--
-- Table structure for table `pemasok`
--

CREATE TABLE `pemasok` (
  `id_pemasok` varchar(10) NOT NULL,
  `nama_pemasok` varchar(30) NOT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `kontak_person` varchar(30) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pemasok`
--

INSERT INTO `pemasok` (`id_pemasok`, `nama_pemasok`, `alamat`, `no_telp`, `kontak_person`, `created_at`, `updated_at`) VALUES
('PM001', 'PT Prima Suku Cadang', 'Jl. Industri No. 45, Jakarta Timur', '021-88888888', 'Budi Santoso', '2025-06-16 12:30:09', '2025-06-16 12:30:09'),
('PM002', 'CV Motor Jaya', 'Jl. Raya Bogor KM 22, Depok', '021-77777777', 'Siti Aminah', '2025-06-16 13:34:51', '2025-06-16 13:34:51'),
('PM003', 'PT Partindo Sejahtera', 'Jl. Veteran No. 10, Bandung', '022-99999999', 'Andi Kurniawan', '2025-06-16 13:34:51', '2025-06-16 13:34:51');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` varchar(10) NOT NULL,
  `tanggal_penjualan` timestamp NOT NULL DEFAULT current_timestamp(),
  `id_pelanggan` varchar(10) DEFAULT NULL,
  `total_harga` decimal(15,2) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `tanggal_penjualan`, `id_pelanggan`, `total_harga`, `updated_at`) VALUES
('PJ001', '2025-06-24 06:25:20', 'PG001', 100000.00, '2025-06-24 06:25:20');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` varchar(12) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` enum('Admin','KepalaGudang','Manager') DEFAULT 'KepalaGudang',
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `fullname`, `username`, `password`, `role`, `created_at`, `updated_at`) VALUES
('admin_001', 'Tobi Saputra', 'tobz', 'admin', 'Admin', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('admin_002', 'Ishafakhri Akbar', 'ishafakhri', 'admin', 'Admin', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('gudang_001', 'Azizan Ramadhan', 'azizan', 'gudang', 'KepalaGudang', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('gudang_002', 'Satrio Baskoro', 'satrio', 'gudang', 'KepalaGudang', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('gudang_003', 'Endriyan Ramadhan', 'endriyan', 'gudang', 'KepalaGudang', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('manager_001', 'Fachri Akbar', 'fachri', 'manager', 'Manager', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('manager_002', 'Ridho Alfiansyah', 'ridho', 'manager', 'Manager', '2025-06-16 12:50:40', '2025-06-16 12:50:40'),
('manager_003', 'Muhammad Zulfahmi', 'zulfahmi', 'manager', 'Manager', '2025-06-16 12:50:40', '2025-06-16 12:50:40');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `fk_username_user` (`added_by`),
  ADD KEY `kode_kategori` (`id_kategori`) USING BTREE;

--
-- Indexes for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD PRIMARY KEY (`id_keluar`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pelanggan` (`id_pelanggan`),
  ADD KEY `id_gudang` (`id_gudang`);

--
-- Indexes for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`id_masuk`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pemasok` (`id_pemasok`),
  ADD KEY `id_gudang` (`id_gudang`);

--
-- Indexes for table `gudang`
--
ALTER TABLE `gudang`
  ADD PRIMARY KEY (`id_gudang`),
  ADD KEY `id_kepala_gudang` (`id_kepala_gudang`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`),
  ADD UNIQUE KEY `kode_kategori` (`kode_kategori`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `pemasok`
--
ALTER TABLE `pemasok`
  ADD PRIMARY KEY (`id_pemasok`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`),
  ADD CONSTRAINT `fk_username_user` FOREIGN KEY (`added_by`) REFERENCES `users` (`username`);

--
-- Constraints for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD CONSTRAINT `barang_keluar_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`),
  ADD CONSTRAINT `barang_keluar_ibfk_2` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`),
  ADD CONSTRAINT `barang_keluar_ibfk_3` FOREIGN KEY (`id_gudang`) REFERENCES `gudang` (`id_gudang`);

--
-- Constraints for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`),
  ADD CONSTRAINT `barang_masuk_ibfk_2` FOREIGN KEY (`id_pemasok`) REFERENCES `pemasok` (`id_pemasok`),
  ADD CONSTRAINT `barang_masuk_ibfk_3` FOREIGN KEY (`id_gudang`) REFERENCES `gudang` (`id_gudang`);

--
-- Constraints for table `gudang`
--
ALTER TABLE `gudang`
  ADD CONSTRAINT `gudang_ibfk_1` FOREIGN KEY (`id_kepala_gudang`) REFERENCES `users` (`id_user`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
