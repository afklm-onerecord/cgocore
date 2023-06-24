-- table unique constraints --
ALTER TABLE AIRLINE_COMPANY ADD CONSTRAINT UC_AIRLINE_COMPANY UNIQUE (IATA_CODE) USING INDEX (CREATE INDEX IDX_AIRLINE_COMPANY_UC ON AIRLINE_COMPANY(IATA_CODE))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

