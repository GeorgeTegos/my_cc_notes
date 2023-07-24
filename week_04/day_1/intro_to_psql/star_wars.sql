drop table lightsabers;
DROP TABLE characters;

CREATE TABLE characters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    darkside BOOLEAN,
    age INT
);

CREATE TABLE lightsabers(
    id SERIAL PRIMARY KEY,
    hilt_metal VARCHAR(255) NOT NULL,
    colour VARCHAR(255) NOT NULL,
    character_id INT REFERENCES characters(id)
);

INSERT INTO characters (name, darkside, age) VALUES ('Obi-wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);
INSERT INTO characters (name, darkside) VALUES ('Yoda',false);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper',true,25);

UPDATE characters SET darkside = true WHERE name = 'Anakin Skywalker';
UPDATE characters SET age = 65 , name ='Old man Ben 'WHERE name = 'Obi-wan Kenobi';

DELETE FROM characters WHERE name = 'Darth Maul';

UPDATE characters SET AGE = 26 WHERE id=6;

SELECT * FROM characters;

INSERT INTO lightsabers (hilt_metal,colour,character_id) VALUES ('Mandalorian iron','red',1);
INSERT INTO lightsabers (hilt_metal,colour,character_id) VALUES ('wood','yellow',2);
INSERT INTO lightsabers (hilt_metal,colour,character_id) VALUES ('wood','purple',2);
INSERT INTO lightsabers (hilt_metal,colour,character_id) VALUES ('wood','yellow',1);

SELECT * FROM lightsabers;

SELECT * from lightsabers WHERE character_id = 2
