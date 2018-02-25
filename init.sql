-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
--
-- Host: localhost    Database: guangximobile
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `business` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '业务id 主键',
  `Seller_phone` char(11) DEFAULT NULL COMMENT '销售电话',
  `Cus_phone` char(11) DEFAULT NULL COMMENT '客户电话',
  `Pro_name` varchar(50) DEFAULT NULL COMMENT '业务名',
  `bus_type` varchar(50) DEFAULT NULL COMMENT '业务类型',
  `Bus_open` date DEFAULT NULL COMMENT '创建时间',
  `Bus_close` date DEFAULT NULL COMMENT '结束时间',
  `Seller_id` int(11) DEFAULT NULL COMMENT '销售id',
  `bus_status` varchar(50) DEFAULT NULL COMMENT '业务状态',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_11` (`Seller_id`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`Seller_id`) REFERENCES `seller` (`Seller_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='业务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business`
--

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
INSERT INTO `business` VALUES (1,'123','456','飞信','手机端','2017-08-01','2017-08-31',1,NULL),(2,'123','789','飞信','手机端','2017-06-01','2017-10-31',1,NULL),(3,'123','566565','手机动漫','手机端','2017-08-31','2017-08-16',1,NULL),(4,'456','123123123','体育周报','手机端','2017-08-01','2017-11-09',2,NULL),(5,'456','12399999','动漫空间','手机端','2017-08-01','2017-08-30',2,NULL),(6,'456','6666','动漫空间','手机端','2017-06-06','2017-10-05',2,NULL);
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardno`
--

DROP TABLE IF EXISTS `cardno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstNO` int(3) NOT NULL,
  `middleNO` int(4) DEFAULT NULL,
  `endNo` int(4) DEFAULT NULL,
  `joinerId` int(11) DEFAULT NULL COMMENT '代理商id外键',
  `sellerId` int(11) DEFAULT NULL COMMENT '销售员id外键',
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '0未开户,1已开户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardno`
--

