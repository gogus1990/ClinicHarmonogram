CREATE TABLE availableDate
(
    availableDate_id SERIAL                 NOT NULL,
    doctor_id                   INT         NOT NULL,
    dateTime                    VARCHAR(32) NOT NULL,
    availableDate               BOOLEAN     NOT NULL,
    PRIMARY KEY (availableDate_id),
    CONSTRAINT fk_date_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctor (doctor_id)

);