-- Table structure for table `DEPT`
--

DROP TABLE IF EXISTS `DEPT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DEPT` (
  `DEPT_ID` int(11) NOT NULL,
  `DEPT_NAME` varchar(45) NOT NULL,
  PRIMARY KEY (`DEPT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DEPT`
--

LOCK TABLES `DEPT` WRITE;
/*!40000 ALTER TABLE `DEPT` DISABLE KEYS */;
INSERT INTO `DEPT` VALUES (1,'EMERGENCY DEPT'),(2,'CARDIOLOGY'),(3,'INTENSIVE CARE'),(4,'NEUROLOGY'),(5,'ONCOLOGY'),(6,'GYNAECOLOGY'),(7,'DENTISTRY'),(8,'DERMATOLOGY'),(9,'RADIOLOGY'),(10,'BURN UNIT'),(11,' SURGERY'),(12,'OPTHAMOLOGY'),(13,'ORTHOPAEDICS'),(14,'RENAL'),(15,'PEADIATRICS');
/*!40000 ALTER TABLE `DEPT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DOCTORS`
--

DROP TABLE IF EXISTS `DOCTORS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DOCTORS` (
  `DOCID` int(50) NOT NULL AUTO_INCREMENT,
  `DOCNAME` varchar(20) NOT NULL,
  `SPCIALIZATION` varchar(20) NOT NULL,
  `TIME` varchar(45) DEFAULT NULL,
  `FEES` varchar(45) NOT NULL,
  `DEPTID` int(11) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DOCID`),
  KEY `DEPT_ID_idx` (`DEPTID`),
  CONSTRAINT `DEPT_ID` FOREIGN KEY (`DEPTID`) REFERENCES `DEPT` (`DEPT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=131 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DOCTORS`
--

LOCK TABLES `DOCTORS` WRITE;
/*!40000 ALTER TABLE `DOCTORS` DISABLE KEYS */;
INSERT INTO `DOCTORS` VALUES (111,'ATHILA','SURGEON','7AM TO 2PM, MON WED FRI SUN','250.0',11,NULL),(112,'CHANDANA','PEDEATRICIAN','8AM TO 3PM MON TO FRI','200.0',15,NULL),(113,'UTHARA','GYNECOLOGIST','7AM TO 12PM MON TO FRI','200.0',6,NULL),(114,'AMJAD','NEUROLOGIST','9AM TO 1PM MON TO THURS','200.0',4,NULL),(115,'HARI','DENTIST','7AM TO 12PM WEDNESDAYS','150.0',7,NULL),(116,'JUBIN','DERMATOLOGIST','8AM TO 1PM MON THURS','150.0',8,NULL),(117,'AYSHA','ORTHOLOGIST','8AM TO 2PM MON TO WED','200.0',13,NULL),(118,'ARJUN K','EMERGENCY DEPT','8AM TO 3PM','100.0',1,NULL),(119,'AKASH','CARDIOLOGIST','8AM TO 12 PM MON THURS','250.0',2,NULL),(120,'SUHAIL','INTENSIVE CARE','8AM TO 1PM THURS SUN','100.0',3,NULL),(121,'ZEN','ONCOLOGIST','9AM TO 10PM FRI WED','200.0',4,NULL),(122,'SOORAJ','PLASTIC SURGEON','8AM TO 10PM MON THURS','200.0',11,NULL),(123,'GOURI','NEPHROLOGIST','9AM TO 12PM FRI SUN','200.0',14,NULL),(124,'BABITHA','PEADIATRICIAN','3PM TO 8PM EVERYDAY','250.0',15,NULL),(125,'SREEJITH','CARDIAC SURGEON','10AM TO 3PM THURS FRI','250.0',11,NULL),(126,'Zayn','Cardiologist','6pm to 8 pm','200',NULL,NULL),(127,'John','Neurosurgeon','3pm to 8pm','300',NULL,NULL),(128,'christi@gmail.com','internal med','2pm to 6pm','200rs',NULL,'CHRISTI'),(129,'LIA','physiotheraphist','4pm to 7pm','300rs',NULL,'lia@gmail.com'),(130,'ROSE','Cardilogist','4 to 8','200',NULL,'utharaprince2000@gmail.com');
/*!40000 ALTER TABLE `DOCTORS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MEDICINES`
--

DROP TABLE IF EXISTS `MEDICINES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MEDICINES` (
  `MEDICINE` varchar(45) NOT NULL,
  `MEDID` int(50) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`MEDID`)
) ENGINE=InnoDB AUTO_INCREMENT=1015 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MEDICINES`
--

LOCK TABLES `MEDICINES` WRITE;
/*!40000 ALTER TABLE `MEDICINES` DISABLE KEYS */;
INSERT INTO `MEDICINES` VALUES ('PARACETAMOL',1011),('GLYcogen',1013),('Paracetamol',1014);
/*!40000 ALTER TABLE `MEDICINES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PATIENTS`
--

DROP TABLE IF EXISTS `PATIENTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PATIENTS` (
  `PAT_ID` int(50) NOT NULL AUTO_INCREMENT,
  `PAT_NAME` varchar(45) NOT NULL,
  `SEX` varchar(45) DEFAULT NULL,
  `ADDRESS` varchar(45) DEFAULT NULL,
  `BLOOD_GROUP` varchar(45) NOT NULL,
  `PHONENUMBER` varchar(45) NOT NULL,
  `AGE` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PAT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1020 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PATIENTS`
--

LOCK TABLES `PATIENTS` WRITE;
/*!40000 ALTER TABLE `PATIENTS` DISABLE KEYS */;
INSERT INTO `PATIENTS` VALUES (1001,'ARJUN RS','M','VADAKKRA','O+','9899888888',NULL,NULL,NULL),(1002,'AMITHA','F','KOTTARAKKARA','AB+','7654321098',NULL,NULL,NULL),(1003,'AFNAN','M','KOZHIKODE','B+','8765432109',NULL,NULL,NULL),(1004,'SRUHTI','F','TRV','A+','9887654567',NULL,NULL,NULL),(1005,'NEELIMA','F','KOZHIKODE','B-','8787654567',NULL,NULL,NULL),(1006,'ADVAITH','M','KANNUR','AB+','7678909876',NULL,NULL,NULL),(1007,'SARANYA','F','KOZHUKODE','O+','6574839823',NULL,NULL,NULL),(1008,'ANUJA','F','KOTTAYAM','O+','7869505435',NULL,NULL,NULL),(1009,'ARATHI','F','KOTTAYAM','O+','9087654321',NULL,NULL,NULL),(1010,'ARUN K','M','KOZHIKODE','A+','8907654321',NULL,NULL,NULL),(1011,'UTHARA','F','asdfghj','O+','6767564534','66','utharaprince2000@gmail.com',NULL),(1012,'MESSY','F','ASDFGHJ','O+','6767564534','43',NULL,NULL),(1013,'irfu','m','asdfgh','O+','7878787878','78',NULL,NULL),(1014,'Raj','M','house 345 california','O+','5667784534','54',NULL,NULL),(1015,'GLEN','M','DALLAS WEST','O+','5647685432','23',NULL,NULL),(1016,'ARSHA','F','kozhikode','O+','1231567812','21','O+',NULL),(1017,'AARON','M','NIAGRA','O+','6787980987','15','aaron@gmail.com','aaron'),(1018,'MESSY','F','NYC ','O+','8129611033','45','utharaprince2000@gmail.com','uthara'),(1019,'AMJAD','M','MALAPURAM','B+','1234567897','19','amjadpanjeeri@gmail.com','amjad');
/*!40000 ALTER TABLE `PATIENTS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SYMPTOMS`
--

DROP TABLE IF EXISTS `SYMPTOMS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SYMPTOMS` (
  `PATID` int(50) NOT NULL AUTO_INCREMENT,
  `SYMPTOM` varchar(200) NOT NULL,
  PRIMARY KEY (`PATID`)
) ENGINE=InnoDB AUTO_INCREMENT=1015 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SYMPTOMS`
--

LOCK TABLES `SYMPTOMS` WRITE;
/*!40000 ALTER TABLE `SYMPTOMS` DISABLE KEYS */;
INSERT INTO `SYMPTOMS` VALUES (1011,'bhdhhdj'),(1013,'bvjh'),(1014,'Fever cough running nose');
/*!40000 ALTER TABLE `SYMPTOMS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TESTS`
--

DROP TABLE IF EXISTS `TESTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TESTS` (
  `TESTID` int(50) NOT NULL,
  `TEST` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TESTID`),
  CONSTRAINT `MEDID` FOREIGN KEY (`TESTID`) REFERENCES `MEDICINES` (`MEDID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TESTS`
--

LOCK TABLES `TESTS` WRITE;
/*!40000 ALTER TABLE `TESTS` DISABLE KEYS */;
INSERT INTO `TESTS` VALUES (1011,'X-Ray'),(1013,'TRERE'),(1014,'blood test');
/*!40000 ALTER TABLE `TESTS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `register` (
  `RegisterID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  PRIMARY KEY (`RegisterID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` VALUES (1,'uthara','1234','utharaprince2000@gmail.com','6767676767'),(2,'athila','3456','athilarahim@gmail.com','7878899078'),(3,'Kevin','kevin','kevin@gmail.com','5678903456'),(4,'JUBIN','jubin','jubinkoruthu@gmail.com','2345678976'),(5,'JUBIN','jubin','jubinkoruthu@gmail.com','2345678976'),(6,'JUBIN','jubin','jubinkoruthu@gmail.com','2345678976'),(7,'JUBIN','jubin','jubinkoruthu@gmail.com','2345678976'),(8,'100','jubin','','');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
