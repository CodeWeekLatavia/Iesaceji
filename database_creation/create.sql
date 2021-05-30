CREATE DATABASE workio_workers;
USE workio_workers;
CREATE TABLE worker(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	workerName VARCHAR(500) NOT NULL,
    workerSurname VARCHAR(500) NOT NULL,
    workerAge INTEGER UNSIGNED NOT NULL,
    excelSkill INTEGER UNSIGNED NOT NULL,
    talkingSkill INTEGER UNSIGNED NOT NULL,
    javaSkill INTEGER UNSIGNED NOT NULL,
    translatingSkill INTEGER UNSIGNED NOT NULL
    );
USE workio_workers