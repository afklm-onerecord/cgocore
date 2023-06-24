-- create table --
CREATE TABLE SPECIAL_HANDLING_CODE
(
id INTEGER,
CODE VARCHAR(255) NOT NULL,
LABEL VARCHAR(255) NULL
);
/

ALTER TABLE SPECIAL_HANDLING_CODE ADD CONSTRAINT PK_SPECIAL_HANDLING_CODE PRIMARY KEY (ID);
/

-- create sequence --
CREATE SEQUENCE SPECIAL_HANDLING_CODE_SEQ
INCREMENT 1
MINVALUE 0
MAXVALUE 9223372036854775807
START 0
CACHE 1;
/

-- Specific Code Start --
-- Specific Code End --