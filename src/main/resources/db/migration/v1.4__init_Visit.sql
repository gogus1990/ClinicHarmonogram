CREATE TABLE visit
(
    visit_id            SERIAL                      NOT NULL,
    availableDate_id    TIMESTAMP WITH TIME ZONE    NOT NULL,
    patient_id          INT                         NOT NULL,
    PRIMARY KEY (visit_id),
    CONSTRAINT fk_visit_patient
        FOREIGN KEY (patient_id)
            REFERENCES patient (patient_id),
    CONSTRAINT fk_visit_availableDate
            FOREIGN KEY (availableDate_id)
                REFERENCES availableDate (availableDate_id)

);