-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 01, 2014 at 10:01 PM
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
  `registrationDate` varchar(20) NOT NULL,
  `registrationDay` varchar(20) NOT NULL,
  `registrationTime` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `admin_registration_information`
--

INSERT INTO `admin_registration_information` (`id`, `firstName`, `lastName`, `organisationName`, `eMail`, `userID`, `password`, `organisationAddress`, `agree`, `registrationDate`, `registrationDay`, `registrationTime`) VALUES
(1, 'Sukanta', 'Sharma', 'JIS College of Engineering', 'onlinewrk@live.in', 'shanu', '1111', 'Kalyani', 'on', '30/11/2013', 'Monday', '9:58:32 PM'),
(3, 'sadf', 'afasdf', 'sadfsaf', 'dasdfsa@m.bi', 'fsadfsa', '1234abc.', 'safsafsaf', 'on', '1/0/2014', 'Wednesday', '11:47:17 PM');

-- --------------------------------------------------------

--
-- Table structure for table `admin_sign_in_history`
--

CREATE TABLE IF NOT EXISTS `admin_sign_in_history` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `fId` varchar(20) NOT NULL,
  `signInDate` varchar(20) NOT NULL,
  `signInDay` varchar(20) NOT NULL,
  `signInTime` varchar(20) NOT NULL,
  `signOutDate` varchar(20) NOT NULL,
  `signOutDay` varchar(20) NOT NULL,
  `signOutTime` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `admin_sign_in_history`
--

INSERT INTO `admin_sign_in_history` (`id`, `fId`, `signInDate`, `signInDay`, `signInTime`, `signOutDate`, `signOutDay`, `signOutTime`) VALUES
(1, '1', '2/0/2014', 'Thursday', '3:4:39 AM', '-', '-', '-'),
(2, '1', '2/0/2014', 'Thursday', '3:8:26 AM', '-', '-', '-'),
(3, '1', '2/0/2014', 'Thursday', '3:15:47 AM', '-', '-', '-'),
(4, '3', '2/0/2014', 'Thursday', '3:19:58 AM', '-', '-', '-');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
