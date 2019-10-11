DROP TABLE IF EXISTS `seata_account`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `seata_account` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账户编号',
  `a_money` decimal(10,2) DEFAULT NULL COMMENT '余额',
  `a_create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `a_mark` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='账户信息表';


LOCK TABLES `seata_account` WRITE;
INSERT INTO `seata_account` VALUES (1,10000.00,'2019-10-11 02:37:35',NULL);
UNLOCK TABLES;