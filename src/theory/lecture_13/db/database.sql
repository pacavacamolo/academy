create database site default character set utf8 DEFAULT COLLATE utf8_general_ci;

use site;

CREATE TABLE `users` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
)
  ENGINE = innoDB
  DEFAULT CHAR SET = utf8;

  CREATE TABLE `pages` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(30) not NULL ,
    `status` int(2) not NULL,
    `titul_photo_id` BIGINT(20),
    PRIMARY KEY (`id`),
    CONSTRAINT `PHOTOS_PAGES` FOREIGN KEY (`titul_photo_id`) REFERENCES `photos` (`id`)
  )

  CREATE TABLE `pages_photos` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `page_id` bigint(20) not NULL,
    `photo_id` BIGINT(20) NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `PHOTOS_PAGES_PHOTOS` FOREIGN KEY (`photo_id`) REFERENCES `photos` (`id`),
    CONSTRAINT `PAGES_PAGES_PHOTOS` FOREIGN KEY (`page_id`) REFERENCES `pages` (`id`)
  )
    ENGINE = innoDB
    DEFAULT CHAR SET = utf8;