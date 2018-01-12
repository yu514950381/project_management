/*
Navicat MySQL Data Transfer

Source Server         : kdpm
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : kdpm

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-11 22:22:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dict`
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `dict_id` varchar(32) NOT NULL,
  `dict_column` varchar(255) NOT NULL,
  `dict_key` varchar(255) NOT NULL,
  `dict_value` varchar(255) NOT NULL,
  `dict_sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dict
-- ----------------------------
INSERT INTO `dict` VALUES ('1L', 'projectstate', '0', '未完成', '10');
INSERT INTO `dict` VALUES ('2L', 'projectstate', '1', '已完成', '20');
INSERT INTO `dict` VALUES ('3L', 'projectstate', '2', '未开始', '30');
INSERT INTO `dict` VALUES ('4L', 'projectstate', '3', '进行中', '40');
INSERT INTO `dict` VALUES ('5L', 'projecttype', '0', '长期项目', '10');
INSERT INTO `dict` VALUES ('6L', 'projecttype', '1', '短期项目', '20');
INSERT INTO `dict` VALUES ('7L', 'projecttype', '2', '维护项目', '30');


-- ----------------------------
-- Table structure for `menutable`
-- ----------------------------
DROP TABLE IF EXISTS `menutable`;
CREATE TABLE `menutable` (
  `menu_id` varchar(32) NOT NULL,
  `menu_name` varchar(255) NOT NULL,
  `menu_number` varchar(255) NOT NULL,
  `menu_belong` varchar(255) NOT NULL,
  `menu_sort` int(7) NOT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menutable
-- ----------------------------

-- ----------------------------
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `project_id` varchar(32) NOT NULL,
  `project_name` varchar(255) NOT NULL,
  `project_type` varchar(255) NOT NULL,
  `project_date_begin` datetime NOT NULL,
  `project_date_over` datetime NOT NULL,
  `project_working_days` int(11) NOT NULL,
  `project_state` varchar(255) DEFAULT NULL,
  `project_describe` text,
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('10L', '飞马项目管理2a', '0', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('11L', '飞马项目管理dfa', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '2', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('12L', '飞马项目管理as4', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '32', '3', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('13L', '飞马项目asd管理as5', '0', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('14L', '飞马项目管asd理6', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('15L', '飞马项目管asd理7', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('1L', '飞马项目管理', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '3', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('2L', '飞马项目管理2', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '2', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('3L', '飞马项目管理3', '0', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('4L', '飞马项目管理4', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('5L', '飞马项目管理5', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('6L', '飞马项目管理6', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '2', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('7L', '飞马项目管理7', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('8L', '飞马项目管理1', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('9L', '飞马项目管理as', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
