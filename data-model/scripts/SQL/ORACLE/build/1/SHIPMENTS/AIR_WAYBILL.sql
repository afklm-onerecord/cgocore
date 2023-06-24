-- create table --
CREATE TABLE AIR_WAYBILL
(
ID NUMBER(19,0),
AIR_WAYBILL_NUMBER VARCHAR2(255) NOT NULL,
FORWARDER_NAME VARCHAR2(255) NULL,
ORIGIN_ID NUMBER(10,0) NULL,
DESTINATION_ID NUMBER(10,0) NULL,
GODDS_DESCRIPTION VARCHAR2(255) NULL,
HS_CODE VARCHAR2(255) NULL,
NUMBER_OF_PIECES NUMBER(10,0) NULL,
GROSS_WEIGHT NUMBER NULL,
CHARGEABLE_WEIGHT NUMBER NULL,
GROSS_WEIGHT_UNIT_OF_MEASURE_ID NUMBER(10,0) NULL,
GROSS_VOLUME NUMBER NULL,
GROSS_VOLUME_UNIT_OF_MEASURE_ID NUMBER(10,0) NULL,
CONSTRAINT PK_AIR_WAYBILL PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_AIR_WAYBILL_PK ON AIR_WAYBILL(ID)
)
/

-- create sequence --
CREATE SEQUENCE AIR_WAYBILL_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --
