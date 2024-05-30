CREATE TABLE visit
(
    visit_id            SERIAL      NOT NULL,
    availableDate_id    INT         NOT NULL,
    patient_id          INT         NOT NULL,
    PRIMARY KEY (visit_id),
    CONSTRAINT fk_visit_patient
        FOREIGN KEY (patient_id)
            REFERENCES patient (patient_id),
    CONSTRAINT fk_visit_availableDate
            FOREIGN KEY (availableDate_id)
                REFERENCES available_Date (availableDate_id)

);