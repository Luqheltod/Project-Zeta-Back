ALTER TABLE pz.stage ADD rest_modifier int8 NULL DEFAULT 0;
COMMENT ON COLUMN pz.stage.rest_modifier IS 'modificador de descanso';
