DROP DATABASE IF EXISTS Starters;
CREATE DATABASE Starters;

USE Starters;

CREATE TABLE Table1 (
    fieldInt INT NULL,
    fieldFloat FLOAT  NULL ,
    fieldText VARCHAR(45) NULL ,
    fieldBool TINYINT(1)  NULL ,
    keyText VARCHAR(45) NULL ) ;

COMMIT;
  
CREATE TABLE people (
	id int(11) not null auto_increment,  
    firstName VARCHAR(45) NULL,
    lastName VARCHAR(45)  NULL ,
    email VARCHAR(45) NULL ,
    userId INT  NULL ,
    gender VARCHAR(45) NULL ,
    height VARCHAR(45) NULL ,
    weight VARCHAR(45) NULL ,
    modified TIMESTAMP NULL ,
    
    primary key (id));
    
    
COMMIT;  
 
