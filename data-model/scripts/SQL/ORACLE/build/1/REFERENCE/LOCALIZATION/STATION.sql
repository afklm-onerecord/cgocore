-- create table --
CREATE TABLE STATION
(
ID NUMBER(10,0),
IATA_CODE VARCHAR2(255) NOT NULL,
LABEL VARCHAR2(255) NOT NULL,
COUNTRY_ID NUMBER(10,0) NULL,
CONSTRAINT PK_STATION PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_STATION_PK ON STATION(ID)
)
/

-- create sequence --
CREATE SEQUENCE STATION_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

