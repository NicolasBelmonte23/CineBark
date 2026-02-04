ALTER TABLE movies
    ADD COLUMN user_id BIGINT;

ALTER TABLE movies
    ADD CONSTRAINT fk_movies_user
        FOREIGN KEY (user_id) REFERENCES users (id);
