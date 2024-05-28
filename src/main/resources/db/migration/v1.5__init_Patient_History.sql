CREATE TABLE patient_history
(
    patient_history_id  SERIAL      NOT NULL,
    visit_id            INT         NOT NULL,
    patient_id          INT         NOT NULL,

    PRIMARY KEY (patient_history_id),
    CONSTRAINT fk_history_patient
        FOREIGN KEY (patient_id)
            REFERENCES patient (patient_id),
    CONSTRAINT fk_history_visit
            FOREIGN KEY (visit_id)
                REFERENCES visit (visit_id)

);