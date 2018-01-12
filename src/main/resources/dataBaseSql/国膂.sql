/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : kdpm

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-11 23:35:53
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
  `Dict_Sort` int(11) NOT NULL,
  PRIMARY KEY (`Dict_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dict
-- ----------------------------

-- ----------------------------
-- Table structure for `historytable`
-- ----------------------------
DROP TABLE IF EXISTS `historytable`;
CREATE TABLE `historytable` (
  `History_Id` varchar(32) NOT NULL,
  `User_Id` varchar(255) NOT NULL,
  `Project_Id` varchar(255) NOT NULL,
  `Target` varchar(255) NOT NULL,
  `Target_Kind` varchar(255) NOT NULL,
  `Visit_Time` int(11) NOT NULL,
  `Last_Time` datetime NOT NULL,
  `Join_Time` datetime NOT NULL,
  `User_Number` int(11) NOT NULL,
  PRIMARY KEY (`History_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of historytable
-- ----------------------------

-- ----------------------------
-- Table structure for `menuable`
-- ----------------------------
DROP TABLE IF EXISTS `menuable`;
CREATE TABLE `menuable` (
  `Menu_Id` varchar(32) NOT NULL,
  `Menu_Name` varchar(255) NOT NULL,
  `Menu_Number` varchar(255) NOT NULL,
  `Menu_Belong` varchar(255) NOT NULL,
  `Menu_Sort` int(7) NOT NULL,
  `Menu_Path` varchar(255) NOT NULL,
  `Meny_Parent_Id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Menu_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menuable
-- ----------------------------

-- ----------------------------
-- Table structure for `mission`
-- ----------------------------
DROP TABLE IF EXISTS `mission`;
CREATE TABLE `mission` (
  `Mission_Id` varchar(32) NOT NULL,
  `Mission_Name` varchar(255) DEFAULT NULL,
  `Mission_Details` varchar(255) DEFAULT NULL,
  `Mission_Role` varchar(255) DEFAULT NULL,
  `Mission_Number` varchar(255) DEFAULT NULL,
  `Project_Id` varchar(32) DEFAULT NULL,
  `Mission_Date_Begin` datetime DEFAULT NULL,
  `Mission_Date_Over` datetime DEFAULT NULL,
  PRIMARY KEY (`Mission_Id`),
  KEY `Project_Id` (`Project_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mission
-- ----------------------------
INSERT INTO `mission` VALUES ('Lxxxx2018011101', '建立数据库', '无', 'xie', 'Lxxxx20180111001', 'Lxxxx', '2018-01-03 23:29:40', '2018-01-06 23:29:48');
INSERT INTO `mission` VALUES ('Lxxxx2018011102', '建立表', '无', 'xie', 'Lxxxx20180111002', 'Lxxxx', '2018-01-04 23:32:49', '2018-01-07 23:32:55');
INSERT INTO `mission` VALUES ('Lxxxx2018011103', '往表里插入数据', '无', 'xie', 'Lxxxx20180111003', 'Lxxxx', '2018-01-05 23:34:56', '2018-01-08 23:35:05');

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

-- ----------------------------
-- Table structure for `typetable`
-- ----------------------------
DROP TABLE IF EXISTS `typetable`;
CREATE TABLE `typetable` (
  `Typle_Id` varchar(32) NOT NULL,
  `Tyoe_Name` varchar(255) NOT NULL,
  PRIMARY KEY (`Typle_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of typetable
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `User_Id` varchar(255) NOT NULL,
  `User_Name` varchar(255) NOT NULL,
  `User_TrueName` varchar(255) NOT NULL,
  `User_Password` varchar(255) NOT NULL,
  `User_Email` varchar(255) NOT NULL,
  `User_Tel` bigint(255) DEFAULT NULL,
  `User_Sex` varchar(255) NOT NULL,
  `User_Img` varchar(255) DEFAULT NULL,
  `User_QQ` bigint(255) DEFAULT NULL,
  PRIMARY KEY (`User_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for `usermission`
-- ----------------------------
DROP TABLE IF EXISTS `usermission`;
CREATE TABLE `usermission` (
  `UserMission_Id` varchar(32) DEFAULT NULL,
  `User_Id` varchar(255) DEFAULT NULL,
  `Mission_Id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usermission
-- ----------------------------

-- ----------------------------
-- Table structure for `userproject`
-- ----------------------------
DROP TABLE IF EXISTS `userproject`;
CREATE TABLE `userproject` (
  `UserProject_Id` varchar(32) NOT NULL,
  `User_Id` varchar(255) NOT NULL,
  `Project_Id` varchar(32) NOT NULL,
  `User_root` varchar(255) NOT NULL,
  `User_Number` varchar(255) NOT NULL,
  `User_Data` datetime NOT NULL,
  `Project_VisitTime` int(32) NOT NULL,
  PRIMARY KEY (`UserProject_Id`),
  KEY `User_Id` (`User_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userproject
-- ----------------------------
