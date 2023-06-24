ALTER TABLE DATED_FLIGHT_LEG_ULD_AWB ADD CONSTRAINT UC_DATED_FLIGHT_LEG_ULD_AWB UNIQUE (DATED_FLIGHT_LEG_ULD_ID,AIR_WAYBILL_ID,NUMBER_OF_PIECES,GROSS_WEIGHT);
/

-- table foreign keys and indexes --
ALTER TABLE DATED_FLIGHT_LEG_ULD_AWB ADD CONSTRAINT FK_DATED_FLIGHT_LEG_ULD_AWB_0 FOREIGN KEY (DATED_FLIGHT_LEG_ULD_ID) REFERENCES DATED_FLIGHT_LEG_ULD;
/

ALTER TABLE DATED_FLIGHT_LEG_ULD_AWB ADD CONSTRAINT FK_DATED_FLIGHT_LEG_ULD_AWB_1 FOREIGN KEY (AIR_WAYBILL_ID) REFERENCES AIR_WAYBILL;
/

ALTER TABLE DATED_FLIGHT_LEG_ULD_AWB ADD CONSTRAINT FK_DATED_FLIGHT_LEG_ULD_AWB_4 FOREIGN KEY (GROSS_WEIGHT_UNIT_OF_MEASURE_ID) REFERENCES UNIT_OF_MEASURE;
/

ALTER TABLE DATED_FLIGHT_LEG_ULD_AWB ADD CONSTRAINT FK_DATED_FLIGHT_LEG_ULD_AWB_6 FOREIGN KEY (GROSS_VOLUME_UNIT_OF_MEASURE_ID) REFERENCES UNIT_OF_MEASURE;
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_ULD_AWB_UC ON DATED_FLIGHT_LEG_ULD_AWB(DATED_FLIGHT_LEG_ULD_ID,AIR_WAYBILL_ID,NUMBER_OF_PIECES,GROSS_WEIGHT);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_ULD_AWB_C0 ON DATED_FLIGHT_LEG_ULD_AWB(DATED_FLIGHT_LEG_ULD_ID);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_ULD_AWB_C1 ON DATED_FLIGHT_LEG_ULD_AWB(AIR_WAYBILL_ID);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_ULD_AWB_C4 ON DATED_FLIGHT_LEG_ULD_AWB(GROSS_WEIGHT_UNIT_OF_MEASURE_ID);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_ULD_AWB_C6 ON DATED_FLIGHT_LEG_ULD_AWB(GROSS_VOLUME_UNIT_OF_MEASURE_ID);
/

-- Specific Code Start --
-- Specific Code End --
