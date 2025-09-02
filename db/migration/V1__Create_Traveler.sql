CREATE TABLE if not exists traveler (
    id SERIAL PRIMARY KEY,
    username varchar(250)
);

CREATE TABLE if not exists trip (
    id SERIAL PRIMARY KEY
);

CREATE TABLE if not exists place (
    id SERIAL PRIMARY KEY,
    name varchar(250),
    timezone smallint
);

CREATE TABLE if not exists destination (
    id SERIAL PRIMARY KEY,
    trip int REFERENCES trip(id) ON DELETE CASCADE,
    place int REFERENCES place(id) ON DELETE CASCADE
);

CREATE TABLE if not exists travel (
    id SERIAL PRIMARY KEY,
    destination int REFERENCES place(id) ON DELETE CASCADE,
    origin int REFERENCES place(id) ON DELETE CASCADE,
    departure_time timestamp,
    arrival_time timestamp
);