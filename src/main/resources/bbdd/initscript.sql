-- pz.games definition

-- Drop table

-- DROP TABLE pz.games;

CREATE TABLE pz.games (
	id_games bigserial NOT NULL,
	id_stage int8 NULL,
	life int8 NULL,
	energy int8 NULL,
	game_code varchar NULL
);


-- pz.instadeath definition

-- Drop table

-- DROP TABLE pz.instadeath;

CREATE TABLE pz.instadeath (
	id_instadeath bigserial NOT NULL,
	message varchar NULL,
	id_options int8 NULL
);


-- pz."options" definition

-- Drop table

-- DROP TABLE pz."options";

CREATE TABLE pz."options" (
	id_options bigserial NOT NULL,
	id_stage int8 NULL,
	text_option varchar NULL,
	lifedrain int8 NULL,
	energydrain int8 NULL,
	instadeath bool NULL DEFAULT false,
	to_stage int8 NULL -- la stage a la que dirige esta opcion
);

-- Column comments

COMMENT ON COLUMN pz."options".to_stage IS 'la stage a la que dirige esta opcion';


-- pz.rest_info definition

-- Drop table

-- DROP TABLE pz.rest_info;

CREATE TABLE pz.rest_info (
	id_rest_info bigserial NOT NULL,
	message varchar NULL,
	energy_difference int8 NULL,
	life_difference int8 NULL
);


-- pz.stage definition

-- Drop table

-- DROP TABLE pz.stage;

CREATE TABLE pz.stage (
	id_stage bigserial NOT NULL,
	"text" varchar NULL,
	flat varchar NULL, -- piso actual
	map_name varchar NULL, -- nombre del archivo de mapa
	final_stage bool NULL DEFAULT false,
	rest_modifier int8 NULL DEFAULT 0 -- modificador de descanso
);

-- Column comments

COMMENT ON COLUMN pz.stage.flat IS 'piso actual';
COMMENT ON COLUMN pz.stage.map_name IS 'nombre del archivo de mapa';
COMMENT ON COLUMN pz.stage.rest_modifier IS 'modificador de descanso';