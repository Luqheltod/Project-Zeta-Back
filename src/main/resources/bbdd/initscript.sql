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

CREATE TABLE pz.games (
	id_games bigserial NOT NULL,
	id_stage int8 NULL,
	life int8 NULL,
	energy int8 NULL,
	game_code varchar NULL
);


CREATE TABLE pz.rest_info (
	id_rest_info bigserial NOT NULL,
	message varchar NULL,
	energy_difference int8 NULL,
	life_difference int8 NULL
);

CREATE TABLE pz.instadeath (
	id_instadeath bigserial NOT NULL,
	message varchar NULL,
	id_options int8 NULL
);


ALTER TABLE pz."options" ADD to_stage int8 NULL;
COMMENT ON COLUMN pz."options".to_stage IS 'la stage a la que dirige esta opcion';


ALTER TABLE pz.stage ADD final_stage boolean NULL DEFAULT false;
