-- create table --
CREATE TABLE DATED_FLIGHT_BOOKING
(
ID NUMBER(10,0),
DATED_FLIGHT_ID NUMBER(10,0) NOT NULL,
BOOKING_ID NUMBER(19,0) NOT NULL,
NUMBER_OF_PIECES NUMBER(10,0) NULL,
GROSS_WEIGHT NUMBER NULL,
GROSS_WEIGHT_UNIT_OF_MEASURE_ID NUMBER(10,0) NULL,
GROSS_VOLUME NUMBER NULL,
GROSS_VOLUME_UNIT_OF_MEASURE_ID NUMBER(10,0) NULL,
CONSTRAINT PK_DATED_FLIGHT_BOOKING PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_DATED_FLIGHT_BOOKING_PK ON DATED_FLIGHT_BOOKING(ID)
)
/

-- create sequence --
CREATE SEQUENCE DATED_FLIGHT_BOOKING_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --
