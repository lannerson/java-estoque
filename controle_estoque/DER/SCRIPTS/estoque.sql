SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `cidades` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;

-- -----------------------------------------------------
-- Table `cidades`.`cidade`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `cidades`.`cidade` (
  `codigo` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL ,
  `uf` VARCHAR(2) NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cidades`.`bairro`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `cidades`.`bairro` (
  `codigo` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cidades`.`logradouro`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `cidades`.`logradouro` (
  `codigo` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cidades`.`cliente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `cidades`.`cliente` (
  `codigo` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NULL ,
  `logradouro` INT NULL ,
  `numero` VARCHAR(45) NULL ,
  `complemento` VARCHAR(45) NULL ,
  `bairro` INT NULL ,
  `cidade` INT NULL ,
  `cep` VARCHAR(45) NULL ,
  `rg` VARCHAR(45) NULL ,
  `cpf` VARCHAR(40) NULL ,
  `FoneRes` VARCHAR(45) NULL ,
  `FoneCom` VARCHAR(45) NULL ,
  `FoneCel` VARCHAR(45) NULL ,
  `Email` VARCHAR(45) NULL ,
  `DataNascimento` DATE NULL ,
  `DataCadastro` DATE NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
