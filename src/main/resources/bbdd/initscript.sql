CREATE TABLE pz.stage (
	id_stage bigserial NOT NULL,
	"text" varchar NULL,
	flat varchar NULL,
	map_name varchar NULL
);

-- Column comments

COMMENT ON COLUMN pz.stage.flat IS 'piso actual';
COMMENT ON COLUMN pz.stage.map_name IS 'nombre del archivo de mapa';
