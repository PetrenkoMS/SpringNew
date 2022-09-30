-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: repository
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `people_model`
--

DROP TABLE IF EXISTS `people_model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `people_model` (
  `id` int NOT NULL AUTO_INCREMENT,
  `about` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `er` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `login` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `number_passport` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `second_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `series_passport` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `select_param` varchar(255) DEFAULT NULL,
  `pattern` varchar(255) DEFAULT NULL,
  `title_pattern` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `people_model_login_index` (`login`),
  KEY `people_model_password_index` (`password`),
  KEY `people_model_name_index` (`name`),
  KEY `people_model_secondName_index` (`second_name`),
  KEY `people_model_age_index` (`age`),
  KEY `people_model_gender_index` (`gender`),
  KEY `people_model_series_index` (`series_passport`),
  KEY `people_model_number_index` (`number_passport`),
  KEY `people_model_telephone_index` (`telephone`),
  KEY `people_model_about_index` (`about`),
  KEY `people_model_selectParam_index` (`select_param`),
  KEY `people_model_pattern_index` (`pattern`),
  KEY `people_model_titlePattern_index` (`title_pattern`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `people_model`
--

LOCK TABLES `people_model` WRITE;
/*!40000 ALTER TABLE `people_model` DISABLE KEYS */;
INSERT INTO `people_model` VALUES (1,'qqq',23,'ok','male','qqq','qqq','999999','qwe','qwerov','9999','88005553535',NULL,NULL,NULL),(3,'I\'m eternal!',19,'ok','male','Dargonax','Dargonax','999999','qwe','Great','1111','88005553535',NULL,NULL,NULL),(4,'Тестим ',54,NULL,'female','test','tester','111111','test','testerov','7777','89998883322',NULL,NULL,NULL),(5,'one registr controller',111,NULL,'male','one','one','656565','qwe','one','1111','88005553535',NULL,NULL,NULL),(6,'one service for two',20,NULL,'male','only','only','565656','qwe','one','1111','88005553535',NULL,NULL,NULL),(7,'last?',23,NULL,'male','last','last','000001','qwe','one','1111','88005553535',NULL,NULL,NULL),(8,'Long id',120,NULL,'male','Long','Long','888888','qwe','Id','8888','88005553535',NULL,NULL,NULL),(9,'JpaRepository Work',22,'ok','male','Jpa','Jpa','333333','qwe','Repository','7777','88005553535',NULL,NULL,NULL),(10,'@Transactional на всех серверах',22,'ok','female','transactional','Transactional','333333','qwe','Transactionalov','9999','88005553535',NULL,NULL,NULL),(11,'Тестим ',23,'ok','male','new','owner','111111','qwe','lom','9999','88005553535',NULL,NULL,NULL),(12,'Тестим ',22,'ok','male','setter','setter','444444','qwe','lom','1111','89998883322',NULL,NULL,NULL),(13,'fullLombok',67,'ok','male','fullLombok','lombok','444444','qwe','lom','9999','88005553535',NULL,NULL,NULL),(14,'Allright',55,'ok','male','all','all','888888','qwe','right','7777','23231423456',NULL,NULL,NULL),(15,'no',14,NULL,'male','no1','no','223311','qwe','on','7777','89998883322',NULL,NULL,NULL),(16,'Тестим ',14,'ok','male','rrr','qq','534333','qwe','qq','1111','88005553535',NULL,NULL,NULL),(30,'Cucumber run registration',23,NULL,'female','cucumber7','ogyrchik','138878','qwe','zeleniq','1388','88005553500',NULL,NULL,NULL),(22,'Cucumber run registration',20,NULL,'male','cucmber','ogyrchik','128877','qwe','zeleniq','1288','88005553500',NULL,NULL,NULL),(23,'Cucumber run registration',20,NULL,'male','cucumber','ogyrchik','138877','qwe','zeleniq','1388','88005553500',NULL,NULL,NULL),(24,'Cucumber run registration',23,'ok','male','cucumber1','ogyrchik','138872','qwe','zeleniq','1382','88005553500',NULL,NULL,NULL),(25,'Cucumber run registration',23,NULL,'male','cucumber2','ogyrchik','138873','qwe','zeleniq','1383','88005553500',NULL,NULL,NULL),(26,'Cucumber run registration',23,NULL,'male','cucumber3','ogyrchik','138874','qwe','zeleniq','1384','88005553500',NULL,NULL,NULL),(27,'Cucumber run registration',23,NULL,'male','cucumber4','ogyrchik','138875','qwe','zeleniq','1385','88005553500',NULL,NULL,NULL),(28,'Cucumber run registration',23,'ok','male','cucumber5','ogyrchik','138876','qwe','zeleniq','1386','88005553500',NULL,NULL,NULL),(29,'Cucumber run registration',23,'ok','male','cucumber6','ogyrchik','138877','qwe','zeleniq','1387','88005553500',NULL,NULL,NULL),(31,'Cucumber run registration',23,NULL,'female','cucumber8','ogyrchik','138879','qwe','zeleniq','1389','88005553500',NULL,NULL,NULL),(32,'Cucumber run registration',23,NULL,'female','cucumber00','ogyrchik','138880','qwe','zeleniq','1390','88005553500',NULL,NULL,NULL),(33,'Cucumber run registration',23,NULL,'female','cucumber01','ogyrchik','138881','qwe','zeleniq','1391','88005553500',NULL,NULL,NULL),(34,'Cucumber run registration',23,NULL,'female','cucumber02','ogyrchik','138882','qwe','zeleniq','1392','88005553500',NULL,NULL,NULL),(35,'Cucumber run registration',23,NULL,'female','cucumber03','ogyrchik','138883','qwe','zeleniq','1393','88005553500',NULL,NULL,NULL);
/*!40000 ALTER TABLE `people_model` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-29 18:29:41
