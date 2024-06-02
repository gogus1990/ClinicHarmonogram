CREATE TABLE visit
(
    visit_id            SERIAL      NOT NULL,
    available_date_id    INT         NOT NULL,
    patient_id          INT         NOT NULL,
    doctor_id           INT         NOT NULL,
    description         TEXT,
    PRIMARY KEY (visit_id),
    CONSTRAINT fk_visit_patient
        FOREIGN KEY (patient_id)
            REFERENCES patient (patient_id),
    CONSTRAINT fk_visit_availableDate
            FOREIGN KEY (available_date_id)
                REFERENCES available_date (available_date_id)

);