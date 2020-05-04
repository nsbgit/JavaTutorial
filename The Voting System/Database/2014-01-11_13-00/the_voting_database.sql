-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 11, 2014 at 07:52 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `the_voting_database`
--

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Dumping data for table `admin_registration_information`
--

INSERT INTO `admin_registration_information` (`id`, `firstName`, `lastName`, `organisationName`, `eMail`, `userID`, `password`, `organisationAddress`, `agree`, `fileName`, `registrationDate`, `registrationDay`, `registrationTime`) VALUES
(1, 'Sukanta', 'Sharma', 'JIS College of Engineering', 'onlinewrk@live.in', 'shanu', '1234/.,m', 'Kalyani', 'on', '05012014120647.jpg', '30/11/2013', 'Monday', '9:58:32 PM'),
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
(18, 'Amandip', 'Singha', 'Google', 'amandip@gmail.com', 'amandip', '456123aman!@#', 'Kolkata, India', 'on', '', '2/0/2014', 'Thursday', '2:18:4 PM'),
(19, 'Katrina', 'Kaif', 'Bollywood', 'sukantaskat@live.com', 'cat', '1234/.,m', 'Mumbai\r\nIndia', 'on', '04012014114840.jpg', '5/1/2014', 'Sunday', '0:7:12 AM'),
(20, 'Saikat', 'Biswas', 'JNV Kalyani Nadia', 'saikatb53@gmail.com', 'Hrtbrkrsaikat', '1234/.,m', 'Kalyani, Nadia, WB', 'on', '05012014105854.jpg', '5/1/2014', 'Sunday', '10:58:54 AM'),
(21, 'Vikash', 'Singh', 'JIS College of Engineering', 'vikascse19jan@gmail.com', 'shanr', '1234/.,m', 'bihar', 'on', '05012014022248.jpg', '5/1/2014', 'Sunday', '2:22:48 PM'),
(22, 'Ritu', 'Singh', 'Aambagan', 'vikascse19jan@gmail.com', 'vik', '1234/.,m', 'Naihati', 'on', '05012014035745.jpg', '5/1/2014', 'Sunday', '4:2:15 PM'),
(23, 'Viku', 'Paji', 'JIS College of Engineering', 'akjisce@gmail.com', 'shanufdsfsfds', '1234/.,m', 'Kalyani', 'on', '11012014104350.jpg', '11/1/2014', 'Satuarday', '10:43:50 AM'),
(24, 'Arbind Kumar', 'Paji', 'JIS College of Engineering', 'asd@hj.bo', 'shanudgg', '1234/.,m', 'Naihati', 'on', '11012014104559.jpg', '11/1/2014', 'Satuarday', '10:51:9 AM'),
(25, 'Suraj', 'Deep', 'abcd', 'suraj.deep08@gmail.com', 'suraj', '1234/.,m', 'sdsd', 'on', '11012014115018.jpg', '11/1/2014', 'Satuarday', '11:50:19 AM'),
(26, 'Arbind Kumar', 'Mahato', 'js', 'akjisce@gmail.com', 'akm', '15632/.,m', 'kolkata', 'on', '11012014124913.jpg', '11/1/2014', 'Satuarday', '0:49:13 PM'),
(27, 'sdcs', 'cdscsc', 'jik', 'akjisce@gmail.com', 'jik', '15632/.,m', 'lop', 'on', '11012014125150.jpg', '11/1/2014', 'Satuarday', '0:51:50 PM'),
(28, 'abhijeet', 'shaw', 'hot', 'abhijeetisready4luv@gmail.com', 'abhi', '15632/.,m', 'kolkata', 'on', '11012014011417.gif', '11/1/2014', 'Satuarday', '1:14:17 PM');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=76 ;

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
(21, '1', '3/1/2014', 'Friday', '8:56:20 AM', '    -    ', '    -    ', '    -    '),
(22, '19', '5/1/2014', 'Sunday', '0:10:13 AM', '    -    ', '    -    ', '    -    '),
(23, '19', '5/1/2014', 'Sunday', '0:41:14 AM', '    -    ', '    -    ', '    -    '),
(24, '1', '5/1/2014', 'Sunday', '1:10:2 AM', '    -    ', '    -    ', '    -    '),
(25, '20', '5/1/2014', 'Sunday', '10:59:21 AM', '    -    ', '    -    ', '    -    '),
(26, '21', '5/1/2014', 'Sunday', '2:24:30 PM', '    -    ', '    -    ', '    -    '),
(27, '22', '5/1/2014', 'Sunday', '4:8:24 PM', '    -    ', '    -    ', '    -    '),
(28, '1', '5/1/2014', 'Sunday', '9:26:50 PM', '    -    ', '    -    ', '    -    '),
(29, '1', '5/1/2014', 'Sunday', '9:41:42 PM', '    -    ', '    -    ', '    -    '),
(30, '1', '5/1/2014', 'Sunday', '9:56:54 PM', '    -    ', '    -    ', '    -    '),
(31, '1', '6/1/2014', 'Monday', '9:44:48 AM', '    -    ', '    -    ', '    -    '),
(32, '1', '6/1/2014', 'Monday', '0:30:43 PM', '    -    ', '    -    ', '    -    '),
(33, '1', '6/1/2014', 'Monday', '0:45:2 PM', '    -    ', '    -    ', '    -    '),
(34, '1', '6/1/2014', 'Monday', '0:50:15 PM', '    -    ', '    -    ', '    -    '),
(35, '1', '6/1/2014', 'Monday', '1:4:47 PM', '    -    ', '    -    ', '    -    '),
(36, '1', '6/1/2014', 'Monday', '1:12:39 PM', '    -    ', '    -    ', '    -    '),
(37, '1', '6/1/2014', 'Monday', '1:39:58 PM', '    -    ', '    -    ', '    -    '),
(38, '1', '6/1/2014', 'Monday', '9:23:31 PM', '    -    ', '    -    ', '    -    '),
(39, '1', '6/1/2014', 'Monday', '9:43:48 PM', '    -    ', '    -    ', '    -    '),
(40, '1', '6/1/2014', 'Monday', '9:46:7 PM', '    -    ', '    -    ', '    -    '),
(41, '1', '6/1/2014', 'Monday', '11:11:8 PM', '    -    ', '    -    ', '    -    '),
(42, '1', '6/1/2014', 'Monday', '11:15:28 PM', '    -    ', '    -    ', '    -    '),
(43, '1', '6/1/2014', 'Monday', '11:50:55 PM', '    -    ', '    -    ', '    -    '),
(44, '1', '7/1/2014', 'Tuesday', '0:11:41 AM', '    -    ', '    -    ', '    -    '),
(45, '1', '7/1/2014', 'Tuesday', '0:16:32 AM', '    -    ', '    -    ', '    -    '),
(46, '1', '7/1/2014', 'Tuesday', '0:21:1 PM', '    -    ', '    -    ', '    -    '),
(47, '1', '7/1/2014', 'Tuesday', '0:22:14 PM', '    -    ', '    -    ', '    -    '),
(48, '19', '7/1/2014', 'Tuesday', '0:25:28 PM', '    -    ', '    -    ', '    -    '),
(49, '19', '7/1/2014', 'Tuesday', '0:33:55 PM', '    -    ', '    -    ', '    -    '),
(50, '19', '7/1/2014', 'Tuesday', '1:20:50 PM', '    -    ', '    -    ', '    -    '),
(51, '1', '7/1/2014', 'Tuesday', '1:26:12 PM', '    -    ', '    -    ', '    -    '),
(52, '1', '7/1/2014', 'Tuesday', '1:33:54 PM', '    -    ', '    -    ', '    -    '),
(53, '1', '8/1/2014', 'Wednesday', '0:44:5 PM', '    -    ', '    -    ', '    -    '),
(54, '1', '8/1/2014', 'Wednesday', '1:22:10 PM', '    -    ', '    -    ', '    -    '),
(55, '1', '8/1/2014', 'Wednesday', '1:45:31 PM', '    -    ', '    -    ', '    -    '),
(56, '4', '8/1/2014', 'Wednesday', '10:23:55 PM', '    -    ', '    -    ', '    -    '),
(57, '1', '8/1/2014', 'Wednesday', '10:25:42 PM', '    -    ', '    -    ', '    -    '),
(58, '22', '8/1/2014', 'Wednesday', '10:37:7 PM', '    -    ', '    -    ', '    -    '),
(59, '1', '9/1/2014', 'Thursday', '0:21:5 PM', '    -    ', '    -    ', '    -    '),
(60, '1', '9/1/2014', 'Thursday', '2:13:14 PM', '    -    ', '    -    ', '    -    '),
(61, '1', '9/1/2014', 'Thursday', '2:23:27 PM', '    -    ', '    -    ', '    -    '),
(62, '1', '9/1/2014', 'Thursday', '2:46:0 PM', '    -    ', '    -    ', '    -    '),
(63, '1', '10/1/2014', 'Friday', '1:41:20 AM', '    -    ', '    -    ', '    -    '),
(64, '1', '10/1/2014', 'Friday', '2:9:11 AM', '    -    ', '    -    ', '    -    '),
(65, '1', '10/1/2014', 'Friday', '0:42:49 PM', '    -    ', '    -    ', '    -    '),
(66, '1', '10/1/2014', 'Friday', '2:9:50 PM', '    -    ', '    -    ', '    -    '),
(67, '1', '10/1/2014', 'Friday', '2:20:19 PM', '    -    ', '    -    ', '    -    '),
(68, '1', '10/1/2014', 'Friday', '2:23:59 PM', '    -    ', '    -    ', '    -    '),
(69, '1', '10/1/2014', 'Friday', '2:35:55 PM', '    -    ', '    -    ', '    -    '),
(70, '1', '10/1/2014', 'Friday', '9:57:46 PM', '    -    ', '    -    ', '    -    '),
(71, '1', '10/1/2014', 'Friday', '10:20:22 PM', '    -    ', '    -    ', '    -    '),
(72, '1', '10/1/2014', 'Friday', '11:24:51 PM', '    -    ', '    -    ', '    -    '),
(73, '1', '11/1/2014', 'Satuarday', '11:6:53 AM', '    -    ', '    -    ', '    -    '),
(74, '1', '11/1/2014', 'Satuarday', '0:11:42 PM', '    -    ', '    -    ', '    -    '),
(75, '1', '11/1/2014', 'Satuarday', '1:4:17 PM', '    -    ', '    -    ', '    -    ');

