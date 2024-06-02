CREATE TABLE available_Date
(
    available_date_id            SERIAL                      NOT NULL,
    doctor_id                   INT                         NOT NULL,
    date_time                    TIMESTAMP WITH TIME ZONE    NOT NULL,
    available_date               BOOLEAN                     DEFAULT TRUE,
    PRIMARY KEY (available_date_id),
    CONSTRAINT fk_date_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctor (doctor_id)

);