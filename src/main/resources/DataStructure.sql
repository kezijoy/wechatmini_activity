/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.47-0ubuntu0.14.04.1 : Database - hongtao_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hongtao_test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hongtao_test`;

/*Table structure for table `activity` */

DROP TABLE IF EXISTS `activity`;

CREATE TABLE `activity` (
  `activity_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动id',
  `activity_name` varchar(50) DEFAULT NULL COMMENT '活动名称',
  `activity_charge_type` varchar(20) DEFAULT NULL COMMENT '收费模式',
  `activity_cost` decimal(10,0) DEFAULT NULL COMMENT '活动费用',
  `activity_start_time` datetime DEFAULT NULL COMMENT '活动开始时间',
  `activity_end_time` datetime DEFAULT NULL COMMENT '活动结束时间',
  `registration_start_time` datetime DEFAULT NULL COMMENT '报名开始时间',
  `registration_end_time` datetime DEFAULT NULL COMMENT '报名结束时间',
  `people_number` int(11) DEFAULT NULL COMMENT '限制人数',
  `cover_image_id` varchar(500) DEFAULT NULL COMMENT '封面图片url',
  `activity_status` varchar(20) DEFAULT NULL COMMENT '活动状态',
  `creater_id` int(11) DEFAULT NULL COMMENT '活动创建人',
  `description` varchar(500) DEFAULT NULL COMMENT '活动描述',
  `address` varchar(200) DEFAULT NULL COMMENT '活动地点',
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity` */

/*Table structure for table `activity_application` */

DROP TABLE IF EXISTS `activity_application`;

CREATE TABLE `activity_application` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `create_time` datetime DEFAULT NULL COMMENT '报名时间',
  `person` int(11) DEFAULT '1' COMMENT '报名人数',
  `note` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_application` */

/*Table structure for table `activity_comment` */

DROP TABLE IF EXISTS `activity_comment`;

CREATE TABLE `activity_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `user_id` int(11) DEFAULT NULL COMMENT '评论用户id',
  `content` varchar(500) DEFAULT NULL COMMENT '评论内容',
  `create_time` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_comment` */

/*Table structure for table `activity_follow` */

DROP TABLE IF EXISTS `activity_follow`;

CREATE TABLE `activity_follow` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `create_time` datetime DEFAULT NULL COMMENT '关注时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_follow` */

/*Table structure for table `activity_image` */

DROP TABLE IF EXISTS `activity_image`;

CREATE TABLE `activity_image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `image_url` varchar(500) DEFAULT NULL COMMENT '图片url',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_image` */

/*Table structure for table `activity_image_ad` */

DROP TABLE IF EXISTS `activity_image_ad`;

CREATE TABLE `activity_image_ad` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ad_url` varchar(500) DEFAULT NULL COMMENT '广告url',
  `image_url` varchar(500) DEFAULT NULL COMMENT '广告图片url',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `activity_image_ad` */

/*Table structure for table `activity_like` */

DROP TABLE IF EXISTS `activity_like`;

CREATE TABLE `activity_like` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `create_time` datetime DEFAULT NULL COMMENT '点赞时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_like` */

/*Table structure for table `activity_sign` */

DROP TABLE IF EXISTS `activity_sign`;

CREATE TABLE `activity_sign` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `create_time` datetime DEFAULT NULL COMMENT '签到时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_sign` */

/*Table structure for table `activity_tag` */

DROP TABLE IF EXISTS `activity_tag`;

CREATE TABLE `activity_tag` (
  `activity_tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_tag_name` varchar(50) DEFAULT NULL COMMENT '活动标签名',
  PRIMARY KEY (`activity_tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Table structure for table `activity_tag_custom` */

DROP TABLE IF EXISTS `activity_tag_custom`;

CREATE TABLE `activity_tag_custom` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '自定义标签名',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_tag_custom` */

/*Table structure for table `activity_tag_relation` */

DROP TABLE IF EXISTS `activity_tag_relation`;

CREATE TABLE `activity_tag_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_tag_id` int(11) DEFAULT NULL COMMENT '活动标签id',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_tag_relation` */

/*Table structure for table `activity_type` */

DROP TABLE IF EXISTS `activity_type`;

CREATE TABLE `activity_type` (
  `activity_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_type_name` varchar(50) DEFAULT NULL COMMENT '活动类型名称',
  PRIMARY KEY (`activity_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


/*Table structure for table `activity_type_custom` */

DROP TABLE IF EXISTS `activity_type_custom`;

CREATE TABLE `activity_type_custom` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '自定义类型名',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_type_custom` */

/*Table structure for table `activity_type_relation` */

DROP TABLE IF EXISTS `activity_type_relation`;

CREATE TABLE `activity_type_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_type_id` int(11) DEFAULT NULL COMMENT '活动类型id',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_type_relation` */

/*Table structure for table `activity_video` */

DROP TABLE IF EXISTS `activity_video`;

CREATE TABLE `activity_video` (
  `video_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` int(11) DEFAULT NULL COMMENT '活动id',
  `video_url` varchar(500) DEFAULT NULL COMMENT '视频url',
  PRIMARY KEY (`video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity_video` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `open_id` varchar(50) DEFAULT NULL,
  `avatar_url` varchar(500) DEFAULT NULL COMMENT '头像',
  `gender` varchar(5) DEFAULT NULL COMMENT '性别',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `open_id` (`open_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
