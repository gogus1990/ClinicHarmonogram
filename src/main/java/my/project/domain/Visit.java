package my.project.domain;

import lombok.*;

import java.time.LocalDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"availableDateID", "patientID"})
@ToString(of = {"availableDateID", "patientID"})
public class Visit {

    Integer VisitID;
    LocalDateTime availableDateID;
    Integer patientID;
}
