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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `active` tinyint DEFAULT '1',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `roles` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'ROLE_USER',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `users_active_index` (`active`),
  KEY `users_password_index` (`password`),
  KEY `users_roles_index` (`roles`),
  KEY `users_userName_index` (`user_name`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,1,'$2a$12$9msvsR8.wfRWVuQxYGfGcegZtOnyW9BjrGmBtsgRkbi2/PXIr4Jy6','ROLE_USER','qqq'),(2,1,'$2a$12$T4/gNZYuGv0KZKRR1ojRH.7iUnHCgzhHz510GWQFawHcjf7M.2LDy','ROLE_USER','Mik'),(3,1,'$2a$12$vkgnOZChnU6kYtsHMxPGZ.YOA41J/gACLZW4Sjc3YFF2KYkD0fnya','ROLE_USER','Dargonax'),(4,1,'$2a$12$xWFW5ISVpPwdKKptUSsb5uLcJV3ZP/QGWZZ8ET9LPXGatmCpVF/t6','ROLE_USER','test'),(5,1,'$2a$12$iLgStLUtTecaoiBELcY.O.A0RWtocIblxJ808zz.Cge.ySJjDRy66','ROLE_USER','one'),(6,1,'$2a$12$Ny5GO7.NvoNT0eYjgDJrWOwLoTAacU5660uvO0gEOg2jmFSJs/tQ2','ROLE_USER','only'),(7,1,'$2a$12$xjWUoTGPhDQoT0SjKe7a2eCk3L06JvX/b2II5/6BCN.FmOyos.T5K','ROLE_USER','last'),(8,1,'$2a$12$uPZgvtwVLQRNA1bhCC4IwuvrTyXKc2Xm7CedAB5amLXRDimmITyQW','ROLE_USER','Long'),(9,1,'$2a$12$HL4G2b6/Jgh5me41LCiD/OaPktii6O87JnzDVbGcPT7gTubJMP49G','ROLE_USER','Jpa'),(10,1,'$2a$12$rqSF.PRNuC0FKl4GXQBbpu//hlHWi/U4kauX/3yM3PtM6BmBeQJKS','ROLE_USER','transactional'),(11,1,'$2a$12$nqadb7x2DSat4NZQgjlUHuZvVvCga1JoFdhcRwWyfsOAD.QsAQVvm','ROLE_USER','new'),(12,1,'$2a$12$jtytY1SgGIBjft12B1nXZeoR4WqJhmc7FEtBXX9b2ANc/xYbdvJ5O','ROLE_USER','setter'),(13,1,'$2a$12$DFr47uBID74aDqpe0Ikhbe7CQzc7Bn3WOXcNWkpJeysMCsscF4fvq','ROLE_USER','fullLombok'),(14,1,'$2a$12$81ku1azscJbE5klie2em6ufAl36GRkD1bzXSsAy0YAhbxNyzwstOO','ROLE_USER','all'),(15,1,'$2a$12$mk8lK7x8jb0rhStG6Eec7evrNeGqE8IFGSaAgBN/KaaXfsUp4Xs2e','ROLE_USER','no1'),(16,1,'$2a$12$gl0FJOuHAs2H2CHQMdWxTeeWONY6wTsXC0QiwcN98mhSjtvlDchf.','ROLE_USER','rrr'),(17,1,'$2a$12$uoptD.XADie1EJRWb0Lz/u2eDpUQssbydMb0XbQONEEKEASPOXn12','ROLE_USER','cucmber'),(18,1,'$2a$12$1TV6CG7W5szgQaqjZbSO7u9UY8bFvuq/CmMdV2szfygR.ZEse2OVG','ROLE_USER','cucumber'),(19,1,'$2a$12$lgBH6ZMcp7G1ETE2qXLRrOaSLZjAGxy/IokuxDBjfcJ9oZuXzbkHK','ROLE_USER','cucumber1'),(20,1,'$2a$12$AW3A7oXNbImkjsxyoMJ78.GMKbPNo9uZNCgDOFVrnTkM67TI4ur8C','ROLE_USER','cucumber2'),(21,1,'$2a$12$zCY2ckExYShSlQUa8MO2wO13mCfvp79t3PgtfELBLtExaC1ozl2PG','ROLE_USER','cucumber3'),(22,1,'$2a$12$hg8nFOHzhd9tBdtMLoHaS.i11BfLI3Dm.YBE4q7Z3dhM.Patty2ZS','ROLE_USER','cucumber4'),(23,1,'$2a$12$ycNEU.5cAOivXC1Hep2tbOZJ3m2ggmUMxRZFwaK7n3e4lNy2/EyPm','ROLE_USER','cucumber5'),(24,1,'$2a$12$RWeInOfygo0M/HVF.1a4pe6KChIr.7GNZmBU7BntT0zU2pno5wiiy','ROLE_USER','cucumber6'),(25,1,'$2a$12$/Wa5hqth2xZPKVTUra1NquZgfg5jjB53tHgHQBtijVT.cZaxg3/Jy','ROLE_USER','cucumber7'),(26,1,'$2a$12$VVS.z5.RzHuwaSF1Y97BCOpHEhduMVFn80h98ZtGpNf7PpOsCLgj.','ROLE_USER','cucumber8'),(27,1,'$2a$12$vepd9DULkhucWDpl1tzxn.yflclHZcd3JJrdLesuNAeIRIz0PcNzG','ROLE_USER','cucumber00'),(28,1,'$2a$12$/0TEF.BwmIYGSTynZglWH.gPpvbkpkzvnh2tzEer8187Sgi3D4qvK','ROLE_USER','cucumber01'),(29,1,'$2a$12$ZSLziYAClYc39dlcY8ZeBehw2LOBO9arFSqESC6cACZyBgKqD8HxG','ROLE_USER','cucumber02'),(30,1,'$2a$12$P4A1N6kF7YvQvGAs.7N6Tu1Yod14vDwrxF9zd2/fRJKY9TTpEuCtq','ROLE_USER','cucumber03');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
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
