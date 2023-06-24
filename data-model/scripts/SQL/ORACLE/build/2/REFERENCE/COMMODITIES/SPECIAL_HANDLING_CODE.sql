-- table unique constraints --
ALTER TABLE SPECIAL_HANDLING_CODE ADD CONSTRAINT UC_SPECIAL_HANDLING_CODE UNIQUE (CODE) USING INDEX (CREATE INDEX IDX_SPECIAL_HANDLING_CODE_UC ON SPECIAL_HANDLING_CODE(CODE))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

