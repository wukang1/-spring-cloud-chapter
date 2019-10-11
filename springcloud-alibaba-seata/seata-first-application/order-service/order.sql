
DROP TABLE IF EXISTS `seata_order`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `seata_order` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_good_id` int(11) DEFAULT NULL,
  `o_account_id` int(11) DEFAULT NULL,
  `o_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='订单表';