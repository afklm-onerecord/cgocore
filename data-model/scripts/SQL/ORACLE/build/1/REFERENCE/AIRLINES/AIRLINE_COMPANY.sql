-- create table --
CREATE TABLE AIRLINE_COMPANY
(
ID NUMBER(10,0),
IATA_CODE VARCHAR2(255) NOT NULL,
LABEL VARCHAR2(255) NULL,
PREFIX VARCHAR2(255) NULL,
CONSTRAINT PK_AIRLINE_COMPANY PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_AIRLINE_COMPANY_PK ON AIRLINE_COMPANY(ID)
)
/

-- create sequence --
CREATE SEQUENCE AIRLINE_COMPANY_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

