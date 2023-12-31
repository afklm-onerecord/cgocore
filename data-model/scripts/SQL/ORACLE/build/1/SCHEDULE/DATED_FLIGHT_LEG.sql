-- create table --
CREATE TABLE DATED_FLIGHT_LEG
(
ID NUMBER(10,0),
DATED_FLIGHT_ID NUMBER(10,0) NOT NULL,
SEQUENCE_NUMBER NUMBER(10,0) NOT NULL,
ORIGIN_ID NUMBER(10,0) NOT NULL,
DEPARTURE_DATE DATE NOT NULL,
DEPARTURE_TIME VARCHAR2(255) NOT NULL,
DESTINATION_ID NUMBER(10,0) NOT NULL,
ARRIVAL_DATE DATE NOT NULL,
ARRIVAL_TIME VARCHAR2(255) NOT NULL,
CONSTRAINT PK_DATED_FLIGHT_LEG PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_DATED_FLIGHT_LEG_PK ON DATED_FLIGHT_LEG(ID)
)
/

-- create sequence --
CREATE SEQUENCE DATED_FLIGHT_LEG_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

