CREATE TABLE IF NOT EXISTS messages (
    id       VARCHAR(60)  PRIMARY KEY,
    text     VARCHAR      NOT NULL
);

CREATE TABLE IF NOT EXISTS userr (
    id          VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    username    VARCHAR      NOT NULL
);