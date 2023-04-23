
CREATE Database student_directory;
USE student_directory;

CREATE TABLE `student` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `first_name` VARCHAR(250) NULL,
  `last_name` VARCHAR(250) NULL,
  `roll` INT NULL,
  `dob` DATE NULL,
   PRIMARY KEY (`id`)
);

INSERT INTO `student` (`id`, `first_name`, `last_name`, `roll`, `dob`) VALUES (101, 'Sean', 'Carver', 36, '2009-12-13');
INSERT INTO `student` (`id`, `first_name`, `last_name`, `roll`, `dob`) VALUES (102, 'Sean', 'Higgins', 61, '2012-06-09');
INSERT INTO `student` (`id`, `first_name`, `last_name`, `roll`, `dob`) VALUES (103, 'Whitney', 'Bray', 54, '2013-01-07');
INSERT INTO `student` (`id`, `first_name`, `last_name`, `roll`, `dob`) VALUES (104, 'Kirestin', 'Watson', 58, '2025-05-06');
INSERT INTO `student` (`id`, `first_name`, `last_name`, `roll`, `dob`) VALUES (105, 'Joshua', 'Bright', 51, '2003-03-09');
