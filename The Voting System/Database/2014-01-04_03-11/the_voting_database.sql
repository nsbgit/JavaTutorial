-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 03, 2014 at 09:43 PM
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
  `fileName` varchar(20) NOT NULL,
  `registrationDate` varchar(20) NOT NULL,
  `registrationDay` varchar(20) NOT NULL,
  `registrationTime` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `admin_registration_information`
--

INSERT INTO `admin_registration_information` (`id`, `firstName`, `lastName`, `organisationName`, `eMail`, `userID`, `password`, `organisationAddress`, `agree`, `fileName`, `registrationDate`, `registrationDay`, `registrationTime`) VALUES
(1, 'Sukanta', 'Sharma', 'JIS College of Engineering', 'onlinewrk@live.in', 'shanu', '1111', 'Kalyani', 'on', '', '30/11/2013', 'Monday', '9:58:32 PM'),
(3, 'sadf', 'afasdf', 'sadfsaf', 'dasdfsa@m.bi', 'fsadfsa', '1234abc.', 'safsafsaf', 'on', '', '1/0/2014', 'Wednesday', '11:47:17 PM'),
(4, 'Arbind Kumar', 'Mahato', 'Google', 'akjisce@gmail.com', 'akjisce', '12345abc@', 'Kolkata, India', 'on', '', '2/0/2014', 'Thursday', '1:36:17 PM'),
(5, 'Abhijeet', 'Shaw', 'Webel', 'abhi.cool@gmail.com', 'abhi', '12345abc@', 'KOlkata, India', 'on', '', '2/0/2014', 'Thursday', '1:37:49 PM'),
(6, 'Arpana', 'Kumari', 'IBM', 'arpanagayacse@gmail.com', 'arpana', '12345abc@', 'Delhi, India', 'on', '', '2/0/2014', 'Thursday', '1:39:55 PM'),
(8, 'Vikash', 'Singh', 'Life Style', 'vikashcse19@gmail.com', 'vikash', '123456abc!@#', 'KOlkata', 'on', '', '2/0/2014', 'Thursday', '1:47:13 PM'),
(9, 'Bandana', 'Yadav', 'Model Rock', 'vandu.cse@gmail.com', 'vandu', '124578bgt#@!', 'Kolkata, India', 'on', '', '2/0/2014', 'Thursday', '1:49:16 PM'),
(10, 'Swati', 'Panday', 'Google', 'swatipanday@gmail.com', 'swati', '123456789a!@', 'Kolkata, India', 'on', '', '2/0/2014', 'Thursday', '1:52:35 PM'),
(11, 'Pooja', 'Singh', 'P.N.Lmt.', 'poojasingh12@gmail.com', 'pooja', '159753pp!@#', 'Delhi, India', 'on', '', '2/0/2014', 'Thursday', '1:54:28 PM'),
(12, 'Radha', 'Agarwal', 'Wipro', 'radha@gmail.com', 'radha', '124578as!@', 'Patana, India', 'on', '', '2/0/2014', 'Thursday', '1:56:42 PM'),
(13, 'Dayanand', 'Sagar', 'Google', 'dayanandcse37@gmail.com', 'daya', '789456123da!@#', 'Gaya, India', 'on', '', '2/0/2014', 'Thursday', '1:59:26 PM'),
(14, 'Bishwajeet', 'Gupta', 'L.N.T.', '01bishwajeet@gmail.com', '01bish', '456123bhu$%', 'Kolkata, India', 'on', '', '2/0/2014', 'Thursday', '2:2:14 PM'),
(15, 'Amit', 'Sharma', 'E.Lmtd', 'amit01@gmail.com', 'amit', '15632am@!', 'UP, India', 'on', '', '2/0/2014', 'Thursday', '2:6:21 PM'),
(16, 'Bikash', 'Bandari', 'E.Lmtd', 'biokash@gmail.com', 'bikash', '1230bik~!@', 'Goa, India', 'on', '', '2/0/2014', 'Thursday', '2:14:5 PM'),
(17, 'Ram', 'Sharma', 'L.N.T.', 'ramlal@gmail.com', 'ramlal', '12369ram~!@', 'Kalyani, W.B', 'on', '', '2/0/2014', 'Thursday', '2:16:43 PM'),
(18, 'Amandip', 'Singha', 'Google', 'amandip@gmail.com', 'amandip', '456123aman!@#', 'Kolkata, India', 'on', '', '2/0/2014', 'Thursday', '2:18:4 PM');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `admin_sign_in_history`
--

INSERT INTO `admin_sign_in_history` (`id`, `fId`, `signInDate`, `signInDay`, `signInTime`, `signOutDate`, `signOutDay`, `signOutTime`) VALUES
(1, '1', '2/0/2014', 'Thursday', '3:4:39 AM', '-', '-', '-'),
(2, '1', '2/0/2014', 'Thursday', '3:8:26 AM', '-', '-', '-'),
(3, '1', '2/0/2014', 'Thursday', '3:15:47 AM', '-', '-', '-'),
(4, '3', '2/0/2014', 'Thursday', '3:19:58 AM', '-', '-', '-'),
(5, '1', '2/0/2014', 'Thursday', '7:38:2 PM', '    -    ', '    -    ', '    -    '),
(6, '1', '2/1/2014', 'Thursday', '7:48:8 PM', '    -    ', '    -    ', '    -    '),
(7, '1', '2/1/2014', 'Thursday', '7:49:3 PM', '    -    ', '    -    ', '    -    '),
(8, '1', '2/1/2014', 'Thursday', '8:23:43 PM', '    -    ', '    -    ', '    -    '),
(9, '1', '2/1/2014', 'Thursday', '8:43:52 PM', '    -    ', '    -    ', '    -    '),
(10, '1', '2/1/2014', 'Thursday', '8:58:52 PM', '    -    ', '    -    ', '    -    '),
(11, '1', '2/1/2014', 'Thursday', '9:29:49 PM', '    -    ', '    -    ', '    -    '),
(12, '1', '2/1/2014', 'Thursday', '9:34:31 PM', '    -    ', '    -    ', '    -    '),
(13, '1', '2/1/2014', 'Thursday', '9:36:4 PM', '    -    ', '    -    ', '    -    '),
(14, '1', '2/1/2014', 'Thursday', '9:37:13 PM', '    -    ', '    -    ', '    -    '),
(15, '1', '2/1/2014', 'Thursday', '11:6:41 PM', '    -    ', '    -    ', '    -    '),
(16, '1', '2/1/2014', 'Thursday', '11:27:0 PM', '    -    ', '    -    ', '    -    '),
(17, '1', '3/1/2014', 'Friday', '1:37:4 AM', '    -    ', '    -    ', '    -    '),
(18, '1', '3/1/2014', 'Friday', '2:7:39 AM', '    -    ', '    -    ', '    -    '),
(19, '1', '3/1/2014', 'Friday', '2:39:22 AM', '    -    ', '    -    ', '    -    '),
(20, '1', '3/1/2014', 'Friday', '2:48:8 AM', '    -    ', '    -    ', '    -    '),
(21, '1', '3/1/2014', 'Friday', '8:56:20 AM', '    -    ', '    -    ', '    -    ');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
