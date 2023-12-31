-- create table --
CREATE TABLE METRIC
(
ID NUMBER(10,0),
CODE VARCHAR2(255) NOT NULL,
LABEL VARCHAR2(255) NULL,
CONSTRAINT PK_METRIC PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_METRIC_PK ON METRIC(ID)
)
/

-- create sequence --
CREATE SEQUENCE METRIC_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

