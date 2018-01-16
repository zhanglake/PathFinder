/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : plutus_3

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2018-01-16 18:17:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bus_customer
-- ----------------------------
DROP TABLE IF EXISTS `bus_customer`;
CREATE TABLE `bus_customer` (
  `customer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(100) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` int(11) DEFAULT NULL,
  `contact` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `province` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_customer
-- ----------------------------
INSERT INTO `bus_customer` VALUES ('1', 'zzh', null, null, null, null, '0', 'zzh', '123', '321', '1', 'asdasd');
INSERT INTO `bus_customer` VALUES ('2', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('3', '张正华', '2018-01-12 15:50:16', '系统', '2018-01-12 15:50:16', '系统', '0', '张正华', '0510-85759680', '18601572590', '9', '无锡市');
INSERT INTO `bus_customer` VALUES ('4', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('5', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('6', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('7', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('8', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('9', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('10', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('11', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');
INSERT INTO `bus_customer` VALUES ('12', 'a', null, 'a', null, 'a', '0', 'a', 'a', 'a', '1', 'a');

-- ----------------------------
-- Table structure for bus_order
-- ----------------------------
DROP TABLE IF EXISTS `bus_order`;
CREATE TABLE `bus_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) DEFAULT NULL,
  `total_price` decimal(10,2) DEFAULT '0.00',
  `status` int(10) DEFAULT '0',
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` int(10) DEFAULT NULL,
  `order_code` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_order
-- ----------------------------
INSERT INTO `bus_order` VALUES ('1', '1', '190.00', '0', null, null, null, null, null, '12345678901');
INSERT INTO `bus_order` VALUES ('2', '1', '190.00', '0', null, null, null, null, null, '12345678902');
INSERT INTO `bus_order` VALUES ('3', '1', '190.00', '0', null, null, null, null, null, '12345678903');
INSERT INTO `bus_order` VALUES ('4', '1', '190.00', '0', null, null, null, null, null, '12345678904');
INSERT INTO `bus_order` VALUES ('5', '1', '190.00', '1', null, null, null, null, null, '12345678905');
INSERT INTO `bus_order` VALUES ('6', '1', '200.00', '4', null, null, null, null, null, '12345678906');
INSERT INTO `bus_order` VALUES ('7', '1', '100.00', '2', null, null, null, null, null, '12345678907');
INSERT INTO `bus_order` VALUES ('8', '1', '100.00', '3', null, null, null, null, null, '12345678908');

-- ----------------------------
-- Table structure for bus_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `bus_order_detail`;
CREATE TABLE `bus_order_detail` (
  `order_detail_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `count` int(20) DEFAULT '0',
  `price` decimal(10,2) DEFAULT '0.00',
  `count_price` decimal(10,2) DEFAULT '0.00',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_order_detail
-- ----------------------------
INSERT INTO `bus_order_detail` VALUES ('1', '1', '1', '1', '100.00', '100.00', null);
INSERT INTO `bus_order_detail` VALUES ('2', '2', '1', '1', '70.00', '70.00', null);
INSERT INTO `bus_order_detail` VALUES ('3', '13', '1', '1', '20.00', '20.00', null);
INSERT INTO `bus_order_detail` VALUES ('4', '1', '2', '1', '100.00', '100.00', null);
INSERT INTO `bus_order_detail` VALUES ('5', '2', '2', '1', '70.00', '70.00', null);
INSERT INTO `bus_order_detail` VALUES ('6', '13', '2', '1', '20.00', '20.00', null);
INSERT INTO `bus_order_detail` VALUES ('7', '1', '3', '1', '100.00', '100.00', null);
INSERT INTO `bus_order_detail` VALUES ('8', '2', '3', '1', '70.00', '70.00', null);
INSERT INTO `bus_order_detail` VALUES ('9', '13', '3', '1', '20.00', '20.00', null);
INSERT INTO `bus_order_detail` VALUES ('10', '1', '4', '1', '100.00', '100.00', null);
INSERT INTO `bus_order_detail` VALUES ('11', '2', '4', '1', '70.00', '70.00', null);
INSERT INTO `bus_order_detail` VALUES ('12', '13', '4', '1', '20.00', '20.00', null);
INSERT INTO `bus_order_detail` VALUES ('13', '1', '5', '1', '100.00', '100.00', null);
INSERT INTO `bus_order_detail` VALUES ('14', '2', '5', '1', '70.00', '70.00', null);
INSERT INTO `bus_order_detail` VALUES ('15', '13', '5', '1', '20.00', '20.00', null);
INSERT INTO `bus_order_detail` VALUES ('16', '1', '6', '2', '100.00', '200.00', null);
INSERT INTO `bus_order_detail` VALUES ('17', '1', '7', '1', '100.00', '100.00', null);
INSERT INTO `bus_order_detail` VALUES ('18', '1', '8', '1', '100.00', '100.00', null);

-- ----------------------------
-- Table structure for bus_product
-- ----------------------------
DROP TABLE IF EXISTS `bus_product`;
CREATE TABLE `bus_product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` int(11) DEFAULT '0',
  `available` int(11) DEFAULT '1',
  `price` decimal(10,2) DEFAULT '0.00',
  `stock` int(11) DEFAULT '0',
  `discount` decimal(10,2) DEFAULT '1.00',
  `description` varchar(255) DEFAULT NULL,
  `sale_price` decimal(10,2) DEFAULT '0.00',
  `type_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_product
-- ----------------------------
INSERT INTO `bus_product` VALUES ('1', '大面包', null, null, null, null, '0', '1', '100.00', '100', '0.90', 'aaa', '90.00', '1');
INSERT INTO `bus_product` VALUES ('2', '小面包', null, null, '2018-01-15 15:48:55', '系统', '0', '1', '70.00', '100', '1.00', 'bbb', '70.00', '1');
INSERT INTO `bus_product` VALUES ('5', 'hahah', '2018-01-15 13:47:36', '系统', '2018-01-15 15:48:46', '系统', '0', '1', '100.00', '100', '0.95', 'asdasd', '95.00', '2');
INSERT INTO `bus_product` VALUES ('6', 'hehea', '2018-01-15 13:52:50', '系统', '2018-01-15 15:48:41', '系统', '0', '1', '100.00', '100', '0.85', '111', '85.00', '2');
INSERT INTO `bus_product` VALUES ('7', '000', '2018-01-15 13:57:05', '系统', '2018-01-15 15:48:35', '系统', '0', '1', '10.00', '10', '0.95', 'asda', '9.50', '3');
INSERT INTO `bus_product` VALUES ('8', '法棍', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '3');
INSERT INTO `bus_product` VALUES ('9', '法棍1', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '4');
INSERT INTO `bus_product` VALUES ('10', '法棍2', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '4');
INSERT INTO `bus_product` VALUES ('11', '法棍3', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '5');
INSERT INTO `bus_product` VALUES ('12', '法棍4', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '5');
INSERT INTO `bus_product` VALUES ('13', '法棍5', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '1');
INSERT INTO `bus_product` VALUES ('14', '法棍6', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '2');
INSERT INTO `bus_product` VALUES ('15', '法棍7', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '3');
INSERT INTO `bus_product` VALUES ('16', '法棍8', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '4');
INSERT INTO `bus_product` VALUES ('17', '法棍9', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '5');
INSERT INTO `bus_product` VALUES ('18', '法棍10', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '1');
INSERT INTO `bus_product` VALUES ('19', '法棍11', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '2');
INSERT INTO `bus_product` VALUES ('20', '法棍12', '2018-01-15 15:50:52', '系统', '2018-01-15 15:50:52', '系统', '0', '1', '20.00', '100', '1.00', '无描述', '20.00', '3');

-- ----------------------------
-- Table structure for bus_product_pic
-- ----------------------------
DROP TABLE IF EXISTS `bus_product_pic`;
CREATE TABLE `bus_product_pic` (
  `product_id` bigint(20) NOT NULL,
  `file_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_product_pic
-- ----------------------------
INSERT INTO `bus_product_pic` VALUES ('1', '28');
INSERT INTO `bus_product_pic` VALUES ('2', '29');
INSERT INTO `bus_product_pic` VALUES ('3', '30');
INSERT INTO `bus_product_pic` VALUES ('4', '31');
INSERT INTO `bus_product_pic` VALUES ('5', '32');
INSERT INTO `bus_product_pic` VALUES ('6', '33');
INSERT INTO `bus_product_pic` VALUES ('7', '34');
INSERT INTO `bus_product_pic` VALUES ('8', '35');
INSERT INTO `bus_product_pic` VALUES ('9', '35');
INSERT INTO `bus_product_pic` VALUES ('10', '35');
INSERT INTO `bus_product_pic` VALUES ('11', '35');
INSERT INTO `bus_product_pic` VALUES ('12', '35');
INSERT INTO `bus_product_pic` VALUES ('13', '35');
INSERT INTO `bus_product_pic` VALUES ('14', '35');
INSERT INTO `bus_product_pic` VALUES ('15', '35');
INSERT INTO `bus_product_pic` VALUES ('16', '35');
INSERT INTO `bus_product_pic` VALUES ('17', '35');
INSERT INTO `bus_product_pic` VALUES ('18', '35');
INSERT INTO `bus_product_pic` VALUES ('19', '35');
INSERT INTO `bus_product_pic` VALUES ('20', '35');

-- ----------------------------
-- Table structure for bus_type
-- ----------------------------
DROP TABLE IF EXISTS `bus_type`;
CREATE TABLE `bus_type` (
  `type_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bus_type
-- ----------------------------
INSERT INTO `bus_type` VALUES ('1', '烘焙面包');
INSERT INTO `bus_type` VALUES ('2', '新鲜蛋糕');
INSERT INTO `bus_type` VALUES ('3', '手工泡芙');
INSERT INTO `bus_type` VALUES ('4', '精制点心');
INSERT INTO `bus_type` VALUES ('5', '手工定制');

-- ----------------------------
-- Table structure for sys_file
-- ----------------------------
DROP TABLE IF EXISTS `sys_file`;
CREATE TABLE `sys_file` (
  `file_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_file
-- ----------------------------
INSERT INTO `sys_file` VALUES ('28', '50c537b2e34bd6747543509ae45b6dfd.jpg', 'jpg', 'files/5e45e03e-9570-4e77-a630-a1abcf902ade.jpg', null);
INSERT INTO `sys_file` VALUES ('29', '631b93404c88ee343c900bedb742e541.jpg', 'jpg', 'files/036c1a79-aec7-4aa6-91cc-e9517e9f7b9b.jpg', null);
INSERT INTO `sys_file` VALUES ('30', 'a9fe65f336fec4ecc1426e1f263c06ca.jpg', 'jpg', 'files/9b55a2ee-8683-40d0-9937-351f1f728bb8.jpg', null);
INSERT INTO `sys_file` VALUES ('31', '50c537b2e34bd6747543509ae45b6dfd.jpg', 'jpg', 'files/769f917d-afb0-4f6f-bcb1-a1735b352f54.jpg', null);
INSERT INTO `sys_file` VALUES ('32', '631b93404c88ee343c900bedb742e541.jpg', 'jpg', 'files/2e312155-d6c5-491b-ad5c-79b79b2c5a30.jpg', null);
INSERT INTO `sys_file` VALUES ('33', 'a9fe65f336fec4ecc1426e1f263c06ca.jpg', 'jpg', 'files/6e05dbc5-384b-4bc5-93ec-19beccdfb107.jpg', null);
INSERT INTO `sys_file` VALUES ('34', '631b93404c88ee343c900bedb742e541.jpg', 'jpg', 'files/cfd6dae9-9dcd-4d5c-b31b-283a938c2a67.jpg', null);
INSERT INTO `sys_file` VALUES ('35', 'a9fe65f336fec4ecc1426e1f263c06ca.jpg', 'jpg', 'files/e3060917-4f07-491a-adcc-d31ccc669a00.jpg', null);

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(10) NOT NULL,
  `menu_name` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `sort` int(10) DEFAULT NULL,
  `parent_id` bigint(10) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '首页', '/home', '100', null, '首页');
INSERT INTO `sys_menu` VALUES ('2', '系统管理', '/system', '200', null, '系统管理');
INSERT INTO `sys_menu` VALUES ('3', '销售管理', '/sale', '300', null, '销售管理');
INSERT INTO `sys_menu` VALUES ('20', '用户管理', '/system/user', '2000', '2', '系统管理 / 用户管理');
INSERT INTO `sys_menu` VALUES ('21', '角色管理', '/system/role', '2001', '2', '系统管理 / 角色管理');
INSERT INTO `sys_menu` VALUES ('30', '销售主页', '/sale/list', '3000', '3', '销售管理 / 销售主页');
INSERT INTO `sys_menu` VALUES ('31', '客户信息', '/sale/customer', '3001', '3', '销售管理 / 客户信息');
INSERT INTO `sys_menu` VALUES ('32', '订单管理', '/sale/order', '3002', '3', '销售管理 / 订单管理');
INSERT INTO `sys_menu` VALUES ('33', '产品管理', '/sale/product', '3003', '3', '销售管理 / 产品管理');

-- ----------------------------
-- Table structure for sys_organization
-- ----------------------------
DROP TABLE IF EXISTS `sys_organization`;
CREATE TABLE `sys_organization` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT '0',
  `name` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_sys_organization_parent_id` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_organization
-- ----------------------------
INSERT INTO `sys_organization` VALUES ('1', null, null, null, null, '0', '组织1', '0');
INSERT INTO `sys_organization` VALUES ('2', null, null, null, null, '0', '组织2', '0');
INSERT INTO `sys_organization` VALUES ('3', null, null, null, null, '0', '组织3', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT '0',
  `role_name` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '2017-09-07 14:15:27', '', '2017-10-26 11:48:11', '系统修改', '0', 'admin', '超级管理员123', '1');
INSERT INTO `sys_role` VALUES ('15', null, null, null, null, '0', '1234', '123', '1');
INSERT INTO `sys_role` VALUES ('16', null, null, null, null, '0', '555', '555', '1');
INSERT INTO `sys_role` VALUES ('17', '2017-09-07 14:18:38', '系统', '2017-09-07 14:18:38', '系统', '0', '888', '888', '1');
INSERT INTO `sys_role` VALUES ('20', '2017-09-07 16:39:10', '系统', '2017-09-07 16:39:10', '系统', '0', '765', '765', '1');
INSERT INTO `sys_role` VALUES ('21', '2017-09-07 16:44:27', '系统', '2017-09-07 16:44:27', '系统', '0', 'asd', 'asd', '1');
INSERT INTO `sys_role` VALUES ('22', '2017-09-07 16:45:25', '系统', '2017-09-07 16:45:25', '系统', '0', '自行车', '自行车', '1');
INSERT INTO `sys_role` VALUES ('23', '2017-09-07 16:45:37', '系统', '2017-09-07 16:45:37', '系统', '0', '自行车', '自行车', '1');
INSERT INTO `sys_role` VALUES ('24', '2017-09-07 16:46:25', '系统', '2017-09-07 16:46:25', '系统', '0', '匆匆', '匆匆', '1');
INSERT INTO `sys_role` VALUES ('25', '2017-09-07 16:49:15', '系统', '2017-09-07 16:49:15', '系统', '0', 'cc', 'cc', '1');
INSERT INTO `sys_role` VALUES ('26', '2017-09-07 16:49:33', '系统', '2017-09-07 16:49:33', '系统', '0', 'vv', 'vv', '1');
INSERT INTO `sys_role` VALUES ('27', '2017-09-07 16:51:09', '系统', '2017-09-07 16:51:09', '系统', '0', 'vvvv', 'vvvv', '1');
INSERT INTO `sys_role` VALUES ('28', '2017-09-07 16:52:04', '系统', '2017-09-07 16:52:04', '系统', '0', 'bb', 'bb', '1');
INSERT INTO `sys_role` VALUES ('29', '2017-09-07 16:53:03', '系统', '2017-09-07 16:53:03', '系统', '0', 'vv', 'vvvv', '1');
INSERT INTO `sys_role` VALUES ('30', '2017-09-07 16:54:38', '系统', '2017-09-07 16:54:38', '系统', '0', 'jj', 'jj', '1');
INSERT INTO `sys_role` VALUES ('31', '2017-09-07 16:55:53', '系统', '2017-09-07 16:55:53', '系统', '0', 'ii', 'ii', '1');
INSERT INTO `sys_role` VALUES ('32', '2017-09-07 16:58:07', '系统', '2017-09-07 16:58:07', '系统', '0', 'mm', 'mm', '1');
INSERT INTO `sys_role` VALUES ('33', '2017-09-08 09:30:36', '系统', '2017-09-08 09:30:36', '系统', '0', '组织管理员1', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('34', '2017-09-08 09:31:57', '系统', '2017-09-08 09:31:57', '系统', '0', '组织管理员2', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('35', '2017-09-08 09:33:23', '系统', '2017-09-08 09:33:23', '系统', '0', '组织管理员3', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('36', '2017-10-14 10:48:57', '系统', '2017-10-14 10:48:57', '系统', '0', '组织管理员4', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('37', '2017-10-14 10:49:07', '系统', '2017-10-14 10:49:07', '系统', '0', '1231', '123', '1');
INSERT INTO `sys_role` VALUES ('38', '2017-10-14 10:49:17', '系统', '2017-10-14 10:49:17', '系统', '0', '123141', '123', '1');
INSERT INTO `sys_role` VALUES ('39', '2017-10-14 10:49:37', '系统', '2017-10-14 11:35:33', '系统修改', '0', '组织管理员5', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('40', '2017-10-14 10:51:16', '系统', '2017-10-14 10:51:16', '系统', '0', '组织管理员6', '组织管理员', '0');
INSERT INTO `sys_role` VALUES ('41', '2017-10-14 10:51:28', '系统', '2017-10-14 10:51:28', '系统', '1', '1233', '123', '1');
INSERT INTO `sys_role` VALUES ('42', '2017-10-14 11:04:35', '系统', '2017-10-14 11:04:35', '系统', '1', '', '', '0');
INSERT INTO `sys_role` VALUES ('43', '2017-10-14 11:15:59', '系统', '2017-10-14 11:15:59', '系统', '0', '组织管理员8', '组织管理员', '0');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `role_id` bigint(20) NOT NULL,
  `menu_id` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '2');
INSERT INTO `sys_role_menu` VALUES ('1', '3');
INSERT INTO `sys_role_menu` VALUES ('1', '20');
INSERT INTO `sys_role_menu` VALUES ('1', '21');
INSERT INTO `sys_role_menu` VALUES ('1', '22');
INSERT INTO `sys_role_menu` VALUES ('1', '23');
INSERT INTO `sys_role_menu` VALUES ('1', '1');
INSERT INTO `sys_role_menu` VALUES ('1', '30');
INSERT INTO `sys_role_menu` VALUES ('1', '31');
INSERT INTO `sys_role_menu` VALUES ('1', '32');
INSERT INTO `sys_role_menu` VALUES ('1', '33');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT '0',
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `organization_id` bigint(20) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `idx_sys_user_username` (`username`),
  KEY `idx_sys_user_organization_id` (`organization_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '2017-09-05 11:30:23', '系统初始化', '2017-11-17 10:39:11', '系统', '0', 'admin', 'd3c59d25033dbf980d29554025c23a75', '1', '8d78869f470951332959580424d4bf4f', '0');
INSERT INTO `sys_user` VALUES ('2', null, null, null, null, '1', 'aaa', 'asdasdasd', '2', 'asdsad', '1');
INSERT INTO `sys_user` VALUES ('3', null, null, null, null, '1', 'zxxc', 'asdsad', '2', 'asdas', '0');
INSERT INTO `sys_user` VALUES ('4', null, null, null, null, '1', 'saf', 'asdas', '3', 'asfas', '0');
INSERT INTO `sys_user` VALUES ('5', '2017-11-20 11:43:20', '系统', '2017-11-20 11:43:20', '系统', '0', 'zzh', 'b989242b9b2a71fd9461a085d93a16ff', '1', '70d5778e03ee051fea1412ba33512b73', '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('1', '17');
INSERT INTO `sys_user_role` VALUES ('1', '16');
INSERT INTO `sys_user_role` VALUES ('1', '15');
INSERT INTO `sys_user_role` VALUES ('5', '1');
