ALTER TABLE DATED_FLIGHT_LEG ADD CONSTRAINT UC_DATED_FLIGHT_LEG UNIQUE (DATED_FLIGHT_ID,SEQUENCE_NUMBER);
/

-- table foreign keys and indexes --
ALTER TABLE DATED_FLIGHT_LEG ADD CONSTRAINT FK_DATED_FLIGHT_LEG_0 FOREIGN KEY (DATED_FLIGHT_ID) REFERENCES DATED_FLIGHT;
/

ALTER TABLE DATED_FLIGHT_LEG ADD CONSTRAINT FK_DATED_FLIGHT_LEG_2 FOREIGN KEY (ORIGIN_ID) REFERENCES STATION;
/

ALTER TABLE DATED_FLIGHT_LEG ADD CONSTRAINT FK_DATED_FLIGHT_LEG_5 FOREIGN KEY (DESTINATION_ID) REFERENCES STATION;
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_UC ON DATED_FLIGHT_LEG(DATED_FLIGHT_ID,SEQUENCE_NUMBER);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_C0 ON DATED_FLIGHT_LEG(DATED_FLIGHT_ID);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_C2 ON DATED_FLIGHT_LEG(ORIGIN_ID);
/

CREATE INDEX IDX_DATED_FLIGHT_LEG_C5 ON DATED_FLIGHT_LEG(DESTINATION_ID);
/

-- Specific Code Start --
-- Specific Code End --
