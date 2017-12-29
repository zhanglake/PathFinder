/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : plutus_3

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-12-29 14:10:08
*/

SET FOREIGN_KEY_CHECKS=0;

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
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `resource_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(100) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `modified_by` varchar(100) DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT '0',
  `resource_name` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`resource_id`),
  KEY `idx_sys_resource_parent_id` (`parent_id`),
  KEY `idx_sys_resource_parent_ids` (`parent_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '2017-09-05 11:32:31', '', '2017-09-05 11:32:31', '', '0', '资源', 'menu', '', '0', '0/', '', '1');
INSERT INTO `sys_resource` VALUES ('11', '2017-09-05 11:32:31', '', '2017-09-05 11:32:31', '', '0', '组织机构管理', 'menu', '/organization', '1', '0/1/', 'organization:*', '1');
INSERT INTO `sys_resource` VALUES ('12', '2017-09-05 11:32:31', '', '2017-09-05 11:32:31', '', '0', '组织机构新增', 'button', '', '11', '0/1/11/', 'organization:create', '1');
INSERT INTO `sys_resource` VALUES ('13', '2017-09-05 11:32:31', '', '2017-09-05 11:32:31', '', '0', '组织机构修改', 'button', '', '11', '0/1/11/', 'organization:update', '1');
INSERT INTO `sys_resource` VALUES ('14', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '组织机构删除', 'button', '', '11', '0/1/11/', 'organization:delete', '1');
INSERT INTO `sys_resource` VALUES ('15', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '组织机构查看', 'button', '', '11', '0/1/11/', 'organization:view', '1');
INSERT INTO `sys_resource` VALUES ('21', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '用户管理', 'menu', '/user', '1', '0/1/', 'user:*', '1');
INSERT INTO `sys_resource` VALUES ('22', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '用户新增', 'button', '', '21', '0/1/21/', 'user:create', '1');
INSERT INTO `sys_resource` VALUES ('23', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '用户修改', 'button', '', '21', '0/1/21/', 'user:update', '1');
INSERT INTO `sys_resource` VALUES ('24', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '用户删除', 'button', '', '21', '0/1/21/', 'user:delete', '1');
INSERT INTO `sys_resource` VALUES ('25', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '用户查看', 'button', '', '21', '0/1/21/', 'user:view', '1');
INSERT INTO `sys_resource` VALUES ('31', '2017-09-05 11:32:32', '', '2017-09-05 11:32:32', '', '0', '资源管理', 'menu', '/resource', '1', '0/1/', 'resource:*', '1');
INSERT INTO `sys_resource` VALUES ('32', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '资源新增', 'button', '', '31', '0/1/31/', 'resource:create', '1');
INSERT INTO `sys_resource` VALUES ('33', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '资源修改', 'button', '', '31', '0/1/31/', 'resource:update', '1');
INSERT INTO `sys_resource` VALUES ('34', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '资源删除', 'button', '', '31', '0/1/31/', 'resource:delete', '1');
INSERT INTO `sys_resource` VALUES ('35', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '资源查看', 'button', '', '31', '0/1/31/', 'resource:view', '1');
INSERT INTO `sys_resource` VALUES ('41', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '角色管理', 'menu', '/role', '1', '0/1/', 'role:*', '1');
INSERT INTO `sys_resource` VALUES ('42', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '角色新增', 'button', '', '41', '0/1/41/', 'role:create', '1');
INSERT INTO `sys_resource` VALUES ('43', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '角色修改', 'button', '', '41', '0/1/41/', 'role:update', '1');
INSERT INTO `sys_resource` VALUES ('44', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '角色删除', 'button', '', '41', '0/1/41/', 'role:delete', '1');
INSERT INTO `sys_resource` VALUES ('45', '2017-09-05 11:32:33', '', '2017-09-05 11:32:33', '', '0', '角色查看', 'button', '', '41', '0/1/41/', 'role:view', '1');
INSERT INTO `sys_resource` VALUES ('46', '2017-10-26 12:44:22', '系统', '2017-10-26 12:44:22', '系统', '1', '123', 'menu', '123', '1', null, '123', '1');
INSERT INTO `sys_resource` VALUES ('47', '2017-10-31 10:09:22', '系统', '2017-10-31 10:09:22', '系统', '1', '123', 'button', '123', '1', null, '123', '1');
INSERT INTO `sys_resource` VALUES ('48', '2017-10-31 10:25:04', '系统', '2017-10-31 15:44:51', '系统修改', '1', '1231', 'menu', '123', '1', null, '123', '1');
INSERT INTO `sys_resource` VALUES ('50', '2017-10-31 15:45:41', '系统', '2017-10-31 15:45:41', '系统', '1', '123', 'menu', '1', '1', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('51', '2017-10-31 15:46:36', '系统', '2017-10-31 15:46:36', '系统', '1', '1', 'menu', '1', '1', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('52', '2017-11-01 16:30:51', '系统', '2017-11-01 16:30:51', '系统', '0', '123', 'menu', '123', '1', null, '123', '1');

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
INSERT INTO `sys_role` VALUES ('38', '2017-10-14 10:49:17', '系统', '2017-10-14 10:49:17', '系统', '0', '1232', '123', '1');
INSERT INTO `sys_role` VALUES ('39', '2017-10-14 10:49:37', '系统', '2017-10-14 11:35:33', '系统修改', '0', '组织管理员5', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('40', '2017-10-14 10:51:16', '系统', '2017-10-14 10:51:16', '系统', '0', '组织管理员6', '组织管理员', '1');
INSERT INTO `sys_role` VALUES ('41', '2017-10-14 10:51:28', '系统', '2017-10-14 10:51:28', '系统', '1', '1233', '123', '1');
INSERT INTO `sys_role` VALUES ('42', '2017-10-14 11:04:35', '系统', '2017-10-14 11:04:35', '系统', '0', '组织管理员7', '组织管理员', '0');
INSERT INTO `sys_role` VALUES ('43', '2017-10-14 11:15:59', '系统', '2017-10-14 11:15:59', '系统', '0', '组织管理员8', '组织管理员', '0');

-- ----------------------------
-- Table structure for sys_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource`;
CREATE TABLE `sys_role_resource` (
  `role_id` bigint(20) DEFAULT NULL,
  `resource_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_resource
-- ----------------------------
INSERT INTO `sys_role_resource` VALUES ('15', '11');
INSERT INTO `sys_role_resource` VALUES ('15', '21');
INSERT INTO `sys_role_resource` VALUES ('15', '31');
INSERT INTO `sys_role_resource` VALUES ('15', '41');
INSERT INTO `sys_role_resource` VALUES ('16', '11');
INSERT INTO `sys_role_resource` VALUES ('16', '21');
INSERT INTO `sys_role_resource` VALUES ('16', '31');
INSERT INTO `sys_role_resource` VALUES ('16', '41');
INSERT INTO `sys_role_resource` VALUES ('17', '11');
INSERT INTO `sys_role_resource` VALUES ('17', '21');
INSERT INTO `sys_role_resource` VALUES ('17', '31');
INSERT INTO `sys_role_resource` VALUES ('17', '41');
INSERT INTO `sys_role_resource` VALUES ('35', '11');
INSERT INTO `sys_role_resource` VALUES ('36', '11');
INSERT INTO `sys_role_resource` VALUES ('36', '21');
INSERT INTO `sys_role_resource` VALUES ('36', '31');
INSERT INTO `sys_role_resource` VALUES ('36', '41');
INSERT INTO `sys_role_resource` VALUES ('37', '11');
INSERT INTO `sys_role_resource` VALUES ('37', '21');
INSERT INTO `sys_role_resource` VALUES ('37', '31');
INSERT INTO `sys_role_resource` VALUES ('37', '41');
INSERT INTO `sys_role_resource` VALUES ('38', '12');
INSERT INTO `sys_role_resource` VALUES ('38', '13');
INSERT INTO `sys_role_resource` VALUES ('38', '14');
INSERT INTO `sys_role_resource` VALUES ('38', '21');
INSERT INTO `sys_role_resource` VALUES ('38', '31');
INSERT INTO `sys_role_resource` VALUES ('38', '41');
INSERT INTO `sys_role_resource` VALUES ('39', '11');
INSERT INTO `sys_role_resource` VALUES ('39', '21');
INSERT INTO `sys_role_resource` VALUES ('39', '31');
INSERT INTO `sys_role_resource` VALUES ('44', '21');
INSERT INTO `sys_role_resource` VALUES ('44', '32');
INSERT INTO `sys_role_resource` VALUES ('44', '33');
INSERT INTO `sys_role_resource` VALUES ('44', '44');
INSERT INTO `sys_role_resource` VALUES ('44', '45');
INSERT INTO `sys_role_resource` VALUES ('1', '11');
INSERT INTO `sys_role_resource` VALUES ('1', '21');
INSERT INTO `sys_role_resource` VALUES ('1', '31');
INSERT INTO `sys_role_resource` VALUES ('1', '41');

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
