CREATE DATABASE  IF NOT EXISTS `triviadb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `triviadb`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: triviadb
-- ------------------------------------------------------
-- Server version	5.6.24-log

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
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `answers` (
  `Answer_ID` int(1) NOT NULL AUTO_INCREMENT,
  `Answer` varchar(50) DEFAULT NULL,
  `isCorrect` tinyint(1) DEFAULT '0',
  `Question_ID` int(1) DEFAULT NULL,
  PRIMARY KEY (`Answer_ID`),
  KEY `Question_ID` (`Question_ID`),
  CONSTRAINT `Question_ID` FOREIGN KEY (`Question_ID`) REFERENCES `questions` (`Question_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
INSERT INTO `answers` VALUES (1,'house paint',0,1),(2,'ketchup',0,1),(3,'motor oil',1,1),(4,'shampoo',0,1),(5,'Moons',1,2),(6,'Atmosphere',0,2),(7,'Strong Gravity',0,2),(8,'Oxygen',0,2),(9,'Limbic System',0,3),(10,'Cerebellum',1,3),(11,'Cerebrum',0,3),(12,'Brain Stem',0,3),(13,'Prison',0,4),(14,'School',0,4),(15,'Hospital',0,4),(16,'University ',1,4),(17,'KSA',0,5),(18,'Oman',0,5),(19,'Yemen ',1,5),(20,'UAE',0,5),(21,'Spanish',1,6),(22,'Italian',0,6),(23,'Portuguese',0,6),(24,'English',0,6);
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categories` (
  `Category_ID` int(1) NOT NULL AUTO_INCREMENT,
  `Category` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Category_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Science'),(2,'Geography'),(3,'Hitory'),(4,'Arts'),(5,'Sports'),(6,'Entertainment');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correct_answers`
--

DROP TABLE IF EXISTS `correct_answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `correct_answers` (
  `Player_ID` int(1) NOT NULL DEFAULT '0',
  `Question_ID` int(1) NOT NULL DEFAULT '0',
  `isCorrect` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`Player_ID`,`Question_ID`),
  KEY `Question_ID_idfk_1` (`Question_ID`),
  CONSTRAINT `Question_ID_idfk_1` FOREIGN KEY (`Question_ID`) REFERENCES `questions` (`Question_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `correct_answers_ibfk_2` FOREIGN KEY (`Question_ID`) REFERENCES `questions` (`Question_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correct_answers`
--

LOCK TABLES `correct_answers` WRITE;
/*!40000 ALTER TABLE `correct_answers` DISABLE KEYS */;
/*!40000 ALTER TABLE `correct_answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `players`
--

DROP TABLE IF EXISTS `players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `players` (
  `Player_ID` int(1) NOT NULL AUTO_INCREMENT,
  `Player_Name` varchar(50) NOT NULL,
  `Session_ID` int(1) DEFAULT NULL,
  PRIMARY KEY (`Player_ID`),
  KEY `Session_ID_idx` (`Session_ID`),
  CONSTRAINT `Session_ID_FK` FOREIGN KEY (`Session_ID`) REFERENCES `sessions` (`Session_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `players`
--

LOCK TABLES `players` WRITE;
/*!40000 ALTER TABLE `players` DISABLE KEYS */;
/*!40000 ALTER TABLE `players` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playerscores`
--

DROP TABLE IF EXISTS `playerscores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `playerscores` (
  `ID` int(50) NOT NULL DEFAULT '0',
  `Player` varchar(50) DEFAULT NULL,
  `CorrectAnswers` int(2) DEFAULT NULL,
  `FinalScore` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `playerscores_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `players` (`Player_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playerscores`
--

LOCK TABLES `playerscores` WRITE;
/*!40000 ALTER TABLE `playerscores` DISABLE KEYS */;
/*!40000 ALTER TABLE `playerscores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `Question_ID` int(1) NOT NULL AUTO_INCREMENT,
  `Question` varchar(200) DEFAULT NULL,
  `Category_ID` int(1) DEFAULT NULL,
  PRIMARY KEY (`Question_ID`),
  KEY `Category_ID` (`Category_ID`),
  CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`Category_ID`) REFERENCES `categories` (`Category_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'A fluid is considered \"Newtonian\" when its viscosity is independent of its shear rate. All but one of the substances below is a Non-Newtonian fluid. Which one is a Newtonian fluid?',1),(2,'Scientists have long been able to calculate the masses of most planets, including Earth. It has taken longer to measure the masses of Mercury and Venus, primarily because these two planets lack what?',1),(3,'What is the name of the biggest part of the human brain?',1),(4,'The cities of Cairo in Egypt and Fez in Morroco are generally accepted to have the oldest of what type of institution in the world?',2),(5,'Which country at the southern tip of the Arabian Peninsula was previously known as Aden?',2),(6,'What language do the locals speak in Bogota?',2);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sessions`
--

DROP TABLE IF EXISTS `sessions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sessions` (
  `Session_ID` int(1) NOT NULL AUTO_INCREMENT,
  `PlayersNb` int(1) DEFAULT '1',
  `Winner` int(1) DEFAULT NULL,
  PRIMARY KEY (`Session_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessions`
--

LOCK TABLES `sessions` WRITE;
/*!40000 ALTER TABLE `sessions` DISABLE KEYS */;
/*!40000 ALTER TABLE `sessions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_cqa`
--

DROP TABLE IF EXISTS `view_cqa`;
/*!50001 DROP VIEW IF EXISTS `view_cqa`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_cqa` AS SELECT 
 1 AS `Category_ID`,
 1 AS `Question_ID`,
 1 AS `Answer_ID`,
 1 AS `Category`,
 1 AS `Question`,
 1 AS `Answer`,
 1 AS `isCorrect`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `view_playerscores`
--

DROP TABLE IF EXISTS `view_playerscores`;
/*!50001 DROP VIEW IF EXISTS `view_playerscores`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_playerscores` AS SELECT 
 1 AS `ID`,
 1 AS `Player`,
 1 AS `CorrectAnswers`,
 1 AS `FinalScore`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_cqa`
--

/*!50001 DROP VIEW IF EXISTS `view_cqa`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_cqa` AS select `categories`.`Category_ID` AS `Category_ID`,`questions`.`Question_ID` AS `Question_ID`,`answers`.`Answer_ID` AS `Answer_ID`,`categories`.`Category` AS `Category`,`questions`.`Question` AS `Question`,`answers`.`Answer` AS `Answer`,`answers`.`isCorrect` AS `isCorrect` from ((`answers` join `questions` on((`questions`.`Question_ID` = `answers`.`Question_ID`))) join `categories` on((`categories`.`Category_ID` = `questions`.`Category_ID`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_playerscores`
--

/*!50001 DROP VIEW IF EXISTS `view_playerscores`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_playerscores` AS select distinct `players`.`Player_ID` AS `ID`,`players`.`Player_Name` AS `Player`,(select count(`correct_answers`.`isCorrect`) from `correct_answers` where ((`correct_answers`.`Player_ID` = `players`.`Player_ID`) and (`correct_answers`.`isCorrect` = 1))) AS `CorrectAnswers`,`FN_GETFINALSCORE`(`sessions`.`Session_ID`,`players`.`Player_ID`) AS `FinalScore` from ((`players` join `correct_answers` on((`correct_answers`.`Player_ID` = `players`.`Player_ID`))) left join `sessions` on((`sessions`.`Session_ID` = `players`.`Session_ID`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-04 18:49:13
