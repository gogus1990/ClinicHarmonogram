CREATE TABLE available_Date
(
    availableDate_id            SERIAL                      NOT NULL,
    doctor_id                   INT                         NOT NULL,
    dateTime                    TIMESTAMP WITH TIME ZONE    NOT NULL,
    availableDate               BOOLEAN                     DEFAULT TRUE,
    PRIMARY KEY (availableDate_id),
    CONSTRAINT fk_date_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctor (doctor_id)

);