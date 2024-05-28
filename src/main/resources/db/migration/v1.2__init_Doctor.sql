CREATE TABLE doctor
(
    doctor_id SERIAL            NOT NULL,
    name            VARCHAR(32) NOT NULL,
    surname         VARCHAR(32) NOT NULL,
    phone           VARCHAR(32) NOT NULL,
    email           VARCHAR(32) NOT NULL,
    PWZ             VARCHAR(32) NOT NULL,
    specialization  VARCHAR(32) NOT NULL,
    PRIMARY KEY (doctor_id),
    UNIQUE (phone),
    UNIQUE (email),
    UNIQUE (PWZ)
);