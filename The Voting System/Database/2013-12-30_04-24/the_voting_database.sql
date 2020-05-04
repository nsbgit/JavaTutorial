-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 29, 2013 at 10:53 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `the_voting_database`
--
CREATE DATABASE IF NOT EXISTS `the_voting_database` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `the_voting_database`;

-- --------------------------------------------------------

--
-- Table structure for table `admin_registration_information`
--

CREATE TABLE IF NOT EXISTS `admin_registration_information` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `organisationName` varchar(50) NOT NULL,
  `eMail` varchar(50) NOT NULL,
  `userID` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `organisationAddress` varchar(200) NOT NULL,
  `agree` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `admin_registration_information`
--

INSERT INTO `admin_registration_information` (`id`, `firstName`, `lastName`, `organisationName`, `eMail`, `userID`, `password`, `organisationAddress`, `agree`) VALUES
(1, 'sdfafsafsadf', 'dfasdfs', 'afdasdf', 'asdfasd', 'fasdfasf', 'adsf', 'asfdsaf', 'on'),
(2, 'Sukanta', 'Sharma', 'JIS College of Engineering', 'onlinewrk@live.in', 'shanu', '1111', 'Kalyani, Nadia', 'on'),
(3, 'sdfafsafsadfsafsdf', 'sdfs', 'sf', 'sfsf', 'fsfs', 'sfsfs', 'sfsfsfs', 'on');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