-- --------------------------------------------------------

--
-- Table structure for table `voting_candidate`
--

CREATE TABLE IF NOT EXISTS `voting_candidate` (
  `idVotingCandidate` int(200) NOT NULL AUTO_INCREMENT,
  `fidVotingSchedule` int(200) NOT NULL,
  `partyName` varchar(20) NOT NULL,
  `partyLeader` varchar(20) NOT NULL,
  `voteCount` int(200) NOT NULL,
  PRIMARY KEY (`idVotingCandidate`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `voting_candidate`
--

INSERT INTO `voting_candidate` (`idVotingCandidate`, `fidVotingSchedule`, `partyName`, `partyLeader`, `voteCount`) VALUES
(1, 1, 'JIS', 'Sukanta', 0),
(2, 1, 'Webel', 'Srobona', 0),
(3, 2, 'JIS', 'Sukanta', 0),
(4, 2, 'Webel', 'Panchu', 0),
(5, 2, 'Debraj', 'Srobona', 0),
(6, 2, 'Globsyn', 'Vikash', 0),
(7, 3, 'aaa', 'a', 0),
(8, 3, 'bbb', 'b', 0),
(9, 4, 'ccc', 'c', 0),
(10, 4, 'ddd', 'd', 0);

-- --------------------------------------------------------

--
-- Table structure for table `voting_schedule`
--

CREATE TABLE IF NOT EXISTS `voting_schedule` (
  `idVotingSchedule` int(200) NOT NULL AUTO_INCREMENT,
  `fidAdminRegistrationInformation` int(200) NOT NULL,
  `electionDate` date NOT NULL,
  `startTime` time NOT NULL,
  `endTime` time NOT NULL,
  PRIMARY KEY (`idVotingSchedule`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `voting_schedule`
--

INSERT INTO `voting_schedule` (`idVotingSchedule`, `fidAdminRegistrationInformation`, `electionDate`, `startTime`, `endTime`) VALUES
(1, 1, '1993-08-31', '01:09:00', '17:30:00'),
(2, 1, '1994-07-09', '07:30:00', '20:30:00'),
(3, 1, '2014-01-11', '09:01:00', '00:01:00'),
(4, 1, '2014-01-11', '10:01:00', '23:11:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
