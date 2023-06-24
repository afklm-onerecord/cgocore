-- table unique constraints --
ALTER TABLE CURRENCY ADD CONSTRAINT UC_CURRENCY UNIQUE (ISO_CODE) USING INDEX (CREATE INDEX IDX_CURRENCY_UC ON CURRENCY(ISO_CODE))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

