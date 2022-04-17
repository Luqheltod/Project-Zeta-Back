CREATE TABLE pz.stage (
	id_stage bigserial NOT NULL,
	"text" varchar NULL,
	flat varchar NULL,
	map_name varchar NULL
);

-- Column comments

COMMENT ON COLUMN pz.stage.flat IS 'piso actual';
COMMENT ON COLUMN pz.stage.map_name IS 'nombre del archivo de mapa';


CREATE TABLE pz."options" (
	id_options bigserial NOT NULL,
	id_stage int8 NULL,
	text_option varchar NULL,
	lifedrain int8 NULL,
	energydrain int8 NULL,
	instadeath boolean NULL DEFAULT false
);
