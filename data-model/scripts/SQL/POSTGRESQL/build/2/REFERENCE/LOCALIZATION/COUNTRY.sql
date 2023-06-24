ALTER TABLE COUNTRY ADD CONSTRAINT UC_COUNTRY UNIQUE (IATA_CODE);
/

-- table foreign keys and indexes --
CREATE INDEX IDX_COUNTRY_UC ON COUNTRY(IATA_CODE);
/

-- Specific Code Start --
-- Specific Code End --
