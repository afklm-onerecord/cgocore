-- table unique constraints --
ALTER TABLE COUNTRY ADD CONSTRAINT UC_COUNTRY UNIQUE (IATA_CODE) USING INDEX (CREATE INDEX IDX_COUNTRY_UC ON COUNTRY(IATA_CODE))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

