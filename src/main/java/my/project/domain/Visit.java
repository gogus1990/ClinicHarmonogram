package my.project.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"availableDate_id", "patientID"})
@ToString(of = {"availableDate_id", "patientID"})
public class Visit {
    int availableDate_id;
    int patientID;
}
