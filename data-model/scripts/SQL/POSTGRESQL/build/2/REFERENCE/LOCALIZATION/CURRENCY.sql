ALTER TABLE CURRENCY ADD CONSTRAINT UC_CURRENCY UNIQUE (ISO_CODE);
/

-- table foreign keys and indexes --
CREATE INDEX IDX_CURRENCY_UC ON CURRENCY(ISO_CODE);
/

-- Specific Code Start --
-- Specific Code End --
