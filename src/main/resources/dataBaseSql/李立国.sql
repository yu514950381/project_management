/*
Navicat MySQL Data Transfer

Source Server         : kdpm
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : kdpm

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-12 15:35:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dict`
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `Dict_Id` varchar(32) NOT NULL,
  `Dict_Column` varchar(255) NOT NULL,
  `Dict_Key` varchar(255) NOT NULL,
  `Dict_Value` varchar(255) NOT NULL,
  `Sort` bigint(20) NOT NULL,
  PRIMARY KEY (`Dict_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dict
-- ----------------------------
INSERT INTO `dict` VALUES ('10Y', 'OPERATION', '1', '退出系统', '20');
INSERT INTO `dict` VALUES ('11Y', 'OPERATION', '2', '创建', '30');
INSERT INTO `dict` VALUES ('12Y', 'OPERATION', '3', '完成', '40');
INSERT INTO `dict` VALUES ('13Y', 'OPERATION', '4', '修改', '50');
INSERT INTO `dict` VALUES ('14Y', 'OPERATION', '5', '删除', '60');
INSERT INTO `dict` VALUES ('15Y', 'PURPOSE', '0', '任务', '10');
INSERT INTO `dict` VALUES ('16Y', 'PURPOSE', '1', '项目', '20');
INSERT INTO `dict` VALUES ('17Y', 'PURPOSE', '2', '文档', '30');
INSERT INTO `dict` VALUES ('18Y', 'PURPOSE', '3', '成员', '40');
INSERT INTO `dict` VALUES ('19Y', 'PURPOSE', '4', '用户', '50');
INSERT INTO `dict` VALUES ('1L', 'PROJECTSTATE', '0', '未完成', '10');
INSERT INTO `dict` VALUES ('1Y', 'LEVEL', '0', '管理员', '20');
INSERT INTO `dict` VALUES ('2L', 'PROJECTSTATE', '1', '已完成', '20');
INSERT INTO `dict` VALUES ('2Y', 'LEVEL', '1', '成员', '10');
INSERT INTO `dict` VALUES ('3L', 'PROJECTSTATE', '2', '未开始', '30');
INSERT INTO `dict` VALUES ('3Y', 'HISTORY', '0', '今天', '10');
INSERT INTO `dict` VALUES ('4L', 'PROJECTSTATE', '3', '进行中', '40');
INSERT INTO `dict` VALUES ('4Y', 'HISTORY', '1', '昨天', '20');
INSERT INTO `dict` VALUES ('5L', 'PROJECTTYPE', '0', '长期项目', '10');
INSERT INTO `dict` VALUES ('5Y', 'HISTORY', '2', '前天', '30');
INSERT INTO `dict` VALUES ('6L', 'PROJECTTYPE', '1', '短期项目', '20');
INSERT INTO `dict` VALUES ('6Y', 'HISTORY', '3', '本周', '40');
INSERT INTO `dict` VALUES ('7L', 'PROJECTTYPE', '2', '维护项目', '30');
INSERT INTO `dict` VALUES ('7Y', 'HISTORY', '4', '本月', '50');
INSERT INTO `dict` VALUES ('8Y', 'HISTORY', '5', '上月', '60');
INSERT INTO `dict` VALUES ('9Y', 'OPERATION', '0', '登录系统', '10');

-- ----------------------------
-- Table structure for `menutable`
-- ----------------------------
DROP TABLE IF EXISTS `menutable`;
CREATE TABLE `menutable` (
  `Menu_Id` varchar(32) NOT NULL,
  `Menu_Kinds` varchar(255) NOT NULL,
  `Menu_Name` varchar(255) NOT NULL,
  `Menu_Url` varchar(255) NOT NULL,
  `Menu_Sort` int(7) NOT NULL,
  `Menu_Path` varchar(255) NOT NULL,
  `Menu_Parent_Idv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Menu_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menutable
-- ----------------------------

-- ----------------------------
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `Project_Id` varchar(32) NOT NULL,
  `Project_Name` varchar(255) NOT NULL,
  `Project_Type` varchar(255) NOT NULL,
  `Project_Date_Begin` datetime NOT NULL,
  `Project_Date_Over` datetime NOT NULL,
  `Project_Working_Days` int(11) NOT NULL,
  `Project_State` varchar(255) DEFAULT NULL,
  `Project_Describe` text,
  PRIMARY KEY (`Project_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('10L', '无敌了', '0', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('11L', '飞马项目管理dfa', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '2', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('12L', '飞马项目管理as4', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '32', '3', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('13L', '飞马项目asd管理as5', '0', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('14L', '飞马项目管asd理6', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('1L', '飞马项目管理', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '3', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('2L', '飞马项目管理2', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '2', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('3L', '飞马项目管理3', '0', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('4L', '飞马项目管理4', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('5L', '飞马项目管理5', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('6L', '飞马项目管理6', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '2', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('7L', '飞马项目管理7', '2', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('8L', '飞马项目管理1', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '1', '这是一个我们需要共同努力的项目');
INSERT INTO `project` VALUES ('9L', '飞马项目管理as', '1', '2017-11-29 21:06:37', '2018-01-15 21:06:53', '78', '0', '这是一个我们需要共同努力的项目');
