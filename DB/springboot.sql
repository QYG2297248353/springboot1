/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100419
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 100419
 File Encoding         : 65001

 Date: 29/07/2021 23:57:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category_
-- ----------------------------
DROP TABLE IF EXISTS `category_`;
CREATE TABLE `category_`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category_
-- ----------------------------
INSERT INTO `category_` VALUES (1, '测试');
INSERT INTO `category_` VALUES (3, 'category 3');
INSERT INTO `category_` VALUES (4, 'category 4');
INSERT INTO `category_` VALUES (5, '萌森');

SET FOREIGN_KEY_CHECKS = 1;
