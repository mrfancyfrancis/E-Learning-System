-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: elearningdb
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `excel`
--

DROP TABLE IF EXISTS `excel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `excel` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(5) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(25) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(25) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(25) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(45) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(12) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(45) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(25) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(5) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(12) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(25) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(25) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(25) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(45) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(12) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(45) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(25) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(25) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `excel`
--

LOCK TABLES `excel` WRITE;
/*!40000 ALTER TABLE `excel` DISABLE KEYS */;
INSERT INTO `excel` VALUES (100,'Microsoft Excel is about Creating formulas that will input in a worsksheets and on how to create worksheet that enable an individual to interact with microsoft excel that can manipulate formulas and derive them to create a mathematical function.','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone',0,'excel.png'),(123,'Microsoft Excel is about Creating formulas that will input in a worsksheets and on how to create worksheet that enable an individual to interact with microsoft excel that can manipulate formulas and derive them to create a mathematical function.','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone',0,'excel.png'),(1610443,'Microsoft Excel is about Creating formulas that will input in a worsksheets and on how to create worksheet that enable an individual to interact with microsoft excel that can manipulate formulas and derive them to create a mathematical function.','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone',0,'excel.png'),(71930451,'Microsoft Excel is about Creating formulas that will input in a worsksheets and on how to create worksheet that enable an individual to interact with microsoft excel that can manipulate formulas and derive them to create a mathematical function.','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone',0,'excel.png'),(109440513,'Microsoft Excel is about Creating formulas that will input in a worsksheets and on how to create worksheet that enable an individual to interact with microsoft excel that can manipulate formulas and derive them to create a mathematical function.','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','BASIC','webm','The student must be able to know how to use Microsoft Excel',0,'Undone','CELL BASICS','webm','Learn how to know basic ways on working the cells and cell content',0,'Undone','ORGANIZING THE WORKSHEET','webm','Discuss how to change raw height and column width',0,'Undone','FORMATING CELLS','webm','Learn how to change the color and style of the text and cells',0,'Undone','SELECTING WORKSHEET','webm','Learn how to save commands',0,'Undone','ROW BASICS','webm','Learn how to create simple formulas',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone','WORKSHEET BASICS','webm','Learn how to name, add color, add, delete, copy, move and group and ungroup worksheet',0,'Undone',0,'excel.png');
/*!40000 ALTER TABLE `excel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flash`
--

DROP TABLE IF EXISTS `flash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flash` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(12) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(5) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(45) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(12) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(5) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(45) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(12) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(5) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(45) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(12) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(5) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(45) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(12) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(5) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(45) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flash`
--

