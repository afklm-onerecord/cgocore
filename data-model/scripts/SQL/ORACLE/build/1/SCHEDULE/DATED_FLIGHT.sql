-- create table --
CREATE TABLE DATED_FLIGHT
(
ID NUMBER(10,0),
COMPANY_ID NUMBER(10,0) NOT NULL,
FLIGHT_NUMBER VARCHAR2(255) NOT NULL,
DEPARTURE_DATE DATE NOT NULL,
ORIGIN_ID NUMBER(10,0) NULL,
DEPARTURE_TIME VARCHAR2(255) NULL,
DESTINATION_ID NUMBER(10,0) NULL,
ARRIVAL_DATE DATE NULL,
ARRIVAL_TIME VARCHAR2(255) NULL,
CONSTRAINT PK_DATED_FLIGHT PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_DATED_FLIGHT_PK ON DATED_FLIGHT(ID)
)
/

-- create sequence --
CREATE SEQUENCE DATED_FLIGHT_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --
