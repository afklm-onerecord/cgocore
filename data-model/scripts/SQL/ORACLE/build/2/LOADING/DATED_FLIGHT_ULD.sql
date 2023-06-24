-- table unique constraints --
ALTER TABLE DATED_FLIGHT_ULD ADD CONSTRAINT UC_DATED_FLIGHT_ULD UNIQUE (DATED_FLIGHT_ID,ULD_TYPE_ID,ULD_CODE,ULD_OWNER_CODE) USING INDEX (CREATE INDEX IDX_DATED_FLIGHT_ULD_UC ON DATED_FLIGHT_ULD(DATED_FLIGHT_ID,ULD_TYPE_ID,ULD_CODE,ULD_OWNER_CODE))
/

-- table foreign keys --
ALTER TABLE DATED_FLIGHT_ULD ADD CONSTRAINT FK_DATED_FLIGHT_ULD_0 FOREIGN KEY (DATED_FLIGHT_ID) REFERENCES DATED_FLIGHT
/

ALTER TABLE DATED_FLIGHT_ULD ADD CONSTRAINT FK_DATED_FLIGHT_ULD_1 FOREIGN KEY (ULD_TYPE_ID) REFERENCES ULD_TYPE
/

ALTER TABLE DATED_FLIGHT_ULD ADD CONSTRAINT FK_DATED_FLIGHT_ULD_5 FOREIGN KEY (GROSS_WEIGHT_UNIT_OF_MEASURE_ID) REFERENCES UNIT_OF_MEASURE
/

-- table indexes --
CREATE INDEX IDX_DATED_FLIGHT_ULD_C0 ON DATED_FLIGHT_ULD(DATED_FLIGHT_ID)
/

CREATE INDEX IDX_DATED_FLIGHT_ULD_C1 ON DATED_FLIGHT_ULD(ULD_TYPE_ID)
/

CREATE INDEX IDX_DATED_FLIGHT_ULD_C5 ON DATED_FLIGHT_ULD(GROSS_WEIGHT_UNIT_OF_MEASURE_ID)
/

-- Specific Code Start --
-- Specific Code End --

