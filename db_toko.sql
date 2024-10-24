-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 24, 2024 at 11:07 AM
-- Server version: 8.3.0
-- PHP Version: 8.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_toko`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` bigint NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `harga` int NOT NULL,
  `stok` int NOT NULL,
  `id_supplier` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `nama_barang`, `harga`, `stok`, `id_supplier`) VALUES
(18, 'qwee', 2000, 200, 1),
(19, 'aqua', 3000, 100, 1),
(20, 'asd', 1000, 25, 2),
(21, 'tissue passeo', 10000, 17, 1),
(22, 'zxc', 2000, 10, 3),
(123123, 'qewqweq', 1234, 980, 2),
(8995757107008, 'kiky', 2000, 48, 1),
(6924247486233000000, 'pulepn', 3000, 20, 1);

-- --------------------------------------------------------

--
-- Table structure for table `calon_karyawan`
--

CREATE TABLE `calon_karyawan` (
  `id` int NOT NULL,
  `nama` text NOT NULL,
  `email` text NOT NULL,
  `password` varchar(255) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `kondisi` enum('Pending','Diterima','Ditolak','') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `calon_karyawan`
--

INSERT INTO `calon_karyawan` (`id`, `nama`, `email`, `password`, `no_hp`, `alamat`, `kondisi`) VALUES
(3, 'Rizqi', 'rizqi@gmail.com', '123', '084546948484844', 'qwe,asd,zxc', 'Diterima'),
(4, 'supri', 'supri@gmail.com', 'supri', '0875786', 'suprii', 'Diterima');

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE `profile` (
  `id` int NOT NULL,
  `nama` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `posisi` enum('Admin','Kasir') NOT NULL DEFAULT 'Kasir'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `profile`
--

INSERT INTO `profile` (`id`, `nama`, `email`, `password`, `alamat`, `no_hp`, `posisi`) VALUES
(1, 'qwe', 'qwe@gmail.com', '123', 'qwe123', '098089', 'Admin'),
(2, 'asd', 'asd@gmail.com', '123', 'asd123', '989', 'Kasir'),
(34, 'zxc', 'zxc@gmail.com', '123', 'zxc123', '123123132', 'Kasir'),
(42, 'Rizqi', 'rizqi@gmail.com', '123', 'qwe,asd,zxc', '084546948484844', 'Kasir'),
(43, 'supri', 'supri@gmail.com', 'supri', 'suprii', '0875786', 'Kasir');

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_barang`
--

CREATE TABLE `riwayat_barang` (
  `id` int NOT NULL,
  `id_barang` bigint NOT NULL,
  `jumlah_barang` int NOT NULL,
  `status` enum('Masuk','Keluar') NOT NULL,
  `tanggal` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_transaksi` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `riwayat_barang`
--

INSERT INTO `riwayat_barang` (`id`, `id_barang`, `jumlah_barang`, `status`, `tanggal`, `id_transaksi`) VALUES
(104, 123123, 5, 'Keluar', '2024-09-19 14:04:30', 18),
(105, 21, 5, 'Masuk', '2024-09-19 14:19:58', NULL),
(106, 22, 10, 'Masuk', '2024-09-19 14:20:27', NULL),
(107, 21, 3, 'Keluar', '2024-09-19 14:46:27', 19),
(108, 8995757107008, 2, 'Keluar', '2024-09-19 14:46:27', 19);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` int NOT NULL,
  `kode` varchar(15) NOT NULL,
  `nama` text NOT NULL,
  `email` varchar(255) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `rekening` varchar(32) NOT NULL,
  `kode_pos` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `fax` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `kode`, `nama`, `email`, `telepon`, `rekening`, `kode_pos`, `alamat`, `fax`) VALUES
(1, 'asd123', 'ASd', '123@fasd.cp', '123341', 'qdq31241dqw', '1231', '1243asdae132', '1243daqwe1'),
(2, 'qwe123', 'asdwqad', 'asdqwe@gs', '123', '142adsqa', '124312', '124qda3q4', '123sads'),
(3, 'zxcasd', 'Qseqwe', 'Sdqw2e@weqa.klo', '0965650', '054464', '0456456464', 'sdfsafsd,fghfdhfg', 'dfhgdfgdfgd'),
(6, '1243oads', 'wdelenmnt', 'asd@gmail.com', '08192798979', '09127489571', '7861724', 'uyiqiuwr, uytiuyqwr, uyiuqwr', '8618724');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int NOT NULL,
  `total_transaksi` int NOT NULL,
  `tgl_transaksi` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `total_transaksi`, `tgl_transaksi`) VALUES
(18, 6170, '2024-09-19 14:04:30'),
(19, 34000, '2024-09-19 14:46:27');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nama_barang` (`nama_barang`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `calon_karyawan`
--
ALTER TABLE `calon_karyawan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `no_hp` (`no_hp`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `riwayat_barang`
--
ALTER TABLE `riwayat_barang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kode` (`kode`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6924247486233000001;

--
-- AUTO_INCREMENT for table `calon_karyawan`
--
ALTER TABLE `calon_karyawan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `profile`
--
ALTER TABLE `profile`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `riwayat_barang`
--
ALTER TABLE `riwayat_barang`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=109;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `riwayat_barang`
--
ALTER TABLE `riwayat_barang`
  ADD CONSTRAINT `riwayat_barang_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `riwayat_barang_ibfk_2` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
