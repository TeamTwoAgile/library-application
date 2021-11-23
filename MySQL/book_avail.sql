CREATE TABLE `project`.`book_available` (
  `isbn` INT NOT NULL,
  `title` VARCHAR(255) NOT NULL,
  `num_pages` INT NOT NULL,
  `author` VARCHAR(255) NOT NULL,
  `genre` VARCHAR(50) NOT NULL,
  `num_copies` INT NOT NULL,
  `num_checkedout` INT NOT NULL,
  `is_available` VARCHAR(1) NOT NULL,
  PRIMARY KEY (`isbn`));