/*
Navicat MySQL Data Transfer

Source Server         : m(5.2)127.0.0.1
Source Server Version : 50200
Source Host           : localhost:3306
Source Database       : xfxmcy

Target Server Type    : MYSQL
Target Server Version : 50200
File Encoding         : 65001

Date: 2014-04-08 11:19:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for derma
-- ----------------------------
DROP TABLE IF EXISTS `derma`;
CREATE TABLE `derma` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `hero_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ehw5ikwvw9lfjjgjiy4b07i3t` (`hero_id`),
  CONSTRAINT `FK_ehw5ikwvw9lfjjgjiy4b07i3t` FOREIGN KEY (`hero_id`) REFERENCES `hero` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of derma
-- ----------------------------

-- ----------------------------
-- Table structure for hero
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero` (
  `id` varchar(255) NOT NULL,
  `birthday` date DEFAULT NULL,
  `hname` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hero
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` varchar(255) NOT NULL,
  `text` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_mfpmj90sod7vi3i6vw40dmfho` (`pid`),
  CONSTRAINT `FK_mfpmj90sod7vi3i6vw40dmfho` FOREIGN KEY (`pid`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', 'parent', null, null);
INSERT INTO `menu` VALUES ('2', 'not click', null, '1');
INSERT INTO `menu` VALUES ('3', 'click', '/index.jsp', '2');
INSERT INTO `menu` VALUES ('4', 'not click', null, '1');
