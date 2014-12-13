CREATE DATABASE IF NOT EXISTS Starters;
USE Starters ;

DROP TABLE IF EXISTS Starters.Table1 ;

CREATE  TABLE IF NOT EXISTS Starters.Table1 (
    fieldInt INT NULL ,
    fieldFloat FLOAT  NULL ,
    fieldText VARCHAR(45) NULL ,
    fieldBool TINYINT(1)  NULL ,
    keyText VARCHAR(45) NULL )
    ENGINE = InnoDB;


SET AUTOCOMMIT=0;
USE Starters;
INSERT INTO Starters.Table1 (fieldInt, fieldFloat, fieldText, fieldBool, keyText) VALUES ('5', 12.4, 'Hello', true, 'Goodbye');
INSERT INTO Starters.Table1 (fieldInt, fieldFloat, fieldText, fieldBool, keyText) VALUES ('6', 22.4, 'Pass', true, 'Fail');


COMMIT;
