CREATE TABLE movies(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    ticket VARCHAR(100) NOT NULL DEFAULT 'WHOLE',
    type_ticket VARCHAR (100),
    room INTEGER,
    description TEXT,
    category VARCHAR (100),
    rating DOUBLE PRECISION,
    capacity INTEGER NOT NULL,
    beginning_movie TIMESTAMP,
    end_movie TIMESTAMP
)

