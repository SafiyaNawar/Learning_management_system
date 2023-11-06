USE `lms-project`;
CREATE TABLE `assignments` (
  `idc` varchar(45) ,
  `namec` varchar(45),
  `assignnum` INT ,
  `due` DATE  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `assignments` (`idc`, `namec`, `assignnum`, `due`) VALUES
('cs351', 'Cloud Computing', '1', '2023-05-10');