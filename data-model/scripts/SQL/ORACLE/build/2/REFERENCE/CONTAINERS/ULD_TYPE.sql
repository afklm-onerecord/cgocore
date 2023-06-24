-- table unique constraints --
ALTER TABLE ULD_TYPE ADD CONSTRAINT UC_ULD_TYPE UNIQUE (CODE) USING INDEX (CREATE INDEX IDX_ULD_TYPE_UC ON ULD_TYPE(CODE))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

