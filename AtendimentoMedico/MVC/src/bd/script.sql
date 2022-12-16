-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema atendimento
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema atendimento
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS atendimento DEFAULT CHARACTER SET utf8 ;
USE atendimento;

-- -----------------------------------------------------
-- Table pessoa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS pessoa (
  codpessoa INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  telefone VARCHAR(45) NOT NULL,
  PRIMARY KEY (codpessoa))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table medico
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS medico (
  codigomedico INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  telefone VARCHAR(45) NOT NULL,
  crm INT (45) NOT NULL,
  PRIMARY KEY (codigomedico))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table paciente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS paciente (
  codpaciente INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL ,
  cpf VARCHAR(45) NOT NULL ,
  telefone VARCHAR(45) NOT NULL ,
  cod_paciente INT(45) NOT NULL,
  PRIMARY KEY (codpaciente))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table atendimento
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS atendimento (
  codatendimento INT NOT NULL AUTO_INCREMENT,
  dia DATE NOT NULL,
  codpaciente INT ,
  codigomedico INT,
  PRIMARY KEY (codatendimento),
  FOREIGN KEY (codpaciente) REFERENCES paciente (codpaciente),
  FOREIGN KEY (codigomedico) REFERENCES medico (codigomedico))
ENGINE = InnoDB;

SELECT * FROM atendimento;