LOCK TABLES `flash` WRITE;
/*!40000 ALTER TABLE `flash` DISABLE KEYS */;
INSERT INTO `flash` VALUES (100,'Flash is one of an authoring tool that designers and developers use in creating presentations,\n application, web interaction where contents enables user to interact with it.\n Flash animation may include simple animations, applications, and video content and complex presentations.','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone',0,'Flash.png'),(123,'Flash is one of an authoring tool that designers and developers use in creating presentations,\n application, web interaction where contents enables user to interact with it.\n Flash animation may include simple animations, applications, and video content and complex presentations.','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\nUse the tools for drawing and applying colors.\nDifferentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\ndifferent version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\n 12 principles of animation in adobe flash.',0,'undone',0,'Flash.png'),(1610443,'Flash is one of an authoring tool that designers and developers use in creating presentations,\r  application, web interaction where contents enables user to interact with it.\r  Flash animation may include simple animations, applications, and video content ...','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone',0,'Flash.png'),(71930451,'Flash is one of an authoring tool that designers and developers use in creating presentations,\r  application, web interaction where contents enables user to interact with it.\r  Flash animation may include simple animations, applications, and video content ...','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone',0,'Flash.png'),(109440513,'Flash is one of an authoring tool that designers and developers use in creating presentations,\r  application, web interaction where contents enables user to interact with it.\r  Flash animation may include simple animations, applications, and video content ...','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone','History','webm','Familiarize with Adobe Flash Environment\r Use the tools for drawing and applying colors.\r Differentiate the essential options needed for flash animations.',0,'undone','Types','webm','The students must be able to know the\r different version of Adobe Flash.',0,'undone','12 Principles of Animation','pptx','The student must be able to know the\r  12 principles of animation in adobe flash.',0,'undone',0,'Flash.png');
/*!40000 ALTER TABLE `flash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `html`
--

DROP TABLE IF EXISTS `html`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `html` (
  `usn` int(11) NOT NULL,
  `info` varchar(255) DEFAULT NULL,
  `lesson1` varchar(25) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(25) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(12) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(25) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(45) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(45) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(12) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(25) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(25) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(12) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(25) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(45) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(45) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(12) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(12) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `html`
--

LOCK TABLES `html` WRITE;
/*!40000 ALTER TABLE `html` DISABLE KEYS */;
INSERT INTO `html` VALUES (100,'Hypertext Mark Up Language is the language for creating Web Pages. HTML files are transported to web servers to be and passed to the user. The web browsers are responsible for displaying the outputs of HTML files','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone',0,NULL),(123,'Hypertext Mark Up Language is the language for creating Web Pages. HTML files are transported to web servers to be and passed to the user. The web browsers are responsible for displaying the outputs of HTML files','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone',0,NULL),(1610443,'Hypertext Mark Up Language is the language for creating Web Pages. HTML files are transported to web servers to be and passed to the user. The web browsers are responsible for displaying the outputs of HTML files','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone',0,''),(71930451,'Hypertext Mark Up Language is the language for creating Web Pages. HTML files are transported to web servers to be and passed to the user. The web browsers are responsible for displaying the outputs of HTML files','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','Getting started','webm','The student must be able to know the different basic HTML tags',0,'Undone','HTML necessary tags','webm','The student must be able to know the HTML necessary tags',0,'Undone','HTML BASICS','webm','The student must be able to know what are the HEADING tags in html',0,'Undone','TABLES AND LIST','webm','The student must be able to know what are the lists in html',0,'Undone','CSS-Cascading Style Sheets','webm','The student must be able to know how to use style tag',0,'Undone','CSS-Height,Width and Padding','webm','The student must be able to know how to use width and height on DIV tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone','CSS-Links','webm','The student must be able to  use paddings on div tag',0,'Undone',0,'');
/*!40000 ALTER TABLE `html` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `java1`
--

DROP TABLE IF EXISTS `java1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `java1` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(25) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(25) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(12) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(25) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(12) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(12) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(25) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(12) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(25) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(25) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(25) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(12) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(25) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(25) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `java1`
--

LOCK TABLES `java1` WRITE;
/*!40000 ALTER TABLE `java1` DISABLE KEYS */;
INSERT INTO `java1` VALUES (100,'Improve the programming skill and knowledge of a student and use it in a single project','Intro to Java1','mp4','We will be discussing a little bit of Java history and what is Java, phases that a Java program undergoes.',0,'undone','Basic Syntax','mp4','We will learn the fundamentals of case sensitivity, class names,  method names and program file name.',0,'undone','Classes and Objects','mp4','We will be discussing about Java classes and its components, We will be discussing about Java classes and its components, properties, behaviors and constructors.',0,'undone','String','mp4','Strings, which are widely used in Java programming. In Java programming language, are a sequence of characters, strings are treated as objects.',0,'undone','Decision Making','mp4','Decision making structures have one or more conditions along with a statement or statements that are to be executed to be evaluated or tested by the program.',0,'undone','Loop Control','mp4',' A loop statement allows us to execute a statement or group form of a loop statement in most of the programming languages of statements multiple times and following is the general.',0,'undone','Characters','mp4','The Character class offers a number of useful class methods for manipulating characters.',0,'undone','Encapsulation','mp4','We will be discussing about the notion of encapsulation and how we will be looking into some mechanisms and techniques can implement this in Java.',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone','Files and Streams','mp4','We will see how we are able to save data into a file. Additionally, we will be discussing about streams, which are, ia certain utilities available in Java',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone',0,'java.png'),(123,'Improve the programming skill and knowledge of a student and use it in a single project','Intro to Java1','mp4','We will be discussing a little bit of Java history and what is Java, phases that a Java program undergoes.',0,'undone','Basic Syntax','mp4','We will learn the fundamentals of case sensitivity, class names,  method names and program file name.',0,'undone','Classes and Objects','mp4','We will be discussing about Java classes and its components, We will be discussing about Java classes and its components, properties, behaviors and constructors.',0,'undone','String','mp4','Strings, which are widely used in Java programming. In Java programming language, are a sequence of characters, strings are treated as objects.',0,'undone','Decision Making','mp4','Decision making structures have one or more conditions along with a statement or statements that are to be executed to be evaluated or tested by the program.',0,'undone','Loop Control','mp4',' A loop statement allows us to execute a statement or group form of a loop statement in most of the programming languages of statements multiple times and following is the general.',0,'undone','Characters','mp4','The Character class offers a number of useful class methods for manipulating characters.',0,'undone','Encapsulation','mp4','We will be discussing about the notion of encapsulation and how we will be looking into some mechanisms and techniques can implement this in Java.',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone','Files and Streams','mp4','We will see how we are able to save data into a file. Additionally, we will be discussing about streams, which are, ia certain utilities available in Java',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone',0,'java.png'),(1610443,'Improve the programming skill and knowledge of a student and use it in a single project','Intro to Java1','mp4','We will be discussing a little bit of Java history and what is Java, phases that a Java program undergoes.',0,'undone','Basic Syntax','mp4','We will learn the fundamentals of case sensitivity, class names,  method names and program file name.',0,'undone','Classes and Objects','mp4','We will be discussing about Java classes and its components, We will be discussing about Java classes and its components, properties, behaviors and constructors.',0,'undone','String','mp4','Strings, which are widely used in Java programming. In Java programming language, are a sequence of characters, strings are treated as objects.',0,'undone','Decision Making','mp4','Decision making structures have one or more conditions along with a statement or statements that are to be executed to be evaluated or tested by the program.',0,'undone','Loop Control','mp4',' A loop statement allows us to execute a statement or group form of a loop statement in most of the programming languages of statements multiple times and following is the general.',0,'undone','Characters','mp4','The Character class offers a number of useful class methods for manipulating characters.',0,'undone','Encapsulation','mp4','We will be discussing about the notion of encapsulation and how we will be looking into some mechanisms and techniques can implement this in Java.',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone','Files and Streams','mp4','We will see how we are able to save data into a file. Additionally, we will be discussing about streams, which are, ia certain utilities available in Java',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone',0,'java.png'),(71930451,'Improve the programming skill and knowledge of a student and use it in a single project','Intro to Java1','mp4','We will be discussing a little bit of Java history and what is Java, phases that a Java program undergoes.',0,'undone','Basic Syntax','mp4','We will learn the fundamentals of case sensitivity, class names,  method names and program file name.',0,'undone','Classes and Objects','mp4','We will be discussing about Java classes and its components, We will be discussing about Java classes and its components, properties, behaviors and constructors.',0,'undone','String','mp4','Strings, which are widely used in Java programming. In Java programming language, are a sequence of characters, strings are treated as objects.',0,'undone','Decision Making','mp4','Decision making structures have one or more conditions along with a statement or statements that are to be executed to be evaluated or tested by the program.',0,'undone','Loop Control','mp4',' A loop statement allows us to execute a statement or group form of a loop statement in most of the programming languages of statements multiple times and following is the general.',0,'undone','Characters','mp4','The Character class offers a number of useful class methods for manipulating characters.',0,'undone','Encapsulation','mp4','We will be discussing about the notion of encapsulation and how we will be looking into some mechanisms and techniques can implement this in Java.',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone','Files and Streams','mp4','We will see how we are able to save data into a file. Additionally, we will be discussing about streams, which are, ia certain utilities available in Java',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone',0,'java.png'),(109440513,'Improve the programming skill and knowledge of a student and use it in a single project','Intro to Java1','mp4','We will be discussing a little bit of Java history and what is Java, phases that a Java program undergoes.',0,'undone','Basic Syntax','mp4','We will learn the fundamentals of case sensitivity, class names,  method names and program file name.',0,'undone','Classes and Objects','mp4','We will be discussing about Java classes and its components, We will be discussing about Java classes and its components, properties, behaviors and constructors.',0,'undone','String','mp4','Strings, which are widely used in Java programming. In Java programming language, are a sequence of characters, strings are treated as objects.',0,'undone','Decision Making','mp4','Decision making structures have one or more conditions along with a statement or statements that are to be executed to be evaluated or tested by the program.',0,'undone','Loop Control','mp4',' A loop statement allows us to execute a statement or group form of a loop statement in most of the programming languages of statements multiple times and following is the general.',0,'undone','Characters','mp4','The Character class offers a number of useful class methods for manipulating characters.',0,'undone','Encapsulation','mp4','We will be discussing about the notion of encapsulation and how we will be looking into some mechanisms and techniques can implement this in Java.',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone','Files and Streams','mp4','We will see how we are able to save data into a file. Additionally, we will be discussing about streams, which are, ia certain utilities available in Java',0,'undone','Inheritance','mp4','We will be discussing about the concept of inheritance and how it is applied in Java. Behaviors of classes when inheritance takes effect.',0,'undone',' POLYMORPHISM','mp4','We will see how polymorphism can be exhibited in Javato help in creating and utilizing classes.',0,'undone','Swing and GUI','mp4','We will learn the fundamentals of creating graphical user interfaces (GUI). Additionally, we will be tackling how we could handle events, and in Java via the Swing package.',0,'undone',0,'java.png');
/*!40000 ALTER TABLE `java1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `java2`
--

DROP TABLE IF EXISTS `java2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `java2` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(12) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` text,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(25) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` text,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(25) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` text,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(45) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(5) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(12) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(25) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(25) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(45) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(5) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(12) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(25) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(25) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(45) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(5) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `java2`
--

LOCK TABLES `java2` WRITE;
/*!40000 ALTER TABLE `java2` DISABLE KEYS */;
INSERT INTO `java2` VALUES (100,'Improve the programming skill and knowledge of a student and use it in a single project','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone',0,'java.png'),(1610443,'Improve the programming skill and knowledge of a student and use it in a single project','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone',0,'java.png'),(71930451,'Improve the programming skill and knowledge of a student and use it in a single project','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone','Math Class','mp4','The student should be able to use the methods for the Java Math Class to dtermine the value of a variable given piece of code, an associate the new methods of the Math Class.',0,'Undone','Regular Expression','mp4','Identify a method that is appropriate for proramming requirement, Supply approriate parameters for a regular expressions, Create a java project that would exhibit the use of regular expressions',0,'Undone','Inner and Outer Class','mp4','Learn the manipulation of Inner and Outer Class and improve the programming skill of the student  with the help of Inner and Outer Class',0,'Undone','Serialization and Deserialization','mp4','Learn the process of securing data using Serialization and make a project that would exhibit the Serialization and Deserialization',0,'Undone','JDBC','mp4','Learn Database manipulation using MySQL, Manipulate the database using java, and create a project that would be using JDBC',0,'Undone',0,'java.png');
/*!40000 ALTER TABLE `java2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `javascript`
--

DROP TABLE IF EXISTS `javascript`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `javascript` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(25) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(12) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(12) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(12) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(12) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(12) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(12) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(12) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(25) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(12) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(12) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(12) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(12) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(25) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `javascript`
--

LOCK TABLES `javascript` WRITE;
/*!40000 ALTER TABLE `javascript` DISABLE KEYS */;
INSERT INTO `javascript` VALUES (100,'In the whole course, the student should be able to use all the topics in creating a dynamic web page and produce a great outcome in applying all the topics. ','JavaScript Concept','mp4','The students will know the basic syntax and the use of JavaScript',0,'undone','Where To','mp4','The students will know where to include JavaScript tag',0,'undone','Output','mp4','The students will know how to use the 4 output syntax',0,'undone','Syntax','mp4','The students will be familiarized with JavaScript Syntax',0,'undone','Statements','mp4','The students will know the use of statements or instructions to be executed by the browser',0,'undone','Comments','mp4','The students will know how to use a comment in JavaScript',0,'undone','Variables','mp4','The students will know how to use variables in JavaScript',0,'undone','Operators','mp4','The students will know how and where to use JavaScript Operators',0,'undone','Arithmetic','mp4','The students will know what are the arithmetic operations in JavaScript',0,'undone','Assigment Operators','mp4','The students will know how to assign values to JavaScript variables',0,'undone','Data Types','mp4','The students will know the data types of JavaScript',0,'undone','Functions','mp4','The students will know how to use functions in JavaScript',0,'undone','Objects','mp4','The students will know how to create and use objects in JavaScript',0,'undone','Math Class','mp4','The students will know how to use built in math methods in JavaScript',0,'undone','Form Validation','mp4','The students will know how to validate forms using JavaScript',0,'undone',0,'javascript.png'),(123,'In the whole course, the student should be able to use all the topics in creating a dynamic web page and produce a great outcome in applying all the topics. ','JavaScript Concept','mp4','The students will know the basic syntax and the use of JavaScript',0,'undone','Where To','mp4','The students will know where to include JavaScript tag',0,'undone','Output','mp4','The students will know how to use the 4 output syntax',0,'undone','Syntax','mp4','The students will be familiarized with JavaScript Syntax',0,'undone','Statements','mp4','The students will know the use of statements or instructions to be executed by the browser',0,'undone','Comments','mp4','The students will know how to use a comment in JavaScript',0,'undone','Variables','mp4','The students will know how to use variables in JavaScript',0,'undone','Operators','mp4','The students will know how and where to use JavaScript Operators',0,'undone','Arithmetic','mp4','The students will know what are the arithmetic operations in JavaScript',0,'undone','Assigment Operators','mp4','The students will know how to assign values to JavaScript variables',0,'undone','Data Types','mp4','The students will know the data types of JavaScript',0,'undone','Functions','mp4','The students will know how to use functions in JavaScript',0,'undone','Objects','mp4','The students will know how to create and use objects in JavaScript',0,'undone','Math Class','mp4','The students will know how to use built in math methods in JavaScript',0,'undone','Form Validation','mp4','The students will know how to validate forms using JavaScript',0,'undone',0,'javascript.png'),(145,'In the whole course, the student should be able to use all the topics in creating a dynamic web page and produce a great outcome in applying all the topics. ','JavaScript Concept','mp4','The students will know the basic syntax and the use of JavaScript',0,'undone','Where To','mp4','The students will know where to include JavaScript tag',0,'undone','Output','mp4','The students will know how to use the 4 output syntax',0,'undone','Syntax','mp4','The students will be familiarized with JavaScript Syntax',0,'undone','Statements','mp4','The students will know the use of statements or instructions to be executed by the browser',0,'undone','Comments','mp4','The students will know how to use a comment in JavaScript',0,'undone','Variables','mp4','The students will know how to use variables in JavaScript',0,'undone','Operators','mp4','The students will know how and where to use JavaScript Operators',0,'undone','Arithmetic','mp4','The students will know what are the arithmetic operations in JavaScript',0,'undone','Assigment Operators','mp4','The students will know how to assign values to JavaScript variables',0,'undone','Data Types','mp4','The students will know the data types of JavaScript',0,'undone','Functions','mp4','The students will know how to use functions in JavaScript',0,'undone','Objects','mp4','The students will know how to create and use objects in JavaScript',0,'undone','Math Class','mp4','The students will know how to use built in math methods in JavaScript',0,'undone','Form Validation','mp4','The students will know how to validate forms using JavaScript',0,'undone',0,'javascript.png'),(1610443,'Javascript Powerpoint Presentation.pptx','JavaScript Concept','mp4','The students will know the basic syntax and the use of JavaScript',0,'undone','Where To','mp4','The students will know where to include JavaScript tag',0,'undone','Output','mp4','The students will know how to use the 4 output syntax',0,'undone','Syntax','mp4','The students will be familiarized with JavaScript Syntax',0,'undone','Statements','mp4','The students will know the use of statements or instructions to be executed by the browser',0,'undone','Comments','mp4','The students will know how to use a comment in JavaScript',0,'undone','Variables','mp4','The students will know how to use variables in JavaScript',0,'undone','Operators','mp4','The students will know how and where to use JavaScript Operators',0,'undone','Arithmetic','mp4','The students will know what are the arithmetic operations in JavaScript',0,'undone','Assigment Operators','mp4','The students will know how to assign values to JavaScript variables',0,'undone','Data Types','mp4','The students will know the data types of JavaScript',0,'undone','Functions','mp4','The students will know how to use functions in JavaScript',0,'undone','Objects','mp4','The students will know how to create and use objects in JavaScript',0,'undone','Math Class','mp4','The students will know how to use built in math methods in JavaScript',0,'undone','Form Validation','mp4','The students will know how to validate forms using JavaScript',0,'undone',0,'javascript.png'),(71930451,'Javascript Powerpoint Presentation.pptx','JavaScript Concept','mp4','The students will know the basic syntax and the use of JavaScript',0,'undone','Where To','mp4','The students will know where to include JavaScript tag',0,'undone','Output','mp4','The students will know how to use the 4 output syntax',0,'undone','Syntax','mp4','The students will be familiarized with JavaScript Syntax',0,'undone','Statements','mp4','The students will know the use of statements or instructions to be executed by the browser',0,'undone','Comments','mp4','The students will know how to use a comment in JavaScript',0,'undone','Variables','mp4','The students will know how to use variables in JavaScript',0,'undone','Operators','mp4','The students will know how and where to use JavaScript Operators',0,'undone','Arithmetic','mp4','The students will know what are the arithmetic operations in JavaScript',0,'undone','Assigment Operators','mp4','The students will know how to assign values to JavaScript variables',0,'undone','Data Types','mp4','The students will know the data types of JavaScript',0,'undone','Functions','mp4','The students will know how to use functions in JavaScript',0,'undone','Objects','mp4','The students will know how to create and use objects in JavaScript',0,'undone','Math Class','mp4','The students will know how to use built in math methods in JavaScript',0,'undone','Form Validation','mp4','The students will know how to validate forms using JavaScript',0,'undone',0,'javascript.png'),(109440513,'Javascript Powerpoint Presentation.pptx','JavaScript Concept','mp4','The students will know the basic syntax and the use of JavaScript',0,'undone','Where To','mp4','The students will know where to include JavaScript tag',0,'undone','Output','mp4','The students will know how to use the 4 output syntax',0,'undone','Syntax','mp4','The students will be familiarized with JavaScript Syntax',0,'undone','Statements','mp4','The students will know the use of statements or instructions to be executed by the browser',0,'undone','Comments','mp4','The students will know how to use a comment in JavaScript',0,'undone','Variables','mp4','The students will know how to use variables in JavaScript',0,'undone','Operators','mp4','The students will know how and where to use JavaScript Operators',0,'undone','Arithmetic','mp4','The students will know what are the arithmetic operations in JavaScript',0,'undone','Assigment Operators','mp4','The students will know how to assign values to JavaScript variables',0,'undone','Data Types','mp4','The students will know the data types of JavaScript',0,'undone','Functions','mp4','The students will know how to use functions in JavaScript',0,'undone','Objects','mp4','The students will know how to create and use objects in JavaScript',0,'undone','Math Class','mp4','The students will know how to use built in math methods in JavaScript',0,'undone','Form Validation','mp4','The students will know how to validate forms using JavaScript',0,'undone',0,'javascript.png');
/*!40000 ALTER TABLE `javascript` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photoshop`
--

DROP TABLE IF EXISTS `photoshop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photoshop` (
  `usn` int(11) NOT NULL,
  `info` longtext,
  `lesson1` varchar(5) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(4000) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(25) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(12) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(25) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(4000) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(12) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(25) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(12) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(4000) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(12) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(45) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(45) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(255) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(45) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(45) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(12) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(4000) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) DEFAULT NULL,
  `photo` varchar(45) DEFAULT 'PS.jpg',
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photoshop`
--

LOCK TABLES `photoshop` WRITE;
/*!40000 ALTER TABLE `photoshop` DISABLE KEYS */;
INSERT INTO `photoshop` VALUES (100,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',0,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg'),(456,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artist\'s virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your \"canvas\" or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, you\'d learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and it\'s property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',0,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we\'ll talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we\'ll talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We\'ll also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we\'ll talk about Eraser, Spot Healing Brush. We\'ll also provide beginners a better knowledge using different types of Brush Tools. You\'ll also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we\'ll talk about Text Tool. We\'ll also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we\'ll talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we\'ll talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we\'ll talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we\'ll talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we\'ll talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we\'ll talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg'),(1610443,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',0,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg'),(71930451,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',0,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg'),(73153481,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',0,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg'),(74099349,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',6,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg'),(111963696,'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.','Basic','mp4','This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.',0,'Undone','Cropping','pptx','This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.',0,'Undone','Saving Options','mp4','This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.',0,'Undone','Layers','pptx','This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.',0,'Undone','Adjustment Panel','pptx','This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.',0,'Undone','Sharpening','pptx','This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.',0,'Undone','Background Layers','pptx','In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.',0,'Undone','Brush Tool','pptx','In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.',0,'Undone','Text Tool','pptx','In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better',0,'Undone','Hide Layers','mp4','In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.',0,'Undone','Layer Masks','mp4','In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing',0,'Undone','Gradient','mp4','In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.',0,'Undone','Blending','mp4','In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.',0,'Undone','Free Transform','mp4','In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.',0,'Undone','Histogram','mp4','In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.',0,'Undone',0,'ps.jpg');
/*!40000 ALTER TABLE `photoshop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `php`
--

DROP TABLE IF EXISTS `php`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `php` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(12) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` text,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(25) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(12) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(25) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(12) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(12) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(25) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(12) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(25) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(12) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(12) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(25) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(12) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(25) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `php`
--

LOCK TABLES `php` WRITE;
/*!40000 ALTER TABLE `php` DISABLE KEYS */;
INSERT INTO `php` VALUES (100,'Php is a server side scripting language that is embedded in Html.It is used to manage dynamic content,databases, session tracking, and even build an entire e-commerce site.','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone',0,'php.jpg'),(123,'Php is a server side scripting language that is embedded in Html.It is used to manage dynamic content,databases, session tracking, and even build an entire e-commerce site.','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone',0,'php.jpg'),(1610443,'Php is a server side scripting language that is embedded in Html.It is used to manage dynamic content,databases, session tracking, and even build an entire e-commerce site.','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone',0,'php.jpg'),(71930451,'Php is a server side scripting language that is embedded in Html.It is used to manage dynamic content,databases, session tracking, and even build an entire e-commerce site.','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone',0,'php.jpg'),(109440513,'Php is a server side scripting language that is embedded in Html.It is used to manage dynamic content,databases, session tracking, and even build an entire e-commerce site.','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone','Variables','mp4','Students should be able to create data types using proper variable naming',0,'Undone','Operators','mp4','The Students should know the uses of the different operators e.g. Addition and Subtraction,should be able to accomplish static mathematical equations, the students should now be familiar with how different operators work',0,'Undone','Conditions','mp4','Students should know the different conditional statements,should be able to implement proper control mechanisms, should be familiar with how the different uses of if, else if, and else statements.',0,'Undone','Looping','mp4','Students should know the uses of different types of loops,should be able to implement proper looping mechanisms, should be familiar with the different uses of for,while,and do while loops.',0,'Undone','Arrays','mp4','Students should know the uses of arrays, should be able to implement proper array mehcanisms,should be familiar with the different implementations of arrays.',0,'Undone',0,'php.jpg');
/*!40000 ALTER TABLE `php` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `powerpoint`
--

DROP TABLE IF EXISTS `powerpoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `powerpoint` (
  `usn` int(11) NOT NULL,
  `info` varchar(255) DEFAULT NULL,
  `lesson1` varchar(45) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(12) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(25) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(25) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(25) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(25) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(25) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(25) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(25) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(25) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(255) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(25) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(45) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(25) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(255) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(25) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(255) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `powerpoint`
--

LOCK TABLES `powerpoint` WRITE;
/*!40000 ALTER TABLE `powerpoint` DISABLE KEYS */;
INSERT INTO `powerpoint` VALUES (100,'PowerPoint 2010 is a presentation software that allows you to create dynamic slide presentations that can include animation, narration, images, and videos. In this tutorial, you will learn how to use Powerpoint 2010 through the 15 lessons provided.','Getting Started with PowerPoint','wmv','To be able to learn your way around the PowerPoint 2010 environment, including getting to know the new Backstage view.',0,'Undone','Slide Basics','wmv','To learn how to insert new slides, modify a layout, and change your presentation view.',0,'Undone','Text Basics','wmv','To learn the basics of working with text, including how to insert, delete, and move text; how to work with text boxes; and how to format text.',0,'Undone','Applying a Theme','wmv','To learn all about themes and how to apply them.',0,'Undone','Inserting Images','wmv','To learn how to insert and manipulate pictures, clip art, and screenshots into your slides.',0,'Undone','Applying Transitions','wmv','To learn how to apply and customize slide transitions.',0,'Undone','Check Spelling','wmv','To learn about the various proofing features, including the Spelling tool.',0,'Undone','Presenting a Slideshow','wmv','To learn how to play a slide show and advance through slides. In addition, you will learn about various presentation options like using a highlighter to mark slides and how to set your slide show to play on a continuous loop.',0,'Undone','Saving and Printing','wmv','To learn how to use the Save and Save As commands, in addition to learning how to save in alternative file formats. We will also cover all of the printing tasks and settings in the Print pane, along with the Quick Print feature.',0,'Undone','Modifying Themes','wmv','To learn how to modify theme colors, theme fonts, and theme effects, as well as apply a background style.',0,'Undone','Formatting Pictures','wmv','To learn how to change the picture style and shape, add a border, crop and compress pictures, and add artistic effects.',0,'Undone','Animation Effects','wmv','To learn how to add animation effects to text and objects and customize them.',0,'Undone','Hyperlinks and Action Buttons','wmv','To learn how to insert hyperlinks using text and objects and how to insert action buttons.',0,'Undone','Inserting Tables','wmv','To learn how to insert tables, apply table styles, and format tables using various commands.',0,'Undone','Inserting Charts','wmv','To learn how to insert charts and modify them so they communicate information effectively.',0,'Undone',0,'Powerpoint.png'),(123,'PowerPoint 2010 is a presentation software that allows you to create dynamic slide presentations that can include animation, narration, images, and videos. In this tutorial, you will learn how to use Powerpoint 2010 through the 15 lessons provided.','Getting Started with PowerPoint','wmv','To be able to learn your way around the PowerPoint 2010 environment, including getting to know the new Backstage view.',0,'Undone','Slide Basics','wmv','To learn how to insert new slides, modify a layout, and change your presentation view.',0,'Undone','Text Basics','wmv','To learn the basics of working with text, including how to insert, delete, and move text; how to work with text boxes; and how to format text.',0,'Undone','Applying a Theme','wmv','To learn all about themes and how to apply them.',0,'Undone','Inserting Images','wmv','To learn how to insert and manipulate pictures, clip art, and screenshots into your slides.',0,'Undone','Applying Transitions','wmv','To learn how to apply and customize slide transitions.',0,'Undone','Check Spelling','wmv','To learn about the various proofing features, including the Spelling tool.',0,'Undone','Presenting a Slideshow','wmv','To learn how to play a slide show and advance through slides. In addition, you will learn about various presentation options like using a highlighter to mark slides and how to set your slide show to play on a continuous loop.',0,'Undone','Saving and Printing','wmv','To learn how to use the Save and Save As commands, in addition to learning how to save in alternative file formats. We will also cover all of the printing tasks and settings in the Print pane, along with the Quick Print feature.',0,'Undone','Modifying Themes','wmv','To learn how to modify theme colors, theme fonts, and theme effects, as well as apply a background style.',0,'Undone','Formatting Pictures','wmv','To learn how to change the picture style and shape, add a border, crop and compress pictures, and add artistic effects.',0,'Undone','Animation Effects','wmv','To learn how to add animation effects to text and objects and customize them.',0,'Undone','Hyperlinks and Action Buttons','wmv','To learn how to insert hyperlinks using text and objects and how to insert action buttons.',0,'Undone','Inserting Tables','wmv','To learn how to insert tables, apply table styles, and format tables using various commands.',0,'Undone','Inserting Charts','wmv','To learn how to insert charts and modify them so they communicate information effectively.',0,'Undone',0,'Powerpoint.png'),(1610443,'PowerPoint 2010 is a presentation software that allows you to create dynamic slide presentations that can include animation, narration, images, and videos. In this tutorial, you will learn how to use Powerpoint 2010 through the 15 lessons provided.','Getting Started with PowerPoint','wmv','To be able to learn your way around the PowerPoint 2010 environment, including getting to know the new Backstage view.',0,'Undone','Slide Basics','wmv','To learn how to insert new slides, modify a layout, and change your presentation view.',0,'Undone','Text Basics','wmv','To learn the basics of working with text, including how to insert, delete, and move text; how to work with text boxes; and how to format text.',0,'Undone','Applying a Theme','wmv','To learn all about themes and how to apply them.',0,'Undone','Inserting Images','wmv','To learn how to insert and manipulate pictures, clip art, and screenshots into your slides.',0,'Undone','Applying Transitions','wmv','To learn how to apply and customize slide transitions.',0,'Undone','Check Spelling','wmv','To learn about the various proofing features, including the Spelling tool.',0,'Undone','Presenting a Slideshow','wmv','To learn how to play a slide show and advance through slides. In addition, you will learn about various presentation options like using a highlighter to mark slides and how to set your slide show to play on a continuous loop.',0,'Undone','Saving and Printing','wmv','To learn how to use the Save and Save As commands, in addition to learning how to save in alternative file formats. We will also cover all of the printing tasks and settings in the Print pane, along with the Quick Print feature.',0,'Undone','Modifying Themes','wmv','To learn how to modify theme colors, theme fonts, and theme effects, as well as apply a background style.',0,'Undone','Formatting Pictures','wmv','To learn how to change the picture style and shape, add a border, crop and compress pictures, and add artistic effects.',0,'Undone','Animation Effects','wmv','To learn how to add animation effects to text and objects and customize them.',0,'Undone','Hyperlinks and Action Buttons','wmv','To learn how to insert hyperlinks using text and objects and how to insert action buttons.',0,'Undone','Inserting Tables','wmv','To learn how to insert tables, apply table styles, and format tables using various commands.',0,'Undone','Inserting Charts','wmv','To learn how to insert charts and modify them so they communicate information effectively.',0,'Undone',0,'Powerpoint.png');
/*!40000 ALTER TABLE `powerpoint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qexcel`
--

DROP TABLE IF EXISTS `qexcel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qexcel` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(25) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qexcel`
--

LOCK TABLES `qexcel` WRITE;
/*!40000 ALTER TABLE `qexcel` DISABLE KEYS */;
INSERT INTO `qexcel` VALUES (1,'BASIC','MS-EXCEL can be used to automate','Financial statements, Business forecasting'),(2,'BASIC','NOT, AND, OR and XOR are','Relational operators'),(3,'BASIC','In a report, you need to show the monthly rainfall in NepaThe best way to do this is to insert a','chart showing rainfall amounts'),(4,'BASIC','You want to record experiment information and create a chart that shows the rate of crystal growth over a period of timThe best application to use would be:','spreadsheet'),(5,'BASIC','You are editing an worksheet that you had previously saveIf you want to save the edited sheet without losing the original one, which command should you use?','Save As'),(6,'BASIC','If you want to have a blank line after the title in a worksheet, what is the best thing for you to do?','Insert a row'),(7,'BASIC','In order to arrange the countries from those with the highest population to those with the lowest, you need to sort on the population field in ','descending order'),(8,'BASIC','In order to perform a calculation in a spreadsheet, you need to use a:','formula'),(9,'BASIC','The box on the chart that contains the name of each individual record is called the ','legend'),(10,'BASIC','If you want all of the white cats grouped together in the database, you need to sort by ','Pet Type, then Color'),(11,'CELL BASICS','You accidentally erased a record in the sheeWhat command can be used to restore it immediately?','Undo'),(12,'CELL BASICS','Where a row and a column meet, what do you call that?','A cell'),(13,'CELL BASICS','How do you tell one cell from another?','By its address'),(14,'CELL BASICS','Give me an example of a cell address.','A21'),(15,'CELL BASICS','Which is an example of a formula?','.=A1+A2'),(16,'CELL BASICS','Which is an example of a function?','.=SUM(A1:A2)'),(17,'CELL BASICS','What is the symbol for multiplying?','*'),(18,'CELL BASICS','What is the symbol for dividing?','A ./'),(19,'CELL BASICS','A function inside another function is called ?','Nested function'),(20,'CELL BASICS','Which of the following is not an underline option in the format cells dialog box?','Single Engineering'),(21,'ORGANIZING THE WORKSHEET','Formulas in Excel start with','='),(22,'ORGANIZING THE WORKSHEET','The default header for a worksheet is','None'),(23,'ORGANIZING THE WORKSHEET','Which of the following is not an option of the spelling dialog box?','Edit'),(24,'ORGANIZING THE WORKSHEET','Which of the following methods will not enter data in a cell?','Pressing the Esc key'),(25,'ORGANIZING THE WORKSHEET','The cell reference for cell range of G2 to M12 is?','G2:M12'),(26,'ORGANIZING THE WORKSHEET','What is the keyboard shortcut for creating a chart from the selected cell range?','F11'),(27,'ORGANIZING THE WORKSHEET','The Software which contains rows and columns is called ?','Spreadsheet'),(28,'ORGANIZING THE WORKSHEET','You can group noncontiguous worksheets with','The ctrl key and mouse'),(29,'ORGANIZING THE WORKSHEET','What is the AutoComplete feature of Excel?','It completes text entries that match an existing entry in the same column'),(30,'ORGANIZING THE WORKSHEET','Which of the following is correct?','..=AVERAGE(4, 5, 6, 7) \n'),(31,'FORMATING CELLS','Which of the following function will return a value of 8?','ROUNDDOWN(8.4999, '),(32,'FORMATING CELLS','How to restrict to run a macro automatically when starting Microsoft Excel?','Hold down the SHIFT key during startup'),(33,'FORMATING CELLS','How to remove the unwanted action from recorded macro without recording the whole macro again?','By edit the macro in the Visual Basic Editor'),(34,'FORMATING CELLS','. What should be add before a fraction to avoid entering it as a date?','Zero Space'),(35,'FORMATING CELLS','Which of the following function will use to find the highest number in a series of number?','MAX(B1:B3)'),(36,'FORMATING CELLS','What does the NOW() function return?','None of the above'),(37,'FORMATING CELLS','What value will display if the formula = “$55.00″+5 is entered into a cell?','60'),(38,'FORMATING CELLS','What is the shortcut key to insert current date in a cell?','CTRL + ;'),(39,'FORMATING CELLS','Which of the following syntax is correct regarding to SUM function in Excel?','All of the above'),(40,'FORMATING CELLS','. What is the shortcut key to hide entire column?','CTRL + 0'),(41,'SELECTING WORKSHEET','How to specify cell range from A9 to A99 in Excel?','(A9 : A99)'),(42,'SELECTING WORKSHEET','Selecting the Column G & H then choose Insert->ColumnWhat will happen?','2 Columns will be inserted after Column F'),(43,'SELECTING WORKSHEET','2 Columns will be inserted after Column F?','The Settings tab under the menu Data -> Validation'),(44,'SELECTING WORKSHEET','Clear the contents by pressing “DELETE” key from a keyboard will clear ','Contents Only'),(45,'SELECTING WORKSHEET','Which of the following shortcuts can be used to insert a new line in the same cell?','Alt + Enter'),(46,'SELECTING WORKSHEET','What is the quickest way to select entire worksheet?','Click on the rectangle box on the upper left corner where column headings and row headings meet'),(47,'SELECTING WORKSHEET','A smart tag will be removed from a cell when ','the data in the cell is changed or deleted'),(48,'SELECTING WORKSHEET','Which of the following options is appropriate to show the numbers 9779851089510 in a cell?','Apply the Text format in the cell and type the numbers'),(49,'SELECTING WORKSHEET','Which of the following is correct syntax in Excel?','.=IF(LogicalTest, TrueResult, FalseResult)'),(50,'SELECTING WORKSHEET','Which of the following is correct?','POWER(2*3)'),(51,'ROW BASICS','Selecting the Rows 5 & 6 then choose Insert->RoWhat will happen?','2 Rows will be inserted after Row 4'),(52,'ROW BASICS','If 4/6 entered in a cell without applying any formats, Excel will treat this as','Date'),(53,'ROW BASICS','If the values in A1 is “MCQ” and B1 is “Questions”, which function will return “MCQ@Questions” in cell C1?','.=A1 & “@” & B1'),(54,'ROW BASICS','How to fit long texts in a single cell with multiple lines?','Use the Wrap Text option in the Format -> Alignment menu'),(55,'ROW BASICS','If particular workbook have to open each time Excel started, where that workbook should be placed?','XLSTART Folder'),(56,'ROW BASICS','If the cell B1 contains the formula = $A$1, which of the following statements is true?','There is an absolute reference to cell A1'),(57,'ROW BASICS','Worksheet can be renamed by ','Double Click on the Worksheet tab and type new name'),(58,'ROW BASICS','1What is the shortcut key to hide entire row?','CTRL + 9'),(59,'ROW BASICS','What is the shortcut key to insert a new comment in a cell?','Shift + F2'),(60,'ROW BASICS','Which option allows you to Bold all the negative values within the selected cell range?','Conditional Formatting'),(61,'WORKSHEET BASICS','What is the shortcut key to insert new sheet in current workbook?','Shift + F11'),(62,'WORKSHEET BASICS','. Which one is the last column header in Excel 2007?','XFD'),(63,'WORKSHEET BASICS','In maximum, how many sheets can be set as default while creating new workbook? ','255'),(64,'WORKSHEET BASICS','“New Comment” option can be found under _________ tab','Review'),(65,'WORKSHEET BASICS','In Excel, by default Numeric Values appears in','Right aligned'),(66,'WORKSHEET BASICS','To show/hide the grid lines in Microsoft Excel 2007','Page Layout -> Grid lines -> View'),(67,'WORKSHEET BASICS','What will be the result if you type =A1=B1 in cell C1?','True or False'),(68,'WORKSHEET BASICS','In Excel _______ may not contain in Formula','Circular Reference'),(69,'WORKSHEET BASICS','Ecxel may not contain  in formula','Text Constant'),(70,'WORKSHEET BASICS','What is the keyboard shortcut for creating a chart from the selected cell range?','f11');
/*!40000 ALTER TABLE `qexcel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qflash`
--

DROP TABLE IF EXISTS `qflash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qflash` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(45) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qflash`
--

LOCK TABLES `qflash` WRITE;
/*!40000 ALTER TABLE `qflash` DISABLE KEYS */;
INSERT INTO `qflash` VALUES (1,'History','In the early _______, flash was widely installed on desktop computers.','1990'),(2,'History','Meaning of the word RIA\'s','Research Intelligence'),(3,'History','Between 2006 and 2016, the _____ web service conducted over 9.0 billion speed test','speedtest.net'),(4,'History','______ allows creation flash based mobile games, which may be published to the google play.','adobe flash'),(5,'History','______ are popular on the internet, with portals like new grounds dedicated','nintendo'),(6,'History','_______ is one of the common animation programs for low-cost','animated feature'),(7,'History','What is the meaning of the AJAX.?','asychronous javascript and xml'),(8,'History','To release games for desktop or mobile platforms','adobe air'),(9,'History','To improve performance','adobe scout'),(10,'History','To convert C++ based games to run in flash','cross bridge'),(11,'Types','November ______, future flash was acquired by macromedia and release Futureflash animator','1995'),(12,'Types','______ was an animation tool originally developed for pen-based computing devices?','Future Splash animator'),(13,'Types','If you do not see the command you want, click on the Choose Commands drop-down and select ______?','File tabs'),(14,'Types','In the ____, the first major version of Action Script was develop.?','1990'),(15,'Types','In 2014 _______ reached a milestone when or 100,000 unique application built on air.?','adobe Hex builder'),(16,'Types','What format have a flash source file.?','FLA format'),(17,'Types','what scripting language used in Adobe Flash.?','ActionScipt'),(18,'Types','Flash movie files are in the _______ format.?','SWF'),(19,'Types','The flash player includes in virtual machine called.?','ActionScript virtual'),(20,'Types','Adobe flash player performed better on ____.?','Windows'),(21,'12 Principles of Animation','This movement prepares the audience for a major action the character is about to perform.','anticipation'),(22,'12 Principles of Animation','This action gives the illusion of weight and volume to a character as it move.','squash and stretch'),(23,'12 Principles of Animation','A pose or action should clearly communicate to the audience the attitude and mood.','staging'),(24,'12 Principles of Animation','Expertise in the timing comes best with experience and personal experimentation.','timing'),(25,'12 Principles of Animation','Like all forms of story telling, the feature has to appeal to the mind as well as to the eye.','appeal'),(26,'12 Principles of Animation','It is not extreme distortion of a drawing or extremely broad, violent action all the time.','exaggeration'),(27,'12 Principles of Animation','You transform these into color and movement giving the characters the illusion of 3D and 4D in life.','solid drawing'),(28,'12 Principles of Animation','This action adds to and enriches the main action and adds more dimension to the character animation','secondary action'),(29,'12 Principles of Animation','It give animation a more natural action and better flow.','arcs'),(30,'12 Principles of Animation','As actions starts, we have more drawings near the starting pose, one or two in the middle, and more drawing near the next pose','Slow-in and slow-out');
/*!40000 ALTER TABLE `qflash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qhtml`
--

DROP TABLE IF EXISTS `qhtml`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qhtml` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(45) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qhtml`
--

LOCK TABLES `qhtml` WRITE;
/*!40000 ALTER TABLE `qhtml` DISABLE KEYS */;
INSERT INTO `qhtml` VALUES (1,'Getting Started','It is a text editor and source code editor for use with Microsoft Windows?','Notepad++'),(2,'Getting Started','What is the current version of the Notepad++ in the video?','v7.3.3'),(3,'Getting Started','How to Open a new HTML worksheet?','Click File then New'),(4,'Getting Started','How to save a HTML ?','Click Save'),(5,'Getting Started','What is the Save as Type of a HTML document?','.html'),(6,'Getting Started','How to Run a HTML document inside the Notepad++?','Click run then choose your browser'),(7,'Getting Started','After installing the Notepad++ what is the first step?','Choose your language'),(8,'Getting Started','Is notepad++ a User Defined language?','Yes'),(9,'Getting Started','What tag or element you can put a title of the HTML?','<title>'),(10,'Getting Started','After reading the License of agreement in installing a Notepad++, what button you\'ll choose to continue installing Notepad++?','I agree Button'),(11,'HTML necessary tags','HTML stands for?','Hyper Text Markup Language'),(12,'HTML necessary tags','What tag is the root element of the HTML?','<html>'),(13,'HTML necessary tags','How to end a html document or html tag?','</html>'),(14,'HTML necessary tags','What element contains meta information about the document?','<head>'),(15,'HTML necessary tags','What element is under the head?','<title>'),(16,'HTML necessary tags','What element contains the visible page content?','<body>'),(17,'HTML necessary tags','What element defines a paragraph?','<p>'),(18,'HTML necessary tags','What elements are represented in HTML?','tags'),(19,'HTML necessary tags','How many headings tags in HTML?','6'),(20,'HTML necessary tags','How to end a body element?','</body>'),(21,'HTML BASICS','How many levels are there in the headings?','six'),(22,'HTML BASICS','What is the least or the smallest heading element?','<h6>'),(23,'HTML BASICS','What is the highest or the biggest heading element?','</h1>'),(24,'HTML BASICS','What element defines a paragraph?','<p>'),(25,'HTML BASICS','How to put left-align text in paragraph element?','<p align = \'left\'>'),(26,'HTML BASICS','In HTML, a ________ can be specified by using a color name, an RGB value, or a HEX value.','color'),(27,'HTML BASICS','In HTML, the easiest way to put a color is?','color name'),(28,'HTML BASICS','In HTML, images are defined with ____ tag?','<img>'),(29,'HTML BASICS','_______ attribute to define the URL of the image?','file path'),(30,'HTML BASICS','Do <img> tag need closing tag?','Yes'),(31,'TABLES AND LIST','What HTML element define an unordered list?','<ul>'),(32,'TABLES AND LIST','What HTML element define an ordered list?','<ol>'),(33,'TABLES AND LIST','What is the meaning of <li> tag?','list item'),(34,'TABLES AND LIST','In unoredered list with the <ul> tag. What is the list item in unordered list?','Marked with bullets(small black circles)'),(35,'TABLES AND LIST','In ordered list with the <ol> tag. What is the list item in ordered list?','numbering'),(36,'TABLES AND LIST','An HTML table is defined with the ____ tag?','<table>'),(37,'TABLES AND LIST','What is tag element of the table row?','<tr>'),(38,'TABLES AND LIST','What is the tag element of the table header?','<th>'),(39,'TABLES AND LIST','A table data/cell is defined with the _____?','<td>'),(40,'TABLES AND LIST','What is the use of table border?','table border is the separates each cell on the table'),(41,'CSS-Cascading Style Sheets','CSS stands for?','Cascading Style Sheets'),(42,'CSS-Cascading Style Sheets','Where do you put the <style> tag?','under the head tag'),(43,'CSS-Cascading Style Sheets','It is used to define a style for a single HTML page?','internal CSS'),(44,'CSS-Cascading Style Sheets','Use the HTML _____attribute for inline styling?','style'),(45,'CSS-Cascading Style Sheets','Use the HTML ______ element to store <style> and <link> elements?','<head>'),(46,'CSS-Cascading Style Sheets','Use the CSS ______ property for text colors?','color'),(47,'CSS-Cascading Style Sheets','Use the CSS  _________property for text fonts ?','font-family'),(48,'CSS-Cascading Style Sheets','Use the CSS ______ property for text sizes?','font-size'),(49,'CSS-Cascading Style Sheets','HTML elements are represented by ?','tag'),(50,'CSS-Cascading Style Sheets','________ are stored in CSS files?','External Style Sheets'),(51,'CSS-Height,Width and Padding','The ______and ______ properties are used to set the height and width of an element.','Height and width'),(52,'CSS-Height,Width and Padding','It is a properties that are used to generate space around content.','Padding'),(53,'CSS-Height,Width and Padding','You have full control over the padding with?','CSS'),(54,'CSS-Height,Width and Padding','What are the CSS properties for setting the padding for each side of an element ?','Right,Top,Left,Bottom'),(55,'CSS-Height,Width and Padding','What is the quantity of length equal to the pixel in an unscaled HTML <img> or CSS \'background-image’?','<head>'),(56,'CSS-Height,Width and Padding','Use the CSS ______ property for text colors?','px'),(57,'CSS-Height,Width and Padding','No maximum width. This is default','False'),(58,'CSS-Height,Width and Padding','The  property is used to set the maximum width of an element.','Max-width'),(59,'CSS-Height,Width and Padding','The problem with the ________ above occurs when the browser window is smaller than the width of the element (500px). The browser then adds a horizontal scrollbar to the page.','<div>'),(60,'CSS-Height,Width and Padding','Using max-width instead, in this situation, will improve the browser\'s handling the?','Small windows'),(61,'CSS-Links','It can be styled with any CSS property.','Links'),(62,'CSS-Links','It is a normal, unvisited links.','a:link'),(63,'CSS-Links','a link the user has visited','a:visited'),(64,'CSS-Links','a link when the user mouses over it','a:hover'),(65,'CSS-Links','a link the moment it is clicked?','a:active'),(66,'CSS-Links','The _________ property is mostly used to remove underlines from links:','Text-Decoration'),(67,'CSS-Links','The __________ property can be used to specify a background color for links:','Background-color'),(68,'CSS-Links','The link must contain?','<a href>'),(69,'CSS-Links','The __________ attribute specifies where to open the linked document.','target'),(70,'CSS-Links',' It is used to allow readers to jump to specific parts of a Web page.','HTML Bookmarks');
/*!40000 ALTER TABLE `qhtml` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qjava1`
--

DROP TABLE IF EXISTS `qjava1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qjava1` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(25) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qjava1`
--

LOCK TABLES `qjava1` WRITE;
/*!40000 ALTER TABLE `qjava1` DISABLE KEYS */;
INSERT INTO `qjava1` VALUES (1,'Intro to Java1','Who is the main developer of Java Programming language?','James Gosling'),(2,'Intro to Java1','What is the original name of java?','Oak'),(3,'Intro to Java1','It is a special machine language that can be understood by the Java Virtual Machine (JVM).',' bytecode'),(4,'Intro to Java1','What is the file type/extension in saving Java programs?',' .java'),(5,'Intro to Java1','What is the file type/extension once the Java program has been compiled?','.class'),(6,'Intro to Java1','Allows you to create, edit, compile and run programs written in a particular language, e.g. Java','IDE'),(7,'Intro to Java1',' It will display each string on a separate line',' println()'),(8,'Intro to Java1','It refers to the hiding of data and methods within an object.','encapsulation'),(9,'Intro to Java1',' It is the ability of OOP to create classes that share the attributes and methods of existing classes.','inheritance'),(10,'Intro to Java1','It adds security by separating the name spaces for the classes of the local file system from those that are imported from network sources','Class Loader'),(11,'Basic Syntax','All Java components require names. Names used for classes, variables, and methods','identifier'),(12,'Basic Syntax','Where the logics are written, data is manipulated and all the actions are executed','methods'),(13,'Basic Syntax','Can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.','Class Loader'),(14,'Basic Syntax','have states and behaviors','object'),(15,'Basic Syntax','A modifier which that is default, public , protected, private','access'),(16,'Basic Syntax','All variables must be declared before they can be used. (TRUE or FALSE)','True'),(17,'Basic Syntax','All strings end with a null zero inside memory','True'),(18,'Basic Syntax','Variable names may begin with a number.','False'),(19,'Basic Syntax',' In Java, 5/2 =','2'),(20,'Basic Syntax',' In Java, the % refers to what operator','modulus'),(21,'Classes and Objects','Which of the field declaration is legal within the body of an interface? _______ answer = 42;','int'),(22,'Classes and Objects','Which is a valid declaration within an interface? Public _______ demo(long bow);','Boolean'),(23,'Classes and Objects','Can an abstract class define both abstract methods and non-abstract methods? (YES or NO)','YES'),(24,'Classes and Objects','Abstract classes cannot be instantiated, but they can be subclassed. (TRUE or FALSE)','True'),(25,'Classes and Objects','Abstract class cannot be declared as final as it is meant to be extended by some other class but any class declared as final cannot be extended. (TRUE or FALSE)','True'),(26,'Classes and Objects','Abstract class can\'t have abstract methods and non-abstract methods. (TRUE or FALSE)','False'),(27,'Classes and Objects','Can native can be applied to a method. (TRUE or FALSE)','True'),(28,'Classes and Objects','A modifier that can be applied to method not variable.','synchronized'),(29,'Classes and Objects','A modifier can be used with class and method.','abstract'),(30,'Classes and Objects','Everytime you want to create an object of a class, you need to call the _______ of the respective class.','constructor'),(31,'String',' Returns the number of characters in the String.','int length()'),(32,'String','Converts all the characters in the String to lower case.    MethodString ______()','toLowerCase'),(33,'String','Converts all the characters in the String to upper case.. String ______()','toUpperCase'),(34,'String',' Returns the copy of the String, by removing whitespaces at both ends. String ____()',' trim'),(35,'String','Returns the index within the string of the first occurrence of the specified string. (int ____ (String s))','indexOf'),(36,'String','A statement that is assigning a value to a variable','assignment'),(37,'String','The default statement of a switch is always executed. (TRUE or FALSE)','False'),(38,'String','String is a _____','class'),(39,'String','Consider the following code snippet String river = new String(\'Columbia”); System.out.println(river.length()); What is printed?','8'),(40,'String','A TextArea can handle multiple lines of text (YES or NO)','YES'),(41,'Decision Making','The if statement is a control structure used for selection (Decision Making) (TRUE or FALSE)','True'),(42,'Decision Making','The value True is represented in the computer as the integer  (TRUE or FALSE)','True'),(43,'Decision Making','The value False is represented in the computer as the integer  (TRUE or FALSE)','False'),(44,'Decision Making','The logical operator for AND is','&&'),(45,'Decision Making','The logical operator for OR is','||'),(46,'Decision Making','1 && 0 results in','0'),(47,'Decision Making','1 || 0 results in','1'),(48,'Decision Making','(!0 ) (true = 1; false = 0)','0'),(49,'Decision Making',' ( !1 || !0 )  (true = 1; false = 0)','0'),(50,'Decision Making','When using an if .. else statement, indentation is demanded by the compiler.','False'),(51,'Loop Control','Each pass through a loop is called a/an',' iteration'),(52,'Loop Control','Which looping process checks the test condition at the end of the loop?','Do-while'),(53,'Loop Control','A continue statement causes execution to skip to the statement following the continue statement (TRUE or FALSE)','False'),(54,'Loop Control','The statement  i++;  is equivalent to  i = i + i;','False'),(55,'Loop Control','Which looping process is best used when the number of iterations is known?','for'),(56,'Loop Control','for (int k = 2, k <= 12, k++)  the commas should be semicolons (TRUE or FALSE)','True'),(57,'Loop Control','while( (i < 10) && (i > 24)) the logical operator && cannot be used in a test condition (TRUE or FALSE)','False'),(58,'Loop Control','If there is more than one statement in the block of a for loop, which of the following must be placed at the beginning and the ending of the loop block? (symbol only)','{}'),(59,'Loop Control','What value is stored in num at the end of this looping?\n                for (num = 1; num <= 5; num++)','6'),(60,'Loop Control','while( (i < 10) || (i > 24)) the logical operator || cannot be used in a test condition','False'),(61,'Characters','Instance variables are assigned default values based on their types.  (TRUE or FALSE)','True'),(62,'Characters','The boolean data type can take either true or false, but its \"size\" isn\'t precisely defined  (TRUE or FALSE)','True'),(63,'Characters','What is the default value of byte variable?','0'),(64,'Characters','All variables must be declared before they can be used. (TRUE or FALSE)','True'),(65,'Characters','The name of a variable is known as its:','identifier'),(66,'Characters','A character variable may contain up to seven letters.  (TRUE or FALSE)','False'),(67,'Characters','When a data type must contain decimal numbers, assign the type-','Double'),(68,'Characters','The following code will allow the program to obtain a name from the keyboard    String name = Console.readLine(\"Enter name);  (TRUE or FALSE)','True'),(69,'Characters','String is a full-fledged object in Java.  (TRUE or FALSE)','True'),(70,'Characters','Which of the following is not a primitive data type?','string'),(71,'Encapsulation','The keyword private restricts the access of class or struct members to what function','constructor'),(72,'Encapsulation','An object is __________ of a class.','instance'),(73,'Encapsulation','An object is an initialized class variable. (TRUE or FALSE)','True'),(74,'Encapsulation','A class is an initialized object variable. (TRUE or FALSE)','False'),(75,'Encapsulation','In object-oriented software design, there is at least one extra step before you get to the coding of algorithms. That step is the design of member functions (TRUE or FALSE)','False'),(76,'Encapsulation','What is a method\'s signature? The signature of a method is the name of the method and the/its ____ of its parameters','name'),(77,'Encapsulation','What is the name of the class that is the ancestor to every other class in Java?','java'),(78,'Encapsulation','Examine the following code: String str = \"+\"Hot Java\"+\"; boolean switch = str instanceof String;','Hot Java'),(79,'Encapsulation','The ability to define more than one function with the same name is called?','Polymorphism'),(80,'Encapsulation',' Which one is runtime polymorphism?',' MethodOverloading'),(81,'Inheritance','What type of inheritance does Java have','single'),(82,'Inheritance','Say that there are three classes: Computer, AppleComputer, and IBMComputer.  Computer, AppleComputer and IBMComputer are sibling classes (TRUE or FALSE)','False'),(83,'Inheritance','Can an object be a subclass of another object?  (YES or NO)','NO'),(84,'Inheritance','How many objects of a given class can there be in a program per defined class','ONE'),(85,'Inheritance','Does a subclass inherit both member variables and methods? (YES or NO)','YES'),(86,'Inheritance','One big superclass can be used instead of many little classes (TRUE or FALSE)','True'),(87,'Inheritance',' Code that is shared between classes needs to be written only once. (TRUE or FALSE)','False'),(88,'Inheritance','Enhancements to a base class will automatically be applied to derived classes. (TRUE or FALSE)','False'),(89,'Inheritance','A class Animal has a subclass Mammal.Is true that... Because of single inheritance, Mammal can have no other parent than Animal (YES or NO)','YES'),(90,'Inheritance','A class member declared protected becomes member of subclass of which type?','private'),(91,' POLYMORPHISM',' Polymorphism is the ability of an object to take on many forms. (TRUE or FALSE)','True'),(92,' POLYMORPHISM','The most common use of polymorphism in OOP occurs when a child class reference is used to refer to aparent class object. (TRUE or FALSE)','False'),(93,' POLYMORPHISM','A reference variable can be declared as a class or interface type.','True'),(94,' POLYMORPHISM','Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time. (TRUE or FALSE)','True'),(95,' POLYMORPHISM','When reference variable of Parent class refers to the object of Child class, it is known as upcasting','True'),(96,' POLYMORPHISM','In Java, a class can extend multiple other classes. (TRUE or FALSE)','True'),(97,' POLYMORPHISM','The keyword private restricts the access of class or struct members to:','const'),(98,' POLYMORPHISM','An object is _____________ of a class.','instance'),(99,' POLYMORPHISM',' An object is an initialized class variable. (TRUE or FALSE)','True'),(100,' POLYMORPHISM','A class is an initialized object variable. (TRUE or FALSE)','False'),(101,'Swing and GUI','controls the size and position of components in a container?','layout manager'),(102,'Swing and GUI','Default layout for panel','flow layout'),(103,'Swing and GUI','Default layout for window','border layout'),(104,'Swing and GUI','Constructs a new frame that initially is invisible and has no title','jframe'),(105,'Swing and GUI','It occurs when a user takes action on a component, such as clicking the mouse on a JButton object.','event'),(106,'Swing and GUI','an interface, that is, a class containing a set of specifications for methods that can be used','action listener'),(107,'Swing and GUI','A component that can contain other components.','jpanel'),(108,'Swing and GUI','.a display area that shows an option and a list box contains additional options.','jcombobox'),(109,'Swing and GUI','component is intended to let the user easily enter a numeric value bounded by a minimum and maximum value.','jslider'),(110,'Swing and GUI',' It is not a public class, and is used only within the containing class/method, often to create just one instance','inner class'),(111,'Files and Streams','Who is the main developer of Java Programming language?','James Gosling'),(112,'Files and Streams','Which of these exception is thrown in cases when the file specified for writing it not found?','FileNotFoundException'),(113,'Files and Streams','Which of these methods are used to read in from file?','read()'),(114,'Files and Streams','Which of these values is returned by read() method is end of file (EOF) is encountered?','-1'),(115,'Files and Streams','Which of these exception is thrown by close() and read() methods?','IOException'),(116,'Files and Streams',' Which of these methods is used to write() into a file?','write()'),(117,'Files and Streams','What is the name of a stream that connects two running programs?','Pipe'),(118,'Files and Streams','What is the name of the abstract base class for streams dealing with character input?','Reader'),(119,'Files and Streams','What is the name of the abstract base class for streams dealing with general purpose (non-character) input?',' InputStream'),(120,'Files and Streams',' Can data flow through a given stream in both directions? (YES or NO)','NO');
/*!40000 ALTER TABLE `qjava1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qjava2`
--

DROP TABLE IF EXISTS `qjava2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qjava2` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(45) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qjava2`
--

LOCK TABLES `qjava2` WRITE;
/*!40000 ALTER TABLE `qjava2` DISABLE KEYS */;
INSERT INTO `qjava2` VALUES (1,'Math Class','Which of the following is correct','int x,y,z;'),(2,'Math Class','All are numerical data types, except:','String'),(3,'Math Class','Which is the proper declaration of float','float variableName;'),(4,'Math Class','Abs(-10) is equal to','10'),(5,'Math Class','2^2 is equal to','4'),(6,'Math Class','What is the size short variable','8bit'),(7,'Math Class','What is the default value of float variable','0.0f'),(8,'Math Class','floor(10.2) is equal to','10'),(9,'Math Class','ceil(10.2) is equal to','11'),(10,'Math Class','What is the output of System.println(Math.max(7.7, 7.2));','7.7'),(11,'Regular Expression','Package for Regular Expression','java.util.regex'),(12,'Regular Expression','An object that is a compiled representaion of a Regex','Pattern Class'),(13,'Regular Expression','Match the beginning of the line','^'),(14,'Regular Expression','Interprets the pattern and perform match operations','Matcher Class'),(15,'Regular Expression','Exception that indicates a syntax error in a regex pattern','PatternSyntaxException'),(16,'Regular Expression','Special sequence of characters that helps you match or find strings/group of strings','Regular Expresion'),(17,'Regular Expression','Matches end of the line','$'),(18,'Regular Expression','Matches digit 0-9','\\d'),(19,'Regular Expression','Matches beginning of the entire string','\\A'),(20,'Regular Expression','Matches end of the entire string','\\z'),(21,'Inner and Outer Class','Class that holds that holds the inner class','Outer Class'),(22,'Inner and Outer Class','Class that is written within a class','Inner Class'),(23,'Inner and Outer Class','Inner class declared without a name','Anonymous Inner Class'),(24,'Inner and Outer Class','It can be accessed without instantiating the outer class, using static members','Static Nested Class'),(25,'Inner and Outer Class','These are non-static members of a class','Non Static Nested Classes'),(26,'Inner and Outer Class','It can be instantiated only within the method where the inner class is defined','Method Local Inner'),(27,'Inner and Outer Class','You dont need to instantiate to use the class inside a class','False'),(28,'Inner and Outer Class','Class within a class is allowed in Java','True'),(29,'Inner and Outer Class','Purpose of inner class in Java','Security Mechanism'),(30,'Inner and Outer Class','The inner class is ____ when it is member of the class','Private'),(31,'Serialization and Deserialization','Process of converting an object into a sequence of bytes','Serialization'),(32,'Serialization and Deserialization','Process of creating an object from sequence of bytes','Deserialization'),(33,'Serialization and Deserialization','Class that contains many write methods for writing various data types','ObjectOutputStream'),(34,'Serialization and Deserialization','The class that can read bytes and converts them into an object','ObjectInputStream'),(35,'Serialization and Deserialization','It\'s needed to be implemented before you can Serialize','Serializable'),(36,'Serialization and Deserialization','Package for serialization','java.io'),(37,'Serialization and Deserialization','It is associated to each serializable class by serialization runtime','Version Number'),(38,'Serialization and Deserialization','If the receiver used different ID, it will result as','InvalidClassException'),(39,'Serialization and Deserialization','You save the Serialize object into the text file','True'),(40,'Serialization and Deserialization','You can Deserialize without Serializing','False'),(41,'JDBC','What JDBC stands for','Java Database Connectivity'),(42,'JDBC','What is C in CRUD','Create'),(43,'JDBC','R in CRUD','Read'),(44,'JDBC','U in CRUD','Update'),(45,'JDBC','D in CRUD','Delete'),(46,'JDBC','This class is used to register driver for a specific database type','DriverManager'),(47,'JDBC','This interface represents an established database connection','Connection'),(48,'JDBC','Method to execute the selected Query','PreparedStatement'),(49,'JDBC','Method to execute Insert, Update, Delete','executeUpdate()'),(50,'JDBC','Method to execute Read','executeQuery()');
/*!40000 ALTER TABLE `qjava2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qjavascript`
--

DROP TABLE IF EXISTS `qjavascript`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qjavascript` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(25) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` text,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qjavascript`
--

LOCK TABLES `qjavascript` WRITE;
/*!40000 ALTER TABLE `qjavascript` DISABLE KEYS */;
INSERT INTO `qjavascript` VALUES (1,'JavaScript Concept','You do not need an outline in writing a JavaScript program. (TRUE or FALSE)','False'),(2,'JavaScript Concept','The Web browser runs a JavaScript program when the Web page is first loaded, or in response to an event. (TRUE or FALSE)','True'),(3,'JavaScript Concept','JavaScript can only be placed in the external file. (TRUE or FALSE)','False'),(4,'JavaScript Concept','How do you hide your JavaScript code?','Save it in an external file'),(5,'JavaScript Concept','Complicated JavaScript program are placed in the HTML file. (TRUE or FALSE)','False'),(6,'JavaScript Concept','Your program can be placed anywhere within the HTML file. (TRUE or FALSE)','True'),(7,'JavaScript Concept','JavaScript is not case sensitive. (TRUE or FALSE)','False'),(8,'JavaScript Concept','JavaScript ignores multiple spaces. (TRUE or FALSE)','True'),(9,'JavaScript Concept','JavaScript statements can be grouped together in code blocks, inside curly brackets {...}. (TRUE or FALSE)','True'),(10,'JavaScript Concept','The tag alerts the browser program to start interpreting all the text between these tags as a script. ','<script>'),(11,'Where To','Who developed Javascript?','Brendan Eich'),(12,'Where To','JavaScript is a lightweight and most commonly used as a part of a web page. (TRUE or FALSE)','True'),(13,'Where To','JavaScript has no object-oriented capabilities.  (TRUE or FALSE)','False'),(14,'Where To','What is JavaScript\'s official name?','ECMAScript'),(15,'Where To','What organization is the resposible of the development of the scripting standard?','European Computer Manufacturers Association'),(16,'Where To','Can you read or write files using JavaScript?  (YES or NO)','No'),(17,'Where To','JavaScript can be used for networking applications?  (TRUE or FALSE)','False'),(18,'Where To','JavaScript have multithreading capabilities.  (TRUE or FALSE)','False'),(19,'Where To','One of the disadvantage of JavaScript is that it uses less server interaction.  (TRUE or FALSE)','False'),(20,'Where To','JavaScript include such items as drag-and-drop components and sliders.  (TRUE or FALSE)','True'),(21,'Output','It is example of Correct Syntax of JavaScript: <script src=URL language=\\\"javascript\\\" type=\\\"text/javascript\\\">JavaScript code </script> (TRUE or FALSE)','True'),(22,'Output','The location of an external document containing the program code.','url'),(23,'Output','Language is the attribute that dont specifies what scripting language you are using. Typically, its value will be javascript. (TRUE or FALSE)','False'),(24,'Output','This attribute is what is now recommended to indicate the scripting language in use and its value should be set to \\\"text/javascript\\\".','type'),(25,'Output','What is the output of this code: <script language=\\\"javascript\\\" type=\\\"text/javascript\\\"> <!-- document.write (\\\"Hello World!\\\") //--> </script>','Hello World!'),(26,'Output','Any text between a // and the end of a line is treated as a?','comment'),(27,'Output','Any text between the characters /* and */ is treated as a ?','Multiple comment lines'),(28,'Output','The HTML comment closing sequence --> is not recognized by JavaScript so it should be written as //-->. (TRUE or FALSE)','True'),(29,'Output','Function of this code : <!-- ','single line comment'),(30,'Output','Function of this code: // ','comment'),(31,'Syntax','You can insert javascript using this: Script in <head>...</head> section. (TRUE or FALSE)','True'),(32,'Syntax','You can insert javascript using this: <script><html>...</html></script> (TRUE or FALSE)','False'),(33,'Syntax','You can insert javascript using this: Script in … (TRUE or FALSE)','True'),(34,'Syntax','You can insert javascript using this: Script in ...... (TRUE or FALSE)','True'),(35,'Syntax','You can insert javascript using this: Script in an external file and then include in <head>...</head> section. (TRUE or FALSE)','True'),(36,'Syntax','Javascript outputs can be written into HTML element, using outerHTML. (TRUE or FALSE)','False'),(37,'Syntax','Javascript outputs can be written an HTML element, using innerHTML. (TRUE or FALSE)','True'),(38,'Syntax','Javascript outputs can be written the HTML output using document.write(). (TRUE or FALSE)','True'),(39,'Syntax','Javascript outputs can be written  window.alert(). (TRUE or FALSE)','True'),(40,'Syntax','Javascript outputs can be written the browser console, using console.log(). (TRUE or FALSE)','True'),(41,'Statements','Is a named element in a program that stores information.','variables'),(42,'Statements','Variables are  not useful','False'),(43,'Statements','In applying variables, the first character must be?','both a and b'),(44,'Statements','You cannot use words that JavaScript has reserved for other purposes (TRUE or FALSE)','True'),(45,'Statements','Variable names are not case-sensitive (TRUE or FALSE)','False'),(46,'Statements',' \'abstract\' is a reserved word in javascript? (YES or NO)','Yes'),(47,'Statements',' \' scan \' is a reserved word in javascript? (YES or NO)','No'),(48,'Statements',' \'println\' is a reserved word in javascript? (YES or NO)','No'),(49,'Statements',' \'else\'  is a reserved word in javascript? (YES or NO)','Yes'),(50,'Statements',' \'extends\' is a reserved word in javascript?  (YES or NO)','Yes'),(51,'Comments','It can be expressed in decimal, octal, or hexadecimal form.','Int'),(52,'Comments','Value is hexadecimal such as?','0x24'),(53,'Comments','Examples of Floating points are 3.14, -3.14, 314e-2 (TRUE or FALSE)','True'),(54,'Comments','Boolean values are?','True and False values'),(55,'Comments','String values - May be enclosed by single \' or double \\\" quotes. (TRUE or FALSE)','True'),(56,'Comments','The \\\' or \\\"sequence of characters will insert a quote character into a?','String'),(57,'Comments','Before you can use a variable in your program, you need to create it?','declaring a variable'),(58,'Comments','You declare a variable in JavaScript using ?','var'),(59,'Comments','Is this syntax correct: var Month = “December” (YES or NO)','Yes'),(60,'Comments','Is this syntax correct: String Month = “December”; (YES or NO)','No'),(61,'Variables','It contains information about the current date and time','Today'),(62,'Variables','It stores the current day of the month','ThisDay'),(63,'Variables','It stores a number indicating the current month','ThisMonth'),(64,'Variables','It stores a number indicating the current year','This year'),(65,'Variables','It stores number of days until a selected date','DaysLeft'),(66,'Variables','What operator is this \'+\'?','addition'),(67,'Variables','What operator is this \'%\'?','modulus'),(68,'Variables','What operator is this \'++\'?','increment'),(69,'Variables','What operator is this \'*\'?','multiplication'),(70,'Variables','What operator is this\'--\'?','Decrement'),(71,'Operators','What is the correct about features of JavaScript?','cross-platform'),(72,'Operators','What is the correct syntax to redirect a url using JavaScript?','window.location=\'http://www.newlocation.com\';'),(73,'Operators','What built-in method returns the index within the calling String object of the first occurrence of the specified value?','indexOf()'),(74,'Operators','What built-in method returns the string representation of the number\'s value?','toString()'),(75,'Operators','What function of Number object defines how many total digits to display of a number?','toPrecision()'),(76,'Operators','What function of String object extracts a section of a string and returns a new string?','slice()'),(77,'Operators','What String object returns the calling string value converted to lower case?','toLowerCase()'),(78,'Operators','What String object causes a string to be displayed in the specified color as if it were in a <font color=\'color\'> tag?','fontcolor()'),(79,'Operators','What Array object removes the last element from an array and returns that element?','pop()'),(80,'Operators','What Array object returns true if at least one element in this array satisfies the provided testing function?','some()'),(81,'Arithmetic','What is the correct about JavaScript?','interpreted programming language'),(82,'Arithmetic','Can you pass a anonymous function as an argument to another function? (TRUE or FALSE)','True'),(83,'Arithmetic','What is the correct about callbacks?','plain JavaScript function'),(84,'Arithmetic','What built-in method returns the characters in a string beginning at the specified location?','substr()'),(85,'Arithmetic','What Number object defines how many total digits to display of a number?','toPrecision()'),(86,'Arithmetic','What String object returns the index within the calling String object of the first occurrence of the specified value?','indexOf()'),(87,'Arithmetic','What String object returns the calling string value converted to lower case while respecting the current locale?','toLocaleLowerCase()'),(88,'Arithmetic','What String object causes a string to be displayed as struck-out text, as if it were in a <strike> tag?','strike()'),(89,'Arithmetic','What Array object returns true if every element in this array satisfies the provided testing function?','every()'),(90,'Arithmetic','What Array object removes the first element from an array and returns that element?','shift()'),(91,'Assigment Operators','Is JavaScript is a heavy weight, interpreted programming? (TRUE or FALSE)','False'),(92,'Assigment Operators','How can you get the type of arguments passed to a function?','typeof operator'),(93,'Assigment Operators','What built-in method adds one or more elements to the end of an array and returns the new length of the array?','push()'),(94,'Assigment Operators','What code creates an object?','new Object();'),(95,'Assigment Operators','What Number object returns the number\'s value?','valueOf()'),(96,'Assigment Operators','What String object is used to match a regular expression against a string?','match()'),(97,'Assigment Operators','What String object returns a string representing the specified object?','toString()'),(98,'Assigment Operators','What String object causes a string to be displayed as a subscript, as if it were in a <sub> tag?','subs()'),(99,'Assigment Operators','What Array object creates a new array with all of the elements of this array for which the provided filtering function returns true?','filter()'),(100,'Assigment Operators','What Array object sorts the elements of an array?','sort()'),(101,'Data Types','What is the correct about features of JavaScript?','cross-platform'),(102,'Data Types','What is the a valid type of function javascript supports?','named function'),(103,'Data Types','What built-in method returns the character at the specified index?','charAt()'),(104,'Data Types','What built-in method returns the characters in a string beginning at the specified location?','substr()'),(105,'Data Types','What String object returns the character at the specified index?','charAt()'),(106,'Data Types','What String object splits a String object into an array of strings by separating the string into substrings?','split()'),(107,'Data Types','What String object creates a string to be displayed in a big font as if it were in a <big> tag?','big()'),(108,'Data Types','What String object causes a string to be displayed as a subscript, as if it were in a <sub> tag?','sub()'),(109,'Data Types','What Array object calls a function for each element in the array?','forEach()'),(110,'Data Types','What Array object extracts a section of an array and returns a new array?','slice()'),(111,'Objects','What is the a disadvantage of using JavaScript?','multithreading capabilities'),(112,'Objects','What type of variable is visible everywhere in your JavaScript code?','global variable'),(113,'Objects','What type of variable is visible only within a function where it is defined?','local variable'),(114,'Objects','What function of Number object formats a number with a specific number of digits to the right of the decimal?','toFixed()'),(115,'Objects','What function of Boolean object returns a string of either \'true\' or \'false\' depending upon the value of the object?','toString()'),(116,'Objects','What function of String object returns the index within the calling String object of the first occurrence of the specified value?','indexOf()'),(117,'Objects','What function of String object returns the calling string value converted to lower case?','toLowerCase()'),(118,'Objects','What function of String object causes a string to be italic, as if it were in an <i> tag?','italics()'),(119,'Objects','What function of Array object applies a function simultaneously against two values of the array (from left-to-right) as to reduce it to a single value?','reduce()'),(120,'Objects','What function of Array object adds and/or removes elements from an array?','splice()'),(121,'Math Class','What is the advantage of using JavaScript?','reading or writing of files'),(122,'Math Class','What is the correct syntax to redirect a url using JavaScript?','window.location'),(123,'Math Class','What built-in method combines the text of two strings and returns a new string?','concat()'),(124,'Math Class','What code creates an object?','new Object();'),(125,'Math Class','What function of String object combines the text of two strings and returns a new string?','concat()'),(126,'Math Class','What function of String object extracts a section of a string and returns a new string?','slice()'),(127,'Math Class','What function of String object creates an HTML anchor that is used as a hypertext target?','anchor()'),(128,'Math Class','What function of String object causes a string to be displayed in fixed-pitch font as if it were in a <tt> tag?','fixed()'),(129,'Math Class','What function of Array object adds one or more elements to the end of an array and returns the new length of the array?','push()'),(130,'Math Class','What function of Array object extracts a section of an array and returns a new array?','slice()'),(131,'Functions','What is true about variable naming conventions in JavaScript?','case sensitive'),(132,'Functions','What is the correct syntax to create a cookie using JavaScript?','document.cookie = \'key1 = value1;'),(133,'Functions','What built-in method returns the character at the specified index?','charAt()'),(134,'Functions','What built-in method returns the calling string value converted to lower case?','toLowerCase()'),(135,'Functions','What function of Number object returns a string value version of the current number?','toString()'),(136,'Functions','What function of String object returns the index within the calling String object of the first occurrence of the specified value?','indexOf()'),(137,'Functions','What function of String object creates an HTML anchor that is used as a hypertext target?','anchor()'),(138,'Functions','What function of String object causes a string to be displayed in a small font, as if it were in a <small> tag?','small()'),(139,'Functions','What function of Array object creates a new array with the results of calling a provided function on every element in this array?','map()'),(140,'Functions','What function of Array object extracts a section of an array and returns a new array?','slice()'),(141,'Form Validation','What is the advantage of using JavaScript?','Less server interaction'),(142,'Form Validation','How can you get the total number of arguments passed to a function?','arguments.length'),(143,'Form Validation','What built-in method calls a function for each element in the array?','forEach()'),(144,'Form Validation','All user-defined objects and built-in objects are descendants of an object called Object? (TRUE or FALSE)','True'),(145,'Form Validation','What function of Boolean object returns the primitive value of the Boolean object?','valueOf()'),(146,'Form Validation','What function of String object splits a String object into an array of strings by separating the string into substrings?','split()'),(147,'Form Validation','What function of String object returns the calling string value converted to lower case?','toLowerCase()'),(148,'Form Validation','What function of String object causes a string to be displayed in the specified color as if it were in a <font color=\'color\'> tag?','fontcolor()'),(149,'Form Validation','What function of Array object joins all elements of an array into a string?','join()'),(150,'Form Validation','What function of Array object adds and/or removes elements from an array?','splice()');
/*!40000 ALTER TABLE `qjavascript` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qphotoshop`
--

DROP TABLE IF EXISTS `qphotoshop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qphotoshop` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(25) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qphotoshop`
--

LOCK TABLES `qphotoshop` WRITE;
/*!40000 ALTER TABLE `qphotoshop` DISABLE KEYS */;
INSERT INTO `qphotoshop` VALUES (1,'Basic','What menu opens or create?','File Menu'),(2,'Basic','What is the default file type for Photoshop documents?','PSD'),(3,'Basic','Where you can find different shape tools?','Tools Panel'),(4,'Basic','By default, a document\'s dimensions are measured in?','inches'),(5,'Basic','Where do you adjust the text size?','Interface'),(6,'Basic','What is the shortcut to zoom in?','Ctrl Plus'),(7,'Basic','What is the shortcut to zoom out?','Ctrl Minus'),(8,'Basic','What is the shortcut to reset zoom?','Ctrl 0'),(9,'Basic','Under what company is Photoshop on?','Adobe'),(10,'Basic','What Image Editing software are you using?','Adobe Photoshop'),(11,'Cropping','Which panel is the crop tool in?','Tools'),(12,'Cropping','What crop tool can skew or re-align an image?','Perspective Crop'),(13,'Cropping','What is the shortcut key to resize an image?','Alt Ctrl I'),(14,'Cropping','What term is called when rotating by a specific amount and rotation?','Arbitrary'),(15,'Cropping','What is the shortcut key to undo previous work?','Ctrl Z'),(16,'Cropping','What is the shortcut key to save your work?','Ctrl S'),(17,'Cropping','What is the save as shortcut key?','Ctrl Shift S'),(18,'Cropping','What menu allows you to open or create a file?','File Menu'),(19,'Cropping','What tool is used to slect a portion on your canvas?','Marquee Tool'),(20,'Cropping','What tool is used for moving a selected image?','Move Tool'),(21,'Saving Options','What is the default file type for Photoshop documents?','PSD'),(22,'Saving Options','What is the file type for images with 256 colors?','PNG'),(23,'Saving Options','After clicking file, what menu would let you save a document with specific details?','Save As'),(24,'Saving Options','What is the save as shortcut key?','Ctrl Shift S'),(25,'Saving Options','What is the shortcut key to save for Mac?','Command S'),(26,'Saving Options','Can you resize the image directly from the Save for Web dialog box?','Yes'),(27,'Saving Options','How to save your work for the web?','File Save for Web'),(28,'Saving Options','What is the shortcut for saving for the web?','Alt Shift Ctrl S'),(29,'Saving Options','If you\'re using the JPEG format, can the image be saved at different quality levels?','Yes'),(30,'Saving Options','It is a Web-save file format wherein is mainly used for graphics and illustrations?','PNG-8'),(31,'Layers','According to the powerpoint, how can you describe layers?','transparent panes of glass'),(32,'Layers','What are layers that has different types of content?','Content Layer'),(33,'Layers','What are layers that you can adjust their saturation or brightness?','Adjustment Layer'),(34,'Layers','Where can you view, create and edit layers?','Layers Panel'),(35,'Layers','What is the shortcut key to view the layers panel?','F7'),(36,'Layers','What panel can you adjust the Hue, Saturation or Lightness of your image?','Adjustment Panel'),(37,'Layers','What icon would you press to hide a layer?','Eye Icon'),(38,'Layers','What is the shortcut to create a new layer?','Ctrl Shift N'),(39,'Layers','What is the shortcut to copy a layer?','Ctrl J'),(40,'Layers','What is the shortcut to cut a layer?','Ctrl Shift J'),(41,'Adjustment Panel','The type of nondestructive editing about the original image?','Adjustment Layers'),(42,'Adjustment Panel','The darkest parts of the image, highlights are the brightest parts, and midtones are everything in between?','Shadows'),(43,'Adjustment Panel','Shows information about the shadows, highlights, and midtones of the image?','Histogram'),(44,'Adjustment Panel','What are the controls that can adjust the levels?','Input Levels Slider'),(45,'Adjustment Panel','What panel can you locate the graph?','Properties'),(46,'Adjustment Panel','What do you call, moving the white slider too far to the left that it loses detail?','Clipping'),(47,'Adjustment Panel','What tool gives you more power to control shadows, highlights and midtones?','Curves Tool'),(48,'Adjustment Panel','What simple adjustment can you make with curves?','Increase Contrast'),(49,'Adjustment Panel','What can you change without changing the highlights?','Shadows'),(50,'Adjustment Panel','What key can you press to remove it?','Delete Key'),(51,'Sharpening','What is the term for adding too much sharpness?','Halos'),(52,'Sharpening','What filter is a method to sharpen images that gives ctrl to amount, radius and threshold?','Unsharp Mask'),(53,'Sharpening','What setting controls the size of the details that will be sharpened?','Radius'),(54,'Sharpening','What can help reduce imagine noise?','Threshold'),(55,'Sharpening','What is the first step on a safe procedure to sharper a layer?','Duplicate Layer'),(56,'Sharpening','What tool has ctrl over Strength, Preserve Details, Reduce Color Noise and more?','Noise Reduction'),(57,'Sharpening','What can result into noise reduction and loss of detail?','Blurriness'),(58,'Sharpening','What effect is called when a huge amount of noise is applied?','Grainy'),(59,'Sharpening','Which menu can you find the sharpening filters?','Filter Sharpen'),(60,'Sharpening','What technique can make your image look crisp and clear?','Sharpening'),(61,'Background Layers','Zero percent opacity is?','Transparent'),(62,'Background Layers','Non transparent is?','Opaque'),(63,'Background Layers','If you want to affect only one layer? Use','Clipping Mask'),(64,'Background Layers','Selecting a layer and a button at the bottom of the Layers panel will create?','Layer Mask'),(65,'Background Layers','Dragging a layer panel to the trash can means?','Remove'),(66,'Background Layers','What button does allow you to group up a number of layers?','Group Button'),(67,'Background Layers','To combine both layers, you can','Merge Layers'),(68,'Background Layers','Lowering the opacity of the higher layer will show?','Background Layer'),(69,'Background Layers','When starting a new project, what kind of layer does Photoshop start with?','Background Layer'),(70,'Background Layers','What file format can handle transparacy?','PNG'),(71,'Brush Tool','What tool allows you to paint on any layer?','Brush Tool'),(72,'Brush Tool','What key is a shortcut for the brush tool?','B'),(73,'Brush Tool','The top-most color in the Color Picker Tool, this is known as the','Foreground Color'),(74,'Brush Tool','What can harder brush do that defines edges?','Clear'),(75,'Brush Tool','What can softer brush do that less-define edges?','Blurry'),(76,'Brush Tool','What can you press to quickly increase or decrease brush size?','Bracket Keys'),(77,'Brush Tool','What panel allows you to customize different settings for the brush tool?','Control panel'),(78,'Brush Tool','Brush Tool is associated with Mixer Brush Tool, Color Replacement tool and ','Pencil Tool'),(79,'Brush Tool','Where can you find the different types of brushes to choose for your image?','Brush Panel'),(80,'Brush Tool','What is the Shortcut Key for Brush Panel?','F5'),(81,'Text Tool','What toolallows to add text in a document?','Text Tool'),(82,'Text Tool','Where are text tool located?','Tools Panel'),(83,'Text Tool','What icon do you click to edit a text layer?','Layer Icon'),(84,'Text Tool','What panel allows you to customize different settings for the text tool?','Control Panel'),(85,'Text Tool','What tool allows you to move the text?','Move Tool'),(86,'Text Tool','What is the term for converting text into pixels?','Rasterizing'),(87,'Text Tool','If you don\'t want to rasterize, click?','Cancel'),(88,'Text Tool','If you want to add a lot of text to your document, you may find it easier to work with?','True'),(89,'Text Tool','Is it click and drag anywhere in the document window to create a text box?','True'),(90,'Text Tool','The Text tool does not allow you to add text to your document?','False'),(91,'Hide Layer','Hotkey for gradient tool?','G'),(92,'Hide Layer','Gradient tool is associated with?','Paint Bucket Tool'),(93,'Hide Layer','What is the default style of gradient picker?','Linear Style'),(94,'Hide Layer','To reset the foreground and background color swatches, you just have to press?','D'),(95,'Hide Layer','To swap the white as foreground color into background color, you just have to press?','X'),(96,'Hide Layer','Where can you choose what style of gradient is appropriate for your project?','Gradient Picker'),(97,'Hide Layer','How many styles does gradient styles have?','5'),(98,'Hide Layer','To blend layers you should first use what layer tool?','Layer Mask'),(99,'Hide Layer','What icon does turn on/off the selected layer for viewing separately the layers.','Visibility Icon'),(100,'Hide Layer','The visibility icon is represented by what human body parts?','Eye'),(101,'Layer Masks','What appears in the panel column along the right of the a panel that pops in the lower right of the interface?','Layers Panel'),(102,'Layer Masks','You can show or hide the Layers panel by pressing?','F7'),(103,'Layer Masks','What button allows you to create a new layer at the bottom of the Layers panel?','New Layer Icon'),(104,'Layer Masks','What shortcut allows you to create a new layer?','Shift Ctrl N'),(105,'Layer Masks','What is the shortcut to copy a layer?','Ctrl J'),(106,'Layer Masks','What button do you press before \"More Tool\"?','V'),(107,'Layer Masks','To select all layers at once, press?','Ctrl Alt A'),(108,'Layer Masks','Selecting multiple layers requires you to hold?','Shift Key'),(109,'Layer Masks','Another way is to press and hold?','Shift Alt'),(110,'Layer Masks','What shortcut is used to select acontent of a layer?','Ctrl Key'),(111,'Blending','To rename a layer, what do you do to change it\'s name?','Double Click'),(112,'Blending','How Photoshop represents transparecy?','Checkerboard Pattern'),(113,'Blending','An option to reduce or add transparency to a layer','Opacity'),(114,'Blending','A tool to reduce or add transparency to a layer','Eraser Tool'),(115,'Blending','Hotkey for the Eraser Tool?','E'),(116,'Blending','What image only uses white and various shades of gray and between?','Grayscale Image'),(117,'Blending','Shortcut to swap current Foreground and Background colors','X'),(118,'Blending','What shortcut allows you to turn the mask back on and hide those areas?','Shift'),(119,'Blending','Our current Foreground and Background colors ','Color Swatches'),(120,'Blending','Shortcut for the Brush tool','B'),(121,'Gradient','We can create our own gradient with?','Gradient Editor'),(122,'Gradient','If you look below the gradient bar, you\'ll see ','Color Stops'),(123,'Gradient','This helps you crete your own set or pallette of colors','Color Swatch'),(124,'Gradient','Where the midpoint is located between the two colors after dragging the midpoint icon?','Location'),(125,'Gradient','Shortcut Key for Undo?','Ctrl Z'),(126,'Gradient','To add transparency, click on the?','Arrow'),(127,'Gradient','Shortcut to copy paste existing transparecy stops by holding?','Alt'),(128,'Gradient','What controls how gradual the transitions appear between your main color?','Smoothness'),(129,'Gradient','The left side of all the color spectrum','Black'),(130,'Gradient','The right side of all the color spectrum','White'),(131,'Free Transform','Shortcut key when creating a new document?','Ctrl N'),(132,'Free Transform','Custom shape tool is associated with what tool?','Rectangle Tool'),(133,'Free Transform','Shortcut key for custom shape tool?','Unsharp Mask'),(134,'Free Transform','Shortcut key for free transform?','Ctrl T'),(135,'Free Transform','The free transform can be found where?','Edit Menu Bar'),(136,'Free Transform','When transforming vector shapes, the command is named?','Free Transform Path'),(137,'Free Transform','What is the shortcut for choosing the direct selection tool?','A'),(138,'Free Transform','The direct selection tool is also known as?','White Arrow Tool'),(139,'Free Transform','And the path selection tool is also known as?','Black Arrow Tool'),(140,'Free Transform','To adjust the size, you have to drag the mouse while holding?','Shift Key'),(141,'Histogram','The histogram can be found at the?','Properties Panel'),(142,'Histogram','What is a measurement of an objects opaqueness and/or transparency?','Opacity'),(143,'Histogram','What letter will allow to view standard, maximized, full screen mode of their work?','F'),(144,'Histogram','What settings for this tool include linear, reflected, angle, diamond, and radial?','Gradient'),(145,'Histogram','Zero percent opacity is?','Transparent'),(146,'Histogram','Non transparent is?','Opaque'),(147,'Histogram','By definition these involve groupings of sliders and graphic icons.','Panels'),(148,'Histogram','B is a shortcut for?','Paint brush'),(149,'Histogram','Measurement unit on Photoshop','Pixels'),(150,'Histogram','Of the 4 Keys Components to a Great Graphic which one would include a number?','Typography');
/*!40000 ALTER TABLE `qphotoshop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qphp`
--

DROP TABLE IF EXISTS `qphp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qphp` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(12) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qphp`
--

LOCK TABLES `qphp` WRITE;
/*!40000 ALTER TABLE `qphp` DISABLE KEYS */;
INSERT INTO `qphp` VALUES (1,'Variables','All variables in php start with what symbol?','$'),(2,'Variables','Create the variable \'total\' and assign the number 15 in the variable.','$total= 15;'),(3,'Variables','Create the variable \'Text\' and assign the word \'Hello\' in the variable','$Text=\'Hello\';'),(4,'Variables','Is $age=10; the same with $Age =  10;?','False'),(5,'Variables','How do you echo/print variable \'$example\' in php? ','echo $example;'),(6,'Variables','What is the output of the code <?php $x=5; $y=6; echo ($x); ?>','5'),(7,'Variables','What is the output of the code <?php $x=5; $y=6; echo $x+$y ?>','11'),(8,'Variables','What is the output of the code <?php $text=\'hello\'; echo (\'$text world!\'); ?>','hello world'),(9,'Variables','<?php $x=5; $y=9; $z=$x+$y; echo ($z); ?>','14'),(10,'Variables','What is the tags used in creating a php line?','<?php …?>'),(11,'Operators','How do you add the variables $x and $y?','$x+$y;'),(12,'Operators','How do you divide the variable $x and the number 10 as the divisor?','$x/10;'),(13,'Operators','What is the output of the following given $x=10; $y=15; $z=20; echo($x+$y+$z)','45'),(14,'Operators','What is the output of the given $x=10;$y=15;$z=25; print(10+$y);','25'),(15,'Operators','Following the given in number 4; print(($x+$y)/25);','1'),(16,'Operators','Following the given in number 4; echo($y-$x);','5'),(17,'Operators','Following the given in number4; echo ($z*$x);','250'),(18,'Operators','Following the given in number 4; echo (($z*$x)/$x);','25'),(19,'Operators','What is the output of the given $x=3;$y=4;$z=5; echo(($y+$x)*$z);','35'),(20,'Operators','Following the given in number 9 ; echo(30/($z*$x));','2'),(21,'Conditions','What is wrong in conditional syntax if($variable=1){}','='),(22,'Conditions','What is the output of the given: $x=0; if($x==1){echo(\'true\');}','No Output'),(23,'Conditions','What is the output of the condition 10==20?','False'),(24,'Conditions','What is the output of the give:$x=1;$y=1{echo(\'Kitten\')} else{echo(\'No value of 1 detected\');}','No value of 1 detected'),(25,'Conditions','What is the output of the given: $x=1;$y=1 if ($x!=$y){echo(\'Kitten\');} else if($x==$y){echo(\'Church\');}','No value of 1 detected'),(26,'Conditions','What is the output of the given:$picture=\'church\'; switch($picture){ case \'Kitten\': print(\'Kitten\'); break; case\'church\':print(\'Church\'); break;}','Church'),(27,'Conditions','$x=5;$y=10; if($x<=y){echo(\'<h3>true</h3>\');}else{echo(\'false\');}','True'),(28,'Conditions','$x=5;$y=20; if($x>=$y){echo(\'True\');} else if ($x>$y){echo(\'false\');}','False'),(29,'Conditions','What is the output of the given; $x=10 ;$y=10; $x!=$y','False'),(30,'Conditions','$x=10;$y=20;($x==$y){echo(“True”);}else{echo(“False”);}','False'),(31,'Looping','Complete the code:$counter =0; for ($start=0;$start<11;_____){$counter =$counter+1; print $counter.”<br>”;   } to have the output of numbers 1 to 10\n','$start++'),(32,'Looping','What is missing in the code:while( ){print(\'Hello\');}','condition'),(33,'Looping','What is the output of the given:$counter=1;while($counter<10){print $counter; $counter++}','123456789'),(34,'Looping','Given:for($counter=10;$counter<21;$counter++){echo $counter;}','11,12,13,14,15,16,17,19,20'),(35,'Looping','Given:$counter=2;while($counter<22){print $counter;$counter=$counter+2;}','2,4,6,8,10,12,14,16,18,20'),(36,'Looping','Complete the code _____; while(____){print $c;$c++} to have the output 1,2,3,4,5.','$c=1;$c<6'),(37,'Looping','Complete the code for($c=__;$c__;$c__){print $c;} to have the output 10,9,8,7,6,5,4,3,2,1.','($c=10;$c<0;$c--)'),(38,'Looping','Complete the code for($c=__;$c__;$c__){print $c;} to have the output 20,19,18,17,16,15,14,13,12,11,10','($c=20;$c>10;$c--)'),(39,'Looping','What is the correct syntax in a while loop?','while(condition){statement}'),(40,'Looping','What is the correct syntax in a do while loop?','do statement while(condition)'),(41,'Arrays','Create an array named Array_name that has the values 1,2, and 3.','$Array_name=array(1,2,3);'),(42,'Arrays','Create an array named Array that has the values 1,2, and 3. Use the other style in creating an array.','$Array[]=1;$Array[]=2;$Array[]=3;'),(43,'Arrays','What is control structure used in displaying the values of an array?','Loops'),(44,'Arrays','The Order of an Array always starts at what number?','0'),(45,'Arrays','Can you assign the order of an array?','True'),(46,'Arrays','What is the ouytput of the given:$ Array=(\'1\',\'2\',\'3\'); print $Array[0];','1'),(47,'Arrays','What is the output of the given:$Array[1]=\'1\';$Array[0]=\'2\';$Array[2]=\'3\'; print $Array[2];','3'),(48,'Arrays','What is the output of the given $variable=(\'1\',\'2\',\'3\',\'4\',\'5\'); print $variable[0];','1'),(49,'Arrays','What do you call a variable that holds multiple values?','Array'),(50,'Arrays','What do you add to a variable to make it an array?','[]');
/*!40000 ALTER TABLE `qphp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qpowerpoint`
--

DROP TABLE IF EXISTS `qpowerpoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qpowerpoint` (
  `qid` int(11) NOT NULL,
  `lesson` text,
  `question` text,
  `answer` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qpowerpoint`
--

LOCK TABLES `qpowerpoint` WRITE;
/*!40000 ALTER TABLE `qpowerpoint` DISABLE KEYS */;
INSERT INTO `qpowerpoint` VALUES (1,'Getting Started with PowerPoint','PowerPoint uses slides to build a ___________?','Presentation'),(2,'Getting Started with PowerPoint','The Ribbon contains ___________?','Multiple tabs'),(3,'Getting Started with PowerPoint','If you do not see the command you want, click on the Choose Commands drop-down box and select _____________.','All Commands'),(4,'Getting Started with PowerPoint','The ______________, located above the Ribbon, lets you access common commands no matter which tab you are on. By default, it shows the Save, Undo,  and Repeat commands. You can add other commands to make it more convenient.','Quick Access toolbar'),(5,'Getting Started with PowerPoint','______________ gives you various options for saving, opening, printing, and sharing your presentation. It is similar to the Microsoft Office button menu from PowerPoint 2007 and the File Menu from earlier versions of PowerPoint.','Backstage view'),(6,'Getting Started with PowerPoint','Clicking the_____ tab takes you to Backstage view.','File'),(7,'Getting Started with PowerPoint','By selecting _____, the Open dialog box appears.','Open'),(8,'Getting Started with PowerPoint','By clicking ______, a new blank presentation appears in the PowerPoint window.','Create'),(9,'Getting Started with PowerPoint','Locate and select the ______ command.','Convert'),(10,'Getting Started with PowerPoint','The _____ dialog box will appear. Select the location where you want to save the workbook, enter a file name for the presentation, and click Save.','Save As'),(11,'Slide Basics','Every PowerPoint presentation is composed of a series of _______.','Slides'),(12,'Slide Basics','Slides contain ________.','Placeholders'),(13,'Slide Basics','Placeholders are arranged in different layouts that can be applied to existing slides or chosen when you insert a ________.','New Slide'),(14,'Slide Basics','By clicking the ______ command in the Slides group on the Home tab, a menu will appear with your options and you can choose a layout from the menu.','Layout'),(15,'Slide Basics','Allows you to add to your current layout, so you can place text wherever you want on your slide.','Text boxes'),(16,'Slide Basics','From the _______ tab, click the bottom half of the New Slide command to open the menu of slide layout options.','Home'),(17,'Slide Basics','To select multiple slides, press and hold ____ on your keyboard and click the slides you want to select.','CTRL'),(18,'Slide Basics','From the Home tab, click the bottom half of the _______ command to open the menu of slide layout options and select the slide you want to insert. A new  slide will be added to your presentation.','New Slide'),(19,'Slide Basics','To delete a Slide, press the _____ or Backspace key on your keyboard.','Delete'),(20,'Slide Basics','The _______ tab shows your slide text in outline form. This allows you to quickly edit your slide text and view the contents of multiple slides at once.','Slides'),(21,'Text Basics','If you\'re new to PowerPoint, you\'ll need to learn the _________________ so you can add and arrange text on your slides.','Basics of working with text'),(22,'Text Basics','Click the placeholder or text box where you want to insert text and the _____________ appears.','Insertion point'),(23,'Text Basics','Click the mouse button. While holding it down, drag the mouse over the text then release the mouse. The text will be selected, and a _______________ will  appear over the selected text.','Highlighted box'),(24,'Text Basics','When you select text in PowerPoint, a ___________ with formatting options appears. This makes formatting commands easily accessible, which can save you time.','Hover toolbar'),(25,'Text Basics','If text does not appear in the exact location you want, you can press the ______ key on your keyboard to move the text to a new line.','Enter'),(26,'Text Basics','_______________ is another technique that can be used to edit text and allows you to search all of your slides for a specific word or phrase.','Find and Replace'),(27,'Text Basics','As you create your presentation, you can add ___________ to help organize your slides. You\'ll also need to know how to _______ text to create the look you need.','Text boxes and format'),(28,'Text Basics','Text can be inserted into both ___________and __________.','Placeholders and text boxes'),(29,'Text Basics','Inserting an extra ________ allows you to add to the slide layout so you can include as much text as you want.','Text box'),(30,'Text Basics','You can help your text stand out on the slide by changing its _________, including font size, color, and style.','Formatting'),(31,'Applying a Theme','A _____ is a set of colors, fonts, effects, and more that can be applied to your entire presentation to give it a consistent, professional look.','Theme'),(32,'Applying a Theme','Available from the font menu.','Theme Fonts'),(33,'Applying a Theme','Available in the format tab when you click a shape.','Shape Styles'),(34,'Applying a Theme','Available from every color menu.','Theme Colors'),(35,'Applying a Theme','How to apply Theme?','Go to the Design'),(36,'Applying a Theme','TRUE or FALSE: In applying Theme, click the Drop-down arrow to access more themes.','True'),(37,'Applying a Theme','Hover over a theme to see a/an ___________ of it in the presentation. The name of the theme will appear as you hover over it.','Live preview'),(38,'Applying a Theme','A theme is a __________________ of colors, fonts, and effects that can be applied to your presentation.','Predefined Combination'),(39,'Applying a Theme','TRUE or FALSE: In applying theme to your Slides, click a theme to apply to your slides.','True'),(40,'Applying a Theme','The colors and fonts will only update if you\'re using ______________ or ______________.','Theme fonts or theme colors'),(41,'Inserting Images','Adding ______ and ________ to your presentation can be a great way to illustrate important information or add decorative accents to existing text.','Clip art and pictures'),(42,'Inserting Images','Select the Insert tab and click the _________ command in the Images group. The Insert picture dialog box appears.','Table'),(43,'Inserting Images','You can also select the __________________ command in a placeholder to insert images.','Insert Picture from File'),(44,'Inserting Images','To select the Insert tab, click the _______ command in the Images group.','Clip Art'),(45,'Inserting Images','You can insert ______ from your computer, search Microsoft\'s large selection of clip art to find the image you need, or add a screenshot of your own.','Text box'),(46,'Inserting Images','You can select the ______________ command in a placeholder to insert clip art.','Insert Clip Art from File'),(47,'Inserting Images','___________ are pictures that capture the visible windows and items displayed on your computer screen.','Video'),(48,'Inserting Images','Select the Insert tab. Click the Screenshot commands in the Images group. The _______________ from your desktop will appear. Select the window you want to capture as a screenshot. The Screenshot will appear in your slide.','Clip Art'),(49,'Inserting Images','Click the image. The cursor will turn into a cross with arrows and while holding down the mouse button, drag the ________________ to the desired location. Release the mouse button. The box will be moved.','Shapes'),(50,'Inserting Images','The side sizing handles change the image\'s size but do not keep the same ________. If you want to keep the image\'s proportions, always use the corner handles.','Proportions'),(51,'Applying Transitions','___________ are motion effects that when in Slide Show view add movement to your slides as you advance from one slide to another.','Transitions'),(52,'Applying Transitions','TRUE or FALSE: Is transition subtle?','False'),(53,'Applying Transitions','When working with transitions, the Apply to All command in the ______ group can be used at any time to make your presentation uniform. Use this command with caution.','Timing'),(54,'Applying Transitions','Click the Preview command on the Transitions tab. Click the star ___________ icon. The icon appears on the Slides tab in the left pane beside any slide that includes a transition.','Play Animations'),(55,'Applying Transitions','Select the slide you want to modify. Choose ______ from the gallery in the Transition to this slide group.','None'),(56,'Applying Transitions','In Slide Show view, you would typically advance to the next slide by clicking your mouse or pressing _____ on your keyboard.','Enter'),(57,'Applying Transitions','Using the __________ settings in the Timing group, you can set your presentation to advance on its own instead and display each slide for a specific amount of time. This is useful for unattended presentations, such as at a tradeshow booth.','Advance slides'),(58,'Applying Transitions','Select the slide you want to modify then locate the ______ group on the transitions tab.','Timing'),(59,'Applying Transitions','Under Advance slide, uncheck the Next to ___________. In the After field, enter the amount of time you want to display the slide. Select another slide, and repeat the process until all the desired slides have the appropriate timing.','On Mouse Click'),(60,'Applying Transitions','You can _________ the transition for a selected slide at any time, using either of these two methods.','Preview'),(61,'Check Spelling','PowerPoint provides you with several _____________ that will help you produce professional, error-free presentations.','Proofing features'),(62,'Check Spelling','To make your slide show appear professional, you\'ll want to make sure it is free from _______ errors.','Spelling'),(63,'Check Spelling','Go to the Review tab. Click the Spelling command. The Spelling dialog box will open. For each error in your presentation, PowerPoint will try to offer one or more suggestions. You can select a suggestion and then click ______ to correct the error.','Add'),(64,'Check Spelling','This will skip the word without changing it.','Ignore once'),(65,'Check Spelling','This will skip the word without changing it, and it will also skip all other instances of the word in your presentation.','Add'),(66,'Check Spelling','This adds the word to the dictionary so it will never come up as an error again. Make sure the word is spelled correctly before choosing this option.','Add'),(67,'Check Spelling','PowerPoint __________ checks your presentation for spelling errors.','Dramatically'),(68,'Check Spelling','Uncheck this box if you don\'t want PowerPoint to check for spelling errors automatically.','Hide spelling errors'),(69,'Check Spelling','Check this box if you want PowerPoint to check for contextual spelling mistakes, like the use of your vs. you\'re.','Use contextual spelling'),(70,'Check Spelling','Check this box if you want to hide the red wavy lines that mark spelling errors.','Hide spelling errors'),(71,'Presenting a Slideshow','PowerPoint offers several tools and features that can help make your presentation smooth, _________, and _________.','Engaging and Professional'),(72,'Presenting a Slideshow','Select the Slide show tab. Click the form _____________ command in the Start Slide Show group to start the slide show with the first slide.','From beginning'),(73,'Presenting a Slideshow','Another option for starting the slide show is to select _________ view at the bottom of the window.','Slide show'),(74,'Presenting a Slideshow','You can use the ___________ on your keyboard to advance and reverse slides.','Arrow keys'),(75,'Presenting a Slideshow','To end a slide show, hover and select the menu box options command and click End Show. You can also press the __________ key at the top left of your keyboard to end the show.','Esc'),(76,'Presenting a Slideshow','From the same menu, you can _______________of the pen or highlighter. Keep in mind that light color choices are best for the highlighter.','Change the color'),(77,'Presenting a Slideshow','You may switch between pen pointers by pressing ______?','CTRL + P'),(78,'Presenting a Slideshow','You may switch between mouse pointers by pressing ______?','CTRL + M'),(79,'Presenting a Slideshow','Press ____ on the keyboard to erase any ink markings while using the pen or highlighter.','E'),(80,'Presenting a Slideshow','Select the slide show tab. Click the Set Up Show command. The Set Up Show dialog box will appear. Click the buttons in the Interactive below to learn about the various options available for setting up and playing a slide show. Click ____ to apply the settings to the slide show.','Okay'),(81,'Saving and Printing','What have you learned in this lesson: Presenting Slide show, Save, Save As and Print, or Delete and Create design?','Save, Save As and Print'),(82,'Saving and Printing','____________ allows you to choose a name and location for your presentation. It\'s useful if you\'ve first created a presentation or if you want to save a different version of a presentation while keeping the original.','Save As'),(83,'Saving and Printing','Click the _____ tab. Select Save As. The Save As dialog box will appear. Select the location where you want to save the presentation. Enter a name for the presentation, then click Save.','File'),(84,'Saving and Printing','Click the ______ command on the Quick Access toolbar. The presentation will be saved in its current location with the same file name.','Save'),(85,'Saving and Printing','TRUE or FALSE: Create PDF/XPS Document saves the contents of your slide show as a document instead of a PowerPoint file.','True'),(86,'Saving and Printing','Package Presentation for _____ saves your presentation in a folder along with the Microsoft PowerPoint Viewer, a special slide show player that anyone can download and use.','CD'),(87,'Saving and Printing','Create a ______ saves your presentation as a video that can be shared online, in an email, or on a disc.','Video'),(88,'Saving and Printing','Click the drop-down arrow on the right side of the Quick Access toolbar. Select Quick Print if it is not already checked. To print, click the ____________ command.','Quick Print'),(89,'Saving and Printing','Click the File tab to go to Backstage view. Select Print. The Print pane appears, with the print settings on the left and the ________ on the right.','Preview'),(90,'Saving and Printing','_________ is a process for reproducing text and images using a master form or template.','Printing'),(91,'Modifying Themes','A _______ is a predefined combination of colors, fonts, and effects that can be applied to your presentation. PowerPoint includes built-in themes that allow you to easily create professional-looking presentations without spending a lot of time formatting.','Theme'),(92,'Modifying Themes','You can modify themes by combining the colors, fonts, and effects from different themes, and you can customize them even further by creating your own sets of _______ and_______.','Colors & fonts'),(93,'Modifying Themes','If it still doesn\'t look exactly right, you can customize the theme colors and _________.','Theme Fonts'),(94,'Modifying Themes','From the Design tab, click the __________ command. A drop-down menu will appear. Hover the mouse over the different sets of theme colors to see a live preview. Select the set of theme colors you want, or select Create New Theme Colors to customize each color individually.','Theme Colors'),(95,'Modifying Themes','To further customize your slides, you can change the background\'s color and texture by choosing a different _______________.','Background Style'),(96,'Modifying Themes','If you want even more control over the background, you can select _________________ from the menu.','Format Background '),(97,'Modifying Themes','Select the set of _________ you want, or select Create New Theme Fonts to customize each font individually.','Theme Fonts'),(98,'Modifying Themes','To change theme effects: From the Design tab, click the _________ command. A drop-down menu will appear. Hover the mouse over the different sets of theme effects to see a live preview.','Theme Effects'),(99,'Modifying Themes','To apply a background style: From the Design tab, click the _________________ command. Select the desired style. The new background will appear in the slides.','Background Style'),(100,'Modifying Themes','What have you learned in this lesson: Designing Picture & videos, Modifying chart & table, Modifying theme colors, fonts & effects, or Designing text & inserting charts?','Modifying Theme colors'),(101,'Formatting Pictures','The _______ tools in PowerPoint 2010 make it easy to incorporate images into your presentations and modify these images to make them look even better.','Picture'),(102,'Formatting Pictures','To crop an image: Select an image. The _______ tab will appear. Select the Format tab. Click the Crop command. The black cropping handles appear. Click and drag a handle to crop an image. Click the Crop command to deselect the crop tool.','Format'),(103,'Formatting Pictures','_____________ controls how vivid the colors are in the image.','Color Saturation'),(104,'Formatting Pictures','___________ controls the temperature of the color, from cool to warm.','Color Tone'),(105,'Formatting Pictures','___________ controls the overall color of the image. Use this option to make the image black and white, grayscale, or to colorize it with a different color.','Recolor'),(106,'Formatting Pictures','With _________________, PowerPoint uses special algorithms to determine which parts of the image are the background and then removes these areas from the image.','Background Removal'),(107,'Formatting Pictures','To remove the background from an image: Click the image. The ________ tab will appear.','Format'),(108,'Formatting Pictures','To remove the background from an image: Click the ______________ command. PowerPoint will try to guess which part of the image is the background, and it will mark that area with a magenta fill. It will also place a box around the image with selection handles.','Remove Background'),(109,'Formatting Pictures','To compress a picture: Choose a __________. If you are emailing your presentation, you may want to select Email, which produces the smallest file size.','Target output'),(110,'Formatting Pictures','To apply a picture style: Select the picture. The Format tab will appear. Select the Format tab. Click the More drop-down arrow to display all picture styles. Hover over a picture style to display a live preview of the style in the slide. Select the desired style. To refine the picture style, click the ____________ command to see the Effects drop-down menu.','Picture Effects'),(111,'Animation Effects','In PowerPoint you can ______ text and objects such as clip art, shapes, and pictures.','Animate'),(112,'Animation Effects','_________can be used to make text or objects appear on a slide, exit a slide, or emphasize the text or objects already on a slide.','Animations'),(113,'Animation Effects','_________ control how the object enters the slide. For example, with the Bounce animation, the object will drop onto the slide and then bounce several times.','Entrance'),(114,'Animation Effects','_________ control how the object exits the slide. For example, with the Fade animation, the object will simply fade away.','Exit'),(115,'Animation Effects','These animations occur while the object is on the slide and are often triggered by a mouse click. For example, you can set an object to Spin when you click the mouse.','Emphasis'),(116,'Animation Effects','These are similar to Emphasis effects, except the object moves within the slide along a predetermined path, like a circle.','Motion Paths'),(117,'Animation Effects','To apply an animation to an object: Select an object you want. Click the __________ tab. In the Animation group, click the More drop-down arrow to view the available animations. Select the desired animation effect. ','Animations'),(118,'Animation Effects','The ___________ allows you to view and manage all of the effects that are on the current slide.','Animation Pane'),(119,'Animation Effects','______________ will start the effect when the mouse is clicked.','Start on Click'),(120,'Animation Effects','What have you learned in this lesson: Designing Picture & videos, Modifying chart & table, Modifying theme colors, fonts & effects, or Designing text & inserting charts: Adding animation effects, Designing, Creating Tables, or  Adding Photos?','Adding animation effects'),(121,'Hyperlinks and Action Buttons','Adding ________ to your presentation can help readers quickly access contact information or information from the Internet. ','Hyperlinks'),(122,'Hyperlinks and Action Buttons','What are the 2 basic parts of Hyperlinks?','Address & Display Text'),(123,'Hyperlinks and Action Buttons','To edit, move, or delete an action button inserted this way, click the _____ tab, then Slide Master. Click Close Master View after making the desired changes.','View'),(124,'Hyperlinks and Action Buttons','To test an action button: Click the Slide Show tab In the Start Slide Show group, click ______________. Click your action button.','From Current Slide'),(125,'Hyperlinks and Action Buttons','To edit an action button: Select the action button. Click the Insert tab. In the Links group, click the ________ command. The Actions Settings dialog box will appear.','Action'),(126,'Hyperlinks and Action Buttons','_________are built-in button shapes you can add to a presentation and set to link to another slide, play a sound, or perform another action.','Action Button'),(127,'Hyperlinks and Action Buttons','To insert a hyperlink to an email address: Right-click the selected text or image, then click __________. The Insert Hyperlink dialog box will open. On the left side of the dialog box, click Email Address. Type the email address you want to connect to in the Email Address box, then click OK.','Hyperlink'),(128,'Hyperlinks and Action Buttons','To insert a hyperlink to another file: Right-click the selected text or image, then click Hyperlink. The Insert Hyperlink dialog box will open. On the left side of the dialog box, click ________________. Click the drop-down arrow to browse for your file. Click OK. The text or image will now be a hyperlink to the file you selected.','Existing File or Web Page'),(129,'Hyperlinks and Action Buttons','To insert a hyperlink to another slide: Right-click the selected text or image, then click Hyperlink. The Insert Hyperlink dialog box will open. On the left side of the dialog box, click ______________________.','Place in this Document'),(130,'Hyperlinks and Action Buttons','What have you learned in this lesson: Inserting Hyperlink, Inserting Table, or Inserting Chart?','Hyperlink'),(131,'Inserting Tables','A _________ is a grid of cells arranged in rows and columns.','Table'),(132,'Inserting Tables','To insert a blank table: On the ______ tab, click the Table command. Hover your mouse over the diagram squares to select the number of columns and rows in the table. Click your mouse. The table will appear on the slide.','Insert'),(133,'Inserting Tables','To make sure your table looks good with the slide layout, you can also insert a table using the placeholder. Click the _________ icon in the placeholder, then enter the desired number of rows and columns.','Insert Table '),(134,'Inserting Tables','To delete a row or column: Select the row or column by placing the insertion point in any cell in that row or column. Select the ____________ tab. In the Rows & Columns group, click Delete. A drop-down menu appears. Select Delete Rows or Delete Columns.','Table Tools Layout '),(135,'Inserting Tables','Depending on the __________ you\'re using, certain table style options may have somewhat different effects. You may need to experiment to get the exact look you want.','Table style '),(136,'Inserting Tables','To resize a table: Position the mouse over one of the ________ located around the edge of the table. The cursor will become a pair of directional arrows.','Sizing handles '),(137,'Inserting Tables','To move a table: Place the cursor over the _____ of the table. The cursor will turn into a cross with arrows. Click and drag the table to the desired location. Release the mouse button to drop the table in the new location.','Edge'),(138,'Inserting Tables','If you want to insert a new _____, select either Insert Above or Insert Below. If you want to insert a new column, select either Insert Left or Insert Right.','Row'),(139,'Inserting Tables','To add borders to a table: Select the cells you want to add a border to. From the Table Tools Design tab, select the desired Line Style, Line Weight, and Pen Color. Click the ______ drop-down arrow.','Borders'),(140,'Inserting Tables','What have you learned in this lesson: Inserting tables, Inserting charts, Inserting themes, or Inserting pictures?','Inserting tables'),(141,'Inserting Charts','A _____ is a tool you can use to communicate your data graphically.','Chart'),(142,'Inserting Charts','They give you an  _________of your data.','Illustration'),(143,'Inserting Charts','PowerPoint uses an ___________ as a placeholder for entering chart data.','Excel worksheet '),(144,'Inserting Charts','The data that appears in the Excel spreadsheet is _______________ that you will replace with your own information. The Excel source data is used to create the PowerPoint chart.','Placeholder source data '),(145,'Inserting Charts','Enter your data into the Excel spreadsheet. If you are not sure how to enter data into an Excel spreadsheet, review our _________ lesson from our Excel 2010 tutorial.','Cell Basics '),(146,'Inserting Charts','Be sure to drag the __________ to surround all the data you want to include in the chart.','Blue line '),(147,'Inserting Charts','To _____ an imported chart, double-click it to open the Excel placeholder. After you have finished editing, be sure to save the chart in Excel.','Edit'),(148,'Inserting Charts','Once you insert a chart, a set of ________ will appear on the Ribbon. These are only visible when the chart is selected. You can use the three tabs grouped under Chart Tools to modify your chart.','Chart tools'),(149,'Inserting Charts','Select the _____. From the Chart Tools Design tab, select the Edit command in the Data group. The Excel placeholder will open. Return to your PowerPoint slide. Select the Switch Row/Column command in the Data group. The chart will adjust the data.','Chart'),(150,'Inserting Charts','Some layouts include things like chart titles and __________. To change them, place the insertion point in the text and begin typing.','Legend labels');
/*!40000 ALTER TABLE `qpowerpoint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qword`
--

DROP TABLE IF EXISTS `qword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qword` (
  `qid` int(11) NOT NULL,
  `lesson` varchar(45) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qword`
--

LOCK TABLES `qword` WRITE;
/*!40000 ALTER TABLE `qword` DISABLE KEYS */;
INSERT INTO `qword` VALUES (1,'Getting Started','It is the tab in the ribbon where you can find the font style, font size, font color, etc.?','Home'),(2,'Getting Started','It is the button that’s make certain tool more convenient?','Quick Access Tool Bar '),(3,'Getting Started','What do you call the set of menus in top section of Microsoft word?','Ribbon '),(4,'Getting Started','Can you customize your own ribbon?','Yes '),(5,'Getting Started','In which tab you can enable the ruler?','View'),(6,'Getting Started',' Where can you make a new blank file?','File Tab'),(7,'Getting Started','Where does the File tab take you when you click it?','In the backstage view '),(8,'Getting Started','an you send your work through Email?','Yes '),(9,'Getting Started','Before closing a document, it is important that you do what?',' Save Your Document '),(10,'Getting Started',' What is the shortcut in saving your document?','Crtl S'),(11,'Text Basics','What button do you use to delete a text in your document?','Backspace '),(12,'Text Basics','How do you select the text?','By Clicking and Holding '),(13,'Text Basics','What button will you use to search a word in your document?','Find'),(14,'Text Basics','What button will you use to change a word in your document?','Replace '),(15,'Text Basics','Can you select multiple words in your document?','Yes'),(16,'Text Basics','What happens when you select a text or word images in Word?','A Hover Tool Bar Appears '),(17,'Text Basics','What button do you use to copy or paste your work?','Copy and Paste '),(18,'Text Basics','What pane will appear have you click the find button?','Navigation '),(19,'Text Basics','Can you also use cut to copy and paste a text?','Yes '),(20,'Text Basics',' Can a drag and drop technique make things easy for us?','Yes'),(21,'Formatting Text','Can you change the size of a text?','Yes'),(22,'Formatting Text','What are the other options for changing the font size?','Grow and Shrink '),(23,'Formatting Text','How do you change the color of your text?',' By Clicking Color '),(24,'Formatting Text','What are the other ways to make the text stand out?','Bold, Italic and Underline '),(25,'Formatting Text','What button do you use to make all the letters upper case?','Change Case Commands '),(26,'Formatting Text','How do you highlight a text?','Highlighter Command '),(27,'Formatting Text','Where can the alignment options be found?','Paragraph '),(28,'Formatting Text','Where can the font size be found?','Home '),(29,'Formatting Text','The following are alignment options EXCEPT','Create '),(30,'Formatting Text',' What are the other ways of highlighting a text?','Bold'),(31,'Saving','What button do you use to save a file?','File '),(32,'Saving','Does MS word auto save’s you work?','Yes'),(33,'Saving','What do you need to do in order for you to use your file in other versions of MS?','Use File Format Word 97 – 2003 '),(34,'Saving','What do you need to use to save your file in PDF?','Pdf '),(35,'Saving','What button do you use so you can save you file?','Save As '),(36,'Saving','What is the shortcut of save?','Ctrl S '),(37,'Saving','Where do you go so you can retrieve your file when you forget to save it?','Info '),(38,'Saving','Where can you find the Info button?','File '),(39,'Saving','Does auto save helps you?','Yes'),(40,'Saving',' Does save as allows you to choose a name and location for your file ?','Yes '),(41,'Modifying Page Layout','Where can you find the Orientation?','Page layout '),(42,'Modifying Page Layout','What can you find in orientation?','Portrait and Landscape '),(43,'Modifying Page Layout','How can you change the size of the page?',' By Clicking Size '),(44,'Modifying Page Layout','Can you adjust margins in you page?','Yes '),(45,'Modifying Page Layout','Where can you find the margin button?','Page Layout '),(46,'Modifying Page Layout','How can you make your own margins?','By Clicking Custom Margin'),(47,'Modifying Page Layout','The following is inside the custom page or page setup EXCEPT','Page '),(48,'Modifying Page Layout','Can page Layout help you in making your page more decent?','Yes '),(49,'Modifying Page Layout','How many commands does page layout have?','3'),(50,'Modifying Page Layout',' Where can you find the page set up?','Page Layout '),(51,'Checking Spelling and Grammar','Where do you need to go to check your spelling and grammar?','Review '),(52,'Checking Spelling and Grammar','What color is a spelling error?','Red '),(53,'Checking Spelling and Grammar','What color is a grammatical error?','Green'),(54,'Checking Spelling and Grammar','Where do you need to go to change the auto check settings? ','Back Stage View '),(55,'Checking Spelling and Grammar','Can someone see the errors you made in your file if you sent it to someone?','Yes '),(56,'Checking Spelling and Grammar','Can you disable your auto correct?','Yes '),(57,'Checking Spelling and Grammar','What happens if you click the spelling and grammar button?','It Automatically Changes Your Spellings and Grammar '),(58,'Checking Spelling and Grammar','The following are the buttons you will use for spelling errors EXCEPT:','Don’t Change It '),(59,'Checking Spelling and Grammar','The following are the buttons you will use for grammatical error EXCEPT','Next Page '),(60,'Checking Spelling and Grammar',' What color is contextual error?','Blue '),(61,'Printing','Where can you find print?','Back Stage View '),(62,'Printing','Can you choose more copies when you want to print?','Yes '),(63,'Printing','What button do you check if you are going to print a multi-page document?','Collate '),(64,'Printing','What button do you use to print something with a single click?','Quick Print '),(65,'Printing','Is there a limit in printing?',' No'),(66,'Printing','Where can you find print?','Back Stage View '),(67,'Printing','Can you choose more copies when you want to print?','Yes '),(68,'Printing','What button do you check if you are going to print a multi-page document?','Collate '),(69,'Printing','What button do you use to print something with a single click?','Quick Print '),(70,'Printing','Is there a limit in printing?',' No'),(71,'Indents and Tabs','The following are indent markers EXCEPT','Over Indent  '),(72,'Indents and Tabs','What button do you use to make the text jump at half inch increments?','tabs'),(73,'Indents and Tabs','What button do you use to see the tabs and shows you little arrows ?','show hide command'),(74,'Indents and Tabs','What button do you use to change the size of the tabs ?','tab stops '),(75,'Indents and Tabs','The following are tab stops EXCEPT','right tab'),(76,'Indents and Tabs','Where can be the hanging,first line and left indent marker can be found ?','right tab'),(77,'Indents and Tabs','Can you increase the indent by increments of a ½ ?','yes'),(78,'Indents and Tabs','Does using tabs help you in your daily use of word ?','yes'),(79,'Indents and Tabs','This helps to visually separate paragraphs from one another. ','Indent'),(80,'Indents and Tabs','Can you decrease your indent increment by ½ inch ?','yes'),(81,'Line and Pharagraph Spacing','What button do you use so you can change the line spacing?','Line and paragraph spacing'),(82,'Line and Pharagraph Spacing','The following are inside the line spacing options Except','both a and b'),(83,'Line and Pharagraph Spacing','Where can the spacing be found ? ','line spacing options'),(84,'Line and Pharagraph Spacing','Does using spacing important to your work?','yes'),(85,'Line and Pharagraph Spacing','Can you increase the spacing in your paragraph?','yes'),(86,'Line and Pharagraph Spacing','What button do you use to see the paragraph marks ?','show hide command'),(87,'Line and Pharagraph Spacing','Can you reduce your line spacing ?','yes '),(88,'Line and Pharagraph Spacing','Does improving your line spacing help you?','yes'),(89,'Line and Pharagraph Spacing','Is the line spacing easy to use ?','yes'),(90,'Line and Pharagraph Spacing','Does the line spacing makes your waork full of lines ?','no'),(91,'Working with Lists','What button do you use so you can put bullets to your work ?','bullet command'),(92,'Working with Lists','Can you create your own bullet ?','yes'),(93,'Working with Lists','What button do you use to select your own bullet mark ?','symbol'),(94,'Working with Lists','Can you select a font for your bullet?','yes'),(95,'Working with Lists','Can you change the color of your bullet ?','yes'),(96,'Working with Lists','Does using bullets makes your work organized?','yes'),(97,'Working with Lists','What do you call a list that is group in one place ?','multi level list '),(98,'Working with Lists','Can you use numbers as a marker ?','yes'),(99,'Working with Lists','Using bullets may lead to destroying your work','no'),(100,'Working with Lists','Does using bullets make your work easier ?','yes'),(101,'Adding Breaks','Where can the page break be found?','page layout '),(102,'Adding Breaks','Are there many different kinds of breaks ?','yes'),(103,'Adding Breaks','The following are breaks EXCEPT','heart break'),(104,'Adding Breaks','Can you delete a break ?','yes'),(105,'Adding Breaks','How do you select the page break ?','by double clicking it '),(106,'Adding Breaks','Does page break help you in your daily work ?','yes'),(107,'Adding Breaks','What do you use so that your text wont move when you delete a text ?','page break'),(108,'Adding Breaks','Does page break make your work complicated ?','yes'),(109,'Adding Breaks','Is page break limited to use ?','no'),(110,'Adding Breaks','Is there a requirement for you to use page break ?',NULL),(111,'Inserting Columns','Where can you find the insert column?','page layout'),(112,'Inserting Columns','Can you select the number of columns that you want ?','yes'),(113,'Inserting Columns','What do you use to make sure that the title doesn’t go with the column?','break'),(114,'Inserting Columns','Can this help you in organizing your text?','yes'),(115,'Inserting Columns','Can you add more columns ?','yes'),(116,'Working with Hyperlink','What happens when you put an email or a website in your document?','It becomes a hyperlink'),(117,'Working with Hyperlink','Can hyper link help you in your document?','yes'),(118,'Working with Hyperlink','How do you choose the hyper link command?','right click it '),(119,'Working with Hyperlink','Can you insert a hyper link to another portion of the same document ?','yes'),(120,'Working with Hyperlink','Can you use hyper link as a marker ?','no'),(121,'Working with Shapes','Where can the shapes be found?','Insert'),(122,'Working with Shapes','How can you change the size of the shape ?','by using the handles'),(123,'Working with Shapes','The following are the options in send to back EXCEPT','send to friend'),(124,'Working with Shapes','Where can you find the shape style ?','format'),(125,'Working with Shapes','The following are options in changing the appearance of the shape EXCEPT','color change'),(126,'Working with Shapes','Can you mix and match different kinds of effects?','yes'),(127,'Working with Shapes','Can you add a 3d effect in a shape?','yes'),(128,'Working with Shapes','Can hving shapes help your a little eye cathching?','yes'),(129,'Working with Shapes','Can you put the shape forward the text?','yes'),(130,'Working with Shapes','Can you change the size of the outline?','yes'),(131,'Text Boxes and Word Art','Where can you create a text box ?','insert'),(132,'Text Boxes and Word Art','Where can you align your text box?','format'),(133,'Text Boxes and Word Art','Can you edit the shape of your text box?','yes'),(134,'Text Boxes and Word Art','Can you add effect in the text box ?','yes'),(135,'Text Boxes and Word Art','Where can you find the word art command?','insert'),(136,'Text Boxes and Word Art','Can you change the colors and effect of the word ?','yes'),(137,'Text Boxes and Word Art','Can you transform the text ?',' yes'),(138,'Text Boxes and Word Art','Can this help you in making your text more eye catching?','yes'),(139,'Text Boxes and Word Art','Can you delete a text box once you place it ?','yes'),(140,'Text Boxes and Word Art','Where can you find the word art ?','insert');
/*!40000 ALTER TABLE `qword` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `usn` int(11) NOT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  UNIQUE KEY `usn_UNIQUE` (`usn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (100,'lname','Mememan','pass'),(123,'Valencia','Denver','password'),(1610443,'Chan','Fran','meme'),(71930451,'Juntila','Jessica','123'),(73153481,'Las','Fir','pass'),(74099349,'Mauricio','Francis','mauricio'),(77000757,'Peperoni','Shawnies','ericshawn'),(80784905,'The Rapper','Chance','3825'),(109440513,'silva','yco','Test'),(111963696,'valencia','denver','123456');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `word`
--

DROP TABLE IF EXISTS `word`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `word` (
  `usn` int(11) NOT NULL,
  `info` text,
  `lesson1` varchar(25) DEFAULT NULL,
  `lesson1f` varchar(5) DEFAULT NULL,
  `lesson1i` varchar(255) DEFAULT NULL,
  `lesson1g` int(11) NOT NULL,
  `lesson1d` varchar(12) DEFAULT NULL,
  `lesson2` varchar(12) DEFAULT NULL,
  `lesson2f` varchar(5) DEFAULT NULL,
  `lesson2i` varchar(255) DEFAULT NULL,
  `lesson2g` int(11) NOT NULL,
  `lesson2d` varchar(12) DEFAULT NULL,
  `lesson3` varchar(25) DEFAULT NULL,
  `lesson3f` varchar(5) DEFAULT NULL,
  `lesson3i` varchar(255) DEFAULT NULL,
  `lesson3g` int(11) NOT NULL,
  `lesson3d` varchar(12) DEFAULT NULL,
  `lesson4` varchar(12) DEFAULT NULL,
  `lesson4f` varchar(5) DEFAULT NULL,
  `lesson4i` varchar(255) DEFAULT NULL,
  `lesson4g` int(11) NOT NULL,
  `lesson4d` varchar(12) DEFAULT NULL,
  `lesson5` varchar(25) DEFAULT NULL,
  `lesson5f` varchar(5) DEFAULT NULL,
  `lesson5i` varchar(255) DEFAULT NULL,
  `lesson5g` int(11) NOT NULL,
  `lesson5d` varchar(12) DEFAULT NULL,
  `lesson6` varchar(45) DEFAULT NULL,
  `lesson6f` varchar(5) DEFAULT NULL,
  `lesson6i` varchar(255) DEFAULT NULL,
  `lesson6g` int(11) NOT NULL,
  `lesson6d` varchar(12) DEFAULT NULL,
  `lesson7` varchar(12) DEFAULT NULL,
  `lesson7f` varchar(5) DEFAULT NULL,
  `lesson7i` varchar(255) DEFAULT NULL,
  `lesson7g` int(11) NOT NULL,
  `lesson7d` varchar(12) DEFAULT NULL,
  `lesson8` varchar(25) DEFAULT NULL,
  `lesson8f` varchar(5) DEFAULT NULL,
  `lesson8i` varchar(255) DEFAULT NULL,
  `lesson8g` int(11) NOT NULL,
  `lesson8d` varchar(12) DEFAULT NULL,
  `lesson9` varchar(45) DEFAULT NULL,
  `lesson9f` varchar(5) DEFAULT NULL,
  `lesson9i` varchar(255) DEFAULT NULL,
  `lesson9g` int(11) NOT NULL,
  `lesson9d` varchar(12) DEFAULT NULL,
  `lesson10` varchar(25) DEFAULT NULL,
  `lesson10f` varchar(5) DEFAULT NULL,
  `lesson10i` varchar(255) DEFAULT NULL,
  `lesson10g` int(11) NOT NULL,
  `lesson10d` varchar(12) DEFAULT NULL,
  `lesson11` varchar(25) DEFAULT NULL,
  `lesson11f` varchar(5) DEFAULT NULL,
  `lesson11i` varchar(45) DEFAULT NULL,
  `lesson11g` int(11) NOT NULL,
  `lesson11d` varchar(12) DEFAULT NULL,
  `lesson12` varchar(25) DEFAULT NULL,
  `lesson12f` varchar(5) DEFAULT NULL,
  `lesson12i` varchar(255) DEFAULT NULL,
  `lesson12g` int(11) NOT NULL,
  `lesson12d` varchar(12) DEFAULT NULL,
  `lesson13` varchar(25) DEFAULT NULL,
  `lesson13f` varchar(5) DEFAULT NULL,
  `lesson13i` varchar(255) DEFAULT NULL,
  `lesson13g` int(11) NOT NULL,
  `lesson13d` varchar(12) DEFAULT NULL,
  `lesson14` varchar(25) DEFAULT NULL,
  `lesson14f` varchar(5) DEFAULT NULL,
  `lesson14i` varchar(45) DEFAULT NULL,
  `lesson14g` int(11) NOT NULL,
  `lesson14d` varchar(12) DEFAULT NULL,
  `lesson15` varchar(25) DEFAULT NULL,
  `lesson15f` varchar(5) DEFAULT NULL,
  `lesson15i` varchar(45) DEFAULT NULL,
  `lesson15g` int(11) NOT NULL,
  `lesson15d` varchar(12) DEFAULT NULL,
  `fgrade` int(11) NOT NULL,
  `photo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`usn`),
  KEY `lesson1g_index` (`lesson1g`),
  KEY `lesson2g_index` (`lesson2g`),
  KEY `lesson3g_index` (`lesson3g`),
  KEY `lesson4g_index` (`lesson4g`),
  KEY `lesson5g_index` (`lesson5g`),
  KEY `lesson6g_index` (`lesson6g`),
  KEY `lesson7g_index` (`lesson7g`),
  KEY `lesson8g_index` (`lesson8g`),
  KEY `lesson9g_index` (`lesson9g`),
  KEY `lesson10g_index` (`lesson10g`),
  KEY `lesson11g_index` (`lesson11g`),
  KEY `lesson12g_index` (`lesson12g`),
  KEY `lesson13g_index` (`lesson13g`),
  KEY `lesson14g_index` (`lesson14g`),
  KEY `lesson15g_index` (`lesson15g`),
  KEY `fgrade_index` (`fgrade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `word`
--

LOCK TABLES `word` WRITE;
/*!40000 ALTER TABLE `word` DISABLE KEYS */;
INSERT INTO `word` VALUES (100,'Microsoft word 2010 is a wor processing program , designed to help you create professional quality documents. With the finest document formatting tools , word helps you organize and write your documents more effieciently. Word also includess powerful edi...','Getting Started','webm','to be able to learn your way around the ms word 2010 environment , incluing getting to know the new backstage view.',0,'Undone','Text Basics','webm','basics of working with text , including how to insert , delete , select , copy , cut , paste , and drag and drop text.',0,'Undone','Formatting Text','webm','to create and design effective documents , you need to know how to format text.',0,'Undone','Saving','webm','to learn it is important to know how to save the documents you are working with.',0,'Undone','Modifying Page Layout','webm','to learn how to change the page orientation , paper size , and page margins.',0,'Undone','Checking Spelling and Grammar','webm','to learn about the various proofing features , incluing the spelling and grammar tool.',0,'Undone','Printing','webm','this lessong covers the tasks in the print pane , along with the quick print feature.',0,'Undone','Indent And Tabs','webm','to learn how to use the tab selector and the horizontal ruler to set tabs and indents  as well as how to use the increase indent and decrease indent command',0,'Undone','Line and Pharagraph Spacing','webm','to learn how to modify the line and paragraph spacing in various ways.',0,'Undone','Working With Lists','webm','to learn how to modiffy exisiting bullets , insert new bulleted and numbered lists , select symbols as bullets and format multilevel lists.',0,'Undone','Adding Breaks','webm','to learn how to insert and delete breaks.',0,'Undone','Inserting Columns','webm','to learn how to insert columns into a document and create column break.',0,'Undone','Working With Hyper Links','webm','to learn the basics of working with hyperlinks , including how to insert and remove the from your word document.',0,'Undone','Working With Shapes','webm','to learn how to apply 3D effects to shapes.',0,'Undone','Text Boxes And Word Art','webm','to learn how to create nad format wordart.',0,'Undone',0,'word.png'),(1610443,'Microsoft word 2010 is a wor processing program , designed to help you create professional quality documents. With the finest document formatting tools , word helps you organize and write your documents more effieciently. Word also includess powerful edi...','Getting Started','webm','to be able to learn your way around the ms word 2010 environment , incluing getting to know the new backstage view.',0,'Undone','Text Basics','webm','basics of working with text , including how to insert , delete , select , copy , cut , paste , and drag and drop text.',0,'Undone','Formatting Text','webm','to create and design effective documents , you need to know how to format text.',0,'Undone','Saving','webm','to learn it is important to know how to save the documents you are working with.',0,'Undone','Modifying Page Layout','webm','to learn how to change the page orientation , paper size , and page margins.',0,'Undone','Checking Spelling and Grammar','webm','to learn about the various proofing features , incluing the spelling and grammar tool.',0,'Undone','Printing','webm','this lessong covers the tasks in the print pane , along with the quick print feature.',0,'Undone','Indent And Tabs','webm','to learn how to use the tab selector and the horizontal ruler to set tabs and indents  as well as how to use the increase indent and decrease indent command',0,'Undone','Line and Pharagraph Spacing','webm','to learn how to modify the line and paragraph spacing in various ways.',0,'Undone','Working With Lists','webm','to learn how to modiffy exisiting bullets , insert new bulleted and numbered lists , select symbols as bullets and format multilevel lists.',0,'Undone','Adding Breaks','webm','to learn how to insert and delete breaks.',0,'Undone','Inserting Columns','webm','to learn how to insert columns into a document and create column break.',0,'Undone','Working With Hyper Links','webm','to learn the basics of working with hyperlinks , including how to insert and remove the from your word document.',0,'Undone','Working With Shapes','webm','to learn how to apply 3D effects to shapes.',0,'Undone','Text Boxes And Word Art','webm','to learn how to create nad format wordart.',0,'Undone',0,'word.png'),(71930451,'Microsoft word 2010 is a wor processing program , designed to help you create professional quality documents. With the finest document formatting tools , word helps you organize and write your documents more effieciently. Word also includess powerful edi...','Getting Started','webm','to be able to learn your way around the ms word 2010 environment , incluing getting to know the new backstage view.',0,'Undone','Text Basics','webm','basics of working with text , including how to insert , delete , select , copy , cut , paste , and drag and drop text.',0,'Undone','Formatting Text','webm','to create and design effective documents , you need to know how to format text.',0,'Undone','Saving','webm','to learn it is important to know how to save the documents you are working with.',0,'Undone','Modifying Page Layout','webm','to learn how to change the page orientation , paper size , and page margins.',0,'Undone','Checking Spelling and Grammar','webm','to learn about the various proofing features , incluing the spelling and grammar tool.',0,'Undone','Printing','webm','this lessong covers the tasks in the print pane , along with the quick print feature.',0,'Undone','Indent And Tabs','webm','to learn how to use the tab selector and the horizontal ruler to set tabs and indents  as well as how to use the increase indent and decrease indent command',0,'Undone','Line and Pharagraph Spacing','webm','to learn how to modify the line and paragraph spacing in various ways.',0,'Undone','Working With Lists','webm','to learn how to modiffy exisiting bullets , insert new bulleted and numbered lists , select symbols as bullets and format multilevel lists.',0,'Undone','Adding Breaks','webm','to learn how to insert and delete breaks.',0,'Undone','Inserting Columns','webm','to learn how to insert columns into a document and create column break.',0,'Undone','Working With Hyper Links','webm','to learn the basics of working with hyperlinks , including how to insert and remove the from your word document.',0,'Undone','Working With Shapes','webm','to learn how to apply 3D effects to shapes.',0,'Undone','Text Boxes And Word Art','webm','to learn how to create nad format wordart.',0,'Undone',0,'word.png');
/*!40000 ALTER TABLE `word` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-24 13:23:12
