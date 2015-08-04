-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hotelinho
-- ------------------------------------------------------
-- Server version	5.1.43-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookings` (
  `id` varchar(45) NOT NULL,
  `customerId` varchar(45) NOT NULL,
  `roomId` varchar(45) NOT NULL,
  `checkin` datetime NOT NULL,
  `checkout` datetime NOT NULL,
  `otherSpecifications` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_id_idx` (`customerId`),
  KEY `room_id_idx` (`roomId`),
  CONSTRAINT `customerId` FOREIGN KEY (`customerId`) REFERENCES `customers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `roomId` FOREIGN KEY (`roomId`) REFERENCES `rooms` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `id` varchar(45) NOT NULL,
  `name` varchar(100) NOT NULL,
  `cnp` varchar(13) NOT NULL,
  `address` varchar(100) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `registrationDate` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cnp_UNIQUE` (`cnp`),
  UNIQUE KEY `username_UNIQUE` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES ('23hf23-b23','George','1941001889345','Cluj','roman','0745367654','geo123','parola','2014-11-11'),('77543c0e-d1af-44d4-aec4-5ff290310390','Geo','1930710576884','Cluj','roman',NULL,'bla','as','2015-05-05'),('hjv234-23','Maria','2921111546372','Bucuresti','roman','0724657867','maia','pass','2015-06-06');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hotels`
--

DROP TABLE IF EXISTS `hotels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotels` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `nrStars` int(11) NOT NULL,
  `availableRooms` int(11) DEFAULT NULL,
  `pool` varchar(3) DEFAULT 'NO',
  `restaurant` varchar(3) DEFAULT 'NO',
  `playground` varchar(3) DEFAULT 'NO',
  `parking` varchar(3) DEFAULT 'NO',
  `wireless` varchar(3) DEFAULT 'NO',
  `roomService` varchar(3) DEFAULT 'NO',
  `airConditioning` varchar(3) DEFAULT 'NO',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotels`
--

LOCK TABLES `hotels` WRITE;
/*!40000 ALTER TABLE `hotels` DISABLE KEYS */;
INSERT INTO `hotels` VALUES ('d44das-3hjf','Grand Hotel','Cluj',5,243,'YES','YES','NO','YES','YES','YES','YES');
/*!40000 ALTER TABLE `hotels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `placesclosetohotels`
--

DROP TABLE IF EXISTS `placesclosetohotels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `placesclosetohotels` (
  `id` varchar(45) NOT NULL,
  `placeId` varchar(45) NOT NULL,
  `hotelId` varchar(45) NOT NULL,
  `distance` int(11) DEFAULT NULL,
  `guidance` varchar(255) DEFAULT NULL,
  `specifications` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hotel_id_idx` (`hotelId`),
  KEY `placeIdd` (`placeId`),
  CONSTRAINT `hotelIdd` FOREIGN KEY (`hotelId`) REFERENCES `hotels` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `placeIdd` FOREIGN KEY (`placeId`) REFERENCES `placestovisit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `placesclosetohotels`
--

LOCK TABLES `placesclosetohotels` WRITE;
/*!40000 ALTER TABLE `placesclosetohotels` DISABLE KEYS */;
/*!40000 ALTER TABLE `placesclosetohotels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `placestovisit`
--

DROP TABLE IF EXISTS `placestovisit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `placestovisit` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `carAcces` varchar(3) DEFAULT 'YES',
  `description` varchar(445) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `placestovisit`
--

LOCK TABLES `placestovisit` WRITE;
/*!40000 ALTER TABLE `placestovisit` DISABLE KEYS */;
/*!40000 ALTER TABLE `placestovisit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooms`
--

DROP TABLE IF EXISTS `rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rooms` (
  `id` varchar(45) NOT NULL,
  `hotelId` varchar(45) DEFAULT NULL,
  `roomNumber` int(11) NOT NULL,
  `type` varchar(45) DEFAULT 'room',
  `nrBeds` int(11) NOT NULL,
  `fridge` varchar(3) DEFAULT 'YES',
  `tv` varchar(3) DEFAULT 'YES',
  `minibar` varchar(3) DEFAULT 'YES',
  `phone` varchar(3) DEFAULT 'YES',
  `airConditioning` varchar(3) DEFAULT 'YES',
  `balcony` varchar(3) DEFAULT 'YES',
  PRIMARY KEY (`id`),
  KEY `hotelId` (`hotelId`),
  CONSTRAINT `hotelId` FOREIGN KEY (`hotelId`) REFERENCES `hotels` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooms`
--

LOCK TABLES `rooms` WRITE;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` VALUES ('5d25d-4f5h','d44das-3hjf',442,'room',2,'YES','YES','NO','NO','YES','NO');
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-04 17:04:50
