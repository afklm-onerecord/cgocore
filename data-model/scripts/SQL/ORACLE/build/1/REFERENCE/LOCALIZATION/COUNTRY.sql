-- create table --
CREATE TABLE COUNTRY
(
ID NUMBER(10,0),
IATA_CODE VARCHAR2(255) NOT NULL,
LABEL VARCHAR2(255) NOT NULL,
CONSTRAINT PK_COUNTRY PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_COUNTRY_PK ON COUNTRY(ID)
)
/

-- create sequence --
CREATE SEQUENCE COUNTRY_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

