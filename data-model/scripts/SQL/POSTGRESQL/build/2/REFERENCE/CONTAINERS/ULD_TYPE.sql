ALTER TABLE ULD_TYPE ADD CONSTRAINT UC_ULD_TYPE UNIQUE (CODE);
/

-- table foreign keys and indexes --
CREATE INDEX IDX_ULD_TYPE_UC ON ULD_TYPE(CODE);
/

-- Specific Code Start --
-- Specific Code End --
