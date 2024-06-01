package my.project.domain;

import lombok.*;

import java.time.LocalDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"availableDateID", "patient"})
@ToString(of = {"availableDateID", "patient"})
public class Visit {

    Integer VisitID;
    LocalDateTime availableDateID;
    Patient patient;
    String description;
}
