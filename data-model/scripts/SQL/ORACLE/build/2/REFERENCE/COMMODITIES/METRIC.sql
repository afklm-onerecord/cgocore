-- table unique constraints --
ALTER TABLE METRIC ADD CONSTRAINT UC_METRIC UNIQUE (CODE) USING INDEX (CREATE INDEX IDX_METRIC_UC ON METRIC(CODE))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

