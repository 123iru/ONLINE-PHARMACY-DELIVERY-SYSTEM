-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 22, 2021 at 02:55 AM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `phamacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Em_name` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `in_time` varchar(50) NOT NULL,
  `out_time` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`ID`, `Em_name`, `date`, `in_time`, `out_time`) VALUES
(5, ' irudani', ' 2021.11.19', ' 8.00 a.m', '12.30 p.m '),
(6, ' aaaaaaaa', ' ', ' ', ' ');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE IF NOT EXISTS `cart` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Item name` int NOT NULL,
  `Item no` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customerdata`
--

DROP TABLE IF EXISTS `customerdata`;
CREATE TABLE IF NOT EXISTS `customerdata` (
  `CustomerID` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `NIC` varchar(50) NOT NULL,
  `Email` varchar(150) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `ContactNo` varchar(50) NOT NULL,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customerdata`
--

INSERT INTO `customerdata` (`CustomerID`, `FirstName`, `LastName`, `NIC`, `Email`, `Gender`, `Address`, `ContactNo`, `Password`) VALUES
(39, 'Saman', 'Fernando', '993205475V', 'saman@gmail.com', 'male', '103 Union Place, Colombo', '0774563214', 'saman'),
(37, 'Matilda', 'Perera', '963025421V', 'Matt96@gmail.com', 'female', 'Colombo 05', '0771258620', 'Matilda96'),
(38, 'Sam', 'Roger', '892541236V', 'srog@gmail.com', 'male', 'Kandu', '0765201488', 'sr89'),
(34, 'lola', 'mika', '1997524163V', 'lolam@gmail.com', 'female', ' kandy', '0772014563', '123');

-- --------------------------------------------------------

--
-- Table structure for table `homepage`
--

DROP TABLE IF EXISTS `homepage`;
CREATE TABLE IF NOT EXISTS `homepage` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Delivery address` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `invetory`
--

DROP TABLE IF EXISTS `invetory`;
CREATE TABLE IF NOT EXISTS `invetory` (
  `DrugID` int NOT NULL AUTO_INCREMENT,
  `DrugName` varchar(200) NOT NULL,
  `Price` int NOT NULL,
  `Quantity` int NOT NULL,
  `DrugSupplier` varchar(400) NOT NULL,
  PRIMARY KEY (`DrugID`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `invetory`
--

INSERT INTO `invetory` (`DrugID`, `DrugName`, `Price`, `Quantity`, `DrugSupplier`) VALUES
(1, 'pandol', 20, 10, 'domex'),
(2, 'pandol', 20, 10, 'domex'),
(3, 'cetrizine', 50, 10, 'max'),
(4, 'gosse', 10, 2, 'mxfix'),
(5, 'Betaidean', 200, 1, 'qxas'),
(6, 'metfomine', 400, 20, 'max'),
(7, 'mentose', 15, 10, 'mbx'),
(8, 'paracitamole', 2, 10, 'dmx'),
(9, 'b vitemine', 45, 6, 'drugx'),
(10, 'aaaa', 23, 23, '34'),
(11, 'asdf', 12, 34, 'adf');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(400) NOT NULL,
  `barcode` int NOT NULL,
  `price` int NOT NULL,
  `quantity` int NOT NULL,
  `reorderlevel` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`id`, `name`, `description`, `barcode`, `price`, `quantity`, `reorderlevel`) VALUES
(1, 'vitemine', 'vitemine B', 1111101, 12, 10, 10),
(2, 'antibiotic', '10mg', 1111102, 12, 2, 1),
(3, 'gose', 'cotton', 1111111, 40, 10, 5),
(4, 'aaa', 'sdfgh', 23445, 123, 23, 2345);

-- --------------------------------------------------------

--
-- Table structure for table `leave_em`
--

DROP TABLE IF EXISTS `leave_em`;
CREATE TABLE IF NOT EXISTS `leave_em` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `e_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `status` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `from_em` varchar(50) NOT NULL,
  `to_em` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `leave_em`
--

INSERT INTO `leave_em` (`ID`, `e_name`, `status`, `type`, `from_em`, `to_em`) VALUES
(6, ' irudani', ' weekday', ' medical', ' 2021.11.30', ' 2021.12.1'),
(7, 'asdfg ', ' cvbvn', 'asdf ', ' 2345', ' 2345'),
(8, 'asdf', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `new_emp`
--

DROP TABLE IF EXISTS `new_emp`;
CREATE TABLE IF NOT EXISTS `new_emp` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile` int NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Age` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `new_emp`
--

INSERT INTO `new_emp` (`ID`, `Name`, `Email`, `Mobile`, `Address`, `Age`) VALUES
(24, ' irudani', 'iru@gmail.com ', 778851524, 'hemmathagama,Mavanella ', 23),
(25, ' IRU', ' DFGHJ', 45678, ' GHJMM,,', 34),
(26, ' DFFFFF', ' SXDFGHN', 2345678, ' CVBN', 44);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Item name` int NOT NULL,
  `Item price` int NOT NULL,
  `Quantity` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

DROP TABLE IF EXISTS `profile`;
CREATE TABLE IF NOT EXISTS `profile` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact_No` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profile`
--

INSERT INTO `profile` (`ID`, `Name`, `Email`, `Contact_No`) VALUES
(1, 'AAAA', 'ASDFGHJ', 234567),
(2, 'ASDFGH', 'DFGBNM', 234567);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
CREATE TABLE IF NOT EXISTS `purchase` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `total` int NOT NULL,
  `payment` int NOT NULL,
  `balance` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`id`, `date`, `total`, `payment`, `balance`) VALUES
(1, '2021-00-21', 24, 100, 76);

-- --------------------------------------------------------

--
-- Table structure for table `purchaseitem`
--

DROP TABLE IF EXISTS `purchaseitem`;
CREATE TABLE IF NOT EXISTS `purchaseitem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `purchaseid` int NOT NULL,
  `itemid` int NOT NULL,
  `price` int NOT NULL,
  `quantity` int NOT NULL,
  `total1` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `registation`
--

DROP TABLE IF EXISTS `registation`;
CREATE TABLE IF NOT EXISTS `registation` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `registation`
--

INSERT INTO `registation` (`id`, `username`, `password`) VALUES
(35, ' irudani', '12345'),
(36, ' IRU', '123'),
(37, ' AAA', '12'),
(38, ' irudania', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `security`
--

DROP TABLE IF EXISTS `security`;
CREATE TABLE IF NOT EXISTS `security` (
  `Email` varchar(300) NOT NULL,
  `Q1` varchar(300) NOT NULL,
  `A1` varchar(100) NOT NULL,
  `Q2` varchar(300) NOT NULL,
  `A2` varchar(100) NOT NULL,
  `Q3` varchar(500) NOT NULL,
  `A3` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `security`
--

INSERT INTO `security` (`Email`, `Q1`, `A1`, `Q2`, `A2`, `Q3`, `A3`) VALUES
('saman@gmail.com', 'What was your favourite food as you were child?', 'Gummy bears', 'Who is your childhood best friend?', 'Praveen', 'What is the birthmonth of your mother?', 'January'),
('srog@gmail.com', 'what is the name of your first pet?', 'Lucy', 'What was your dream job as a child?', 'Lawyer', 'Who was your childhood hero?', 'Superman'),
('joe@gmail.com', 'In what city were you born?', 'Colombo', 'What was your dream job as a child?', 'Lawyer', 'What is the birthmonth of your mother?', 'December'),
('Matt96@gmail.com', 'In what city were you born?', 'Colombo', 'What was your childhood nickname?', 'Matty', 'What is your prefferd musical jounre?', 'Classical'),
('lp@gmail.com', 'what is the name of your first pet?', 'sandy', 'What was your childhood nickname?', 'kirby', 'What is the birthmonth of your mother?', 'suddi'),
('e@gmail.com', 'what is the name of your first pet?', 's', 'What was your dream job as a child?', 's', 'What is the birthmonth of your mother?', 's'),
('lolam@gmail.com', 'In what city were you born?', 'colombo', 'What was your childhood nickname?', 'lo', 'What is the birthmonth of your mother?', '');

-- --------------------------------------------------------

--
-- Table structure for table `shift`
--

DROP TABLE IF EXISTS `shift`;
CREATE TABLE IF NOT EXISTS `shift` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `em_name` varchar(50) NOT NULL,
  `shedule` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `period` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `shift`
--

INSERT INTO `shift` (`ID`, `em_name`, `shedule`, `date`, `period`) VALUES
(7, 'irudani ', ' morning', '2021.11.19 ', ' 2 week'),
(8, ' asdfghn', ' cvbnm', ' ', ' '),
(9, 'asdfghm', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `contactno` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `name`, `email`, `address`, `contactno`) VALUES
(1, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(2, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(3, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(4, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(5, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(6, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(7, 'janu', 'janu77@gmail.com', 'mathugama', 775512311),
(8, 'devinda', 'devinda96@gmail.com', 'varakapola', 776662200),
(9, 'shehan', 'shehanmax@gmai.com', 'kalutara', 718418609),
(10, 'mihirani', 'mihirani1992@gmail.com', 'dodangoda', 762245677),
(11, 'ishan', 'ishan97@gmail.com', 'mathugama', 782988369),
(12, 'a', 'a@gmail.com', 'asdfghj', 23456777);

-- --------------------------------------------------------

--
-- Table structure for table `tblattendance`
--

DROP TABLE IF EXISTS `tblattendance`;
CREATE TABLE IF NOT EXISTS `tblattendance` (
  `NicNo` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmpName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `attendance` enum('Present','Absent') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblcart`
--

DROP TABLE IF EXISTS `tblcart`;
CREATE TABLE IF NOT EXISTS `tblcart` (
  `Date` timestamp NOT NULL,
  `DrugImgPath` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DrugID` int NOT NULL,
  `DrugName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DrugPrice` double NOT NULL,
  `DrugQuantity` int NOT NULL,
  `TotalDrugPrice` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblcustomer`
--

DROP TABLE IF EXISTS `tblcustomer`;
CREATE TABLE IF NOT EXISTS `tblcustomer` (
  `CusNIC` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusImgPath` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusFName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusSName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusEmail` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusPassword` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusDOB` date NOT NULL,
  `CusContact` int NOT NULL,
  `CusGender` enum('Female','Male') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `CusAddress` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`CusNIC`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbldrug`
--

DROP TABLE IF EXISTS `tbldrug`;
CREATE TABLE IF NOT EXISTS `tbldrug` (
  `DrugID` int NOT NULL AUTO_INCREMENT,
  `DrugImgPath` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DrugName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DrugPrice` decimal(10,0) NOT NULL,
  `DrugQuantity` int NOT NULL,
  `SupplierID` int NOT NULL,
  `SupplierName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`DrugID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblemployee`
--

DROP TABLE IF EXISTS `tblemployee`;
CREATE TABLE IF NOT EXISTS `tblemployee` (
  `EmpNIC` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmpImgPath` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmpName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmpAge` int NOT NULL,
  `EmpDOB` date NOT NULL,
  `EmpEmail` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmpContact` int NOT NULL,
  `EmpHotline` int NOT NULL,
  `Gender` enum('Female','Male') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`EmpNIC`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblorder`
--

DROP TABLE IF EXISTS `tblorder`;
CREATE TABLE IF NOT EXISTS `tblorder` (
  `Date` timestamp NOT NULL,
  `OrderID` int NOT NULL AUTO_INCREMENT,
  `CusNic` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DeliveryMethod` enum('PickUpAtPharmacy','GetDelivered') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `PaymentMethod` enum('Cash','CreditCard','DebitCard') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TotalBill` double NOT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblorderdetails`
--

DROP TABLE IF EXISTS `tblorderdetails`;
CREATE TABLE IF NOT EXISTS `tblorderdetails` (
  `Date` timestamp NOT NULL,
  `OrderID` int NOT NULL,
  `DrugID` int NOT NULL,
  `DrugName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DrugPrice` double NOT NULL,
  `DrugQuantity` int NOT NULL,
  `TotalDrugPrice` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblsalary`
--

DROP TABLE IF EXISTS `tblsalary`;
CREATE TABLE IF NOT EXISTS `tblsalary` (
  `NicNo` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmpName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `MonthlySalary` double NOT NULL,
  UNIQUE KEY `Employee` (`NicNo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblsupplier`
--

DROP TABLE IF EXISTS `tblsupplier`;
CREATE TABLE IF NOT EXISTS `tblsupplier` (
  `SupplierID` int NOT NULL,
  `SupplierName` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Hotline` int NOT NULL,
  `ContactNo` int NOT NULL,
  `Address` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
