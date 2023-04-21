-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 20, 2023 at 01:15 PM
-- Server version: 8.0.17
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petfarm`
--

-- --------------------------------------------------------

--
-- Table structure for table `petfarm`
--

CREATE TABLE `petfarm` (
  `id` varchar(10) NOT NULL,
  `bleed` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `birthdate` date NOT NULL,
  `weight` float(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `petfarm`
--

INSERT INTO `petfarm` (`id`, `bleed`, `name`, `birthdate`, `weight`) VALUES
('06/001', 'Chizord', 'SS1', '2545-01-22', 5.00),
('06/002', 'Chizord', 'SS1', '0000-00-00', 5.00),
('10006', 'Chi Hua Hua', 'Jacky', '2022-05-13', 1.50),
('2545', '2545', 'prayut', '0000-00-00', 158.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `petfarm`
--
ALTER TABLE `petfarm`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
