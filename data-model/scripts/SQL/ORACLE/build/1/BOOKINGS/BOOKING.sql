-- create table --
CREATE TABLE BOOKING
(
ID NUMBER(19,0),
AIR_WAYBILL_ID NUMBER(19,0) NOT NULL,
ORIGIN_ID NUMBER(10,0) NULL,
DESTINATION_ID NUMBER(10,0) NULL,
NUMBER_OF_PIECES NUMBER(10,0) NULL,
GROSS_WEIGHT NUMBER NULL,
GROSS_WEIGHT_UNIT_OF_MEASURE_ID NUMBER(10,0) NULL,
GROSS_VOLUME NUMBER NULL,
GROSS_VOLUME_UNIT_OF_MEASURE_ID NUMBER(10,0) NULL,
CONSTRAINT PK_BOOKING PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_BOOKING_PK ON BOOKING(ID)
)
/

-- create sequence --
CREATE SEQUENCE BOOKING_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