LOCK TABLES `cardno` WRITE;
/*!40000 ALTER TABLE `cardno` DISABLE KEYS */;
/*!40000 ALTER TABLE `cardno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `organ_id` int(11) DEFAULT NULL COMMENT '组织id',
  `job` varchar(50) DEFAULT NULL COMMENT '职位',
  `name` char(2) DEFAULT NULL COMMENT '姓名',
  `sex` char(11) DEFAULT NULL COMMENT '性别',
  `phone` varchar(50) DEFAULT NULL COMMENT '电话',
  `doc_type` varchar(50) DEFAULT NULL COMMENT '证件类型',
  `doc_number` varchar(50) DEFAULT NULL COMMENT '证件号码',
  `agent_name` varchar(50) DEFAULT NULL COMMENT '代理名称',
  `loc` varchar(50) DEFAULT NULL COMMENT '地址',
  `bank_name` varchar(50) DEFAULT NULL COMMENT '开户行',
  `bank_number` varchar(50) DEFAULT NULL COMMENT '银行卡号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_5` (`user_id`),
  KEY `FK_Reference_4` (`organ_id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`organ_id`) REFERENCES `organ` (`organ_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8 COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1000,1,'经理','李聪','男','123123123','身份证','1165156153','安抚','湖南','中国银行','16555156',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jo_level`
--

DROP TABLE IF EXISTS `jo_level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jo_level` (
  `jo_level_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '代理商ID 主键',
  `jo_level_name` varchar(50) DEFAULT NULL COMMENT '代理商名称',
  `jo_level_explain` varchar(1024) DEFAULT NULL COMMENT '代理商注释',
  PRIMARY KEY (`jo_level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='代理商表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jo_level`
--

LOCK TABLES `jo_level` WRITE;
/*!40000 ALTER TABLE `jo_level` DISABLE KEYS */;
INSERT INTO `jo_level` VALUES (1,'一级代理商','一级代理商，由移动直接进行审核'),(2,'二级代理商',NULL),(3,'三级代理商',NULL);
/*!40000 ALTER TABLE `jo_level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `joiner`
--

DROP TABLE IF EXISTS `joiner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `joiner` (
  `joiner_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '加盟商id 主键',
  `joiner_name` varchar(50) DEFAULT NULL COMMENT '加盟商名称',
  `organ_id` int(11) DEFAULT NULL COMMENT '组织id',
  `joiner_loc` varchar(50) DEFAULT NULL COMMENT '加盟商地址',
  `joiner_linkname` varchar(50) DEFAULT NULL COMMENT '加盟商联系人',
  `joiner_phone` char(11) DEFAULT NULL COMMENT '加盟商电话',
  `joiner_email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `joiner_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `joiner_bank` varchar(50) DEFAULT NULL COMMENT '银行卡',
  `joiner_holder` varchar(50) DEFAULT NULL COMMENT '银行卡持有者',
  `joiner_banknum` varchar(50) DEFAULT NULL COMMENT '卡号',
  `joiner_explain` varchar(1024) DEFAULT NULL COMMENT '加盟说明',
  `jo_level_id` int(11) DEFAULT NULL COMMENT '加盟商级别',
  `jo_heigher_id` int(11) DEFAULT NULL COMMENT '隶属组织id',
  `joiner_date` date DEFAULT NULL COMMENT '加盟日期',
  `user_id` int(11) DEFAULT NULL COMMENT '所属用户id',
  `joiner_status` char(1) DEFAULT '0' COMMENT '状态',
  `joiner_remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`joiner_id`),
  KEY `FK_Reference_8` (`user_id`),
  KEY `FK_Reference_6` (`organ_id`),
  KEY `FK_Reference_7` (`jo_level_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`organ_id`) REFERENCES `organ` (`organ_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`jo_level_id`) REFERENCES `jo_level` (`jo_level_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='加盟商';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `joiner`
--

LOCK TABLES `joiner` WRITE;
/*!40000 ALTER TABLE `joiner` DISABLE KEYS */;
INSERT INTO `joiner` VALUES (1,'长沙移动',1,'长沙市','一级代理商','1231231',NULL,'长沙市','中国银行','',NULL,NULL,1,NULL,'2017-08-02',2,'1',NULL),(2,'长沙岳麓区移动',2,'岳麓区','二级代理商','1231231',NULL,'岳麓区',NULL,NULL,NULL,NULL,2,1,'2017-08-16',3,'1',NULL);
/*!40000 ALTER TABLE `joiner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organ`
--

DROP TABLE IF EXISTS `organ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organ` (
  `organ_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '组织id 主键',
  `organ_heigh` varchar(50) DEFAULT NULL COMMENT '组织等级',
  `organ_name` varchar(50) DEFAULT NULL COMMENT '组织名称',
  `organ_type` varchar(50) DEFAULT NULL COMMENT '组织类型',
  `organ_loc` varchar(50) DEFAULT NULL COMMENT '组织地址',
  `organ_dir` varchar(50) DEFAULT NULL COMMENT '组织负责人',
  `organ_linkman` varchar(50) DEFAULT NULL COMMENT '组织联系人',
  `organ_phone` char(11) DEFAULT NULL COMMENT '组织电话',
  `organ_explain` varchar(1024) DEFAULT NULL COMMENT '组织备注',
  PRIMARY KEY (`organ_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='组织表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organ`
--

LOCK TABLES `organ` WRITE;
/*!40000 ALTER TABLE `organ` DISABLE KEYS */;
INSERT INTO `organ` VALUES (1,'','湖南移动','','湖南','付洲','咪咪','156151651','省级组织'),(2,'1','长沙移动','','长沙市','鲁靖','鲁盖盖','156165','市级组织'),(3,'1','株洲移动',NULL,'株洲市','张尧','米后','16516523','市级组织'),(4,'2','天心区移动',NULL,'天心区','李坤','丽丽','156189','区级组织'),(5,'3','天元区移动',NULL,'天元区','何佳杰','速度','16515','区级组织');
/*!40000 ALTER TABLE `organ` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品id',
  `pro_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `Pro_type` varchar(50) DEFAULT NULL COMMENT '产品类别',
  `Pro_cost` varchar(50) DEFAULT NULL COMMENT '产品资费',
  `Pro_loc` varchar(100) DEFAULT NULL,
  `Pro_img` varchar(200) DEFAULT NULL COMMENT '产品图片',
  `Pro_first` double DEFAULT NULL,
  `Pro_month` double DEFAULT NULL,
  `Pro_link` varchar(1024) DEFAULT NULL,
  `Pro_out` varchar(1024) DEFAULT NULL,
  `Pro_status` char(1) DEFAULT '0',
  `Pro_date` date DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='产品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1000,'飞信','短信类','5元/月','',NULL,1,0.3,'',NULL,'1','2017-08-01'),(1001,'手机动漫','彩信类','16元/月',NULL,NULL,2,0.3,NULL,NULL,'1','2017-08-02'),(1002,'动漫空间','彩信类','5元/月',NULL,NULL,1,0.2,NULL,NULL,'1','2017-08-03'),(1003,'体育周刊','短信类','5元/月',NULL,NULL,1,0.2,NULL,NULL,'0','2017-08-04');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seller`
--

DROP TABLE IF EXISTS `seller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seller` (
  `Seller_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '营业员id 主键',
  `seller_phone` varchar(20) DEFAULT NULL COMMENT '营业员电话',
  `Seller_name` varchar(50) DEFAULT NULL COMMENT '营业员名字',
  `joiner_id` int(11) DEFAULT NULL COMMENT '隶属加盟商',
  `user_id` int(11) DEFAULT NULL COMMENT '关联的用户id',
  `Seller_sex` char(2) DEFAULT NULL COMMENT '营业员性别',
  `Seller_card` varchar(50) DEFAULT NULL COMMENT '营业员证件',
  `Seller_cardnum` char(18) DEFAULT NULL COMMENT '证件号',
  `Seller_remark` varchar(1024) DEFAULT NULL COMMENT '备注',
  `Seller_date` date DEFAULT NULL COMMENT '''',
  `Seller_loc` varchar(1024) DEFAULT NULL COMMENT '营业员地址',
  PRIMARY KEY (`Seller_id`),
  KEY `FK_Reference_10` (`user_id`),
  KEY `FK_Reference_9` (`joiner_id`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`joiner_id`) REFERENCES `joiner` (`joiner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='营业员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seller`
--

LOCK TABLES `seller` WRITE;
/*!40000 ALTER TABLE `seller` DISABLE KEYS */;
INSERT INTO `seller` VALUES (1,'123','直销员1号',1,4,NULL,NULL,NULL,NULL,'2017-08-10','长沙市'),(2,'456','直销员2号',2,5,NULL,NULL,NULL,NULL,'2017-08-01','长沙市');
/*!40000 ALTER TABLE `seller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_menu`
--

DROP TABLE IF EXISTS `sys_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `menu_parent_id` int(11) DEFAULT NULL COMMENT '父级编号',
  `seq` int(11) DEFAULT NULL COMMENT '顺序',
  `menu_name` varchar(50) DEFAULT NULL COMMENT '标题',
  `menu_descn` varchar(400) DEFAULT NULL COMMENT '说明',
  `menu_link_url` varchar(200) DEFAULT NULL COMMENT '转向地址',
  `menu_status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_menu`
--

LOCK TABLES `sys_menu` WRITE;
/*!40000 ALTER TABLE `sys_menu` DISABLE KEYS */;
INSERT INTO `sys_menu` VALUES (1,NULL,100,'系统管理','系统管理',NULL,'1'),(2,1,101,'菜单管理','菜单管理','menulist.jsp','1'),(3,1,102,'角色管理','角色管理','rolelist.jsp','1'),(4,1,103,'用户管理','用户管理','userlist.jsp','1');
/*!40000 ALTER TABLE `sys_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_menu_role`
--

DROP TABLE IF EXISTS `sys_menu_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_menu_role` (
  `menu_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  KEY `FK_Reference_3` (`role_id`),
  KEY `FK_Reference_12` (`menu_id`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`menu_id`) REFERENCES `sys_menu` (`menu_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_menu_role`
--

LOCK TABLES `sys_menu_role` WRITE;
/*!40000 ALTER TABLE `sys_menu_role` DISABLE KEYS */;
INSERT INTO `sys_menu_role` VALUES (1,1),(2,1),(3,1),(4,1);
/*!40000 ALTER TABLE `sys_menu_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) DEFAULT NULL,
  `role_desc` varchar(200) DEFAULT NULL,
  `role_code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` VALUES (1,'系统管理员','系统管理员','ROLE-001');
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_password` varchar(50) DEFAULT NULL,
  `user_flag` char(1) DEFAULT '1',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES (1,'admin','21232F297A5','1'),(2,'joiner1','21232F297A5','1'),(3,'joiner2','21232F297A5','1'),(4,'saller1','21232F297A5','1'),(5,'saller2','21232F297A5','1');
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role`
--

DROP TABLE IF EXISTS `sys_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_role` (
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  KEY `FK_Reference_1` (`user_id`),
  KEY `FK_Reference_2` (`role_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role`
--

LOCK TABLES `sys_user_role` WRITE;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;
INSERT INTO `sys_user_role` VALUES (1,1);
/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-25 20:43:21
