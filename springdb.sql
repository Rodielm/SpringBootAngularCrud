/*
Navicat MySQL Data Transfer

Source Server         : Local
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : springdb

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-05-08 09:33:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contacts
-- ----------------------------
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `idcontact` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `address` text,
  `phone` varchar(255) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idcontact`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contacts
-- ----------------------------
INSERT INTO `contacts` VALUES ('12', 'Jose Mario', 'Martinez Jimenez', 'Calle Mentsd', '8097642321', '2017-05-07 15:52:16');
INSERT INTO `contacts` VALUES ('13', 'Ana Maria', 'Mendez', 'Calle la rosa', '8093234545', '2017-05-08 09:32:42');
