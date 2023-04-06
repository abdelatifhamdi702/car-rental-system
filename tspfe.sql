-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 22, 2023 at 01:02 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tspfe`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `nom` varchar(40) NOT NULL,
  `prenom` varchar(40) NOT NULL,
  `bDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `bDate`) VALUES
(1, 'aa', 'aa', '2023-01-01'),
(2, 'bb', 'bb', '2023-01-25');

-- --------------------------------------------------------

--
-- Table structure for table `client_numéros`
--

CREATE TABLE `client_numéros` (
  `idClient` int(11) NOT NULL,
  `num` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `client_numéros`
--

INSERT INTO `client_numéros` (`idClient`, `num`) VALUES
(1, '0554879631'),
(1, '0611525285'),
(1, '0698500748'),
(2, '0699852145');

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `idClient` int(11) NOT NULL,
  `idVoiture` varchar(40) NOT NULL,
  `date` date NOT NULL,
  `duree` int(11) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`idClient`, `idVoiture`, `date`, `duree`, `total`) VALUES
(1, '26958 116 03', '2023-01-29', 5, 17500);

-- --------------------------------------------------------

--
-- Table structure for table `programme`
--

CREATE TABLE `programme` (
  `id` int(11) NOT NULL,
  `destination` varchar(80) NOT NULL,
  `date` date NOT NULL,
  `duree` int(11) NOT NULL,
  `prix` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `programme`
--

INSERT INTO `programme` (`id`, `destination`, `date`, `duree`, `prix`) VALUES
(1, 'Paris - France', '2023-01-28', 12, 300000),
(2, 'Milano - Italy', '2023-02-15', 20, 280000);

-- --------------------------------------------------------

--
-- Stand-in structure for view `rapportlocation`
-- (See below for the actual view)
--
CREATE TABLE `rapportlocation` (
`idVoiture` varchar(40)
,`nom` varchar(40)
,`prenom` varchar(40)
,`date` date
,`duree` int(11)
,`total` double
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `rapportreservation`
-- (See below for the actual view)
--
CREATE TABLE `rapportreservation` (
`destination` varchar(80)
,`nom` varchar(40)
,`prenom` varchar(40)
,`date` date
,`nbrPersonne` int(11)
,`total` double
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `rapportvp`
-- (See below for the actual view)
--
CREATE TABLE `rapportvp` (
`destination` varchar(80)
,`idVoiture` varchar(40)
,`date` date
,`duree` int(11)
);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `idClient` int(11) NOT NULL,
  `idProgramme` int(11) NOT NULL,
  `date` date NOT NULL,
  `nbrPersonne` int(11) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`idClient`, `idProgramme`, `date`, `nbrPersonne`, `total`) VALUES
(1, 2, '2023-01-29', 2, 560000);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(40) NOT NULL,
  `pass` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `pass`) VALUES
('me', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `voiture`
--

CREATE TABLE `voiture` (
  `matricule` varchar(40) NOT NULL,
  `marque` varchar(40) NOT NULL,
  `modele` varchar(80) NOT NULL,
  `couleur` varchar(40) NOT NULL,
  `prix` double NOT NULL,
  `disponible` varchar(20) NOT NULL,
  `propriete` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voiture`
--

INSERT INTO `voiture` (`matricule`, `marque`, `modele`, `couleur`, `prix`, `disponible`, `propriete`) VALUES
('26958 116 03', 'Toyota', 'Corola', 'Blanc', 3500, 'Oui', 'Oui');

-- --------------------------------------------------------

--
-- Table structure for table `voiture_programme`
--

CREATE TABLE `voiture_programme` (
  `idVoiture` varchar(40) NOT NULL,
  `idProgramme` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voiture_programme`
--

INSERT INTO `voiture_programme` (`idVoiture`, `idProgramme`) VALUES
('26958 116 03', 1);

-- --------------------------------------------------------

--
-- Structure for view `rapportlocation`
--
DROP TABLE IF EXISTS `rapportlocation`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rapportlocation`  AS  select `location`.`idVoiture` AS `idVoiture`,`client`.`nom` AS `nom`,`client`.`prenom` AS `prenom`,`location`.`date` AS `date`,`location`.`duree` AS `duree`,`location`.`total` AS `total` from (`location` join `client`) where `location`.`idClient` = `client`.`id` ;

-- --------------------------------------------------------

--
-- Structure for view `rapportreservation`
--
DROP TABLE IF EXISTS `rapportreservation`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rapportreservation`  AS  select `programme`.`destination` AS `destination`,`client`.`nom` AS `nom`,`client`.`prenom` AS `prenom`,`reservation`.`date` AS `date`,`reservation`.`nbrPersonne` AS `nbrPersonne`,`reservation`.`total` AS `total` from ((`programme` join `client`) join `reservation`) where `client`.`id` = `reservation`.`idClient` and `programme`.`id` = `reservation`.`idProgramme` ;

-- --------------------------------------------------------

--
-- Structure for view `rapportvp`
--
DROP TABLE IF EXISTS `rapportvp`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rapportvp`  AS  select `programme`.`destination` AS `destination`,`voiture_programme`.`idVoiture` AS `idVoiture`,`programme`.`date` AS `date`,`programme`.`duree` AS `duree` from (`voiture_programme` join `programme`) where `programme`.`id` = `voiture_programme`.`idProgramme` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `client_numéros`
--
ALTER TABLE `client_numéros`
  ADD PRIMARY KEY (`num`),
  ADD KEY `idClient` (`idClient`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`idClient`),
  ADD KEY `idVoiture` (`idVoiture`);

--
-- Indexes for table `programme`
--
ALTER TABLE `programme`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`idClient`),
  ADD KEY `idProgramme` (`idProgramme`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `voiture`
--
ALTER TABLE `voiture`
  ADD PRIMARY KEY (`matricule`);

--
-- Indexes for table `voiture_programme`
--
ALTER TABLE `voiture_programme`
  ADD PRIMARY KEY (`idVoiture`),
  ADD KEY `idProgramme` (`idProgramme`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `client_numéros`
--
ALTER TABLE `client_numéros`
  ADD CONSTRAINT `client_numéros_ibfk_1` FOREIGN KEY (`idClient`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `location`
--
ALTER TABLE `location`
  ADD CONSTRAINT `location_ibfk_1` FOREIGN KEY (`idClient`) REFERENCES `client` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `location_ibfk_2` FOREIGN KEY (`idVoiture`) REFERENCES `voiture` (`matricule`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`idClient`) REFERENCES `client` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`idProgramme`) REFERENCES `programme` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `voiture_programme`
--
ALTER TABLE `voiture_programme`
  ADD CONSTRAINT `voiture_programme_ibfk_1` FOREIGN KEY (`idVoiture`) REFERENCES `voiture` (`matricule`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `voiture_programme_ibfk_2` FOREIGN KEY (`idProgramme`) REFERENCES `programme` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
