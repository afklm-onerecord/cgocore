ALTER TABLE METRIC ADD CONSTRAINT UC_METRIC UNIQUE (CODE);
/

-- table foreign keys and indexes --
CREATE INDEX IDX_METRIC_UC ON METRIC(CODE);
/

-- Specific Code Start --
-- Specific Code End --
