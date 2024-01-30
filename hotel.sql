-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 30, 2024 at 03:39 AM
-- Server version: 8.0.30
-- PHP Version: 8.2.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `id` int NOT NULL,
  `kode_kamar` int NOT NULL,
  `tipe_kamar` enum('ac','non ac') COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'ac',
  `harga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`id`, `kode_kamar`, `tipe_kamar`, `harga`) VALUES
(1, 101, 'ac', 350000),
(2, 102, 'non ac', 250000),
(3, 102, 'non ac', 250000),
(4, 103, 'ac', 350000),
(5, 105, 'ac', 700000);

-- --------------------------------------------------------

--
-- Table structure for table `reservasi`
--

CREATE TABLE `reservasi` (
  `id` int NOT NULL,
  `kode_kamar` int NOT NULL,
  `id_tamu` int NOT NULL,
  `check_in` date DEFAULT NULL,
  `check_out` date DEFAULT NULL,
  `total_harga` double NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `reservasi`
--

INSERT INTO `reservasi` (`id`, `kode_kamar`, `id_tamu`, `check_in`, `check_out`, `total_harga`, `created_at`, `updated_at`) VALUES
(115, 101, 1, '2024-01-01', '2024-01-05', 1750000, '2024-01-23 10:39:14', '2024-01-23 10:39:14'),
(116, 102, 2, '2024-01-01', '2024-01-05', 1750000, '2024-01-23 10:39:14', '2024-01-23 10:39:14'),
(117, 101, 4, '2024-01-01', '2024-01-05', 1750000, '2024-01-23 11:54:46', '2024-01-23 11:54:46'),
(118, 101, 5, '2024-01-01', '2024-01-05', 1750000, '2024-01-23 12:04:46', '2024-01-23 12:04:46'),
(119, 101, 6, '2024-01-01', '2024-01-05', 1750000, '2024-01-23 19:10:37', '2024-01-23 19:10:37'),
(120, 101, 7, '2024-01-26', '2024-01-28', 1050000, '2024-01-23 21:10:50', '2024-01-23 21:10:50'),
(121, 102, 8, '2024-01-20', '2024-01-22', 500000, '2024-01-27 23:02:45', '2024-01-27 23:02:45'),
(122, 101, 9, '2024-01-20', '2024-01-22', 700000, '2024-01-27 23:08:43', '2024-01-27 23:08:43'),
(123, 101, 10, '2024-01-20', '2024-01-21', 350000, '2024-01-27 23:41:12', '2024-01-27 23:41:12'),
(124, 102, 11, '2024-01-20', '2024-01-21', 250000, '2024-01-28 23:18:45', '2024-01-28 23:18:45'),
(125, 101, 12, '2024-01-23', '2024-01-25', 500000, '2024-01-28 23:38:03', '2024-01-28 23:38:03'),
(126, 102, 13, '2024-01-25', '2024-01-26', 500000, '2024-01-30 10:15:47', '2024-01-30 10:15:47');

-- --------------------------------------------------------

--
-- Table structure for table `tamu`
--

CREATE TABLE `tamu` (
  `id` int NOT NULL,
  `nama` varchar(70) COLLATE utf8mb4_general_ci NOT NULL,
  `kode_kamar` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tamu`
--

INSERT INTO `tamu` (`id`, `nama`, `kode_kamar`) VALUES
(1, 'Taufik Fajar', 101),
(2, 'Ridwan', 102),
(3, 'Apdya', 102),
(4, 'Hadi', 101),
(5, 'Hadi', 101),
(6, 'Taufik', 101),
(7, 'Adi', 101),
(8, 'Tono', 102),
(9, 'Budi', 101),
(10, 'giring', 101),
(11, 'Doni', 102),
(13, 'Budi', 102);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reservasi`
--
ALTER TABLE `reservasi`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `tamu`
--
ALTER TABLE `tamu`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kamar`
--
ALTER TABLE `kamar`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `reservasi`
--
ALTER TABLE `reservasi`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=127;

--
-- AUTO_INCREMENT for table `tamu`
--
ALTER TABLE `tamu`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
